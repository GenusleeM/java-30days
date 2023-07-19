package com.ginimbi;

import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Arrays
        int[] numbers = new int[3];
        numbers[0]=4;
        numbers[1]=8;
        numbers[2]=10;

        System.out.println(Arrays.toString(numbers));

        int[] numbers2 = {0,1,2,3,4,5};

        System.out.println(Arrays.toString(numbers2));

        String [] names = {"Gie", "Lee"};
        System.out.println(Arrays.toString(names));

//        0 and null values for arrays
        int[] nums = new int[3];
        Arrays.fill(nums, 5);
        nums[2] =25;
        System.out.println(Arrays.toString(nums));

        String[] name = new String[3];
        Arrays.fill(name, "foo");
        name[1] ="Genus lee";
        System.out.println(Arrays.toString(name));

    }
}
