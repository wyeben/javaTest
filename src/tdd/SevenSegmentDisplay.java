package tdd;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a digit (0-9): ");
        int digit = scanner.nextInt();

        displayDigitInSevenSegmentFormat(digit);

        scanner.close();
    }

    public static void displayDigitInSevenSegmentFormat(int digit) {
        String[] segments = {
                " ### \n#   #\n#   #\n#   #\n ### ",
                "  #  \n ##  \n  #  \n  #  \n ### ",
                " ### \n    #\n ### \n#    \n ### ",
                " ### \n    #\n ### \n    #\n ### ",
                "   # \n  ## \n # # \n#####\n   # ",
                "#####\n#    \n#####\n    #\n#####",
                " ### \n#    \n#### \n#   #\n ### ",
                "#####\n    #\n   # \n  #  \n #   ",
                " ### \n#   #\n ### \n#   #\n ### ",
                " ### \n#   #\n ####\n    #\n ### "
        };

        if (digit >= 0 && digit <= 9) {
            System.out.println(segments[digit]);
        } else {
            System.out.println("Invalid input: The digit should be between 0 and 9.");
        }
    }
}