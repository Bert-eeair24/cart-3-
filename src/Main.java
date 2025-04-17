import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
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

    public String toCSV() {
        return String.format("%s,%.2f,%d", name, price, quantity);
    }

    public static Main fromCSV(String csvLine) {
        String[] parts = csvLine.split(",");
        return new Main(
                parts[0],
                Double.parseDouble(parts[1]),
                Integer.parseInt(parts[2])
        );
    }
}
class ShoppingCart {
    private ArrayList<Main> items = new ArrayList<>();


    public void addItem(Main product) {
        items.add(product);
        System.out.println("товар добавлен в корзину.");
    }


    public void viewCart() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
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
            System.out.println("Количество обновлено");
        } else {
            System.out.println("Неверный номер товара");
        }
    }


    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Товар удален из корзины");
        } else {
            System.out.println("Неверный номер товара");
        }
    }

    private static final String CART_FILE = "products.csv";

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CART_FILE))) {
            for (Main item : items) {
                writer.println(item.toCSV());
            }
            System.out.println("Корзина сохранена в файл");
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении корзины: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        items.clear();
        if (!Files.exists(Paths.get(CART_FILE))) {
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(CART_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                items.add(Main.fromCSV(line));
            }
            System.out.println("Корзина загружена из файла");
        } catch (IOException e) {
            System.out.println("Ошибка при загрузке корзины: " + e.getMessage());
        }
    }
}

