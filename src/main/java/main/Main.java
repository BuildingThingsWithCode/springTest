package main;

import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
	public static void main(String[] args) {

		DBCommentRepository commentRepository = new DBCommentRepository();
		EmailCommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
		CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
		Comment comment = new Comment();
		comment.setAuthor("James Joyce");
		comment.setText("Demo test");
		commentService.publishComment(comment);

	}
}
