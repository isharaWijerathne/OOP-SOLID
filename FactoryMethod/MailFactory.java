package FactoryMethod;

public class MailFactory {
    
    public IMail NewMail(String MailType)
    {
        if(MailType == "GENARAL")
        {
            return new GenaralMail();
        }
        else if (MailType == "NOREPLY")
        {
            return new NoReplyMail();
        }
        else if (MailType == "NOTHIDICATION")
        {
            return new NoReplyMail();
        }
        return null;
    }
}