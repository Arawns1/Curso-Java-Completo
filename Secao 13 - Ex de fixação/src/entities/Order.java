package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	
	Date moment;
	OrderStatus status;
	Client client;
	List<OrderItem> orderitems = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> orderitems) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.orderitems = orderitems;
	}
	
	public String getMoment() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return sdf1.format(moment);
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getOrderitems() {
		return orderitems;
	}

	public void addItem(OrderItem item){
		orderitems.add(item);
	}
	public void removeItem(OrderItem item){
		orderitems.remove(item);
	}
	public Double total(){
		double sum = 0;
		
		for(OrderItem i : orderitems) {
			sum += i.subTotal();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder s1 = new StringBuilder();
		s1.append("\nOrder Summary: \n");
		s1.append("Order moment: "+ this.getMoment() + "\n");
		s1.append("Order Status: " + this.getStatus() + "\n");
		s1.append("Client: "+ this.client + "\n");
		s1.append("Order items: \n");
		for(OrderItem oi : orderitems) {
			s1.append(oi + "\n");
		}
		s1.append("Total price: $"+ String.format("%.2f", this.total()));
		
		return s1.toString();
	}
	
}
