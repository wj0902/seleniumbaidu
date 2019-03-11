package cn.com;

public class Brid implements Flyable,Sleepable{
	public void fly() {
		System.out.println("靠翅膀飞行！");
	}
	public void sleep() {
		System.out.println("鸟儿累了就会停在树上休息");
	}
}
