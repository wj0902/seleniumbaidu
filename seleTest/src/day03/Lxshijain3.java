package day03;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lxshijain3 {
	
	@Test
	public void opp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //ȫ�ֵȴ�
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u);
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		driver.findElement(By.name("checkbox4")).click();
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//���������ת������������ȥ
		co2.accept();
		co2.accept();
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    Thread.sleep(1500);
	    /**
	     * 1.��indexҳ��
	     * 2.���wait��ť
	     * 3.��ӡwait��ť�µ���
	     */
	    driver.findElement(By.className("wait")).click();
	    //Thread.sleep(4000); //�̵߳ȴ�
	    String cc=driver.findElement(By.className("red")).getText();
	    System.out.println(cc);
	    
	}
}
