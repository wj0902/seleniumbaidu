package day06;

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

	public class Banksystem1 {
	@Test
	@Parameters("data3")
	public void open(String data3) {
		System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/Banksys_ssh/");
		driver.findElement(By.name("userNO")).sendKeys("1536042660999");
		driver.findElement(By.name("password")).sendKeys("iPhoneX");
		driver.findElement(By.id("loginValidate_0")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		//	driver.findElement(By.xpath("//*[@id=\"fmoneyValidate\"]/table/tbody/tr[4]/td/div/input")).click();
		driver.findElement(By.name("money")).clear();
		driver.findElement(By.name("money")).sendKeys(data3);
		driver.findElement(By.id("fmoneyValidate_0")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/center")).getText());
		driver.findElement(By.name("money")).sendKeys("100000");
		driver.findElement(By.id("fmoneyValidate_0")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"fmoneyValidate\"]/table/tbody/tr[1]/td/span")).getText());
	}
}
