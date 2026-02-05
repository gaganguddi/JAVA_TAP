package Food_dev;

public class Order {
    int orderId;
    MenuItem item;
    int quantity;
    String status;

    Order(int orderId, MenuItem item, int quantity){
        this.orderId = orderId;
        this.item = item;
        this.quantity = quantity;
        this.status = "Placed";
    }

    double calculateBill(){
        return item.price*quantity;
    }
    void showOrder(){
        System.out.println("Order ID: "+ orderId);
        System.out.println("Item: " + item.foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: ₹" + calculateBill());
        System.out.println("Status: " + status);

    }
}
