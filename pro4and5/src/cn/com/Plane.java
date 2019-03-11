package cn.com;

public class Plane implements Flyable,Sleepable{
	public void fly() {
		System.out.println("靠能源支持飞行！");
	}
	public void sleep() {
		System.out.println("飞机没有能源就会停止飞行");
	}
}
