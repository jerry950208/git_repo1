package sample1;

public class HelloSpring {
	public static void main(String[] args) {
		// 의존성이 높은 프로그램
//		MessageBeanEn beanEn = new MessageBeanEn();
//		beanEn.sayHello();
		
		MessageBeanKr beanKr = new MessageBeanKr();
		beanKr.tellMe();
	}
	
}
