package liuCheng;
import java.util.Scanner;
public class Xzhuo {
	public static void bor() {
		System.out.println("ʨ����\t"+"��ƽ��\t"+"˫����\t"+"������");
		System.out.println("ˮƿ��\t"+"Ħ����\t"+"��Ы��\t"+"��ţ��");
		System.out.println("��Ů��\t"+"˫����\t"+"������\t"+"��з��");
	}
	public static void borthday(int month,int date) {
		switch(month) {
		case 1:
			if(date<15) {
				System.out.println("��Ů��");
			}else {
				System.out.println("˫����");
			}
			break;
		case 2:
			if(date<15) {
				System.out.println("˫����");
			}else {
				System.out.println("ˮƿ��");
			}
			break;
		case 3:
			if(date<15) {
				System.out.println("ˮƿ��");
			}else {
				System.out.println("ʨ����");
			}
			break;
		case 4:
			if(date<15) {
				System.out.println("ʨ����");
			}else {
				System.out.println("��Ы��");
			}
			break;
		case 5:
			if(date<15) {
				System.out.println("��Ы��");
			}else {
				System.out.println("������");
			}
			break;
		case 6:
			if(date<15) {
				System.out.println("������");
			}else {
				System.out.println("��ţ��");
			}
			break;
		case 7:
			if(date<15) {
				System.out.println("��ţ��");
			}else {
				System.out.println("��з��");
			}
			break;
		case 8:
			if(date<15) {
				System.out.println("��з��");
			}else {
				System.out.println("˫����");
			}
			break;
		case 9:
			if(date<15) {
				System.out.println("˫����");
			}else {
				System.out.println("Ħ����");
			}
			break;
		case 10:
		if(date<15) {
			System.out.println("Ħ����");
		}else {
			System.out.println("��ƽ��");
		}
		break;
		case 11:
			if(date<15) {
				System.out.println("��ƽ��");
			}else {
				System.out.println("������");
			}
			break;
		case 12:
			if(date<15) {
				System.out.println("������");
			}else {
				System.out.println("��Ů��");
			}
			break;
		}
		
	}

	public static void main(String[] args) {
		bor();
		Scanner s=new Scanner(System.in);
		System.out.print("����������·�:");
		int month=s.nextInt();
		while(month>12) {
			System.out.print("��������������·�:");
			month=s.nextInt();
		}
		System.out.print("�������������:");
		int date=s.nextInt();
		while(date<=0) {
			System.out.print("�����������������:");
			date=s.nextInt();
		}
		borthday(month,date);
	}
}
