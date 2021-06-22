package com.springbootrest.restservice.controller;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

class Person {

    private String name;
    private int age;
    private String nationality;

    public Person(String name, int age, String nationality) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    public Person(String name, int age) {
        this(name, age, "");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public static void main(String[] args) {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = Arrays.asList(sara, eva, viktor);
        Function<Person, Integer> f = (person) -> person.getAge();
        Person p = collection.stream().max(Comparator.comparing(f)).get();
        System.out.println(p.getName());

    }
}
