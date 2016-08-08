package textbook;
import java.util.*;
public class GuessNumber{
	public static void main(String args[]){
		int randomNumber;			//随机数
		int guess;					//用户的猜测
		int cout=0;                 //记录用户猜测的次数
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		System.out.println("给你一个1-100之间的数字，请猜测:");
		randomNumber=random.nextInt(100);
		guess=input.nextInt();
		while(guess!=randomNumber){
			cout++;
			if(guess>randomNumber){
				System.out.println("第"+cout+"次猜测，猜大了，请再猜：");
			}
			else if(guess<randomNumber){
				System.out.println("第"+cout+"次猜测，猜小了，请再猜：");
			}
			guess=input.nextInt();
		}
		System.out.println("您猜了"+cout+"次，猜对了，这个数是"+randomNumber);
	}
}
