import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(TestListener.class)
public class Main {

    SoftAssert softAssert = new SoftAssert();

    @Test(dataProvider = "AnimalDataProvider",dataProviderClass = Animal.class)
    public void howAnimalSay(String address,String pass, String user){
//        softAssert.assertEquals("a","b","FAILED-1");
//        System.out.println("-------------------------------");
//        System.out.println("PASS-1");
//        System.out.println("-------------------------------");
//        softAssert.assertEquals("c","d","FAILED-2");
//        System.out.println("-------------------------------");
//        System.out.println("PASS-2");
//        System.out.println("-------------------------------");
//        softAssert.assertAll();
        System.out.println("User: "+user+" Pass: "+pass+" address: "+address);
    }
}
