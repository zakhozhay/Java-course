package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начальное значение для инкрементирования (конечное 5):");
        int result = scanner.nextInt();

        do {
            result++;
            System.out.println(result);
        } while(result < 5);

    }
}
