package org.example;

public class PracticeOperations {
    static void main(String[] args) {
        int a = 7;
        int b = 3;

        int sum = a + b;
        int minus = a - b;
        int multiple = a * b;
        int divider = a / b; //But its in int and its showing how much times 3 is in 7.
        double divider1 = a / b; // still will be 2 in result
        double divider2 = (double) a / b;  //This will work correctly.
        //If one of them will be double instead of int, doesnt need to do cast "double" in front of divide a/b.

        double divider3 = a % b; //Showing how much left. %

        System.out.println(a + b );  //||
        System.out.println(sum);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(divider);
        System.out.println(divider1);
        System.out.println(divider2);
        System.out.println(divider3);






    }
}
