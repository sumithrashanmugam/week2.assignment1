package assignment.week2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;



public class Facebook {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("SUMI");
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("SREE");
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("123456987");
		driver.findElement(By.xpath("//input[@id ='password_step_input']")).sendKeys("SANGAMITHRA");
		WebElement day = driver.findElement(By.xpath("//select[@id ='day']"));
		Select day1 = new Select(day);
		day1.selectByValue("9");
		WebElement month = driver.findElement(By.xpath("//select[@id ='month']"));
		Select month1 = new Select(month);
		month1.selectByVisibleText("May");
		WebElement year = driver.findElement(By.xpath("//select[@id ='year']"));
		Select year1 = new Select(year);
		year1.selectByValue("1997");
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	

	}

}
