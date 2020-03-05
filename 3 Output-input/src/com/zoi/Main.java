package com.zoi;

import java.util.Scanner;
import java.util.function.ToIntFunction;

public class Main {

    public static <string> void main(String[] args) {
        //Пример потокового вывода
        System.out.print("Hello World!"); //вывод строки без перевода курора на новую строку
        System.out.println(); // Перевод курсора на новую строку
        System.out.println("Привет Мир!"); //Вывод строки и перевод курора на новую строку

        //Иллюстрация потокового ввода
        Scanner scanner = new Scanner(System.in);
        int result = scanner.nextInt();
        System.out.println("Введенное значение равно "+ result);
        float sym = scanner.nextFloat();
        System.out.println("Введенное значение равно "+ sym);


    }
}
