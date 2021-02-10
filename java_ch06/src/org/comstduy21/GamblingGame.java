package org.comstduy21;

// 10번
// https://webclub.tistory.com/164
// https://luyin.tistory.com/417
import java.util.Scanner;

class Person {
	String name;
	int num1, num2, num3;

	Person(String name) {
		this.name = name;
	}

	boolean game() {
		num1 = (int) (Math.random() * 3 + 1);
		num2 = (int) (Math.random() * 3 + 1);
		num3 = (int) (Math.random() * 3 + 1);
		System.out.println(num1 + "  " + num2 + "  " + num3 + "  ");
		if (num1 == num2 && num1 == num3) {
			return true;
		} else {
			return false;
		}
	}
}

public class GamblingGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		String name = scan.next();

		Person person1 = new Person(name);

		System.out.print("2번째 선수 이름>>");
		name = scan.next();

		Person person2 = new Person(name);

		while (true) {
			System.out.print("[" + person1.name + "]:<Enter>");
			String strLine = scan.nextLine();

			if (person1.game()) {
				System.out.println(person1.name + "님이 이겼습니다!");
				break;
			} else {
				System.out.println("아쉽군요!");

				System.out.println("[" + person2.name + "]:<Enter>");
				strLine = scan.nextLine();

				if (person2.game()) {
					System.out.println(person2.name + "님이 이겼습니다!");
					break;
				}
				System.out.println("아쉽군요!");
			}
		}
	}
}
