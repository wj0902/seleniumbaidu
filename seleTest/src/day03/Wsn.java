package day03;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wsn {
	@Test
	public void po() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); //ȫ�ֵȴ�
		String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		/*
		 * 1.����indexҳ��
		 * 2.�ҵ������
		 * 3.����Ҽ�
		 */
		driver.get(u);
		
		WebElement iput=driver.findElement(By.id("user"));
		Actions a=new Actions(driver);  //����һ��Action��
		a.contextClick(iput).perform(); //ִ���Ҽ�����
		Thread.sleep(2000);        
		//a.contextClick().perform();  //�ȸ����Ͻ��Ҽ��һ���������һ��˵Ĳ������Ͳ������һ�
		
		
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		//System.out.println(p);
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
	     * �ҵ�wait��ť�����˫��
	     */
	    WebElement wa=driver.findElement(By.className("wait"));
	    Actions b=new Actions(driver);//��������driver�����������
	    b.doubleClick(wa).perform(); //perform()��ִ�е���˼
	    Thread.sleep(4000); //�̵߳ȴ�
	    String cc=driver.findElement(By.className("red")).getText();
	    System.out.println(cc);
	    
	    
	    /**
	     * ��λ��actions
	     * �����ŵ�����
	     */
	    WebElement aaa=driver.findElement(By.className("over"));
	    Actions c=new Actions(driver);
	    c.moveToElement(aaa).perform();
	    String h=driver.findElement(By.id("over")).getText();
	    System.out.println(h);
	    
	    	
	    
	   
	}
}
