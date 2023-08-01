package com.ginimbi;

import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//    Switch Statement

        char grade = 'A';

        switch (grade){
            case 'A':
                System.out.println("Ginimbi");
                break;
            default:
                System.out.println("Zadhakwa");
        }

      String result =  switch (grade){
            case 'A' -> "Excellent";
          default ->"Fail";
        };

        System.out.println(result.toLowerCase(Locale.ROOT));
    }

}