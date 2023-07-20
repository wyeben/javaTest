package tdd;

public class Palindrome {
    public static boolean canCheckPalindrome(String name) {
        name = name.toLowerCase().replaceAll("\\s+","");
        int n = name.length();

        for (int y = 0; y < n/2; y++) {
            if(name.charAt(y) != name.charAt(n - y - 1)){
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String name = "good";
        String checkPalindrome = String.valueOf(canCheckPalindrome(name));
        System.out.println("Palindrome is: "+checkPalindrome);
    }
}
