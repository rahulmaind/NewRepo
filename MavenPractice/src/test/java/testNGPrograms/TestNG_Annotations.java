package testNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	 @BeforeSuite
     public void setproperty()
     {
         System.out.println("Set the system property");
     }

     @BeforeMethod
     public void getURL()
     {
         System.out.println("display URL");
     }

     @BeforeTest
     public void launchBrowser()
     {
         System.out.println("Open the browser");
     }

     @BeforeClass
     public void enterurl()
     {
         System.out.println("Open URL");
     }

     @Test
     public void checktitle()
     {
         System.out.println("check title of page");
     }

     @AfterClass
     public void closebrowser()
     {
         System.out.println("close browser");
     }

     @AfterMethod
     public void logout()
     {
         System.out.println("logout");
     }

     @AfterTest
     public void checkresults()
     {
         System.out.println("result displayed");
     }

}
