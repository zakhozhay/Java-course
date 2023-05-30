package com.zoi;

import java.util.Scanner;

import java.util.function.ToIntFunction;

public class Main {

    public static <string> void main(String[] args) {
        //Приклад потокового виводу
        System.out.print("Hello World! \t" + "\t" + ""); //виведення рядка без переведення курсору на новий рядок
        System.out.println(); // Переведення курсору на новий рядок
        System.out.println("Привіт Світ!"); //Виведення рядка і переведення курсору на новий рядок

        //Ілюстрація потокового вводу
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть цілочисельну змінну");
        int var_int = scanner.nextInt();
        System.out.println("Введене значення дорівнює "+ var_int);

        System.out.print("Введіть істотну змінну");
        float var_float = scanner.nextFloat();
        System.out.println("Введене значення дорівнює "+ var_float);

        System.out.print("Введіть рядкову змінну");
        String var_string = scanner.next(); //або частіше використовують nextLine()
        System.out.println("Введене значення дорівнює "+ var_string);


    }
}
