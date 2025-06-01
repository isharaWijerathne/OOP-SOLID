package AbstractFactory;

import FactoryMethod.GenaralMail;
import FactoryMethod.IMail;
import FactoryMethod.NoReplyMail;

public class POPSenderFactory extends AbstractMailFactory {

    @Override
    IMail NewMail(String Type) {
        
        if(Type == "GENARAL")
        {
            return new GenaralMail();
        }
        else if (Type == "NOREPLY")
        {
            return new NoReplyMail();
        }
        else if (Type == "NOTHIDICATION")
        {
            return new NoReplyMail();
        }
        return null;
    }
    
}