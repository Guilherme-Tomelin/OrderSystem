package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import entitiesEnums.OrderStatus;
import java.util.List;
import java.util.ArrayList;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> items = new ArrayList<OrderItem>();
    private Client client;


    //---------------------------------------------Constructors---------------------------------------------
    public Order(){}

    public Order(Date moment, OrderStatus status, List<OrderItem> items, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }


    //---------------------------------------------GetSet---------------------------------------------

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    //---------------------------------------------Methods---------------------------------------------


    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item){
        items.remove(item);
    }

    //return total value of items
    public Double total(){
        double sum = 0.0;

        for(OrderItem it : items){ //for each items on my OrderItem, DO
            sum += it.subTotal();
        }
        
        return sum;
    }

    @Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
