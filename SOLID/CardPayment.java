public class CardPayment extends Payment {
            
    private String  cardNumber;

    public CardPayment(String  cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void Payment(Order order, double payment) {
       //Card Payment Logic
        System.out.println("Payment Successful");
        System.out.println("Order Value " + order.GetOrderValue());
        System.out.println("Payment " + payment + " From Card " + cardNumber);
    }

    
}





