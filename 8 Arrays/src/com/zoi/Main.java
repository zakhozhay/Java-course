package com.zoi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*другие варианты объявления массива:
        int[] mass = new int[] {значения через запятую};
        int[] mass = new int[10];
         */

        for(int i = 0; i < mass1.length; i++) {
            mass1[i] += 10; //прибавление 10 к каждому элементу массива.
            System.out.println(mass1[i]);
        }

        System.out.println();

        System.out.println("Другой вариант вывода массива: " + Arrays.toString(mass1));

        //работа с многомернымыи массивами на примере форматного вывода двухмерного массива
        int[][] mass2 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mass2[i][j] + "   ");
            System.out.println();
        }
    }
}
