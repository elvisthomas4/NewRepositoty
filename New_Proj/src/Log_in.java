import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log_in {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new  ChromeDriver();

		driver.get("http://mhalal.com");
		driver.findElement(By.xpath("//a[@href='login']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ashwini");
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
        
	}

}
