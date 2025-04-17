import java.util.ArrayList;
import java.util.Scanner;
class Main {
    private String name;
    private double price;
    private int quantity;

    public Main(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return String.format("%s - $%.2f x %d (Total: $%.2f)",
                name, price, quantity, price * quantity);
    }
}
class ShoppingCart {
    private ArrayList<Main> items = new ArrayList<>();


    public void addItem(Main product) {
        items.add(product);
        System.out.println("Товар добавлен в корзину.");
    }


    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }

        System.out.println("\n--- Ваша корзина ---");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            Main item = items.get(i);
            System.out.println((i + 1) + ". " + item);
            total += item.getPrice() * item.getQuantity();
        }
        System.out.printf("Общая сумма: $%.2f\n", total);
    }


    public void updateItem(int index, int newQuantity) {
        if (index >= 0 && index < items.size()) {
            items.get(index).setQuantity(newQuantity);
            System.out.println("Количество обновлено.");
        } else {
            System.out.println("Неверный номер товара.");
        }
    }


    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Товар удален из корзины.");
        } else {
            System.out.println("Неверный номер товара.");
        }
    }
}

