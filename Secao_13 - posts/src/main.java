import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Have a nice tripe!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland","Im going to visit wonderful contry", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
