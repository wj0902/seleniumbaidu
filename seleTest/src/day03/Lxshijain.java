package day03;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lxshijain {
	@Test
	public void opp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
	     * 1.�л���Сҳ����ȥ
	     * 2.��λ��Сҳ�����������
	     * 3.����Сҳ���е�Ԫ��
	     */
	    //�����л���ʽ
	    //��һ��������ֱ��д��frame��ǩ��id����name
	    //����ж������Ƕ�ף��Ͷ�д����
	    //driver.switchTo().frame("aa"); //��һ��
	    driver.switchTo().frame(0);//�ڶ��֣������ķ�ʽ����iframe���ֵĴ�������0��ʼ
	    driver.findElement(By.id("user")).sendKeys("abcdefg");
	    Thread.sleep(1500);
	    //���ص���ҳ�棬Ҳ�����ַ�ʽ
	    //���ص�����ҳ��
	   // driver.switchTo().parentFrame(); //һ��һ���л�
	    
	    //ֱ����ת�������
	    driver.switchTo().defaultContent();
	    String jin="E:\\�ƽ�˵��.txt";
		WebElement uup=driver.findElement(By.id("load"));
	    uup.sendKeys(jin);
	}
}
