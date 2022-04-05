package sample3;

// 팩토리 패턴으로 객체 생성
// MVC패턴에서 데이터 처리 클래스(if-else) 선택하는방식을 닮아있음
public class BeanFactory {
	public MessageBean getBean(String beanName) {
		MessageBean bean = null;
		if(beanName.equals("en")) {
			bean = new MessageBeanEn();
		} else if(beanName.equals("kr")) {
			bean = new MessageBeanKr();
		}
		return bean;
	}
}
