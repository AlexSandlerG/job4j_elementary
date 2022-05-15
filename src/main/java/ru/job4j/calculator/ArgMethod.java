package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static void main(String[] args) {
        int age = 20;
        String name = "Sonya";
        ArgMethod.hello(name, age);
    }
}
