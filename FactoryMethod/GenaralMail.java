package FactoryMethod;

public class GenaralMail implements IMail{

    @Override
    public void SendMail(String To, String From, String Title, String Body) {
        System.out.println("Genaral Mail Send " + To + " " + From);
        System.out.println("Mail Title " + Title);
        System.out.println("Mail Body " + Body);
    }
    
}
