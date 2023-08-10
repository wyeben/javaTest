package tdd;

import java.math.BigDecimal;

public class TryCatch {
    public static void main(String[] args) {
        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }

        }catch (ArithmeticException e){
            System.out.println("error");
        }


    }
}
