import java.util.Scanner;
public class task05
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		int Int1 = x.nextInt();
		int y = 0;
        //System.out.print(" ");
        x.close();
		for(int i =1; i<=Int1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				y+=j;
			}
			
		}
		System.out.println("The value of y: "+(-1)*y);
    }
}    
    
