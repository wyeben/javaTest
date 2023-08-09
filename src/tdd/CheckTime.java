package tdd;

import java.time.LocalDate;
import java.time.LocalTime;

public class CheckTime {
    public static void main(String[] args) {
        LocalDate time = LocalDate.now();
        LocalTime clock = LocalTime.now();
        System.out.println(time);
        System.out.println(clock);
    }
}
