package org.comstduy21;
//11��
//quiz �̿ϼ�
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CapitalGame {
	HashMap<String, String> map = new HashMap<String, String>();
	Scanner scan = new Scanner(System.in);

	CapitalGame() {
		map.put("�ѱ�", "����");
		map.put("�׸���", "���׳�");
		map.put("ȣ��", "ĵ����");
		map.put("��Ż����", "�θ�");
		map.put("����", "����");
		map.put("�߽���", "�߽��ڽ�Ƽ");
		map.put("����", "����");
		map.put("�߱�", "����¡");
		map.put("�Ϻ�", "����");

	}

	void run() {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		while (true) {
			System.out.print("�Է�:1, ����:2, ����:3>> ");
			int menu = scan.nextInt();
			switch (menu) {
			case 1:
				input();
				break;
			case 2:
				quiz();
				break;
			case 3:
				finish();
				return;
			}
		}

	}

	private void input() {
		int n = map.size();
		System.out.println("���� " + n + "�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");

		while (true) {
			System.out.print("����� ���� �Է�" + n + ">> ");
			String country = scan.next();
			String capital = scan.next();
			if (map.containsKey(country)) {
				System.out.println(country + "�� �̹� �ֽ��ϴ�!");
				continue;
			}

			if (country.equals("�׸�")) {
				break;
			}

			map.put(country, capital);
			n++;
		}
	}

	private void quiz() {
		Set<String> keys = map.keySet(); // Ű�� ���� ���� ����
		String[] arr = (String[]) keys.toArray();
		while (true) {
			int ran = (int) (Math.random() * arr.length);
			System.out.print(ran + "�� ������? ");
			
			String mycapital = scan.next();
			String answer =arr[ran]; //?
				
			if(mycapital.equals(answer)){
				System.out.println("����!");
			}else {
				System.out.println("�ƴմϴ�!");
			}
				
		}

	}

	private void finish() {
		System.out.println("������ �����մϴ�.");
	}

	public static void main(String[] args) {
		CapitalGame game = new CapitalGame();
		game.run();

	}
}