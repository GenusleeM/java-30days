package com.ginimbi;

public class Other {
    public static void main(String[] args) {



        Cat star = new Cat("Star", 4, "blue");

        System.out.println(star);

        Cat lee = new Cat("Star", 4, "blue");
        System.out.println(lee);

        System.out.println(star.equals(lee));

        Cat[] priestCats = {
                star,
                lee
        };

        Person genus = new Person("Genuslee","Mapedze",Gender.MALE);
        Person priest = new Person("King ","Priest",Gender.FEMALE, priestCats);

        System.out.println(priest);
    }


}
