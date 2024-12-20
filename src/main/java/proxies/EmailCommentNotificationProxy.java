package proxies;

import org.springframework.stereotype.Component;

import main.Comment;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

	@Override
	public void sendComment(Comment comment) {
		System.out.println("Sending notification for comment: " + comment.getText());
	}
}
