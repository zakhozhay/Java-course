package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть значення для обмеження інкрементування");
        int result = scanner.nextInt();

        int var=0;
        while(var < result){
            var++;
            System.out.println(var);
        }

    }
}
