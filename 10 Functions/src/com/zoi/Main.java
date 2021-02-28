package com.zoi;

import java.util.Arrays;

public class Main {

    //реализация метода, не возвращающего значение
    public static void myFunction1(String line){
        System.out.println(line);
    }

    //реализация метода, возвращающего значение
    public static int myFunction2(int[] mass){
        int summa=0;
        for (int i = 0; i<mass.length; i++)
            summa += mass[i];

        return summa;
    }

    public static void main(String[] args) {

	myFunction1("Пример вывода строки, которя передается в функцию");

    int[] massive = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
	System.out.println("Сумма элементов массива, расчитанная внутри метода: " + myFunction2(massive));

   }

}
