package org.comstudy21;

public class HelloWorld {
	
	public void sayHello(String[] args) {
		String txtMsg = String.format("%s님 %s", args);
		System.out.println(txtMsg);
	}
	
	// 오버로딩 
	public void sayHello(String user, String message) {
		sayHello(new String[] {user, message});
	}
	
	public static void main(String[] args) {
		HelloWorld obj = new HelloWorld();
		
		if(args.length == 2 ) {
			obj.sayHello(args);
			return;
		}
		
		// 객체(인스턴스) 메소드 호출
		obj.sayHello(new String[]{"홍길동", "안녕하세요"});
	}

}
