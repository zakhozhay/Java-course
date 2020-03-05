package com.zoi;

public class Main {

    public static void main(String[] args) {

     /*
      Имена переменных могут содержать буквы, цифры, символы Unicode.
      Переменные могут начинаться со знаков _ или $ (как, например, в PHP), однако это запрещено соглашением Java Code Convention.
      Также по этому соглашению принято начинать именя переменных со строчных букв, а имена классов - с заглавных.
      Также нельзя имена переменных задавать зарезервированными словами, например static, public, final и др.
      Java это С-подобный язык, поэтому все структуры чувствительны к регистру.
     */
     /*В Java как и в других С-подобных, строго типизированных языкак используется явное приведение типов.
     Например, строка byte i = i + 1 будет выдавать ошибку, так как 1 принимается как константа типа данных  int.
     Поэтому, нужно применить приведение в виде: byte i = (byte) (i + 1).
     Также все вещественные константы в Java воспринимаются как double. Поэтому, для типа данных float тоже нужно приведение,
     а константы указываются с индекосом типа в конце. Например, float pi = 3.14f; Приведение делает аналогично с int
     float j = (float) (j + 3.8); так как все вещественные константы по умолчанию определяются как double.
      */

     // целочисленные типы данных
     byte var1 = 15; //байтовый тип, принимает значения от -128 до 127
     short var2 = 8543; // двухбайтовый тип, принимает значения от -32768 до 32767
     int var3 = 12653; //четырехбайтовый тип, принимает значения от -2147483648 до 2147483647
     long var4 = 234278347; //восьмибайтовый тип, принимает значения от -9223372036854775808 до 9223372036854775807

     //вещественные типы данных
     float var5 = 23.46e-5f; //четырехбайтовый тип, принимает значения 1.4е-45 .... 3.4.e38
     double var6 = 3457.34645f; //восьмибайтовый тип, принимает значения 4.9е-324 ..... 1.8е308

     //Символьные типы данных
     char var7 = 'g'; // представляет один двухбайтный Unicode символ, минимальное значение '\ u0000' максимальное '\ uffff'
                    // значения єтого типа можно задавать при помощи соответствующих ASCII-кодов
     String var8 = "Строка символов"; //строковый тип, содержит массив символов

     //логические типы данных
     boolean var9 = true; //принимает только два значения: true (или 1) и false (или 0)

     System.out.println("Переменная byte=" + var1);
     System.out.println("Переменная short=" + var2);
     System.out.println("Переменная int=" + var3);
     System.out.println("Переменная long=" + var4);
     System.out.println("Переменная float=" + var5);
     System.out.println("Переменная double=" + var6);
     System.out.println("Переменная char=" + var7);
     System.out.println("Переменная String=" + var8);
     System.out.println("Переменная boolean=" + var9);


        }
}
