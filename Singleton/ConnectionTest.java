package Singleton;

public class ConnectionTest {
    public static void main(String[] args) {
        DatabaseConnection myConnection  = DatabaseConnection.Connection();
        myConnection.TestConnection();
    }
}
