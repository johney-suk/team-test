package org.comstudy21.ch03_2;

public class Student {
	String name;
	String mj;
	double score;
	int rank;
	
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