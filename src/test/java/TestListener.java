import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onStart(ITestContext arg0){
        System.out.println("In ra khi luc moi bat dau");
    }

    @Override
    public void onFinish(ITestContext arg0){
        System.out.println("In ra luc ket thuc");
    }

    @Override
    public void onTestStart(ITestResult arg0){
        System.out.println("In ra khi luc test moi bat dau");
    }

    @Override
    public void onTestFailure(ITestResult arg0){
        System.out.println("In ra khi luc test Fail");
    }

    @Override
    public void onTestSuccess(ITestResult arg0){
        System.out.println("In ra khi luc test Success");
    }

    @Override
    public void onTestSkipped(ITestResult arg0){
        System.out.println("In ra khi luc test Skip");
    }

}
