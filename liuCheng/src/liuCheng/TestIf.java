package liuCheng;

public class TestIf {
public static void main(String[] args) {
	double d=Math.random();//���ء�0��1��֮����� 
	System.out.println(d);
	//���㡾0��5��֮�����
	int a=(int)(6*Math.random());
	System.out.println(a);//���if�������ţ�������ڵ���3�ģ���ִ�еڶ��������䣬С��3����������ִ��
	if(a<3)
	System.out.println("С");
	System.out.println("Ц��");
	
	
	int j=(int)(6*Math.random()+1);
	int k=(int)(6*Math.random()+1);
	int m=(int)(6*Math.random()+1);
	int sum=+j+k+m;
	if(sum>15) {
		System.out.println("������������50��!");
	}
	if(10<=sum&&sum<=15) {
		System.out.println("����һ����!����2��");
	}
	if(sum<10) {
		System.out.println("�����Ƚϲ��ʧ2��!");
	}
	System.out.print("��ĵ÷���:"+sum);
	
	
	double r=4*Math.random();//����0-3�������
	double area=Math.PI*Math.pow(r, 2);//Math.PI�����3.14��Math.pow(r, 2)����ǰ뾶r��ƽ��
	
	
}
}
