package org.example;

public class Increment {
    public static void main(String[] args) {
        int age = 5;
        age = age + 2;
        //|| age += 2;  Increasing by two, same.
        age = age - 1;
        //|| age -= 1;

        System.out.println(age);


        //Multiply
        int age1 = 6;
        age1 *= 2;
        System.out.println(age1);

        int age2 = 6;
        age2 %= 2;
        System.out.println(age2);


    }
}
