package tdd;

import java.math.BigDecimal;

public class TryBigDecimal {
    public static void main(String[] args) {
        BigDecimal number = BigDecimal.TEN;
        BigDecimal number2 = BigDecimal.TEN;
        BigDecimal number3 = new BigDecimal("45");
        BigDecimal number4 = new BigDecimal("2");
        System.out.println(number3.divide(number2));
        System.out.println(number.add(number2));
    }
}
