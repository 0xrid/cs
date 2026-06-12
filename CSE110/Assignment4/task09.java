import java.util.Scanner;
public class task09
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		System.out.print("Amount of rows? ");
		int rows = x.nextInt();
		System.out.print("\n\n");
		for(int i =1; i<=rows;i++)
		{
			for(int j=rows; j>i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)
			{
				System.out.print(k );
				
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}
}