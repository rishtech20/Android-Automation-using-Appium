import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Basics extends Base{ 
	//using extends keyword we can easily use the methods defined in the Base class in this class
	//
	public static void main(String[] args) throws MalformedURLException {
		//Automation code starts here....
		//This object will drive the autmation..
		AndroidDriver<AndroidElement> driver = Capabilities(); //Getting the capabilities in the Android Driver
		
	}

}
