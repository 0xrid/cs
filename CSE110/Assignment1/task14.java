import java.util.Scanner;

public class task14
{
    public static void main(String[] task14)
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Give a value for inch: ");

        float inch = x.nextFloat();

        double meter = inch*0.0254; 

        System.out.println("Expected Output: \n"+ inch+" inch is "+meter+" meter");
        
        x.close();

    }
}
