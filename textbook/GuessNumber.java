package textbook;
import java.util.*;
public class GuessNumber{
	public static void main(String args[]){
		int randomNumber;			//�����
		int guess;					//�û��Ĳ²�
		int cout=0;                 //��¼�û��²�Ĵ���
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		System.out.println("����һ��1-100֮������֣���²�:");
		randomNumber=random.nextInt(100);
		guess=input.nextInt();
		while(guess!=randomNumber){
			cout++;
			if(guess>randomNumber){
				System.out.println("��"+cout+"�β²⣬�´��ˣ����ٲ£�");
			}
			else if(guess<randomNumber){
				System.out.println("��"+cout+"�β²⣬��С�ˣ����ٲ£�");
			}
			guess=input.nextInt();
		}
		System.out.println("������"+cout+"�Σ��¶��ˣ��������"+randomNumber);
	}
}
