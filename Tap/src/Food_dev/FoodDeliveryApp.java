package Food_dev;

public class FoodDeliveryApp {
    public static void main(String[] args) {

        Customer customer = new Customer(
                "Gagan", 22, "Bangalore", "9876543210");

        Restaurant restaurant = new Restaurant("Spicy Hub");

        MenuItem item = new MenuItem("Biryani", 180);

        Order order = new Order(101, item, 2);

        Payment payment = new Payment("UPI");

        Delivery delivery = new Delivery("Ravi");

        customer.displayCustomer();
        restaurant.showRestaurant();
        item.displayItem();

        restaurant.acceptOrder();
        order.showOrder();

        payment.makePayment(order.calculateBill());

        delivery.deliverOrder();
    }
}
