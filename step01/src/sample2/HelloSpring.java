package sample2;

public class HelloSpring {
	public static void main(String[] args) {
		// 다형성 이용
		MessageBean bean1 = new MessageBeanEn();
		bean1.sayHello();
		
		MessageBean bean2 = new MessageBeanKr();
		bean2.sayHello();
	}
}
