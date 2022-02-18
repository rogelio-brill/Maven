import org.testng.Assert;
import org.testng.annotations.Test;

import com.brilliomave.p1.MessageUtil;

public class GroupTestExample {
	   String message = ".com";
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test(groups = { "functest", "checkintest" })

	   public void testPrintMessage() {
	      System.out.println("Inside testPrintMessage()");
	      message = ".com";
	      Assert.assertEquals(message, messageUtil.printMessage());
	   }

	   @Test(groups = { "checkintest" })

	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "mywebsite" + ".com";
	      Assert.assertEquals(message, messageUtil.salutationMessage());
	   }

	   @Test(groups = { "functest" })

	   public void testingExitMessage() {
	      System.out.println("Inside testExitMessage()");
	      message = "www." + "mywebsite"+".com";
	      Assert.assertEquals(message, messageUtil.exitMessage());
	   }
}
