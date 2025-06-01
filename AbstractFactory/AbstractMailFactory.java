package AbstractFactory;
import FactoryMethod.IMail;

public abstract class AbstractMailFactory {
    abstract IMail NewMail(String Type);
}