package FactoryMethod;

public class SendMailController {
    public static void main(String[] args) {
        
        //Create Mail Factory
        MailFactory mainFactory = new MailFactory();

        //Create NoReply object through MailFactory
        IMail noRelyMail = mainFactory.NewMail("NOREPLY");

        //Send Mail
        noRelyMail.SendMail("test@test.com", "test2@test.com", "Sample Titile", "Sample Body");
    }
}