package pro;

public class BreakContinue {
public static void main(String[] args) {
	
	int j=0;
	while(true) {
		j++;
		int i=(int)(100*Math.random()+1);
		System.out.println(i);
		if(i==88) {
			break;  //�����ж�ѭ��������ѭ��
			        //�����continue�������continue���滹����䣬Ҳ����ִ�У�����ֱ�ӷ��ص�while��ʼѭ������ֹ����ѭ��
		}
		
	}
	System.out.println("ִ����:"+j+"��!");
}
}
