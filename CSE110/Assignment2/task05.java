import java.util.Scanner;
public class task05
{
    public static void main(String[] task05)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Provide an integer Number: ");
        int num = x.nextInt();
        x.close();
        if(num == 0)
        {
        	System.out.print("Number is zero");
        } else if(num < 0)
        {
        	System.out.print("Number is negative");
        } else if(num > 0 && num%2==0)
        {
        	System.out.print("Number is positive and even");
        }else if(num > 0 && num%2!=0)
        {
        	System.out.print("Number is positive and odd");
        }
        else if(num > 0 && num%2!=0)
        {
		   	System.out.print("error");
        }
    }
}    
    
 
