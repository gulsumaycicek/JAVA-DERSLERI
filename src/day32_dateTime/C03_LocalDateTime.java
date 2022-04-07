package day32_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihsaat=LocalDateTime.now();

        System.out.println(tarihsaat);//2022-03-31T22:35:37.847209100


        System.out.println( tarihsaat.plusYears(3).plusMonths(2).plusDays(10).plusHours(5).plusMinutes(5));
        //2025-06-11T03:43:10.270991900


    }
}
