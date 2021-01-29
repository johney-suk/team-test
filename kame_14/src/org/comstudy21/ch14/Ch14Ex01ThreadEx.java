package org.comstudy21.ch14;




public class Ch14Ex01ThreadEx {
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			// 0.1초에 한번씩 반복하기(인터럽터 발생시키기)
			 try {Thread.sleep(1000);}
			catch(InterruptedException e) {}
			System.out.println(thread.getName()); // main도 단일 쓰레드이다.
		}
	}

}
