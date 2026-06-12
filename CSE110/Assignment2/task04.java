import java.util.Scanner;
public class task04
{
    public static void main(String[] task04)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = x.nextInt();
        x.close();
        if(year%400==0 || (year%4==0 && year%100!=0))
        {
        	System.out.print(year+" is a leap year");
        }
        else 
        {
        	System.out.print(year+" is not a leap year");
        }
    }
}    
    
 
