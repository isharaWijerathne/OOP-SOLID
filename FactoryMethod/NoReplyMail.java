package FactoryMethod;

public class NoReplyMail implements IMail {

    @Override
    public void SendMail(String To, String From, String Title, String Body) {
        System.out.println("NoReply Mail Send " + To + " " + From);
        System.out.println("Mail Title " + Title);
        System.out.println("Mail Body " + Body);
    }

    
}