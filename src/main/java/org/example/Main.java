package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        //Java Primitive Data-Types

        //Whole Numbers (Integer).
        // byte: 1 byte, from -128 to 127
        byte childAge1 = 1;
        byte childAge2 = 2;
        byte childAge3 = 3;
        System.out.println(childAge1-childAge2);
        System.out.println(childAge2);
        System.out.println(childAge1 + "     " +childAge3);

        // short: 2 bytes, -32,768 to 32,767
        short childAge4 = -32768;
        short childAge5 = 4;
        System.out.println(childAge4);
        System.out.println(childAge5);
        System.out.println( childAge4 + childAge5);

        //int: 4 bytes, -2,147,483,648 to 2,147,483,647
        int studentAge = 19;
        int studentAge1 = 20;
        System.out.println(studentAge);
        System.out.println(studentAge - studentAge1);
        System.out.println(studentAge + "   " +studentAge);

        //long: 8 bytes, -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long nameKing = 10500;
        long nameKing1 = 500;
        System.out.println(nameKing);
        System.out.println(nameKing+nameKing1);


        //Decimal Numbers
        //float: 4 bytes, 6 to 7 decimal digits.
        float priceMoney = 4f;
        float priceMoney1 = 5.7f;
        System.out.println(priceMoney);
        System.out.println(priceMoney1);

        //double: 8 bytes, 15 decimals.
        double population = 4;
        double population1 = 14787687;
        System.out.println(population1);
        System.out.println(population1 / population);

        //Boolean: 1 bit, True || False
        boolean isStudent = true;
        System.out.println(isStudent);

        //Char: 2 bytes, one single character, in single quotes ' '
        char score = 'C';
        System.out.println(score);

        /* Data types = byte and so on
        Variable Names = score, isStuent, studentAge and so on
        value = 1, 2, 3 and so on
        assignment operator =
         */


        //Declaration && Initialization. .
        int age;  //this is declaration. We have variable name.
        age = 5;  //This is Initialization. We have Variable name + Value.
        System.out.println(age);

        int age2 = 6;    //together at the Same time. Declaration && Initialization.
        System.out.println(age2);


    }
}
