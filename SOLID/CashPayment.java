public class CashPayment extends Payment {

    @Override
    public void Payment(Order order, double payment) {
         //Cash Payment Logic
        System.out.println("Payment Successful");
        System.out.println("Order Value " + order.GetOrderValue());
        System.out.println("Payment " + payment);
    }
    
}









