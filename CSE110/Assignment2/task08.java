import java.util.Scanner;
public class task08
{
    public static void main(String[] task08)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Salary?: ");
        int sal = x.nextInt();
        System.out.print("Age?: "); 
        int age = x.nextInt();
        x.close();

        if(age >= 18 && sal < 10000)
        {
        	System.out.print("No tax lil bro :)");
        }
        else if(age < 18)
        {
        	System.out.print("No tax lil bro :)");
        }
        else if(age >= 18 && sal >= 10000 && sal <= 20000 )
        {
        	System.out.print("Your tax amount is "+sal*0.05+" Tk");
        }
        else if(age >= 18 && sal >= 20000)
        {
        	System.out.print("Your tax amount is "+sal*0.1+" Tk");
        }
    }
}
       
 
