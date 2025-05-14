import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        Product biscuit = new Product("Biscuit", 384.03);
        Product chocolate = new Product("Choco Chocolate", 125.88);
        Product cake = new Product("Cake", 1335.88);

        ArrayList<Product> myProductCart = new ArrayList<Product>();
        myProductCart.add(biscuit);
        myProductCart.add(chocolate);
        myProductCart.add(cake);

        Order myOnlineOrder = new Order(2245, myProductCart);

        Payment onlinePayment = new Payment();

        //makePayment
        onlinePayment.CardPayment(myOnlineOrder, 2500, "1234567523549876");
    }
}
