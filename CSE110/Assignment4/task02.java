import java.util.Scanner;
public class task02
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in); 
		int num;		
		while(true)
		{
			System.out.print("Enter number: ");
			num = x.nextInt();
			if(num<0)
			{
				break;
			}
			else
			{
				System.out.println(num+" ^ 2 = "+(int)Math.pow(num,2));
			}
		}
         x.close();
    }
}    
    
