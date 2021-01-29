package org.comstudy21.ch14;

public class Ch14Ex02Runable implements Runnable {

	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			// 0.1초에 한번씩 반복하기(인터럽터 발생시키기)
			try {
				Thread.sleep(1000);   
			} catch (InterruptedException e) {
			}
			System.out.println(thread.getName()); // main도 단일 쓰레드이다.

		}
	}

	public static void main(String[] args) {
		// Runnable을 Thread로 바꿔서 실행한다.
		Thread myThread = new Thread(new Ch14Ex02Runable());
		myThread.start();

		Thread thread = Thread.currentThread();
		for (int i = 0; i < 50; i++) {
			// 0.1초에 한번씩 반복하기(인터럽터 발생시키기)
			try {
				Thread.sleep(1000);
				if (i == 10) {
					myThread.wait(1000);
				}
			} catch (InterruptedException e) {

			}
			System.out.println(thread.getName()); // main도 단일 쓰레드이다.

		}

	}
}
