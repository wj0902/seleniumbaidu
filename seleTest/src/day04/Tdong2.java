package day04;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tdong2 {
	@Test
	public void pp() throws IOException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
		/**
		 * 1.������ַ
		 * 2.�϶���ɫ���鵽��һ�е�����
		 * 3.��ָ��λ��
		 */
		driver.get(u);
		WebElement f=driver.findElement(By.id("drag"));//��ɫ����
		Actions f2=new Actions(driver);
		f2.dragAndDropBy(f,-200,-30).perform();
		
	}
}
