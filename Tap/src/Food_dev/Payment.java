package Food_dev;

public class Payment {

        String paymentMode;
        boolean paymentStatus;

        Payment(String paymentMode) {
            this.paymentMode = paymentMode;
            this.paymentStatus = false;
        }

        void makePayment(double amount) {
            paymentStatus = true;
            System.out.println("Payment of ₹" + amount + " successful using " + paymentMode);
        }
    }


