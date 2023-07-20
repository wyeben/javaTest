package tdd;

public class Loop1To10 {
    public static void main(String[] args) {
        int number =1;

        do {
            System.out.println(number);
            number++;
        } while (number < 11);

        for(int counter = 1; counter<11; counter++){
            System.out.println(counter);
        }
        number = 1;
        while(number<11){
            System.out.println(number);
            number++;
        }
    }
}