package day05;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class YanJun {
	@Test  //ע��,Ҳ��һ������
	public void opp() throws InterruptedException, IOException, AWTException {
		//�򿪻�������
		//System.setProperty("webdriver.Firefox.bin","E:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); //driver�����������
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/**
		 * ��������
		 */
		/*String u="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		String u2="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		driver.get(u);
		Thread.sleep(2000);
		driver.get(u2);
		Thread.sleep(2000);
		driver.navigate().back();//����
		Thread.sleep(2000);
		driver.navigate().forward();//ǰ��
		driver.navigate().refresh();//ˢ��
		driver.manage().window().maximize();//���
		Thread.sleep(2000);
		//�����������С
		Dimension aa=new Dimension(800,500); //����ڶ���selenium
		driver.manage().window().setSize(aa); //ִ�� 
		String a;
		a=driver.getCurrentUrl();
		System.out.println(a);
		System.out.println(driver.getTitle());*/
		/**
		 * ���ֶ�λ
		 */
		/*String u3="https://www.baidu.com";
		driver.get(u3);
		driver.findElement(By.cssSelector("#u1 > a:nth-child(1)")).click();
		
		//int b =driver.findElements(By.tagName("a")).size();//��ס����
	   // System.out.println(b); 
	    driver.findElement(By.partialLinkText("������Ӿ��ˮ")).click(); */
	   
		/**
		 * ����
		 * 1.���롢��ѡ����ѡ
		 * 2.������
		 * 3.������
		 */
		//String u4="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		//driver.get(u4);
		//WebElement iput=driver.findElement(By.id("user"));
		//iput.sendKeys("aaa");
		//driver.findElement(By.id("user")).sendKeys("aaa");
		
		/*WebElement s1=driver.findElement(By.id("moreSelect"));
		Select s2=new Select(s1);  //��s1����Ϊ������Ԫ��
		s2.selectByIndex(5);
		Thread.sleep(2000);
		s2.selectByValue("vivo");
		Thread.sleep(2000);
		s2.selectByVisibleText("huawei");
		*//**
		 * ��ѡ���ж�
		 * isSelected()
		 *//*
		WebElement r1=driver.findElement(By.className("Saab"));
		System.out.println(r1.isSelected());
		if (!r1.isSelected()){  //�ж��Ƿ�����û������	
		r1.click();
		}
		System.out.println(r1.isSelected()); //��ӡ�Ƿ���
		
		*//**
		 * ��ѡ���ж�
		 * isEnabled()
		 *//*	
		WebElement c1=driver.findElement(By.name("checkbox4"));
		System.out.println(c1.isEnabled());
		if(c1.isEnabled()) {
			c1.click();
		}
		driver.findElement(By.className("btnSousuo")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle()); 
		driver.navigate().back();
		
		driver.findElement(By.className("confirm")).click();
		Alert p=driver.switchTo().alert();
		p.dismiss(); //ȡ��
		p.accept(); //ȷ��
		
		Thread.sleep(2000);
		driver.findElement(By.className("prompt")).click();
		Alert p2=driver.switchTo().alert();
		p2.sendKeys("���");
		Thread.sleep(4000);
		System.out.println(p2.getText());//��ȡҳ����Ϣ
		Thread.sleep(2000);
		p2.accept(); //ȷ��
		Thread.sleep(2000);
		p2.accept(); 
		Thread.sleep(2000);
		
		String wenjian="E:/a.txt";
		driver.findElement(By.id("load")).sendKeys(wenjian);*/
		
		
		/**
		 * iFrame���ڴ���
		 * ��ȡ�ı���Ϣ
		 */
		/*
		String u6="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/frame.html";
		driver.get(u6);
		driver.switchTo().frame(0);
		String wenben=driver.findElement(By.id("div1")).getText();
		System.out.println(wenben);
		driver.switchTo().parentFrame();
		String wb=driver.findElement(By.id("id1")).getText();
		System.out.println(wb);
		
		*//**
		 * ��ͼ����
		 *//*
		File jietu=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(jietu, new File("E:\\testi.jpg"));//��һ���ļ������͵ڶ����ļ���ŵ�ַ
*/	
		
		/**
		 * �ര�ڴ���
		 */
		//ͨ����ַ����ര��
		/*String u8="http://localhost:8080/mobile_mysql/goodsAction.do?action=16&id=7";
		String u5="http://localhost:8080/mobile_mysql/index.jsp";	
		driver.get(u5);
		String p3=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		driver.findElement(By.name("name")).sendKeys("lisi");
		driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.className("input1")).click();
		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[2]/table[2]/tbody/tr/td[2]/table/tbody/tr[5]/td/div/a")).click();
		
		Set<String>w=driver.getWindowHandles();  //����w��һ������
		//��ȡ��ǰҳ�����о������Ϊ������ҳ�棬��������һ���ַ�������w�������������
		for(String handle:w) {  //�ڼ���w�������ȡһ�����ҳǩ
			driver.switchTo().window(handle);
			String curr=driver.getCurrentUrl();//��ȡ�������жϻ�ȡ��ҳ���Ƿ�����Ҫ��
			
			if(u8.equals(curr)) {
				driver.findElement(By.name("Submit")).click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}
		}
		driver.switchTo().window(p3); 	
		driver.findElement(By.linkText("���ﳵ")).click();
		driver.findElement(By.linkText("ȥ����̨����")).click();*/
		
		//ͨ�����⴦��ര��
		/*String u9="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u9);
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//���������ת������������ȥ
		a2.accept();     
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//���������ת������������ȥ
		co2.dismiss();//����Ϊȡ��
		co2.accept(); //�����Ľ�ȷ��
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
		driver.findElement(By.className("open")).click();
		
		Set<String>w=driver.getWindowHandles();
		for(String handle:w) {
			driver.switchTo().window(handle);
			String title=driver.getTitle();
			if("UIAutomation iFrame".equals(title)) {
				driver.findElement(By.id("user")).sendKeys("text");//ֱ������
				Thread.sleep(3000);
			}
		}
		driver.switchTo().window(p);
		driver.findElement(By.id("user")).sendKeys("texting");//ֱ������
*/		
		/**
		 * �һ���˫��
		 * Ԫ�صȴ�
		 * 1.�̵߳ȴ�
		 * 2.ȫ�ֵȴ�
		 * 3.��ʾ�ȴ���������
		 */
		String u9="file:///E:/%E8%BD%AF%E4%BB%B6%E6%96%87%E4%BB%B6/seleum%E6%96%87%E4%BB%B6/%E9%A1%B5%E9%9D%A2/index.html";
		driver.get(u9);
		String p=driver.getWindowHandle();//��ȡ��ǰ���ھ��
		WebElement a1=driver.findElement(By.className("alert"));
		a1.click();
		Thread.sleep(1000);
		Alert a2=driver.switchTo().alert();//���������ת������������ȥ
		a2.accept();     
		WebElement co1=driver.findElement(By.className("confirm"));
		co1.click();
		Alert co2=driver.switchTo().alert();//���������ת������������ȥ
		co2.dismiss();//����Ϊȡ��
		co2.accept(); //�����Ľ�ȷ��
		String lujin="E:\\a.txt";
		WebElement up=driver.findElement(By.id("load"));
	    up.sendKeys(lujin);
	    //�һ���˫��
	    //Actions sss=new Actions(driver);
	    //sss.contextClick().perform();
	   /* WebElement sss=driver.findElement(By.className("wait"));
	    Actions qqq=new Actions(driver);
	    qqq.doubleClick(sss).perform();*/
	    WebElement sss=driver.findElement(By.className("wait"));
	    sss.click();
	    //Thread.sleep(4000);
	    String swu=driver.findElement(By.className("red")).getText();
	    System.out.println(swu);
	    /**
	     * �����¼���ͨ��sendKeys
	     * ѡ���¼�
	     */
	    WebElement select=driver.findElement(By.id("selectWithMultipleEqualsMultiple"));
	    List<WebElement> aaa=select.findElements(By.tagName("option"));
	    //������driver�����ң���select�����ң���Ϊ������option
		 //List���������
	    Actions sele2=new Actions(driver);//�ӵ�һ����ʼ
	    sele2.sendKeys(Keys.CONTROL).click(aaa.get(2)).perform();
	    //sele2.keyDown(Keys.CONTROL).click(option.get(2)).perform();
	   /* Robot aa=new Robot();
	    aa.keyPress(KeyEvent.VK_CONTROL);//��ס
	    aa.keyPress(KeyEvent.VK_S);	
	    aa.keyRelease(KeyEvent.VK_S);//�ɿ�
	    aa.keyRelease(KeyEvent.VK_CONTROL);
	    Thread.sleep(2000);
	    aa.keyPress(KeyEvent.VK_ESCAPE);
	    Thread.sleep(2000);
	    aa.keyRelease(KeyEvent.VK_ESCAPE);*/
	    FileHandler.createDir(new File("d://dataaa//a.txt"));
	    
	}
}
