import java.util.ArrayList;

public class Order {

    private int orderId;
    private ArrayList<Product> productList;
    private double totalValue;

    //Constructor
    public Order(int orderId, ArrayList<Product> products) {
       this.orderId = orderId;
       this.productList = products;
    }

    public double GetOrderValue(){
         totalValue = 0;
        for (Product product : productList) {
            totalValue = totalValue + product.productValue;
        }
        return totalValue;
    }
}





