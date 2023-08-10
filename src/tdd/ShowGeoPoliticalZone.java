package tdd;

import java.util.Scanner;

import static tdd.GeopoliticalZoneFinder.getGeopoliticalZone;

public class ShowGeoPoliticalZone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your state");
        String input = scanner.nextLine();

        GeopoliticalZoneFinder.GeopoliticalZone geopoliticalZone = getGeopoliticalZone(input);

        if (geopoliticalZone != null) {
            System.out.println("Your state: " + input + ", belongs to the " + geopoliticalZone + " geopolitical zone.");
        } else {
            System.out.println("Sorry, we couldn't determine the geopolitical zone for your state.");
        }
    }
}
