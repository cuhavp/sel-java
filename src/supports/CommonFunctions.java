package supports;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {

	/**
	 * Description: this method use to navigate to URL
	 * @param driver
	 * @param url
	 */
	public static void visit(WebDriver driver,String url){
		driver.get(url);
//	    driver.manage().window().maximize();
	}
	
	/**
	 * Description: this method use to fill in a text box
	 * @param driver
	 * @param how : name,id,css,xpath
	 * @param locator
	 * @param value
	 */
	public static void fillIn(WebDriver driver,String how,String locator,String value){
		waitForElementPresent(driver,how,locator, 10);
		driver.findElement(getElement(how, locator)).clear();
		driver.findElement(getElement(how, locator)).sendKeys(value);
	}
	
	/**
	 * @descriptions: this method use to send text into a text box
	 * @param el
	 * @param value
	 */
	public static void fillIn(WebElement el,String value){
		el.clear();
		el.sendKeys(value);
	}
	/**
	 * Description: this method use to click on element
	 * @param driver
	 * @param how
	 * @param locator
	 */
	public static void click(WebDriver driver,String how,String locator){
		waitForElementPresent(driver,how,locator, 10);
		driver.findElement(getElement(how, locator)).click();
	}
	
	/**
	 * Description: this method use to select an item from a drop down list
	 * @param driver
	 * @param how
	 * @param locator
	 * @param selectValue
	 */
	public static void selectDDL(WebDriver driver,String how,String locator,String selectValue){
		By el = getElement(how,locator);
		Select listBox = new Select(driver.findElement(el));
		listBox.selectByVisibleText(selectValue);
	}
	
	public static WebDriver selectBrowser(String browserName) throws MalformedURLException{
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("Firefox")){
			driver = new FirefoxDriver();
		}else if (browserName.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver","C:\\IEdriver.exe");
			driver = new InternetExplorerDriver();
		}else if(browserName.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","chromedriver");
			driver = new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("Safari")){
			driver = new SafariDriver();
		}else if (browserName.equalsIgnoreCase("android")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("deviceName", "192.168.59.101:5555");
	        capabilities.setCapability("platformName", "android");
	        capabilities.setCapability("platformVersion", "5.1");
	        capabilities.setCapability("browserName", "browser");
//	        capabilities.setCapability(ChromeOptions.CAPABILITY,options) ;
	        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
		}
		else System.out.println("Cannot find browser name, please check your pramametter!!!");
		return driver;
	}

	/**
	 * @descriptions: this method use to get text from web element
	 * @param driver
	 * @param how
	 * @param locator
	 * @return string
	 */
	public static String getText(WebDriver driver, String how, String locator) {
		waitForElementPresent(driver,how,locator, 10);
		return driver.findElement(getElement(how, locator)).getText();
	}

	/**
	 * Description: this method use to wait for element present
	 * @param driver
	 * @param how
	 * @param locator
	 * @param timeout
	 */
	public static void waitForElementPresent(WebDriver driver,String how,String locator,int timeout){
		
		WebElement myDynamicElement = (new WebDriverWait(driver, timeout))
				  .until(ExpectedConditions.presenceOfElementLocated(getElement(how, locator)));
	}
	
	/**
	 * @descriptions: this method use to verify element has displayed
	 * @param driver
	 * @param how
	 * @param locator
	 * @return: true/false
	 */
	public static Boolean verifyElementDisplay(WebDriver driver, String how, String locator){
		
		return driver.findElement(getElement(how, locator)).isDisplayed();
	}
	
	/**
	 * @descriptions: this method use to verify element has enabled
	 * @param driver
	 * @param how
	 * @param locator
	 * @return true/false
	 */
	public static Boolean verifyElementEnable(WebDriver driver, String how, String locator){
		
		return driver.findElement(getElement(how, locator)).isEnabled();
	} 
	
	/**
	 * @descriptions: this method use to locate an elment
	 * @param driver
	 * @param how
	 * @param locator
	 * @return: By
	 */
	public static By getElement(String how,String locator){
		By el = null;
		if (how.equalsIgnoreCase("id")){
			el = By.id(locator);
		}else if (how.equalsIgnoreCase("name")) {
			el = By.name(locator);
		}else if (how.equalsIgnoreCase("css")) {
			el = By.cssSelector(locator);
		}else if (how.equalsIgnoreCase("xpath")) {
			el = By.xpath(locator);
		}else{
			System.err.println("Cannot locate element by " + how + " with locator is: "+ locator);
		}
		return el;
	}
	
}
