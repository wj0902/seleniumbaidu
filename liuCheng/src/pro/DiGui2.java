package pro;

public class DiGui2 {
	public static void main(String[] args) {			
		long d1=System.currentTimeMillis();  
        System.out.printf("�ݹ�%d�׳˵Ľ��:%s%n", 10, jieCheng(10));//Ϊʲô����println��ʽ�����û�к�ʱ
        long d2 = System.currentTimeMillis();
        System.out.println("�ݹ��ʱ:"+(d2-d1));  //��ʱ��32ms
		
		System.out.println("��ͨѭ�������:"+jc(10));
		
	}
	
	
	static long jieCheng(int n){
		if(n==1) {
			return 1;
		}else {
			return n*jieCheng(n-1);
		}
	}
	static long result=1;
	static long sum=0;
	 static long jc(int m) {
		 long d3=System.currentTimeMillis();//��long���ͣ�����дint�����������˼�Ƿ��ص�ǰʱ�̣�������
		if(m==1) {
			return 1;
		}
		while(m>1) {
			result=m*(m-1)*result;
			m=m-2;
		}	
		long d4=System.currentTimeMillis();//��long���ͣ�����дint��ִ�е�6�к�ĵ�ǰʱ��
		System.out.println("��ͨѭ����ʱ:"+(d4-d3));
		return result;	
		
	}
}
//System.out.printf("%d%s%n",6,jieCheng(6))һ���Ǵ�ӡ6��һ����ӡjieCheng(6)��һ���ǻ��У�Ҳ����\n