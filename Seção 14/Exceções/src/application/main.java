package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;
import model.exceptions.DomainException;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			Date checkOut = sdf.parse(sc.next());
			
			
			Reservation r1 = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(r1);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			
			
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());
			
			r1.updateDates(checkIn, checkOut);
			System.out.println(r1);
		}
		catch(ParseException e) {
			System.out.println("Invalid date format");
			System.out.println(e.getMessage());
		}
		catch(DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		finally {
			sc.close();	
		}
		
		
	}

}
