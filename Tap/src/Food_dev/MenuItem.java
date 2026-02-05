package Food_dev;

public class MenuItem {
    String foodName;
    double price;

    MenuItem(String foodName, double price){
        this.foodName = foodName;
        this.price = price;
    }
    void displayItem(){
        System.out.println(foodName+" Rs"+price);
    }
}
