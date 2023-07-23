package tdd;

import java.util.Scanner;

public class EncryptNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a four-digit integer to encrypt: ");
        int originalNumber = scanner.nextInt();

        int encryptedNumber = encrypt(originalNumber);
        System.out.println("Encrypted number: " + encryptedNumber);


    }

    private static int encrypt(int number) {
        int[] digits = getDigits(number);


        for (int i = 0; i < digits.length; i++) {
            digits[i] = (digits[i] + 7) % 10;
        }


        swap(digits, 0, 2);


        swap(digits, 1, 3);

        return composeNumber(digits);
    }

    private static int[] getDigits(int number) {
        int[] digits = new int[4];
        for (int i = 3; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int composeNumber(int[] digits) {
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        return number;
    }
}
