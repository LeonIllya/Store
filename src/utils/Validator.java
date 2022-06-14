package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода имени
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            try {
                str = scanner.nextLine().trim();
            }catch (InputMismatchException e){
                System.out.print(Contacts.EMPTY_NAME);
            }
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {

        String str1 = null;

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Contacts.NUM_QUANTITY, str);
        }

        int quantity = scanner.nextInt();

        while (quantity <= 0) {
            System.out.println(Contacts.INCORRECT_QUANTITY);
            while (!scanner.hasNextInt()) {
                try{
                    str1 = scanner.next().trim();
                } catch (InputMismatchException e){
                    System.out.printf(Contacts.NUM_QUANTITY, str1);
                }
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
    public static double validatePriceInput(Scanner scanner) {

        String str1 = null;

        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf(Contacts.PRICE, str);
        }

        double price = scanner.nextDouble();

        while (price <= 0) {
            System.out.print(Contacts.INCORRECT_PRICE);
            while (!scanner.hasNextDouble()) {
                try{
                    str1 = scanner.nextLine().trim();
                } catch (InputMismatchException e){
                    System.out.printf(Contacts.PRICE, str1);
                }
            }
            price = scanner.nextDouble();
        }
        return price;
    }
}
