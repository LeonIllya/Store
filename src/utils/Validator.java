package utils;

import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода имени
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.print("Empty value! Enter name: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!%nEnter quantity: ", str);
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Incorrect value! Enter quantity: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - not a number!%nEnter quantity: ", str);
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - not a number!%nEnter price: ", str);
        }
        double price = scanner.nextDouble();
        while (price <= 0) {
            System.out.print("Incorrect value! Enter price: ");
            while (!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - not a number!%nEnter price: ", str);
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
