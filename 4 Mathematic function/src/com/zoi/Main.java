package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int var1, var2;
	double var3;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть основу: ");
        var1 = input.nextInt();
        System.out.print("Введіть покажчик ступеню: ");
        var2 = input.nextInt();
        var3 = Math.pow(var1, var2); //використання математичної функції pow(double, double)
                                     //з неявним перетворенням типів аргументів з int в double

        System.out.print("Результат возведення var1 в ступінь var2 дорівнює:  " + var3);
    }
}
