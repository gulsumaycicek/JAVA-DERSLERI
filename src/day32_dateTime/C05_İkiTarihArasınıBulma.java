package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_İkiTarihArasınıBulma {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1990,8,8);

        System.out.println(Period.between(dogumGunu,bugun));//P31Y7M23D

        System.out.println(Period.between(dogumGunu,bugun).getYears());//31


    }
}
