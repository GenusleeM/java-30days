package com.ginimbi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;

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
        System.out.println(now);
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfWeek());
        System.out.println(now.getDayOfYear());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(5));

//        Localdate
        LocalDate date = LocalDate.now();

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.isBefore(LocalTime.MIDNIGHT));
    };
 private static  int add(int a, int b){
     int result = a + b;
        return result;
    };


// Strings



}
