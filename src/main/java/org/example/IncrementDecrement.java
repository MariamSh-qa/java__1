package org.example;

public class IncrementDecrement {
    public static void main(String[] args) {
        //increment && Decrement

        //increment
        int a = 5;
        System.out.println(a); //First will be 5. Then Increase.
        System.out.println(++a);
        System.out.println(a++);
        a++;
        System.out.println(a);


        int c = 7;
        System.out.println(c++);
        System.out.println(++c);


        int d = 5;
        int e = d++;
        System.out.println(d);
        System.out.println(e);


        //Decrement
        int b = 5;
        b--;
        System.out.println(b);




    }
}
