package org.comstudy21.ch06_5;
class Point3D{

	
public class Point3D7 extends Point {
	int z;
	public Point3D7(int x, int y) {
		super(x, y);
	}
	public Point3D7(int x, int y, int z) {
		this(x,y);
		this.z= z;
	}
		public void moveUp() {
			z++;
		}
		
		private void moveDown() {
			z--;
		}
		
		public void move(int x, int y) { // 하나더 추가
			move(x,y);
			
		}
		public String toString() {
			return ("(" + getX() + "," + getY()+"," + z+ ")의 점");
		}	
	}


	public static void main(String[] args) {
		   Point3D7 p = new Point3D7(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
		   System.out.println(p.toString()+"입니다.");
		   p.moveUp(); // z 축으로 위쪽 이동
		   System.out.println(p.toString()+"입니다.");
		   p.moveDown(); // z 축으로 아래쪽 이동
		   p.move(10, 10); // x, y 축으로 이동
		   System.out.println(p.toString()+"입니다.");
		   p.move(100,  200, 300); // x, y, z축으로 이동
		   System.out.println(p.toString()+"입니다.");
		}


	


	}


