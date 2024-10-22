package basic;

import org.testng.annotations.Test;

public class groupstest {
    @Test(groups = "regression")
    public void Test1(){
        System.out.println("Runned Test 1 case");
    }

    @Test(groups = "regression")
    public void Test2(){
        System.out.println("Runned Test 2 case");
    }

    @Test(groups = {"regression","bvt"})
    public void Test3(){
        System.out.println("Runned Test 3 case");
    }

    @Test(groups = "bvt")
    public void Test4(){
        System.out.println("Runned Test 4 case");
    }

}
