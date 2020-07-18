package webmodule.test.message;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "webmodule.test.msssage")
public class AppConfig {

	// bean 객체 생성  
	// 스프링은 messageRepository라는 함수명으로 Bean 객체를 관리하게 된다.
	// 실제 실행이 되면 messageRepository라는 이름으로 
	// messageRepository 타입을 지닌 객체가 생성
//	@Bean
//	public MessageRepository messageRepository() {
//		return new MessageRepository();
//	}
//	
//	@Bean
//	public MessageService messageService() {
//		return new MessageService(messageRepository());
//	}
}
