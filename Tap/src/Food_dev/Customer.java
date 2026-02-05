package Food_dev;

public class Customer {
   String name;
   int age;
   String address;
   String phone;

   Customer(String name, int age, String address, String phone){
       this.name = name;
       this.age = age;
       this.address = address;
       this.phone = phone;
   }

   void displayCustomer(){
       System.out.println("Customer Name: " + name);
       System.out.println("Address: "+ address);
       System.out.println("phone: "+phone);
   }
}
