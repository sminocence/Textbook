package textbook;
import java.util.Scanner;
public class CoutLade{
	public static void main(String args[]){					
		Lade tixing=new Lade();
		Scanner reader=new Scanner(System.in);
		System.out.println("���������ε��µף�");
		tixing.bottom=reader.nextDouble();	
		System.out.println("���������ε��ϵף�");
		tixing.above=reader.nextDouble();
		System.out.println("���������εĸߣ�");
		tixing.height=reader.nextDouble();	
		reader.close();
		System.out.println("���ε����Ϊ��"+tixing.coutArea());
		}
}
class Lade{
	double bottom;
	double above;
	double height;	
	double coutArea(){
		double area=(bottom+above)*height/2;
		return area;
	}
}