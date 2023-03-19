package SeleniumTestNG_CQA115;

import org.testng.annotations.*;

public class OrderOfTestNG {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite...");

    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("before class...");

    }
    @BeforeTest
    public void beforetest(){
        System.out.println("before Test...");

    }
    @BeforeMethod
    public void beforemethod() {
        System.out.println("before method...");

    }
    @Test
    public void test1(){

    }
    @AfterMethod
    public void aftermethod() {

        System.out.println("after method...");
    }

    @AfterTest
    public void aftertest() {

        System.out.println("after Test...");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class...");

    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite...");

    }
}
