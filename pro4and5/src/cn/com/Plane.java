package cn.com;

public class Plane implements Flyable,Sleepable{
	public void fly() {
		System.out.println("����Դ֧�ַ��У�");
	}
	public void sleep() {
		System.out.println("�ɻ�û����Դ�ͻ�ֹͣ����");
	}
}
