package com.zoi;

import java.util.Scanner;

public class Main {

    public static int fibonacci(int n){
        int result;
        int fibonacci1;
        int fibonacci2;
        System.out.println("Call function fibonacci(" + n + ")...");
        if (n < 3)
        {
            result = 1;
        }
        else
        {
            fibonacci1 = fibonacci(n - 1);
            fibonacci2 = fibonacci(n - 2);
            result = fibonacci1 + fibonacci2;
        }
        System.out.println("Result of fibonachi(" + n + ") = " + result);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter number of Fibonacci element: ");
        int number = input.nextInt();
        System.out.println(number + "th element of Fibonacci is " + fibonacci(number));
    }
}
