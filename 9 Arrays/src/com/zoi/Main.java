package com.zoi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] mass1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        /*інші варіанти оголошення масиву:
        int[] mass = new int[] {значення через кому};
        int[] mass = new int[10];
         */

        for(int i = 0; i < mass1.length; i++) {
            mass1[i] += 10; //додавання 10 до кожного елементу масиву.
            System.out.println(mass1[i]);
        }

        System.out.println();

        System.out.println("Інший варіант виведення масиву: " + Arrays.toString(mass1));

        //робота з багатовимірними масивами на прикладі форматного виведення двовимірного масиву
        int[][] mass2 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(mass2[i][j] + "   ");
            System.out.println();
        }
    }
}
