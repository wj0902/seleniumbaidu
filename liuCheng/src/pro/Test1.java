package pro;

public class Test1 {
public static void main(String[] args) {
	int sqq=0;
    for(int i=1;i<10;i++){
        do{             //֮���Ի���8������ΪҪdo---whileҪѭ��������ģ���ѭ���������forѭ��
            i++;
            if(i%2!=0)
                sqq+=i;
        }while(i<6);
    }
    System.out.println(sqq);
}
}
