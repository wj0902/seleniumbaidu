package pro2;

public class Hello {
	int a;//��Ա�������Լ���ֵΪ0�������ڶ���
	static int b;//��̬��������������
public static void main(String[] args){
	{
		int age;//���飬Ҳ�Ǿֲ�����������������
		age=100;
		System.out.println(age);
	}
	int salary=20;//�ֲ�����,�����ڷ���
	System.out.println(salary);
	final String name="aaa";
	System.out.println(name);
	
	char d1='��';//ֻ��дһ�������ַ�
	System.out.println(d1);
	char d2='1';//ֻ��дһ���ַ���������Ӣ�Ļ�������
	System.out.println(d2);
	
	System.out.println(""+'a'+'b');
	System.out.println(""+'a'+'\n'+'b');
	System.out.println(""+'a'+'\t'+'b');
	System.out.println(""+'a'+'\''+'b');        //a'b
	System.out.println(""+'a'+'\\'+'\\'+'b');  //a\\b
	
	//String�����ַ�����
    String  d3 = "abc"; 
    
    boolean man=true;//������д������ֻ��дtrue����false
    if(man) {
    	System.out.println("����");
    }
	
    System.out.println(-7%-3);
    
    int f=1;
    System.out.println(+f);
    
}
}
