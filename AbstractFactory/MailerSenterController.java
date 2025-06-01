package AbstractFactory;
import FactoryMethod.IMail;

public class MailerSenterController {
    public static void main(String[] args) {
        
        //Create SMPT mail factory
        AbstractMailFactory smptFactory = MailFactory.GetSenderType("SMTP");

        //Mail Type
        IMail noReplyMail = smptFactory.NewMail("NOREPLY");

        //send Mail
        noReplyMail.SendMail("test@test.com", "test2@test.com", "Sample Titile", "Sample Body");


    }
}
