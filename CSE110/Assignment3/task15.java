import java.util.Scanner;
public class task15
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter number to check perfect number: ");
		int num = x.nextInt();
		int sum = 0;
		for(int i = 1; i<num; i++)
		{
				if(num%i==0)
				{			
					sum+=i;
				}
		}
				if(sum==num)
				{
					System.out.print(num+" is a perfect number");
				}
				else
				{
					System.out.print(num+" is not a perfect number");
				}
    }
}    