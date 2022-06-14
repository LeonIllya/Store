package utils;

import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода имени
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print(Contacts.EMPTY_NAME);
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Contacts.NUM_QUANTITY, str);
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println(Contacts.INCORRECT_QUANTITY);
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf(Contacts.NUM_QUANTITY, str);
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Contacts.PRICE, str);
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print(Contacts.INCORRECT_PRICE);
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf(Contacts.PRICE, str);
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
