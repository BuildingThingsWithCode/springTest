package services;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import main.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
public class CommentService {
	
	private final CommentRepository commentRepository;
	private final CommentNotificationProxy commentNotificationProxy;
	private Logger logger = Logger.getLogger(CommentService.class.getName());
	
	@Autowired
	public CommentService(CommentRepository commentRepository, @Qualifier("TEXT") CommentNotificationProxy commentNotificationProxy) {
		this.commentRepository = commentRepository;
		this.commentNotificationProxy = commentNotificationProxy;
	}
	
	public String publishComment (Comment comment) {
		//commentRepository.storeComment(comment);
		//commentNotificationProxy.sendComment(comment);
		logger.info("Publishing comment: "+comment.getText());
		return "Succes";
	}
}
