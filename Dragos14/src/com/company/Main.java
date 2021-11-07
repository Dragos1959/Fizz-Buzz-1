package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }

            if ((i % 3 != 0) && (i % 5 != 0)) {
                System.out.println("Numarul " +i+ " nu este divizibil nici cu 3 nici cu 5");
            }
        }
    }
}



