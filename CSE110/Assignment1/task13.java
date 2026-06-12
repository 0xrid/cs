import java.util.Scanner;

public class task13 
{
    public static void main(String[] task13) 
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Provide an integer number of any length: ");
        int num = x.nextInt();
        int last2Digits = num % 100;

        // Print the result
        System.out.println("The last two digits of the integer are: " + last2Digits);
    }
}
