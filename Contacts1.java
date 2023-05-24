package Basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Contacts1 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("appnavigator")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions a= new Actions(driver);
		a.moveToElement(ele);
		a.perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()=' Contacts'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.name("salutationtype"));
		Select s= new Select(ele1);
		s.selectByValue("Ms.");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Aishwarya");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Sonone");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("9665313996");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_account_id_create")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Myntra");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("9860944895");
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(By.xpath("(//select[@name='assigned_user_id'])[2]"));
		Select s1= new Select(ele2);
		s1.selectByValue("3");
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("7020667294");
		WebElement ele3 = driver.findElement(By.xpath("//select[@name='leadsource']"));
		Select s2= new Select(ele3);
		s2.selectByValue("Employee");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("Contacts");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("3467643677");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("contact");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("tws");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("aishu123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_birthday")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='11']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("pqs");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_contact_id_create")).click();
		Thread.sleep(2000);
		WebElement ele4 = driver.findElement(By.xpath("(//select[@name='salutationtype'])[2]"));
		Select s4=new Select(ele4);
		s4.selectByVisibleText("Ms.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='firstname'])[2]")).sendKeys("abcde");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='lastname'])[2]")).sendKeys("pqr");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='phone'])[2]")).sendKeys("1235646843");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//i[@id='Contacts_editView_fieldName_account_id_select'])[2]")).click();
		driver.findElement(By.linkText("suncity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("abc12@gmail.com");
		Thread.sleep(2000);
		WebElement ele5 = driver.findElement(By.xpath("(//select[@name='assigned_user_id'])[2]"));
		Select s5=new Select(ele5);
		s5.selectByValue("3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("2354786467");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("abcda12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='emailoptout'])[2]")).click();
		Thread.sleep(2000);
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("(//input[@data-fieldtype='checkbox'])[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='reference'])[2]")).click();
		WebElement ele6 = driver.findElement(By.xpath("//select[@type='owner']"));
		Select s6= new Select(ele6);
		s6.selectByValue("3");
		Thread.sleep(2000);
		JavascriptExecutor jse1= (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.xpath("(//input[@name='notify_owner'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@name='portal'])[2]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("Contacts_editView_fieldName_support_start_date")).sendKeys("22-05-2023");
		Thread.sleep(2000);
		JavascriptExecutor jse2= (JavascriptExecutor)driver;
		jse2.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.name("mailingstreet")).sendKeys("navipeth pune");
		Thread.sleep(2000);
		driver.findElement(By.name("otherstreet")).sendKeys("sinhgadroad");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("abchrrts");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("adrdjftgh");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("pune");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("nanded");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("maharashtra");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("maharashtra");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("411041");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("448054");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("India");
		Thread.sleep(2000);
		JavascriptExecutor jse3= (JavascriptExecutor)driver;
		jse3.executeScript("window.scrollBy(0,400)");

		driver.findElement(By.name("description")).sendKeys("Created contact details");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='fileUploadBtn btn btn-primary']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Aishwarya Sonone\\Desktop\\Jpicture.exe");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='dropdown']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign Out")).click();



	}

}
