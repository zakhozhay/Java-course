package com.zoi;

public class Main {

    public static void main(String[] args) {

     /*
      Імена змінних можуть містити букви, цифри, символи Unicode.
      Змінні можуть починатися зі знаків _ або $ (як, наприклад, в PHP), однак це заборонено угодою Java Code Convention.
      Також по цій угоді прийнято починати імена змінних з рядкових букв, а імена класів - з заголовних.
      Також не можна імена змінних задавати зарезервованими словами, наприклад static, public, final та ін.
      Java це С-подібна мова, тому всі синтаксичні структури регістрозалежні.
     */
     /*В Java, як і в інших С-подібних, строго типизованих мовах, використовується явне перетворення типів.
     Наприклад, рядок byte i = i + 1 буде видавати помилку, так як 1 приймається як константа типу даних int.
     Тому, треба використовувати приведення у вигляді: byte i = (byte) (i + 1).
     Також всі істотні константи в Java сприймаються як double (подібно C#). Тому, для типу даних float також потрібне приведення,
     а константи вказуються з індексом типу наприкінці. Наприклад, float pi = 3.14f; Приведення роблять аналогічно з int
     float j = (float) (j + 3.8); так як усі істотні константи за замовчуванням визначаються як double.
      */

     // цілочисельні типи даних
     byte var1 = 15; //байтовий тип, приймає значення від -128 до 127
     short var2 = 8543; // двохбайтовий тип, приймає значення від -32768 до 32767
     int var3 = 12653; //чотирьохбайтовий тип, приймає значення від -2147483648 до 2147483647
     long var4 = 234278347; //восьмибайтовий тип, приймає значення від -9223372036854775808 до 9223372036854775807

     //вещественные типы данных
     float var5 = 23.46e-5f; //четирьохбайтовий тип, приймає значення 1.4е-45 .... 3.4.e38
     double var6 = 3457.34645f; //восьмибайтовый тип, приймає значення 4.9е-324 ..... 1.8е308

     //Символьні типи даних
     char var7 = 'g'; // представляють один двохбайтовий Unicode символ, мінімальне значення '\ u0000' максимальне '\ uffff'
                    // значення цього типу можна задавати за допомогою відповідних ASCII-кодів
     String var8 = "Рядок символів"; //рядковий тип, містить масив символів

     //логічні типи даних
     boolean var9 = true; //приймає тільки два значення: true (або 1) и false (або 0)

     System.out.println("Змінна byte=" + var1);
     System.out.println("Змінна short=" + var2);
     System.out.println("Змінна int=" + var3);
     System.out.println("Змінна long=" + var4);
     System.out.println("Змінна float=" + var5);
     System.out.println("Змінна double=" + var6);
     System.out.println("Змінна char=" + var7);
     System.out.println("Змінна String=" + var8);
     System.out.println("Змінна boolean=" + var9);


        }
}
