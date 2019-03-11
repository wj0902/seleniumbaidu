package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class YxingLx1 {
	static String u;
	static WebDriver driver;
	@BeforeClass
	public void stp1() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		driver=new ChromeDriver();
		u="http://localhost:8080/Banksys_ssh/login.jsp";
	}
		@Test
		public void a() {
			driver.get(u);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("/html/body/div[2]/center/a")).click();
			driver.findElement(By.name("userInfo.userName")).sendKeys("王乐好");
			driver.findElement(By.name("userInfo.password")).sendKeys("123456");
			driver.findElement(By.name("userInfo.userAge")).sendKeys("20");
			driver.findElement(By.name("userInfo.idCard")).sendKeys("121212121212121212");
			driver.findElement(By.name("userInfo.userSex")).sendKeys("男");
			driver.findElement(By.name("userInfo.tel")).sendKeys("15010102020");
			driver.findElement(By.name("userInfo.city")).sendKeys("江西");
			driver.findElement(By.name("userInfo.address")).sendKeys("江西");
			driver.findElement(By.id("regValidate_0")).click();
		}
		@Test(dependsOnMethods="a")
		public void b() {
			driver.findElement(By.xpath("/html/body/center/a")).click();
		}
		@Test(dependsOnMethods="b")
		public void c() {
			driver.findElement(By.name("userNO")).sendKeys("1548988310922");
			driver.findElement(By.name("password")).sendKeys("123456");
			driver.findElement(By.id("loginValidate_0")).click();
		}	
		@AfterClass
		public void st2() {
			driver.close();
		}
		
}

