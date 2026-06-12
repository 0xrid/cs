import java.util.Scanner;
public class task11
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Provide digits: ");
		int n = x.nextInt();
		int count = 0;
		while(n>0)
		{
			n/=10;
			count++;
		}
		System.out.print("Total digits = "+count);
    }
}    