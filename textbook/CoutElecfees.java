package textbook;
import java.util.*;
public class CoutElecfees {
	public static void main(String args[]){
	double electricity;
	double price;
	double allprice;
	System.out.println("�����õ�����");
	Scanner reader=new Scanner(System.in);
	electricity=reader.nextInt();
	reader.close();
	if(electricity>=1 && electricity<=90){
		price=0.6;
		allprice=price*electricity;	
	}
	else if(electricity<=150){
		price=1.1;
		allprice=price*electricity;
	}
	else{
		price=1.7;
		allprice=price*electricity;
	}
	System.out.println("�ܹ����Ϊ��"+allprice);
	}
}
