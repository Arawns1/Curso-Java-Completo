package Ex3;
import java.util.Locale;

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Employee p1 = new Employee();
		System.out.println(p1);
		p1.IncreseSalary();
		
	}

}
