package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BMIPage {
	
	public WebDriver driver;
	public BMIPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Metric Units']")
	public WebElement tab_metric;
	
	@FindBy(id="cage")
	public WebElement txt_age;
	
	@FindBy(name="cheightmeter")
	public WebElement txt_height;
	
	@FindBy(name="ckg")
	public WebElement txt_weight;
	
	
	@FindBy(id="csex1")
	public WebElement rad_male;
	
	@FindBy(id="csex2")
	public WebElement rad_female;
	
	@FindBy(css="input[value='Calculate']")
	public WebElement btn_calculate;
	
	@FindBy(css=".bigtext")
	public WebElement lbl_bmi_result;
	
		
}
