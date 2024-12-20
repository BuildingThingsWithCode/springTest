package repositories;

import org.springframework.stereotype.Component;

import main.Comment;

@Component
public class DBCommentRepository implements CommentRepository {
	
	@Override
	public void storeComment(Comment comment) {
		System.out.println("Storing comment: " + comment.getText());
	}
}
