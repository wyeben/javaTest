package tdd;

import java.util.Scanner;

public class CreditCardValidator {

    private static String detectCardType(String cardNumber) {

        if (cardNumber.matches("^4[0-9]{12}(?:[0-9]{3})?$")) {
            return "Visa";
        } else if (cardNumber.matches("^5[1-5][0-9]{14}$")) {
            return "Mastercard";
        } else if (cardNumber.matches("^3[47][0-9]{13}$")) {
            return "American Express";
        } else if (cardNumber.matches("^6(?:011|5[0-9]{2})[0-9]{12}$")) {
            return "Discover";
        }
         else { 
            return "Unknown";
        }
    }

    private static boolean isCardNumberValid(String cardNumber) {
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return sum % 10 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String cardNumber = scanner.nextLine().replaceAll("\\s", "");

        boolean isValid = isCardNumberValid(cardNumber);

        String cardType = detectCardType(cardNumber);

        System.out.println("Credit card type: " + cardType);
        System.out.println("Validity status: " + (isValid ? "Valid" : "Invalid"));

    }
}

