import java.util.Scanner;
public class task09
{
    public static void main(String[] task09)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter first double: ");
        double num1 = x.nextDouble();
        System.out.print("Enter second double: ");
        double num2 = x.nextDouble();
        System.out.print("Enter third double: ");
        double num3 = x.nextDouble();
        double max=0, min=0;
        x.close();
        
        if(num1 == num2 && num2 == num3)
        {
        	System.out.print("All numbers are equal");
        } 
        else if(num1 >= num2 && num1 >= num3) 
        {
        	max = num1;
        } 
        else if(num2 >= num1 && num2 >= num3) 
        {
        	max = num2;
        } 
        else if(num3 >= num1 && num3 >= num2)
        {
        	max = num3;
        } 
        else 
        {
        	System.out.print("error");
        }

        if(num1 <= num2 && num1 <= num3) 
        {
        	min = num1;
        } 
        else if(num2 <= num1 && num2 <= num3) 
        {
        	min = num2;
        } 
        else if(num3 <= num1 && num3 <= num2)
        {
        	min = num3;
        } 
        else 
        {
        	System.out.print("error");
        }

        System.out.println("\nMaximum number is " +max+"\nMinimum number is " + min); 
     
    }
}    
     
