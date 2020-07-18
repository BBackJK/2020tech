package webmodule.test.message;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessageApplication {
	
	public static void main(String[] args) {
		
		// 빨간 표시가 나옴. 왜? 어플리케이션 컨텍스트가 
		// 관리할 컨테이너의 필요한 설정들을 지정해주지 않아서 나오는것
		// 설정을 지정해주는 방법은 여러가지가 있다.
		// 1. 스프링 어노테이션하는 방법 등등 이 있지만 어노테이션 설정을 선호.
		// ApplicationContext ctx = new ApplicationContext();
		
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		
//		MessageService messageService = ctx.getBean(MessageService.class);
//		
//		messageService.save("hello, spring! this text bean object testing text!");
		
		// xml파일 위치 찾아주기
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config/xmlconfig.xml");
		
		MessageService messageService = ctx.getBean(MessageService.class);
		
		messageService.save("hello, spring! this is Component scan");
	}
}
