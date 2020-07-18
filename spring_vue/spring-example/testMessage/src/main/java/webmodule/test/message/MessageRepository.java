package webmodule.test.message;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {
	
	public void saveMessage(Message message) {
		System.out.println("saved!: " + message.getText());
	}
}
