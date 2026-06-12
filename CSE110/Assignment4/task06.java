import java.util.Scanner;
public class task06
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		int num, count=0;
		while(true)
		{
			count=0;		
			System.out.print("Enter number: ");
			num = x.nextInt();
			if(num%2!=0)
			{
				break;
			}
			else 
			{			
				for(int i = 1; i<=num; i++)
					{
							if(num%i!=0)
								{
									continue;
								}
								 else
								{
										count++;
								}
					}
					System.out.println(num +" has "+count+" divisors");
			}
		}

    }
}    
    
