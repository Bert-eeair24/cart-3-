import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        cart.loadFromFile();

        while (true) {
            System.out.println("\n=== Онлайн корзина покупок ===");
            System.out.println("1. Добавить товар");
            System.out.println("2. Просмотреть корзину");
            System.out.println("3. Изменить количество");
            System.out.println("4. Удалить товар");
            System.out.println("5. Сохранить и выйти");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название товара: ");
                    String name = scanner.nextLine();

                    double price = 0;
                    boolean validPrice = false;
                    while (!validPrice) {
                        System.out.print("Введите цену: ");
                        try {
                            price = Double.parseDouble(scanner.nextLine());
                            if (price > 0) {
                                validPrice = true;
                            } else {
                                System.out.println("Ошибка: Цена должна быть положительным числом. Попробуйте снова.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ошибка: Введите корректное число для цены. Попробуйте снова.");
                        }
                    }

                    int quantity = -1;
                    while (quantity <= 0) {
                        System.out.print("Введите количество: ");
                        if (scanner.hasNextInt()) {
                            quantity = scanner.nextInt();
                            if (quantity <= 0) {
                                System.out.println("Ошибка: количество не может быть отрицательным.");
                            }
                        } else {
                            System.out.println("Ошибка: введите целое число.");
                            scanner.next(); // очистка некорректного ввода
                        }
                    }

                    cart.addItem(new Main(name, price, quantity));
                    break;

                case 2:
                    cart.viewCart();
                    break;

                case 3:
                    cart.viewCart();
                    System.out.print("Введите номер товара для изменения: ");
                    int updateIndex = scanner.nextInt() - 1;

                    int newQuantity = -1;
                    while (newQuantity < 0) {
                        System.out.print("Введите новое количество: ");
                        if (scanner.hasNextInt()) {
                            newQuantity = scanner.nextInt();
                            if (newQuantity < 0) {
                                System.out.println("Ошибка: количество не может быть отрицательным.");
                            }
                        } else {
                            System.out.println("Ошибка: введите целое число.");
                            scanner.next(); // очистка некорректного ввода
                        }
                    }

                    cart.updateItem(updateIndex, newQuantity);
                    break;

                case 4:
                    cart.viewCart();
                    System.out.print("Введите номер товара для удаления: ");
                    int removeIndex = scanner.nextInt() - 1;
                    cart.removeItem(removeIndex);
                    break;

                case 5:
                    cart.saveToFile();
                    System.out.println("Спасибо за использование нашего сервиса!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
