package day06;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Yxing2 {
	static WebDriver driver;
	static String u;
	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //driver�����������
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		u="http://localhost:8080/Banksys_ssh/login.jsp";
	}
	
	/**
	 * ����ַ�������û���������
	 * �����¼
	 * @throws InterruptedException
	 */
	@Test //��¼
	public void aopp(){
		driver.get(u);
		driver.findElement(By.name("userNO")).sendKeys("1508329470158");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("loginValidate_0")).click();
	  }
		@Test(dependsOnMethods="aopp")  //ȡ��
		public void bqukuan() {
			driver.switchTo().frame("leftFrame");
			driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
			driver.switchTo().parentFrame();
			driver.switchTo().frame("mainFrame");
			driver.findElement(By.name("money")).sendKeys("1500");
			driver.findElement(By.id("fmoneyValidate_0")).click();
			String aaa=driver.findElement(By.xpath("/html/body/center")).getText();
			System.out.println(aaa);
		}
		
		@Test(dependsOnMethods="bqukuan")   //��ӡ
		public void Cdayi() {
		driver.switchTo().parentFrame();
		driver.switchTo().frame("leftFrame");
		driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("mainFrame");
		driver.findElement(By.name("money")).sendKeys("1500");
		driver.findElement(By.id("fmoneyValidate_0")).click();}		
		String bbb=driver.findElement(By.xpath("/html/body/center")).getText();
		//System.out.println(bbb);
		//driver.findElement(By.linkText("����")).click();

		@AfterClass 
		public void teardow() {
			
		}
}		
		
