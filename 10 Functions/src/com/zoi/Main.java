package com.zoi;

import java.util.Arrays;

public class Main {

    //реалізація методу, що не повертає значення
    public static void myFunction1(String line){
        System.out.println(line);
    }

    //реалізація методу, що повертає значення
    public static int myFunction2(int[] mass){
        int summa=0;
        for (int i = 0; i<mass.length; i++)
            summa += mass[i];

        return summa;
    }

    public static void main(String[] args) {

	myFunction1("Приклад виведення рядка, який передається до функції");

    int[] massive = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println("Сума елементів масиву, розрахована в методі: " + myFunction2(massive));

   }

}
