package basic;

import org.testng.annotations.*;

public class Logging_Test {
    @BeforeTest
    public void login(){System.out.println("Successfully logged in !!");}

    @BeforeMethod
    public void connectDB(){
        System.out.println("Connected to Database !!");
    }

    @Test(priority = 1,description = "you're welcome")
    public void Test1(){
        System.out.println("Runned Test 1 case");
    }

    @Test(priority = 2,description = "Yes getout")
    public void Test2(){
        System.out.println("Runned Test 2 case");
    }

    @AfterMethod
    public void disconnectDB(){
        System.out.println("Disconnected to Database !!");
    }

    @AfterTest
    public void logout(){System.out.println("Successfully logged out !!");}

}
