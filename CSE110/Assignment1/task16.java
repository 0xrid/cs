import java.util.Scanner;

public class task16 
{
    public static void main(String[] task16)    
    {
        Scanner x = new Scanner(System.in);

        System.out.print("Provide data in minutes: ");

        int min = x.nextInt();

        int year = min/(60*24*365);

        int days = (min/(60*24))%365;

        System.out.print(min+" minute is  approximately "+ year + " years and "+ days + " days");

        x.close();
    }
}
