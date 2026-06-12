import java.util.Scanner;
public class task18
{
    public static void main(String[] task18)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        int stdntID = x.nextInt();
        int last2Digits = stdntID%100;
        System.out.println("last two digits printed seperately in reverse: ");
        System.out.println(last2Digits%10);
        System.out.print(last2Digits/10);
        x.close();

    }
}    
    
 
