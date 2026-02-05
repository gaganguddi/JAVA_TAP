package Food_dev;

public class Restaurant {
    String restaurantName;

    Restaurant(String restaurantName){
        this.restaurantName = restaurantName;
    }
    void  showRestaurant(){
        System.out.println("Restaurant: "+restaurantName);
    }
    void acceptOrder(){
        System.out.println("Order accepted by restaurant");
    }

    void cancelOrder(){
        System.out.println("Order cancelled by restaurant");
    }
}
