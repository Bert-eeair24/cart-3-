import java.util.Scanner;

public class OnlineShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        while (true) {
            System.out.println("\n=== Онлайн корзина покупок ===");
            System.out.println("1. Добавить товар");
            System.out.println("2. Просмотреть корзину");
            System.out.println("3. Изменить количество");
            System.out.println("4. Удалить товар");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите название товара: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите цену: ");
                    double price = scanner.nextDouble();
                    System.out.print("Введите количество: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(new Main(name, price, quantity));
                    break;
                case 2:
                    cart.viewCart();
                    break;
                case 3:
                    cart.viewCart();
                    System.out.print("Введите номер товара для изменения: ");
                    int updateIndex = scanner.nextInt() - 1;
                    System.out.print("Введите новое количество: ");
                    int newQuantity = scanner.nextInt();
                    cart.updateItem(updateIndex, newQuantity);
                    break;
                case 4:
                    cart.viewCart();
                    System.out.print("Введите номер товара для удаления: ");
                    int removeIndex = scanner.nextInt() - 1;
                    cart.removeItem(removeIndex);
                    break;
                case 5:
                    System.out.println("Спасибо за использование нашего сервиса!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}