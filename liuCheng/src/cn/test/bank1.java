package cn.test;
import java.util.Scanner;
public class bank1
{
/*	1.����ҵ��������
	2.��ӭ����������ȡ�����ɿ��������ȡ��󣬶�Ҫ��ʾ�����Ϣ
	3.�˳���ʱ�������û���Я����������Ʒ����ӭ�´ι���*/
	static String user;
	static double usermoney=0;
	static double flag;
	static double total=0;
	static double t;
	public static void main(String[] args)
	{
		System.out.println("��ӭʹ������ҵ�����ϵͳ"+"\n"+"1.����"+"\n"+"2.���"+"\n"+"3.ȡ��"+"\n"+"4.�˳�");
		while(flag!=4)
		{
		System.out.print("������˵����ѡ����Ҫ�����ҵ��");
		Scanner a=new Scanner(System.in );
		flag=a.nextInt();
		if(flag==1)
		{
			kaihu();
		}
		if(flag==2)
		{
			if(user==null)
			{
					System.out.println("���ȿ������ܽ��д��");
			}
			else
			{
			total+=chuankuan();
			System.out.println("���ɹ����˻� "+ user +" ��ǰ���Ϊ��"+total);				
			}
		}
		if(flag==3)
		{			
			t = qukuan();
			if(total==0)
			{
				System.out.println("�˻����Ϊ0�����ܽ���ȡ��");
			}
			else if(t>total)
			{
				System.out.println("�����ȡ��������˻�������������");
			}
			else
				{
				total-=t;
				System.out.println("ȡ��ɹ����˻� "+ user +" ��ǰ���Ϊ��"+total);				
				}
		}
		if(flag==4)
		{
			System.out.println("���˳�ϵͳ����Я����������Ʒ����ӭ�´ι���");
		}
		}
	}
	static void kaihu()
	{
		if(user!=null)
		{
			System.out.println("�����ظ�����");
		}
		else
		{
		System.out.print("�������û�����");
		Scanner b=new Scanner(System.in );
		user=b.nextLine();
		System.out.println("�����ɹ�"+"\n"+"����û���Ϊ��"+user+"\n"+"������Ϊ��"+usermoney);	
		}
	}
	static double chuankuan()
	{
		System.out.println("���������");	
		Scanner c=new Scanner(System.in );
		usermoney=c.nextInt();
		return usermoney;
	}
	static double qukuan()
	{
		if(user!=null) 
		{
		System.out.println("������ȡ���");	
		Scanner d=new Scanner(System.in);
		usermoney=d.nextInt();
		return usermoney;
		}
		else
		{
			System.out.println("���ȿ������ܽ���ȡ��");
		}
		return 0;
	}
}
