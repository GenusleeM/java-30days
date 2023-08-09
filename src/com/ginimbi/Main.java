package com.ginimbi;

import java.awt.*;
import java.util.Locale;

public class Main {
    public  static  String foo = "bar";
    public static void main(String[] args) {
        try {
            System.out.println(devide(10,0));
        } catch (MyCheckedException e) {
            throw new RuntimeException(e);
        }

    }
    public  static int devide(int a, int b) throws MyCheckedException{
        if (b==0){
            throw  new MyCheckedException("Cant divide by zero");
        }
        return a/b ;
    }

}