package com.zoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Player user = new Player((byte) 26, Math.random());
		Player computer = new Player((byte) 18, Math.random());
		Player winner = new Player();
		Scanner input = new Scanner(System.in);

		System.out.print("Выберите действие: 1 - толкнуть, 2 - уйти  ");
		switch (input.next()) {
			case "1":
				user.push();
				break;
			case "2":
				user.pass();
				return;
			default:
				System.out.println("Неверный выбор");
				return;
		}
		double advantage = 0; // В этом случае инициализация значением обязательна, так как среда отследживает
							  // возможную ошибку времени выполнения, когда выполняется третья ветвь при равных силах.
							  // В ней нет определения значения переменной advantage.
							  // Поэтому, либо так, либо в третью ветвь писать advantage = 0;
							  // (что конечно лучше так как может экономить лишнюю команду к выполнению.)
		if (user.force > computer.force) {
			winner = user; advantage = user.force - computer.force;
		}
		else if (user.force < computer.force) {
			winner = computer;
			advantage = computer.force - user.force;
		}
		else {
			System.out.println("Ничья");
		}
		System.out.println("В этой схватке победил "+ winner.name); //Допускается получать системный идентификатор
																	// экземпляра класаа и просто : System.out.print(winner);
		System.out.println("Данные победителя: Возраст: " + winner.age + ", Сила: " + winner.force + ". Преимущество в силе: " + advantage);

	}
}
