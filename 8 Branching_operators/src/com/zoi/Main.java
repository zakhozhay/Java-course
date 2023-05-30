package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //оператор if
        int a = 12, b = 24;

        if (a != b) {
            System.out.println("a не дорівнює b");
        }
        else System.out.println("a дорівнює b");

        //оператор switch
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть 1, 2 або 3");
        int result = scanner.nextInt();
        switch (result){
            case 1: System.out.println("Введене значення відповідає 1"); break;
            case 2: System.out.println("Введене значення відповідає 2"); break;
            case 3: System.out.println("Введене значення відповідає 3"); break;
            default: System.out.println("Введене значення відповідає 1, 2 или 3");
        }
    }
}
