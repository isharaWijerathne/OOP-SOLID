package AbstractFactory;

public class MailFactory {
    public static AbstractMailFactory GetSenderType(String Type)
    {
        if(Type == "SMTP")
        {
            return new SMTPSenderFactory();
        }
        else if (Type == "POP")
        {
            return new POPSenderFactory();
        }
        return null;
    }
}