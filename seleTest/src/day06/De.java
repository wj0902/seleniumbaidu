package day06;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class De {
	 @BeforeClass  //��ʼ֮ǰ
	public static void cc() {
		System.out.println("�������");
	}
	@Test  //���Կ�ʼ֮ǰ�Ĳ�������
	public void aa() {
		System.out.println("��¼");
	}
	@Test  //���Կ�ʼ֮��Ĳ�������
	public void bb() {
		System.out.println("��������");
	}
	@AfterClass
	public static void dd() {
		System.out.println("�ر������");
	} 
	/*
	@Before  //��ʼ֮ǰ
	public void cc() {
		System.out.println("����@BeforeTest");
	}
	@Test  //���Կ�ʼ֮ǰ�Ĳ�������
	public void aa() {
		System.out.println("���ǵ�һ��@test");
	}
	@Test  //���Կ�ʼ֮��Ĳ�������
	public void bb() {
		System.out.println("���ǵڶ���@test");
	}
	@After
	public void dd() {
		System.out.println("����@After");
	}*/
	
}
