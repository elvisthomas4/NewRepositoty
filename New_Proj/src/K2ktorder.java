
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class K2ktorder {

	public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new  FirefoxDriver();

			driver.get("http://kos2kostransport.com");
	   	Thread.sleep(2000L);
			
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/a/span")).click();
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/fieldset[1]/input")).click();
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/fieldset[1]/input")).clear();
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/fieldset[1]/input")).sendKeys("uday@aminfocraft.com");
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/fieldset[2]/input")).clear();
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/fieldset[2]/input")).sendKeys("123456");
			driver.findElement(By.xpath("html/body/div[1]/header/div/div[2]/div[2]/form/fieldset/input")).click();
			Thread.sleep(1000L);
			
			driver.findElement(By.xpath("html/body/div[1]/div/div/div/div[6]/div/div/input[1]")).click();
			/*Enter all Details*/
			driver.findElement(By.xpath("//*[@id='sfr_zipcode']")).clear();
			driver.findElement(By.xpath("//*[@id='sfr_zipcode']")).sendKeys("53157");
			
			driver.findElement(By.xpath("//*[@id='st_zipcode']")).clear();
			driver.findElement(By.xpath("//*[@id='st_zipcode']")).sendKeys("53157");
			driver.findElement(By.xpath("//*[@id='form_order1']/fieldset/div[2]/div[1]/div[2]/div[2]/div/div/img")).click();
			driver.findElement(By.xpath("html/body/div[2]/table/tbody/tr[5]/td[6]/a")).click();
			
			
			/*Select Drop down options*/
		    new Select(driver.findElement(By.id("package"))).selectByVisibleText("Boxes");
		    new Select(driver.findElement(By.xpath("//*[@id='weight_type_1']"))).selectByVisibleText("kg");
		    new Select(driver.findElement(By.xpath("//*[@id='m_dimension']"))).selectByVisibleText("cm");
		    new Select(driver.findElement(By.xpath("//*[@id='freight_class_1']"))).selectByVisibleText("55");
		    /*Select Drop down options*/
		    
		    driver.findElement(By.xpath("//*[@id='quantity_1']")).sendKeys("1");
		    driver.findElement(By.xpath("//*[@id='total_weight_1']")).sendKeys("100");
		    driver.findElement(By.xpath("//*[@id='l_dimension_1']")).sendKeys("10");
		    driver.findElement(By.xpath("//*[@id='w_dimension_1']")).sendKeys("20");
		    driver.findElement(By.xpath("//*[@id='h_dimension_1']")).sendKeys("30");
		    driver.findElement(By.xpath("//*[@id='shipping_hazardous_material']")).click();
		    
		    /* Add New Item*/
		    
		    
		    driver.findElement(By.xpath("//*[@id='form_order1']/fieldset/div[3]/div[2]/div[3]/a[1]")).click();
		    Thread.sleep(1000L);
		    
		    new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[2]/div[1]/div[2]/select"))).selectByVisibleText("Carpets");
		    new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]/select"))).selectByVisibleText("lbs");
		    driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/input")).sendKeys("2");
		    driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[2]/div[3]/div[2]/input")).sendKeys("200");
		    driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[3]/div[1]/input")).sendKeys("20");
		    driver.findElement(By.xpath(" html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[3]/div[2]/input")).sendKeys("30");
		    driver.findElement(By.xpath(" html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[3]/div[3]/input")).sendKeys("40");
		    new Select(driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[3]/div[2]/div[2]/div[3]/div[5]/select"))).selectByVisibleText("100");
		    driver.findElement(By.xpath("//*[@id='insurance_val']")).sendKeys("456");
		    driver.findElement(By.xpath("//*[@id='special_service']/div[3]/div[1]/label[2]/input")).click();
		    driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/form/fieldset/div[4]/div[3]/div[3]/div/span/input")).click();

	}}