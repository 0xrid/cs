import java.util.Scanner;
public class task02
{
    public static void main(String[] task02)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("What is your grade, lil bro?: ");
        int mark = x.nextInt();
        x.close();
        if(mark<=100 && mark>=90)
        {
        	System.out.print("Your grade is A");
        }
        else if(mark<=89 && mark>=85)
        {
        	System.out.print("Your grade is A-");
        }
        else if(mark<=84 && mark>=70)
        {
        	System.out.print("Your grade is B");
        }
        else if(mark<=69 && mark>=57)
        {
        	System.out.print("Your grade is C");
        }
        else if(mark<=56 && mark>=50)
        {
        	System.out.print("Your grade is D");
        }
        else if(mark<50)
        {
        	System.out.print("Your grade is F");
        }
        else 
        {
        	System.out.print("Invalid");
        }

    }
}    
     
