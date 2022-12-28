package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	private int roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation(int roomNumber, Date checkin, Date checkout)  {
		Date now = new Date();
		if(checkin.before(now) || checkout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkout.after(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Reservation() {
		
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	public int duration() {
		long diff = checkout.getTime() - checkin.getTime(); // getTime retorna em milissegundos
		return (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS); //Time.Unit.... CONVERTE PARA DIAS
	}
	
	public void updateDates(Date chckin, Date chckout) {
		Date now = new Date();
		if(chckin.before(now) || chckout.before(now)) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!chckout.after(chckin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = chckin;
		this.checkout = chckout;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", check-in: "
			+ sdf.format(checkin)
			+ ", checkout: "
			+ sdf.format(checkout)
			+ ", "
			+ duration()
			+ " nights";
	}
}
