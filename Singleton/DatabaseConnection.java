package Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = new DatabaseConnection();

    //private Constructor
    private DatabaseConnection() {
        
    }

    public static DatabaseConnection Connection()
    {
        return instance;
    }


    public void TestConnection()
    {
        System.out.println("Connection Success");
    }
}