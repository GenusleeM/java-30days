package com.ginimbi;

import java.io.InputStream;
import java.math.BigDecimal;
import java.time.*;
import java.util.Locale;
import java.util.Scanner;

public class Fool {
    public static void main(String[] args) {
//        System.out.println(Main.foo);
        int result = add(5, 6);
//        System.out.println(result);

        String name = "Genuslee";
//        System.out.println(name.substring(1));
//        System.out.println(name.replace('e', 'i'));

//        String Litteral vs String Object
        String name1 = "Ginimbi";
        String name22 = "Ginimbi";

        String name2 = new String("Ginimbi");

//        Comparing Strings
//        System.out.println(name1 == name2);
//        System.out.println(name1==name22);
//        System.out.println(name1.equals(name2));


//       String num = String.valueOf(1);
//        System.out.println(num);
//     String format =   String.format("Number %s", num);
//        System.out.println(format);
//        String [] names = {"Ginimbi", "Lloyd"};
//     String join =   String.join(" | ", names);
//        System.out.println(join);


//        LocalDate
      LocalDateTime now =  LocalDateTime.now();
//        System.out.println(now);
//        System.out.println(now.getMonth());
//        System.out.println(now.getDayOfWeek());
//        System.out.println(now.getDayOfYear());
//        System.out.println(now.getDayOfMonth());
//        System.out.println(now.getSecond());
//        System.out.println(now.minusDays(5));

//        Localdate
        LocalDate date = LocalDate.now();

        LocalTime localTime = LocalTime.now();
//        System.out.println(localTime);
//        System.out.println(localTime.isBefore(LocalTime.MIDNIGHT));

//        Creating Specifc dates
    LocalDateTime someDate =    LocalDateTime.of(
                1999,
                Month.OCTOBER,
                19,
                00,
                00

        );
//        System.out.println(someDate);

//        Working with dates
//        System.out.println(ZonedDateTime.now());
//        System.out.println(Instant.now());

//        doubles
////        When dealing with money use bigdecimal
//        BigDecimal num1 = new BigDecimal("0.03") ;
//        BigDecimal num2 = new BigDecimal("0.04") ;
////        double num2 = 0.04;
// BigDecimal result1 = num2.subtract(num1);
//        System.out.println(result1);

//
//        BigDecimal number = BigDecimal.TEN;
//        System.out.println(number);
//        System.out.println(number.max(BigDecimal.ZERO));
//        System.out.println(number.compareTo(BigDecimal.ONE));


//        Scanner
        System.out.println("Whats your name");
        Scanner scanner = new Scanner(System.in);
      String input =  scanner.nextLine();

        System.out.println("Hello "+ input);
        System.out.println("whats your age");
      int age =  scanner.nextInt();
        if (age < 15) {
            System.out.println("You are jus a kid");
        }else {
            System.out.println("Makura baba");
        }
    };
 private static  int add(int a, int b){
     int result = a + b;
        return result;
    };


// Strings



}
