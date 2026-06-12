import java.util.Scanner;
public class template
{
    public static void main(String[] task15)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Provide first integer: ");
        int a = x.nextInt();
        System.out.print("Provide second integer: ");
        int b = x.nextInt();

        swap_with_3rd_var(a, b);
        swap_without_any_var(a, b);
    }
	public static void swap_with_3rd_var(int a, int b) 
	{
        int temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter swapping using a third variable:");
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void swap_without_any_var(int a, int b) 
    {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("\nAfter swapping without any other variable:\na = " + a + ", b = " + b);
    }
}  

