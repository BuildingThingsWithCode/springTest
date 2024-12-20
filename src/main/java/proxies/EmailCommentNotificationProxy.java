package proxies;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import main.Comment;

@Component
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for email comment: " + comment.getText());
	}
}
