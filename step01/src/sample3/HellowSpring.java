package sample3;

public class HellowSpring {
	public static void main(String[] args) {
		// factory 패턴 이용
		
//		BeanFactory factory = new BeanFactory();
//		MessageBean bean = factory.getBean("en");	// 팩토리로부터 객체 얻어오기
//		bean.sayHello();
		
		BeanFactory factory = new BeanFactory();
		MessageBean bean = factory.getBean("kr");
		bean.sayHello();
	}
}
