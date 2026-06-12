import java.util.Scanner;
public class task03
{
    public static void main(String[] task03)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = x.nextInt();
        x.close();
        if((num%5==0) && (num%7==0))
        {
        	System.out.print("Divisible by Both");
        }
        else if((num%5!=0) && (num%7!=0))
        {
        	System.out.print("No");
        }
        else if(num%7==0)
        {
        	System.out.print("Invalid: Divisible by 7 Only");
        }
        else if(num%5==0)
        {
        	System.out.print("Invalid: Divisible by 5 Only");
        }

    }
}    
    
 
