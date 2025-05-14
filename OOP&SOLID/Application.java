public class Application {

    //For Run Application
    public static void main(String[] args) {
        
        
        Boat newB = new Boat("null", "asd", 0);
        newB.CheckVehicalStatus();
    }
}


abstract class Vehicle {

    //Propeties
    private String brand;
    private String colour;
    private double number;

    //Constructor Method
    public Vehicle(String brand,String colour,double number) {
       this.brand = brand;
       this.colour = colour;
       this.number = number;
    }

    //Abstract Method
    public abstract void CheckVehicalStatus();
      
}

class Car extends Vehicle {

    public Car(String brand, String colour, double number) {
        super(brand, colour, number);
    }

    public void CarStart(){
        //Car Start Logic
    }

    public void CarStart(int userPassword){
        //Car Start Logic
    }

    @Override
    public void CheckVehicalStatus() {
       //Car Check Status Logic
    }

}

class Boat extends Vehicle {

    public Boat(String brand, String colour, double number) {
        super(brand, colour, number);
       
    }

    public void BoatStart(){
        //Boat Start Logic
    }

    @Override
    public void CheckVehicalStatus()
    {
        //New Logic
        System.out.println("New Boat Status Check");
    }
}

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Elephant extends Animal {
    void trumpet() {
        System.out.println("The elephant trumpets.");
    }
}




class Doctor {
    Patient patient;
}


class CricketTeam {
    List<Player> players;
}

class Person {
    private Heart heart = new Heart();
}


