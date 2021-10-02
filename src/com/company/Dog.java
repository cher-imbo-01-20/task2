package com.company;

public class Dog {
    String name;
    Byte age;
    Dog(String n, Byte a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Byte AgeToHu () {
        return  (byte) (age * 7);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
