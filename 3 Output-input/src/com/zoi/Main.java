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

        System.out.print("Введите целочисленную переменную");
        int var_int = scanner.nextInt();
        System.out.println("Введенное значение равно "+ var_int);

        System.out.print("Введите вещественную переменную");
        float var_float = scanner.nextFloat();
        System.out.println("Введенное значение равно "+ var_float);

        System.out.print("Введите строковую переменную");
        String var_string = scanner.next(); //или чаще используют nextLine()
        System.out.println("Введенное значение равно "+ var_string);


    }
}
