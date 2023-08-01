package com.ginimbi;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
//    Loops
        String[] names = {
                "Genius",
                "Genus",
                "Gin"
        };
//        for (int i =0; i< names.length; i++){
//            System.out.println(names[i]);
//        };

//        Enhanced for loop
        for (String name : names){
            System.out.println(name);
        }
    }


}