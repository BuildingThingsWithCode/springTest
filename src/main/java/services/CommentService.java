package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import main.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
@Lazy
public class CommentService {
	
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	
	@Autowired
	public CommentService(CommentRepository commentRepository, @Qualifier("TEXT") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
		System.out.println("Commentservice is created");
	}
	
	public void publishComment (Comment comment) {
		commentRepository.storeComment(comment);
		commentNotificationProxy.sendComment(comment);
	}
}
