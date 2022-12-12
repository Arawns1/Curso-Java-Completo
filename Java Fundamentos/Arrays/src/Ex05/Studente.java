package Ex05;

public class Studente {
	String name;
	String email;
	
	public Studente(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	public String toString() {
		return this.name
			+ ", "
			+ this.email;
	}
	
}
