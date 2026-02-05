package Food_dev;

public class Delivery {

        String deliveryPerson;

        Delivery(String deliveryPerson) {
            this.deliveryPerson = deliveryPerson;
        }

        void deliverOrder() {
            System.out.println("Order delivered by " + deliveryPerson);
        }
    }


