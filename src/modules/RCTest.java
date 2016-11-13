package modules;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RCTest {
	public static void main(String[] args) throws InterruptedException {
		DesiredCapabilities caps =  DesiredCapabilities.chrome();
		URL url = null;
//		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.MAC);
		try{
			 url = new URL("http://192.168.99.100:32768/wd/hub");
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
		RemoteWebDriver driver = new RemoteWebDriver(url,caps);
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Docker");
		System.out.println(driver.getTitle());
		Thread.sleep(10000);
		driver.quit();
	}

}
