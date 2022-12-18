package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {

	Date moment = new Date();
	OrderStatus status;
	Client client;
	List<OrderItem> orderitems = new ArrayList<>();
	
	public Order(Date moment, OrderStatus status, Client client, List<OrderItem> orderitems) {
		this.moment = moment;
		this.status = status;
		this.client = client;
		this.orderitems = orderitems;
	}
	
	public Date getMoment() {
		return moment;
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
	public void total(){
		for(OrderItem i : orderitems) {
			i.subTotal();
		}
	}
	
	
}
