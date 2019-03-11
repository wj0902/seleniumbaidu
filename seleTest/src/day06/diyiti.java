package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class diyiti{
	static WebDriver driver;
	static String url;
	@BeforeClass
	public static void  setup() {
		 System.setProperty("webdriver.chrome.driver","./Tools/chromedriver.exe");
		 driver=new ChromeDriver();
		 url="http://localhost:8080/Banksys_ssh/login.jsp";
		
	}
	
	/*
	 * 1,��¼---ȡ��---��ӡ
	 */
	
	
	/*
	 * 1,����ַ
	 * 2�������û���
	 * 3����������
	 * 4�������¼
	 */
	@Test   //��¼
	public void alogin() {
		//����ַ
			driver.get(url);
		//�����û���	
	 WebElement input=driver.findElement(By.id("loginValidate_userNO"));
	 input.sendKeys("1536220784968");
	 //��������
	WebElement pad=driver.findElement(By.id("loginValidate_password"));
	pad.sendKeys("123456");
	//�����¼��ť
	WebElement button=driver.findElement(By.id("loginValidate_0"));
	button.click(); 
	}
	
	@Test(dependsOnMethods="alogin")  //ȡ��1
	public void  bqukuan1() {
		   //��ת��߿�ܣ�����˵�    
		    driver.switchTo().frame(1);
		   	driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   //��ת���ұ߿��
		   	driver.switchTo().defaultContent();
		   	driver.switchTo().frame(2);
		   	//����ȡ��Ľ�� �����ȷ����ť  
		   	driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1000");
		   	driver.findElement(By.id("fmoneyValidate_0")).click();
		   	      
		   	//��ȡ��ȡ��ɹ�
		   	   WebElement s=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(s.getText());
	       //��ӡ������Ϣ
	       //��ת����߿��
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
	       //���������Ϣ�˵�
		   	   driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		   //��ת���ұ߿��	
		   	   driver.switchTo().defaultContent();
		   	   driver.switchTo().frame(2);
		   //��ӡ������Ϣ
		   	   WebElement aa=driver.findElement(By.xpath("/html/body/center"));
	           System.out.println(aa.getText());
	}
	@Test(dependsOnMethods="bqukuan1")
	public void cqukuan2() {
		      //������߿��
	           driver.switchTo().defaultContent();
	           driver.switchTo().frame(1);
	          //���ȡ��˵� 
		   	   driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		   	  //��ת���ұ߿��
		   	   driver.switchTo().defaultContent(); 
		   	   driver.switchTo().frame(2);
		   	  //����ȡ������ȷ�ϰ�Ť
		   	   driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1000");
		   	   driver.findElement(By.id("fmoneyValidate_0")).click();
			  //��ȡ������Ϣ
			   WebElement q=driver.findElement(By.xpath("/html/body/center"));
		       System.out.println(q.getText());



	}
	@AfterClass
	public static void teardown() {
		
	}
}

