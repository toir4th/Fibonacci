package com.erkki.fibonacci;


public class FibonacciNumber {

    private static int nth;

    FibonacciNumber(int nth) {
        this.nth = nth;
    }

    public static String getNumber() {
        int number = 0;
        for(int i=1; i<=nth; i++){
            number = fibonacciRecusion(i);
        }
        return String.valueOf(number);
    }

    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }
}
