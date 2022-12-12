package Exercicio2;

public class Rectangule {
	double width, height;
	
	public Rectangule(double inpWidth, double inpHeight)
	{
		this.width = inpWidth;
		this.height = inpHeight;
		
	}
	public double Area() {
		return width * height;
	}
	public double Perimeter() {
		return 2 * (width + height);
		
	}
	public double Diagonal() {
		return  Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "AREA= "
				+ Area()
				+ "\nPERIMETER= "
				+ Perimeter()
				+ "\nDIAGONAL= " 
				+ Diagonal();
	}
}
