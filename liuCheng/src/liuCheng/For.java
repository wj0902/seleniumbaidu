package liuCheng;

public class For {
public static void main(String[] args) {
	/*		int i=1;
	int sum=0;
	for(i=1;i<=3;i++) {
		System.out.println(i);
		sum=i+sum;
	}
	System.out.println(sum); */
	
	/*	while(true) {    //������true����������false������������1����0
		System.out.println("ף������Զ��������!");
	}   */
	
	/*	for(; ;) {   //������false����true��ʾ
		System.out.println("��Զ�����������ǵ���Զ!");
	}     */
	
	/*	for(int a=1;a<6;a++) {
		for(int j=1;j<6;j++) {
			System.out.print(a+"\t");
		}
		System.out.println();//���Ҳ�ǻ���,���дprint�Ͳ���
	}	*/
	//�žų˷���
	/*	for(int i=1;i<=9;i++) {
		for(int j=1;j<=i;j++) {   //jС��i��Ϊ��ÿ����һ������9��8��7������
			System.out.print(j);
			System.out.print("*"+i);
			System.out.print("="+i*j+" ");
		}
		System.out.print("\n");    
	}       */
	//��whileѭ���ֱ����100���ڵ�������ż���ĺͣ������
	/*	int n=2;
	int sum=0;
	while(n<=100)
	{
		sum=sum+n;
		n=n+2;
	}
	System.out.print(sum);      */
	//��whileѭ��������ѭ�����1-1000֮���ܱ�5������������ÿ�����5����

	int i=1;
	int count=0;
	for(i=1;i<=100;i++) {
		if(i%5==0) {
			System.out.print(i+"	");
		count++;
		if(count%5==0) {
			System.out.println();
		}
		}
	}	
	
}
}
