/*
 * ��������
 * */
package pro3;

import java.util.*;//ϵͳĬ�ϰ�֮����࣬Ҫʹ�õĻ���Ҫ���������

public class TestScanner {
public static void main(String[] args) {
	
	/*  char i=6;
	System.out.println(i);
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("����������:");
	String name=scanner.nextLine();
	System.out.println(name);
	System.out.println("��������İ���:");
	String favo=scanner.nextLine();
	System.out.println(favo);
	System.out.println("�������������:");
	int age=scanner.nextInt();
	
	System.out.println("#########################");
	
	System.out.println("�������������:"+age*365);
	System.out.println("�뿪���������:"+(72-age)*365);  */
	
	/* 	Scanner bottomPour=new Scanner(System.in);
	System.out.println("#########�뿪ʼ�����ע##########");
	
	System.out.print("��3-18����ѡ����ҪѺ������:");			
	int shuzi=bottomPour.nextInt();
	
	while(shuzi<3||shuzi>18) {
		System.out.print("��3-18����ѡ����ҪѺ������:");	
		shuzi=bottomPour.nextInt();
	}
	
	System.out.print("������Ҫ��ע�ı���:");
	int beishu=bottomPour.nextInt();
	 System.out.print("Ӯ�˽��õ�:"+shuzi*beishu);
	 
	 System.out.print("\n");    */
	
	Scanner name=new Scanner(System.in);
	System.out.print("������Ҫѡ�ٵ�����:");
	String mingZi=name.nextLine();
	System.out.print("ѡ������:"+mingZi);  
	System.out.print("\n");
	System.out.print("����������:");
	int age=name.nextInt();
	System.out.print("ѡ����������:"+age);
}
}
