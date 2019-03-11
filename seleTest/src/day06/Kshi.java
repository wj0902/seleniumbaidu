package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Kshi {
	static WebDriver driver;
	static String ur;
	@BeforeClass
	public void setup() {
		 System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 ur="http://localhost:8080/Exam_ssh";
	}
	@Test
	public void app() {
		
		 driver.get(ur);
		 //�����̨����
		 driver.findElement(By.xpath("/html/body/div/table/tbody/tr[2]/td/a[2]")).click();
		//�û���¼
		 driver.findElement(By.id("name")).sendKeys("admin");
		 driver.findElement(By.id("pass")).sendKeys("admin");
		 driver.findElement(By.name("B1")).click();
	}
	@Test(dependsOnMethods="app")//�����Բ���
	public void bpp() {
		
		 //��ӿ�������
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		 driver.findElement(By.id("testName")).sendKeys("C����");
		 driver.findElement(By.id("testTime")).sendKeys("29");
		 driver.findElement(By.name("submit")).click();
		 //�������
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[3]")).click();
		 driver.findElement(By.id("title")).sendKeys("Ϊʲô��");
		 //ͨ���ɼ�ֵѡ�����
		 WebElement s1=driver.findElement(By.id("examType"));
		 Select s2=new Select(s1);
		 s2.selectByVisibleText("C����");
		 driver.findElement(By.id("choices")).sendKeys("1");
		 driver.findElement(By.id("standardAnswer")).sendKeys("1");
		 driver.findElement(By.name("submit")).click();
		 //��������ӡ
		 driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[2]")).click();
		 String s3=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		 System.out.println(s3);
	}
	@Test(dependsOnMethods="bpp")
	public void cpp() {
		
		 //���ѧ��
		 driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[2]")).click();
		 driver.findElement(By.id("id")).sendKeys("3625");
		 driver.findElement(By.id("realname")).sendKeys("1");
		 driver.findElement(By.id("stuNumber")).sendKeys("1");
		 driver.findElement(By.id("className")).sendKeys("1");
		 driver.findElement(By.id("address")).sendKeys("1");
		 driver.findElement(By.id("phone")).sendKeys("1");
		 driver.findElement(By.id("email")).sendKeys("1");
		 driver.findElement(By.id("humanId")).sendKeys("3625");
		 driver.findElement(By.name("submit")).click();
		 //���ȫ��ѧ������ӡ
		 driver.findElement(By.xpath("//*[@id=\"studentChild\"]/a[1]")).click();
		 String s4=driver.findElement(By.xpath("/html/body/div/table[1]/tbody/tr[2]/td[2]")).getText();
		 System.out.println(s4);
		 }
	
	@AfterClass
	public static void teardown() {
		
	}
}




