import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new  FirefoxDriver();

			driver.get("http://hiretopsales.com");
			Thread.sleep(2000L);
			
			driver.findElement(By.xpath("html/body/div[3]/div[2]/div[1]/div/div[2]/a[1]")).click();
			Thread.sleep(2000L);
			
			driver.findElement(By.xpath("//*[@id='FirstName']")).click();
			driver.findElement(By.xpath("//*[@id='FirstName']")).sendKeys("Shadab");
			
			driver.findElement(By.xpath("//*[@id='LastName']")).click();
			driver.findElement(By.xpath("//*[@id='LastName']")).sendKeys("Shaikh");
		
			
			driver.findElement(By.xpath("//*[@id='email']")).click();
			driver.findElement(By.xpath("//*[@id='email']")).sendKeys("elvis.thomas4@gmail.com");
			
			driver.findElement(By.xpath("//*[@id='password']")).click();
			driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123");
			
			driver.findElement(By.xpath("//*[@id='re-password']")).click();
			driver.findElement(By.xpath("//*[@id='re-password']")).sendKeys("123");
			
			driver.findElement(By.xpath("//*[@id='sendmail']")).click();
			
			driver.findElement(By.xpath("//*[@id='terms']")).click();
			
			driver.findElement(By.xpath("//*[@id='registr-form']/fieldset[7]/div[2]/input[2]")).click();
		
			
			
			
			
		}
	

	}


