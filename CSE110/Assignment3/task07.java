import java.util.Scanner;
public class task07
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("provide a random number: ");
		int o = x.nextInt();
        x.close();
		int count=0;
		System.out.println("Divisors of "+o+": ");
		for(int i = 1; i<=o; i++)
		{
			if(6%i!=0)
			{
				continue;
			}
			else
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Divisors: "+count);
    }
}    