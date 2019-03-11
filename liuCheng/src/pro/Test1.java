package pro;

public class Test1 {
public static void main(String[] args) {
	int sqq=0;
    for(int i=1;i<10;i++){
        do{             //之所以会是8，是因为要do---while要循环完里面的，在循环完外面的for循环
            i++;
            if(i%2!=0)
                sqq+=i;
        }while(i<6);
    }
    System.out.println(sqq);
}
}
