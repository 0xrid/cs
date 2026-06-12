import java.util.Scanner;
public class task12
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Provide digits: ");
		int n = x.nextInt();
		int count = 0;
		while(n>0&n/10>0)
		{
				System.out.print((n%10)+", ");
				n/=10;			
		}
				System.out.print((n%10));
    }
}    