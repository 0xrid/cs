import java.util.Scanner;
public class task01
{
    public static void main(String[] task01)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = x.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = x.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = x.nextInt();
        x.close();
        if(num1 == num2 && num2 == num3)
        {
        	System.out.print("All numbers are equal");
        } else if(num1 >= num2 && num1 >= num3) 
        {
        	System.out.print("largest number: "+  num1);
        } else if(num2 >= num1 && num2 >= num3) 
        {
        	System.out.print("largest number: "+  num2);
        } else if(num3 >= num1 && num3 >= num2)
        {
        	System.out.print("largest number: "+  num3);
        } else 
        {
        	System.out.print("error");
        }
    }
}    
    
