package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Oraganizations1 {

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
		driver.findElement(By.xpath("(//span[text()=' Organizations'])[1]")).click();
		driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("bts");
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.vtiger.com");
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("7020667294");
		driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("ab");
		driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("ac");
		driver.findElement(By.id("Accounts_editView_fieldName_account_id_create")).click();
		driver.findElement(By.xpath("(//input[@name='accountname'])[2]")).sendKeys("Amazon");
		driver.findElement(By.xpath("(//input[@name='website'])[2]")).sendKeys("www.google.com");
		driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys("9860944895");
		WebElement ele1 = driver.findElement(By.xpath("(//select[@name='assigned_user_id'])[2]"));
		Select s1 = new Select(ele1);
		s1.selectByValue("3");
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		driver.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("7020667294");
		driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("300");
		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("abcde234@gmail.com");
		driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("adcrger34@gmail.com");
		driver.findElement(By.xpath("//input[@name='ownership']")).sendKeys("ownershipwith");
		WebElement ele2 = driver.findElement(By.xpath("//select[@name='industry']"));
		Select s2 = new Select(ele2);
		s2.selectByValue("Engineering");
		WebElement ele3 = driver.findElement(By.xpath("//select[@name='rating']"));
		Select s3 = new Select(ele3);
		s3.selectByValue("Active");
		WebElement ele4 = driver.findElement(By.xpath("//select[@name='accounttype']"));
		Select s4 = new Select(ele4);
		s4.selectByValue("Customer");
		driver.findElement(By.xpath("//input[@name='siccode']")).sendKeys("2345");
		driver.findElement(By.xpath("(//input[@name='emailoptout'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("30000");
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");

		WebElement ele5 = driver.findElement(By.xpath("//select[@name='assigned_user_id']"));
		Select s5= new Select(ele5);
		s5.selectByValue("3");
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("(//input[@name='notify_owner'])[2]")).click();
		driver.findElement(By.xpath("//textarea[@name='bill_street']")).sendKeys("navi peth, pune");
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("amravati, maharashta");
		driver.findElement(By.xpath("//input[@name='bill_pobox']")).sendKeys("123556");
		driver.findElement(By.xpath("//input[@name='ship_pobox']")).sendKeys("6589979");
		driver.findElement(By.xpath("//input[@name='bill_city']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@name='ship_city']")).sendKeys("amt");
		driver.findElement(By.xpath("//input[@name='bill_state']")).sendKeys("maharashtra");
		driver.findElement(By.xpath("//input[@name='ship_state']")).sendKeys("maharashtra");
		driver.findElement(By.xpath("//input[@name='bill_code']")).sendKeys("411041");
		driver.findElement(By.xpath("//input[@name='ship_code']")).sendKeys("444805");
		driver.findElement(By.xpath("//input[@name='bill_country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@name='ship_country']")).sendKeys("India");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("completed organisations module");
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		


	}

}
