import java.util.Scanner;
public class task07
{
    public static void main(String[] task07)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Student ID plws >_<: ");
        int std = x.nextInt();
        x.close();
        int std_temp = std/100000;
        int year = std_temp/10;
        int session = std_temp%10;
        if (session == 1)
        {
        	System.out.println("Student Joined BRAC in Spring 20"+year);
        } else if (session == 2)
        {
        	System.out.println("Student Joined BRAC in Fall 20"+year);
        } else if (session == 3)
        {
        	System.out.println("Student Joined BRAC in Summer 20"+year);
        } else 
        {
        	System.out.println("error");
        }
        
    }
}    
    
 
