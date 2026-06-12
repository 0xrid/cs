import java.util.Scanner;
public class task08
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Number of terms: ");
		int terms = x.nextInt(),sum = 0,odd;
        x.close();
		System.out.println("The odd numbers are: ");
		for(int i = 1; i<=terms; i++)
		{
			odd = 2*i-1;
			System.out.println(odd);
			sum+=odd;
		}
		System.out.println("The Sum of odd Natural Numbers up to "+terms+" terms is: "+sum);
    }
}    
    