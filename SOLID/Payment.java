public class Payment {
    
    public void CashPayment(Order order,double payment){
        //Cash Payment Logic
        System.out.println("Payment Successful");
        System.out.println("Order Value " + order.GetOrderValue());
        System.out.println("Payment " + payment);
    }

     
    public void CardPayment(Order order,double payment,String cardNumber){
        //Card Payment Logic
        System.out.println("Payment Successful");
        System.out.println("Order Value " + order.GetOrderValue());
        System.out.println("Payment " + payment + " From Card " + cardNumber);
    }
}











