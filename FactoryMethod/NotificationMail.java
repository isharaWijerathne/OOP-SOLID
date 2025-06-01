package FactoryMethod;

public class NotificationMail implements IMail {

    @Override
    public void SendMail(String To, String From, String Title, String Body) {
        System.out.println("Nothification Mail Send " + To + " " + From);
        System.out.println("Mail Title " + Title);
        System.out.println("Mail Body " + Body);
    }
    
}
