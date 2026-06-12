import java.util.Scanner;
public class task10
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = x.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++)
		{
			if((i%5==0)&&(i%3!=0))
			{
				System.out.println(i);
			}
		}
    }
}    