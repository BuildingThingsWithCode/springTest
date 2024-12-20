package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.Comment;

@Component
@Qualifier("TEXT")
public class TextMessageNotificationProxy implements CommentNotificationProxy {

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for text message comment: " + comment.getText());
		
	}

}
