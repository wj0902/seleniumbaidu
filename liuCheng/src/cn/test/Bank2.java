package cn.test;

import java.util.Scanner;

public class Bank2 {
	/*	1.����ҵ��������
	2.��ӭ����������ȡ�����ɿ��������ȡ��󣬶�Ҫ��ʾ�����Ϣ
	3.�˳���ʱ�������û���Я����������Ʒ����ӭ�´ι���*/
	static int a;
	static String user=null;
	static int flag=0;
	static int usermoney=0;
	public static void main(String[] args) {
		Bank2 u=new Bank2();
		System.out.println("*********��ӭ�������й���ϵͳ!*********");
		System.out.print("������1�ż�\n��2�ż�\nȡ�3�ż�\n�˳���4�ż�\n");		
		while(true) {
			System.out.print("��������Ҫ���еĲ���:");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
		if(a==1) {
			if(user==null) {
				Scanner g=new Scanner(System.in);
				System.out.print("�����뿪����:");
				user=g.nextLine();
				System.out.println("����û���Ϊ:"+user);
				System.out.println("��Ĵ洢���Ϊ:"+flag);
			}else {
				System.out.println("���Ѿ������ˣ��������¿���!");
			}
		}else if(a==2) {
			if(user==null) {
				System.out.println("��û�п����������ȿ���!");
			}else {
				Cunk j=new Cunk();
				flag=flag+j.cunkuang();
				System.out.println("��Ĵ洢���Ϊ:"+flag);
			}
		}else if(a==3) {
				if(flag>=u.qukuang()) {
					flag=flag-u.qukuang();
					System.out.println("��ʣ�µĴ洢���Ϊ:"+flag);
				}else {
					System.out.println("���ȡ������ڴ洢����������ȡ����!");
				}			
			}
		else if(a==4) {
			TuiChu r=new TuiChu();
			r.tui();
			break;
		}
		else {
			System.out.println("�����������!����������");
		}
		}
		
		
	}
	public int qukuang() {
		if(user==null) {
			System.out.println("��û�п����������ȿ���!");
		}else{
			System.out.print("������ȡ���");	
			Scanner d=new Scanner(System.in);
			usermoney=d.nextInt();
			return usermoney;
		}
		return 0;
	}
}
class Cunk{
	public int cunkuang() {
		System.out.print("��������Ĵ洢���:");
		Scanner h=new Scanner(System.in);
		int b=h.nextInt();
		return b;
	}
}



class TuiChu{
	public int tui() {
		System.out.println("��ȫ�˳�!");
		return 0;
	}
}