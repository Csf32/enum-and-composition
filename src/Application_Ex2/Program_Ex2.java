package Application_Ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities_ex2.Comment;
import entities_ex2.Post;

public class Program_Ex2 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip");
	
		Comment c2 = new Comment("Wow, that's awesome!");

		Post p1 = new Post(
				sdf.parse("21/09/2022 10:43:23"), "Traveling to USA", 
				"I'm gonna visit this wonderful country!", 
				12);
		
	
		p1.addComment(c1);
		p1.addComment(c2);
	
	System.out.println(p1);
	
	
		
	}

}
