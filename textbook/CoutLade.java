package textbook;
import java.util.Scanner;
public class CoutLade{
	public static void main(String args[]){					
		Lade tixing=new Lade();
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入梯形的下底：");
		tixing.bottom=reader.nextDouble();	
		System.out.println("请输入梯形的上底：");
		tixing.above=reader.nextDouble();
		System.out.println("请输入梯形的高：");
		tixing.height=reader.nextDouble();	
		reader.close();
		System.out.println("梯形的面积为："+tixing.coutArea());
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