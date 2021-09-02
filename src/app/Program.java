package app;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("---------------------------------------------");
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String nameAux = sc.nextLine();
        System.out.print("Email: ");
        String emailAux = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY):");
        Date birthDateAux = sdf.parse(sc.next());

        Client client = new Client(nameAux, emailAux, birthDateAux);

        System.out.println("---------------------------------------------");
        System.out.println("Enter order data:");
		System.out.print("Status (Only: [PENDING_PAYMENT][PROCESSING][SHIPPED][DELIVERED]):");
        OrderStatus status = OrderStatus.valueOf(sc.next()); //input string and return my Integer obj
        System.out.print("How many items to this order? ");
        int orderQuantity = sc.nextInt();


        Order order = new Order(new Date(), status, null, client);

        for(int i = 1 ; i<=orderQuantity ; i++){
            System.out.println("Enter #" + i +" item data:");
            System.out.print("Product name: ");
            sc.nextLine();
			String productNameAux = sc.nextLine();
            System.out.print("Product priece: ");
            double productPriceAux = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantityAux = sc.nextInt();

            Product product = new Product(productNameAux, productPriceAux);
            OrderItem orderItem = new OrderItem(quantityAux, productPriceAux, product); //args -> quantity,priece and Product
            order.addItem(orderItem);	
        }
        System.out.println("---------------------------------------------");
        System.out.println(order);



        sc.close();
    }
}
