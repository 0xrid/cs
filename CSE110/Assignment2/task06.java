import java.util.Scanner;
public class task06
{
    public static void main(String[] task06)
    {
        Scanner y = new Scanner(System.in);
        System.out.print("Enter digit(s): ");
        int x = y.nextInt();
        y.close();
        if(x<0)
        {
        	System.out.print("output: "+2*x);
        }
        else if(0<=x && x < 2)
        {
        	System.out.print("output: "+(x + 1));	
        }
        else if(2<=x && x < 5)
        {
        	System.out.print("output: "+(Math.pow(x,2) - 1));	
        }
        else if(x >= 2)
        {
        	System.out.print("output: "+(3*Math.pow(x,2) + 2));	
        }
        
    }
}    
    
 
