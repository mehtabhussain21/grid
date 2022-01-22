package hemcoproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class usinggrid {
	
	@Test
	public void launchingURL() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"),cap);
		driver.get("https://www.hecmo.com/");
		
	}

}
