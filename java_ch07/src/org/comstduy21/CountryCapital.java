package org.comstduy21;

//11
//������
//https://djusti.tistory.com/25
import java.util.Scanner;
import java.util.Vector;

class tmp {
	String country;
	String city;

	tmp(String country, String city) {
		this.country = country;
		this.city = city;
	}

}

public class CountryCapital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Vector<tmp> vec = new Vector<tmp>();
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		vec.add(new tmp("�ѱ�", "����"));
		vec.add(new tmp("�׸���", "���׳�"));
		vec.add(new tmp("ȣ��", "ĵ����"));
		vec.add(new tmp("��Ż����", "�θ�"));
		vec.add(new tmp("����", "����"));
		vec.add(new tmp("�߽���", "�߽��ڽ�Ƽ"));
		vec.add(new tmp("����", "����"));
		vec.add(new tmp("�߱�", "����¡"));
		vec.add(new tmp("�Ϻ�", "����"));
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				System.out.println("���� " + vec.size() + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
				while (true) {
					System.out.print("����� ���� �Է�" + (vec.size() + 1) + ">> ");
					String country = scan.next();
					if (country.equals("�׸�")) {
						break;
					}

				}

//			input();
				break;
			case 2:

//			quiz();
				break;
			case 3:
				break;
			}

		}

	}

}