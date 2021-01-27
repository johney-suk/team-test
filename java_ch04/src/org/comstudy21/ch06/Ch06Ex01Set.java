package org.comstudy21.ch06;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ch06Ex01Set {
	static Random rand = new Random();

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("kim", "사장");
		map.put("lee", "비서");
		map.put("park", "종업원");
		Collection values = map.values();
		Iterator<String> valuesIter = values.iterator();
		while(valuesIter.hasNext()) {
			System.out.println(valuesIter.next());
		}

	}

	public static void example(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();

		while (lotto.size() < 6) {
			lotto.add(1 + rand.nextInt(6));
		}
		Iterator<Integer> iter = lotto.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + "  ");
		}
	}

	public static void exam(String[] args) {
		HashSet<String> set = new HashSet<String>();

		set.add("오징어");
		set.add("꼴뚜기");
		set.add("오징어");
		set.add("대구");

		System.out.println("현재 set에 담긴 데이터의 수 : " + set.size());

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}
		// set에 있는 내용을 옮겨 담을 배열 선언
		String[] fishArr = new String[set.size()];
		set.toArray(fishArr);
		for (String fish : fishArr) {
			System.out.println(fish);
		}

	}

}
