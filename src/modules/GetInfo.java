package modules;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GetInfo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		String os = cap.getPlatform().toString();
		System.out.println(os);
		String v = cap.getVersion().toString();
		System.out.println(v);
	}
}
