package org.comstduy21;

//3��
//https://coding-factory.tistory.com/556
import java.util.HashMap;
import java.util.Scanner;

public class HashmapPopulation {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� �Է��ϼ���.(��: Korea 5000)");

		while (true) {
			System.out.println("���� �̸�, �α� >>");
			String country = scan.next(); // ����
			if (country.equals("�׸�")) { // �����ϰ� �˻�
				break;
			}
			int pop = scan.nextInt(); // �α� ����

			nations.put(country, pop); // �ؽøʿ� �μ���
		}
		while (true) {
			System.out.print("�α� �˻� >> ");
			String nation = scan.next();
			if(nation.equals("�׸�")) {
				break;
			}
			Integer population = nations.get(nation);

			if(population ==null) {
	//		if(nations = null) { 
				System.out.println(nation + " ����� �����ϴ�.");
			}else {
				System.out.println(nation + "�� �α��� " + nations.get(nation)); 
			}
		}

	}

}
