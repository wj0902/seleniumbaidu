package cn.test;
import java.util.Scanner;
public class Yhen {
	static String name;
	public static void main(String[] args) {		
		System.out.println("\t\t\t��ӭ��������ҵ�����ϵͳ");
		System.out.println("��������1�ż�\t�������2�ż�\tȡ"
				+ "������3�ż�\t�˳�����4�ż�");
				int n;
				Scanner s=new Scanner(System.in);
				//System.out.print("��������Ҫ�����ҵ�����:");
				int total=0;
				int quk=0;
				while(true) {
					System.out.print("��������Ҫ�����ҵ�����:");
					n=s.nextInt();			
				if(n==1) {	
					if(name==null) {
						Scanner w=new Scanner(System.in);
						System.out.print("�������û���:");
						name=w.nextLine();	
						System.out.println("ҵ�����ɹ�!");
					}else
						System.out.println("����û��˺��Ѿ�����!");
				}
				if(n==2){
					if(name==null)
					{
							System.out.println("���ȿ������ܽ��д��");
					}else
					{
					System.out.print("������洢���:");
					Add p1=new Add();
					total+=p1.su();
					System.out.println("�û�"+name+"��Ĵ洢���Ϊ:"+total);
					}
				}
				if(n==3) {
					Jia p3=new Jia();
					System.out.print("������ȡ�����:");
					quk=p3.jian();
					if(total==0)
					{
						System.out.println("�˻����Ϊ0�����ܽ���ȡ��");
					}
					else if(quk>total)
					{
						System.out.println("�����ȡ��������˻�������������");
					}
					else
					{
						total-=quk;
						System.out.println("�û�"+name+"ȡ��ɹ�����ǰ���Ϊ��"+total);				
					}
				}
				if(n==4) {
					System.out.println("�û�"+name+"��Я����������Ʒ����Ҫ����!");
					break;
				}
				if(n>4) {
					System.out.print("�����������!");
				}
				
				}
			}	
}
class Add{
	public int su() {			
		Scanner q=new Scanner(System.in);
		int m=q.nextInt();
		return m;
	}
}
class Jia{
	public int jian() {
		Scanner q=new Scanner(System.in);
		int m=q.nextInt();
		return m;
	}
}