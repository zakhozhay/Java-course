package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int var1, var2;
	double var3;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите основание: ");
        var1 = input.nextInt();
        System.out.print("Введите показатель степени: ");
        var2 = input.nextInt();
        var3 = Math.pow(var1, var2); //использование математической функции pow(double, double)
                                     //с неявным преобразованием типов аргументов из int в double
        System.out.print("Результат возведения var1 в степень var2 равен:  " + var3);
    }
}
