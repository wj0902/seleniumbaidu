package pro;

public class DiGui {
public static void main(String[] args) {
	a();
}
static int count=0;
static void a(){
	
	System.out.println("a");
	count++;
	//a();  д�˻�ռ���ڴ�ռ䣬ֱ��һֱ�����Լ����ִ���
	if(count<=3) {   //ifΪ�ݹ���
		a();
	}else {          //elseΪ�ݹ�ͷ
		return;//����һ�������ǽ���
	}	
	
}
}