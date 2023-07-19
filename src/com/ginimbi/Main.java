package com.ginimbi;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ginimbi");
        Point pointA = new Point(15,10);
//        System.out.println(pointA);
        Point pointB = pointA;
        pointA.x=100;
        System.out.println(pointA);
        System.out.println(pointB);
    }
}