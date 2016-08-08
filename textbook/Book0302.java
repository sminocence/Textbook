package textbook;  
public class Book0302 { 	
	public static void main(String args[]){ 		
		int number=2; 		 		
		System.out.println("1000以内的完数如下：");		 		
		while(number>1 && number<=1000){
			int sum=0;
			for(int i=1;i<number;i++){				 				
				if(number%i==0) sum=sum+i;	
			}
			if(sum==number) 	
			System.out.println(number);	
			number++;
		}
	}
}