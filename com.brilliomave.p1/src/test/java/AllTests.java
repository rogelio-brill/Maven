import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
@Test
public class AllTests {
   @BeforeClass
   public void beforeClass() {
      System.out.println("in beforeClass");
   }
   
   @BeforeMethod
   public void beforeMethod() {
      System.out.println("in beforeMethod");
   }

   @AfterMethod
   public void afterMethod() {
      System.out.println("in afterMethod");
   }
   
   @AfterClass
   public void afterClass() {
      System.out.println("in afterClass");
   }
   
   @Test(groups = {"functest"}, priority=1)
   private void testAdd() {
      String str = "TestNG is working fine";
      assertEquals("TestNG is working fine", str);
   }

   @Test(groups = {"functest"})
   public void subAdd() {
	      String str = "TestNG";
	      assertEquals("TestNG", str);
	   }
   @Test
	public void printAdd() {
	    String str = "TestNG Print";
	    System.out.println("Checking"+str);
	 }

	/*
	 * private void AssertEquals(String string, String str) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */
}

