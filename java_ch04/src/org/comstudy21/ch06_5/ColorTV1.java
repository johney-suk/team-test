package org.comstudy21.ch06_5;

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	protected int getSize() { // 같은 클래스나 상속문
		return size;
	}
}

public class ColorTV1 extends TV {
	public int color;

	public ColorTV1(int size, int color) {
		super(size);
		this.color = color;
	}

	public void printProperty() {
		System.out.println(getSize() + "인치" + color + "컬러");
	}

	public static void main(String[] args) {
		ColorTV1 myTV = new ColorTV1(32, 1024);
		myTV.printProperty();
	}
}

class IPTV extends ColorTV1 {
	String IP;

	public IPTV(String IP, int size, int color) {
		super(size, color);  // super this 순서 지키기
		this.IP = IP;

	}

	public void printProperty() {
			System.out.println("나의 IPTV는 " + IP + " 주소의 " + getSize() + "인치 " + color + "컬러");
			
}
	public static void main(String[] args) {
		IPTV myTV2 = new IPTV("192.1.1.2", 32, 2048);
		myTV2.printProperty();
	}
}
