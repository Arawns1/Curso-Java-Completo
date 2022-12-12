package Ex4;

import java.util.Scanner;

public class Strudent {
	
	double n1, n2, n3, total;
	
	Scanner sc = new Scanner(System.in);
	
	public Strudent(){
		System.out.print("First Grade:");
		n1 = sc.nextDouble();
		System.out.print("Second Grade:");
		n2 = sc.nextDouble();
		System.out.print("Third Grade:");
		n3 = sc.nextDouble();
		total = n1 + n2 + n3;
	}
	
	public void finalGrade() {
		if(total >= 60) {
			System.out.println("FINAL GRADE = "+ this.total);
			System.out.println("PASS");
		}
		else {
			System.out.println("FINAL GRADE = "+ this.total);
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - this.total) + " POINTS");
		}
	}
	
	
	
}
