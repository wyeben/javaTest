package tdd;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckSpecialCharacter {
    public static boolean checkSpecialCharacter(String input){
    Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
    Matcher matcher = pattern.matcher(input);
        return matcher.find();
}

    public static void main(String[] args) {
        String check = "benson$";

        System.out.println("check if it contains special characters: " + checkSpecialCharacter(check));
    }
}

