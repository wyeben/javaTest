package tdd;

import java.util.Scanner;

public class MyersBriggsPersonalityTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        String[][] questions = {
                {"Expend energy, enjoy groups", "Conserve energy, one-on-one"},
                {"Interpret literally", "Look for meaning and possibilities"},
                {"Logical, thinking, questioning", "Empathetic, feeling, accommodating"},
                {"Organized, orderly", "Flexible, adaptable"},
                {"More outgoing, think out loud", "More reserved, think to yourself"},
                {"Practical, realistic, experiential", "Imagination, innovative, theoretical"},
                {"Candid, straight forward, frank", "Tactful, kind, encouraging"},
                {"Plan, schedule.", "Unplanned, spontaneous"},
                {"seek many tasks, public activities, interaction with others", "seek private, solitary activities with quiet to concentrate"},
                {"standard, usual, conventional.", "different, novel, unique"},
                {"firm, tend to criticize, hold the line ", "gentle, tend to appreciate, conciliate"},
                {"regulated, structured", "easygoing, live  and let live"},
                {"external, communicative, express yourself ", "internal, reticent, keep to yourself"},
                {"focus on here-and-now ", "look to the future, global perspective, 'big picture'"},
                {"tough minded, just ", "tender-hearted, merciful"},
                {"preparation, plan ahead ", "go with the flow, adapt as you go"},
                {"active, initiate", "reflective, deliberate"},
                {"facts, things, 'what is'", "ideas, dreams, 'what could be', philosophical"},
                {"matter of fact, issue oriented", "sensitive, people-oriented, compassionate"},
                {"control, govern ", "latitude, freedom"},

        };

        int[] scores = new int[4];

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ":");
            System.out.println("A. " + questions[i][0]);
            System.out.println("B. " + questions[i][1]);

            String userInput = getUserResponse(scanner);
            updateScores(scores, userInput);

        }

        String personalityType = calculatePersonalityType(scores);
        String personalityDescription = getPersonalityDescription(personalityType);

        System.out.println("Hello "+ name +" you selected \n"+ personalityType);
        System.out.println("Description: " + personalityDescription);


    }

    private static String getUserResponse(Scanner scanner) {
        String userInput;
        do {
            System.out.print("Your response (A or B): ");
            userInput = scanner.nextLine().trim().toUpperCase();
        } while (!userInput.equals("A") && !userInput.equals("B"));
        return userInput;
    }

    private static void updateScores(int[] scores, String userInput) {
        for (int y = 0; y < userInput.length(); y++) {
            if (userInput.charAt(y) == 'A'|| userInput.charAt(y) == 'B') {
                scores[y]++;
            }
        }
    }

    private static String calculatePersonalityType(int[] scores) {
        int countA = 0;
        int countB = 0;
        StringBuilder personalityType = new StringBuilder();

        for (int score : scores) {
            if (score >= 10) {
                personalityType.append("A");
                countA++;
            } else {
                personalityType.append("B");
                countB++;
            }
        }

        return personalityType.toString();
    }

    private static String getPersonalityDescription(String personalityType) {

        String description;
        switch (personalityType) {
            case "intj":
                description = "You are an Architect (INTJ)." +
                        " Architect are the kind of people with the Introverted, Intuitive, Thinking, and Judging personality traits." +
                        " These thoughtful tacticians love perfecting the details of life, applying creativity and rationality " +
                        "to everything they do. Their inner world is often a private, complex one.";
                break;
            case "intp":
                description = "You are a Logician (INTP)." +
                        "Logician is someone with the Introverted, Intuitive, Thinking, and Prospecting personality traits. " +
                        "These flexible thinkers enjoy taking an unconventional approach to many aspects of life. " +
                        "They often seek out unlikely paths, mixing willingness to experiment with personal creativity.";
                break;
            default:
                description = "Please have a little patient work in progress...";
                break;
        }
        return description;
    }
}
