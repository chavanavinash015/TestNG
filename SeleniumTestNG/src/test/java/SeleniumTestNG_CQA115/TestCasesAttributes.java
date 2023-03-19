package SeleniumTestNG_CQA115;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCasesAttributes {

      @Test(priority = 1)
    public void xyz(){
        System.out.println("xyz test cases");
    }
    @Test(priority = 2, invocationCount = 4, enabled = false)
    public void abc(){
        System.out.println("abc test cases");
    }

    

    // Depends on method
    /*@Test
    public void CreateUser(){
        Assert.assertTrue(true,"Create User Failed...");
    }
    @Test(dependsOnMethods = "CreateUser")
    public void DeleteUser(){
        System.out.println("Deleted User Successfully...");

    }*/




    //Cyclic Dependencies
   /* @Test(dependsOnMethods = "DeleteUser")
    public void CreateUser(){
        Assert.assertTrue(true,"Create User Failed...");
    }
    @Test(dependsOnMethods = "CreateUser")
    public void DeleteUser(){
        System.out.println("Deleted User Successfully...");

    }*/
}
