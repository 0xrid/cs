import java.util.Scanner;

public class task07{
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
		System.out.print("Number of attempt: ");		
		int corvo = x.nextInt(),X,Y,sum,count;
		for(int o = 1 ; o<=corvo;o++)
		{
			count=0;
			sum=0;
			System.out.print("\n\nValue of X: ");
			X = x.nextInt();
			System.out.print("Value of Y: ");
			Y = x.nextInt();
			while(count<Y)
			{
				if(X%2!=0)
				{
					sum+=X;
					count++;
				}
				X++;
			}
			System.out.println("\nTotal odds: "+sum);
		}
	}	
}		
		
        
        