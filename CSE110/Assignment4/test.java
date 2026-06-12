import java.util.Scanner;
public class test
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Amount of required prime numbers: ");
		int amount = x.nextInt(),count=0,num=2;	//prime count starts from 2
        x.close();
		while(count<amount)
		{
			boolean optimusPrime = true; //resets value upon every cycle
			for(int i = 2; i<=Math.sqrt(num);i++)
			{
				if (num % i == 0) 
					{
                        break;
                    }
				else
				{
					System.out.println(num);
					count++;
				}
				
			}
			num++;
		}

    }
}    
    
