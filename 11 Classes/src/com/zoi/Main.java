package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Player user = new Player((byte) 26, Math.random());
		Player computer = new Player((byte) 18, Math.random());
		Player winner = new Player();
		Scanner input = new Scanner(System.in);

		System.out.print("Оберіть дію: 1 - штовхнути, 2 - піти  ");
		switch (input.next()) {
			case "1":
				user.push();
				break;
			case "2":
				user.pass();
				return;
			default:
				System.out.println("Неверний вибір");
				return;
		}
		double advantage = 0; // В цьому випадку ініціалізація значенням обов'язкова, так як середовище відслідковує
							  // можливу помилку часу виконання, коли виконується третя гілка при рівних силах.
							  // В ній нема визначення величини змінної advantage.
							  // Тому, або так, або в третю гілку треба писати advantage = 0;
							  // (що, звичайно, краще, так як може зекономити зайву команду до виконання.)
		if (user.force > computer.force) {
			winner = user; advantage = user.force - computer.force;
		}
		else if (user.force < computer.force) {
			winner = computer;
			advantage = computer.force - user.force;
		}
		else {
			System.out.println("Нічия");
		}
		System.out.println("В цій схватці переміг "+ winner.name); //Припускається отримувати системний ідентифікатор
																	// екземпляра класу і просто: System.out.print(winner);
		System.out.println("Дані переможця: Вік: " + winner.age + ", Сила: " + winner.force + ". Перевага в силі: " + advantage);

	}
}
