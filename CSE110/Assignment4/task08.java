import java.util.Scanner;
public class task08
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		System.out.print("length what bro?: ");
		int length = x.nextInt();
		System.out.print("width what bro?: ");
		int width = x.nextInt();	
		System.out.print("\n\n");
		for(int i = 1; i <=width;i++)
		{
			for(int j = 1; j <=length;j++)
			{
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}
}