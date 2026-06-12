import java.util.Scanner;
public class task13
{
    public static void main(String[] Gaben)
    {
		Scanner x = new Scanner(System.in);
		System.out.print("Provide digits: ");
		int num = x.nextInt(), count = -1, numtemp = num;
		while(numtemp>0)
		{
			numtemp/=10;
			count++;
		}
		int temp = (int)Math.pow(10, count);
		while(true)
		{
			if(num<=9){break;}
			System.out.print(num/temp+", ");
			num %= temp; 
			temp /= 10;
		}
			System.out.print(num/temp);
    }
}  