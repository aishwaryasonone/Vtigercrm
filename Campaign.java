package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Campaign {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions a= new Actions(driver);
		a.moveToElement(ele);
		a.perform();
		driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Abc");
	    WebElement ele1 = driver.findElement(By.xpath("//select[@class='inputElement select2 select2-offscreen']"));
	    Select s = new Select(ele1);
	    s.selectByValue("3");
	    WebElement ele2 = driver.findElement(By.xpath("//select[@name='campaignstatus']"));
	    Select s1= new Select(ele2);
	    s1.selectByValue("Active");
	    WebElement ele3 = driver.findElement(By.xpath("//select[@name='campaigntype']"));
	    Select s2=new Select(ele3);
	    s2.selectByValue("Webinar");
	    driver.findElement(By.id("Campaigns_editView_fieldName_product_id_create")).click();
	    driver.findElement(By.id("Products_editView_fieldName_productname")).sendKeys("Software");
	    driver.findElement(By.id("Products-editview-fieldname-unit_price")).sendKeys("1000");
	    driver.findElement(By.id("tax1_check")).click();
	    driver.findElement(By.id("tax2_check")).click();
	    driver.findElement(By.id("tax3_check")).click();
	    driver.findElement(By.id("Products_editView_fieldName_qtyinstock")).sendKeys("10");
	    WebElement ele4 = driver.findElement(By.xpath("(//select[@name='assigned_user_id'])[2]"));
	    Select s4 = new Select(ele4);
	    s4.selectByValue("3");
	    driver.findElement(By.xpath("//strong[text()='Save']")).click();
	    driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("xyz");
	   driver.findElement(By.xpath("(//span[@class='input-group-addon'])[1]")).click();
	   driver.findElement(By.xpath("(//td[text()='9'])[2]")).click();
	    driver.findElement(By.xpath("//input[@name='sponsor']")).sendKeys("spomsership");
	   driver.findElement(By.xpath("//input[@name='targetsize']")).sendKeys("200");
	   driver.findElement(By.xpath("//input[@name='numsent']")).sendKeys("45");
	   driver.findElement(By.xpath("//input[@name='budgetcost']")).sendKeys("10000");
	   driver.findElement(By.xpath("//input[@name='actualcost']")).sendKeys("12000");
	   WebElement ele5 = driver.findElement(By.xpath("//select[@name='expectedresponse']"));
	   Select s5 = new Select(ele5);
	   s5.selectByValue("Good");
	   driver.findElement(By.xpath("//input[@name='expectedrevenue']")).sendKeys("9000");
	   driver.findElement(By.xpath("//input[@name='expectedsalescount']")).sendKeys("150");
	   driver.findElement(By.xpath("//input[@name='actualsalescount']")).sendKeys("130");
	   driver.findElement(By.xpath("//input[@name='expectedresponsecount']")).sendKeys("15000");
	   driver.findElement(By.xpath("//input[@name='actualresponsecount']")).sendKeys("14500");
	   driver.findElement(By.xpath("//input[@name='expectedroi']")).sendKeys("15");
	   driver.findElement(By.xpath("//input[@name='actualroi']")).sendKeys("7");
	   driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("The campaign was good enough");
	   driver.findElement(By.xpath("//button[text()='Save']")).click();
	   driver.findElement(By.xpath("//li[@class='dropdown']")).click();
	   driver.findElement(By.linkText("Sign Out")).click();
	  
		/*Actions a1=new Actions(driver);
		a.moveToElement(ele1).click().perform();
		driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Abc");
		Thread.sleep(2000);
	    driver.findElement(By.id("s2id_autogen1")).click();
	    driver.findElement(By.id("s2id_autogen2_search"));
		driver.findElement(By.id("select2-result-label-24")).click();*/



	}

}
