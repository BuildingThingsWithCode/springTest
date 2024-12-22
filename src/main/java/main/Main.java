package main;

import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.ProjectConfig;
import services.CommentService;

public class Main {
	
	private static Logger logger = Logger.getLogger(Main.class.getName());
	
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		CommentService commentService = context.getBean(CommentService.class);
		Comment comment = new Comment();
		comment.setAuthor("James Joyce");
		comment.setText("Demo test");
		String value = commentService.publishComment(comment);
		logger.info(value);
	}
}
