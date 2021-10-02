package com.company;

import java.util.ArrayList;

public class DogHouse {
    ArrayList <Dog> house = new ArrayList<Dog>();
    void test() {
        System.out.println("-------Test Dog------");
        house.add(new Dog("Jessy", (byte) 5));
        house.add(new Dog("Doggy", (byte) 3));
        house.add(new Dog("Gboy", (byte) 2));
        System.out.println(house.get(0).toString()+"\n"+house.get(1).toString()+"\n"+house.get(2).toString());
    }
}
