package accounts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class EditAccounts {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://qeagle-dev-ed.my.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Accounts']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",ele);
		//driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Aparna",Keys.ENTER);
		driver.findElement(By.xpath("//a[@title='Aparna']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
		driver.findElement(By.xpath("//runtime_platform_actions-action-renderer[@title='Edit']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Technology Partner']")).click();
		Thread.sleep(2000);
		WebElement find = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[4]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();",find);
		
		WebElement find1 = driver.findElement(By.xpath("//span[text()='Healthcare']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("arguments[0].click();",find1);
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("valasaravakkam");
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Ramapuram");
		Thread.sleep(4000);
		
		WebElement ele1 = driver.findElement(By.xpath("//div[contains(@class,'slds-combobox__form-element')]"));
		Actions builder = new Actions(driver);
		builder.scrollToElement(ele1);
		builder.click();
		
		//driver.findElement(By.xpath("//button[@aria-label='Customer Priority, --None--']")).click();
		//driver.findElement(By.xpath("//span[text()='Low']")).click();
		/*driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]")).click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("3456774300");
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
		*/
		
		
		
		
		
		
		
	}

}
