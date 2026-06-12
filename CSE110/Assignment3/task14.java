import java.util.Scanner;
public class task14
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Provide number: ");
		int num = x.nextInt();
		for(int i = 2; i<=9;i++)
		{
			if(num%i==0 && (num!=i))
			{
				System.out.print(num+" is not a prime number");
				break;
			}
			else if((num%i==0) && (num==i))
			{
				System.out.print(num+" is a prime number");
			}
		}
    }
}    