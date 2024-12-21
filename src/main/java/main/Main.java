package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.CommentService;

public class Main {
	public static void main(String[] args) {

		//DBCommentRepository commentRepository = new DBCommentRepository();
		//EmailCommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService cs1 = context.getBean(CommentService.class);
		CommentService cs2 = context.getBean(CommentService.class);
		System.out.println("are they equal? : "+(cs1 == cs2));
		Comment comment = new Comment();
		comment.setAuthor("James Joyce");
		comment.setText("Demo test");
		//commentService1.publishComment(comment);

	}
}
