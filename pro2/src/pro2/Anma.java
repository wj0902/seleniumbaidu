package pro2;

public class Anma {
	public static void main(String[] args) {
		Cat s=new Cat();
		s.height=169.5;	
		s.year=4;
		s.niLin("ʥ������","sq");
		s.jiQiao();
		s.fiXing();
	}
}
class Ani{
	double height;
	public void fiXing() {
		System.out.println("�һ��!");
	}
}
class Pig extends Ani{
	String name="��˹è";
	String user="wj";
	public void jiQiao() {
		System.out.println("�һ���!");
	}
}
class Cat extends Pig{
	int year;
	public void niLin(String name,String user) {
		
		System.out.println("���������ʱ��ս"+year+"\n��:"+height+
				"\n�ҵ�����:"+name+"\n����"+super.name+
				"\n��������"+super.user+"\n��������:"+user);
	}
	public void fiXing() {
		System.out.println("����վ�ڷ�ڵ���������������!");
	}
	public void jiQiao() {
		//System.out.println("�һ�Ϲ�ܣ��ٺ�!");
		super.jiQiao();
	}
}