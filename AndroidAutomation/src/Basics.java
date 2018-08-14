import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{ 
	//using extends keyword we can easily use the methods defined in the Base class in this class
	//
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		//Automation code starts here....
		//This object will drive the automation..It is what creates the wire JSON protocol for us to establish
		//the communication line between the client code and the appium server
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		
		//Using the xpath method to identify the element in the application
		//Once the path is known to use that object then, we need to select the action that we want to perform on the 
		//selected object.
		//Syntax for xpath is ("//TagName[@uniqueAttribute = 'value']");
		driver.findElementByXPath("//android.widget.TextView[@text = 'Preference']").click();
		//Another activity clicking
		Thread.sleep(3000);
		driver.findElementByXPath("//android.widget.TextView[@text = '3. Preference dependencies']").click();
		//finding element using its ID
		driver.findElementById("android:id/checkbox").click();
		//finding element using the xpath array
		Thread.sleep(3000);
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		//finding an element using xpath
		driver.findElementByClassName("android.widget.EditText").sendKeys("Rishabh is great!!!");
		Thread.sleep(2000);
		//driver.findElementById("android:id/button1").click();
		//identifying the duplicated instances using the .get() method - pulls the result
		driver.findElementsByClassName("android.widget.Button").get(2).click();
	}

}
