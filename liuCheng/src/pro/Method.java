package pro;

public class Method {
public static void main(String[] args) {
	Method aaa=new Method();
	aaa.shuChu();
	aaa.add(10,20);   //���ݸ��β�
	int c=aaa.zongHe(30, 50, 80);
	System.out.println(c);
	
	System.out.println(aaa.app(10,50));
}
void shuChu(){
	System.out.println("��Զ��������!");
	System.out.println("��Զ�����Ҹ�!");
}
void add(int a,int b){
	int sum=a+b;
	System.out.println(sum);
}

int zongHe(int a,int b,int c) {
	int sum=a+b+c;
	return sum;  //return�������ã�1.������������ 2.����ֵ
}

int app(int a,int b) {
	 int sum=a+b;
	 return sum;
}

}
