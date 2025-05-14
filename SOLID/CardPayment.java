public class CardPayment extends Payment {

    @Override
    public void Payment(Order order, double payment, String cardNumber) {
       //Card Payment Logic
        System.out.println("Payment Successful");
        System.out.println("Order Value " + order.GetOrderValue());
        System.out.println("Payment " + payment + " From Card " + cardNumber);
    }

    
}





