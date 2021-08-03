import org.junit.Test;
import steps.BaseStep;

public class NewToCheck {


    @Test
    public static void toRegistersOnTheSite (){
        new BaseStep().enterTheSite("https://www.hotwire.com/");

    }
}
