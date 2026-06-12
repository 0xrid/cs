import java.util.Scanner;
public class task12
{
    public static void main(String[] task12) 
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = x.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = x.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = x.nextInt();

        x.close();

        if (num1 == num2 && num2 == num3) 
        {
            System.out.println("All numbers are equal");
        } 
        else if (num1 != num2 && num1 != num3 && num2 != num3) 
        {
            System.out.println("All numbers are different");
        } 
        else 
        {
            System.out.println("Neither all are equal or different");
        }
    }
}
 
