package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.CommentService;

public class Main {
	public static void main(String[] args) {

		//DBCommentRepository commentRepository = new DBCommentRepository();
		//EmailCommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		context.getBean(CommentService.class);
		Comment comment = new Comment();
		comment.setAuthor("James Joyce");
		comment.setText("Demo test");
		//commentService1.publishComment(comment);

	}
}
