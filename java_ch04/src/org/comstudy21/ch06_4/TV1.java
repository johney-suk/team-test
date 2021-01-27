package org.comstudy21.ch06_4;

class TV {
	public String brand;
	public int year;
	public int inch;

	public TV(String brand, int year, int inch) {
		this.brand = brand;
		this.inch = inch;
		this.year = year;
	}

	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	//	String s= String.format(brand, null)
	}
}

public class TV1 {
	public static void main(String[] args) {
		TV myTV = new TV("LG",2017, 32); // LG에서 만든 2017년 32인치
		myTV.show();
	}

}
