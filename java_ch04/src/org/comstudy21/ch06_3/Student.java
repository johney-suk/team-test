package org.comstudy21.ch06_3;

public class Student {
	static String name;
	static String mj;
	static double score;
	static int rank;
	
	public Student() { }
	public Student(String name, String mj, double score, int rank) {
		this.name = name;
		this.mj = mj;
		this.score = score;
		this.rank = rank;
	}
	@Override  
	public String toString() {
		return "[" + name + ", " + mj + ", " + score + ", " + rank + "]";
	}
}
// CRUD