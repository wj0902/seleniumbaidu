package cn.test;

public class Day004 {
	//�˾��е�����
	int age;
	String name;
	//�˾��е���Ϊ
	void speak() {
		System.out.println("����"+name+"����"+age);
	}
	public static void main(String[] args) {
		Cat p=new Cat(179,"ħ��è");
		p.nao();
	}
}
class Cat{
	int height;
	String name;
	Cat(int height,String name){
		super();
		this.height=height;
		this.name=name;
	}
	void nao() {
		System.out.println("�ҽ�"+name+"���"+height);
	}
}
