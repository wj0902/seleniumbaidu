package pro;

public class Goto {
public  static void main(String[] args) {
		/*	aaa:for(int i=10;i<=20;i++) {
		
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
				continue aaa;//aaa�Ǳ�ǩ����������д��������aaa��ֱ�ӷ��ص��������aaa,û��ִ��if���ͻ�������	
				}		
		}
		System.out.print(i+"	");
		
	}                   */
	int t;
	for(int i=10;i<=29;i++) {     //�������ļ򵥷���
		t=1;
		for(int j=2;j<=i/j;j++) {
			if(i%j==0) {
				t=0;
			}
		}
			if(t==1){
				System.out.println(i);
			}
	}
	
	
	int c=5;
	int d=8;
	{
		int k=2;
		//int c=2;//�ظ��������
	}//����k�������򵽴˽���
	
	
}
}
