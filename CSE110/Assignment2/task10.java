import java.util.Scanner;
public class task10
{
    public static void main(String[] task10)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("first side in unit: ");
        int side1 = x.nextInt();
        System.out.print("second side in unit: ");
        int side2 = x.nextInt();
        System.out.print("third side in unit: ");
        int side3 = x.nextInt();
        x.close();
        if(side1 == side2 && side2 == side3)
        {
        	System.out.print("This is a Equilateral triangle");
        } 
        else if(side1 != side2 && side2 != side3)
        {
        	System.out.print("This is a Scalene triangle");
        }
        else if (side1 == side2 || side1 == side3 || side2 == side3)
        { 
        	System.out.println("The triangle is Isosceles");
        } 
        else 
        {
        	System.out.print("Error");
        }
    }
}    
    
 
