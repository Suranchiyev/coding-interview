package com.company;

public class Person {
    public String name;
    public int age;
    public static String address;

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 20;
        person.address = "101 Main st";

        System.out.println(person.name); // John
        System.out.println(person.age); // 20
        System.out.println(person.address); // 101 Main st
        System.out.println("---");

        Person person1 = new Person();
        System.out.println(person1.name); // null
        System.out.println(person1.age); // 0
        System.out.println(person1.address); // 101 Main st
    }
}
