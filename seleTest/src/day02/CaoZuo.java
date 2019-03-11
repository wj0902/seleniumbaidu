package day02;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaoZuo {
	@Test
	public void ope() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String u1="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/index.html";
		driver.get(u1);
		WebElement iput=driver.findElement(By.id("user"));
		iput.sendKeys("�ؼ�����");
		
		//��λ������
		WebElement s=driver.findElement(By.id("moreSelect"));
		Select s1=new Select(s); //��s����Ϊ������Ԫ��
		
		//��һ�֣�����������ѡ�񣬵�һ��ѡ�����ݴ�0��ʼ	
		s1.selectByIndex(3);
		Thread.sleep(1000);  
		
		//�ڶ��֣�����value��ѡ�񣬴�HTML������Ԫ��valueֵ
	     s1.selectByValue("huawei");
	     Thread.sleep(1000);
	     //�����֣��ÿɼ���ֵ��������HTML�ң���ֱ����������������,Ҳ������
	     //HTML��ʽ������
		s1.selectByVisibleText("xiaomi");
		
		//driver.findElement(By.className("Volvo")).click();
		WebElement r1=driver.findElement(By.className("Volvo"));
		System.out.println(r1.isSelected());
		r1.click();
		System.out.println(r1.isSelected()); //��ӡ�Ƿ�ѡ����r1.click();
		//���ѡ���˾ͷ���true������false
		//isSelected()  �жϰ�ť�Ƿ�ѡ��
		
		
		//��ѡ���ѡ
		WebElement c1=driver.findElement(By.name("checkbox1"));
		if(!c1.isSelected()) {
		c1.click();
		}
		WebElement c2=driver.findElement(By.name("checkbox2"));
		c2.click();
		
		WebElement b1=driver.findElement(By.name("buttonhtml"));
		System.out.println(b1.isEnabled());  //�жϰ�ť�Ƿ����
		//assertTrue("false",b1.isEnabled()); ���潲
		
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//���������ת������������ȥ
		a2.accept();     
		
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//���������ת������������ȥ
		/*co2.accept(); //�����Ľ�ȷ��
		Thread.sleep(1000);
		co2.accept(); //�����Ľ�ȷ��   */
		co2.dismiss();//����Ϊȡ��
		co2.accept(); //�����Ľ�ȷ��
		
		//������ڵ����ť
		WebElement p1=driver.findElement(By.className("prompt"));
		p1.click();
		Alert p2=driver.switchTo().alert();//���������ת������������ȥ
		Thread.sleep(1500);
		p2.sendKeys("hello word!");
		String aa=p2.getText();  //��ȡҳ����Ϣ
		System.out.println(aa);
		Thread.sleep(1500);
		p2.accept();
		p2.accept();
		
		
		//�����ļ�·��
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    
	}
}
