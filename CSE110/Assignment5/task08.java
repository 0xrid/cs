import java.util.Scanner;

public class task08
{
    public static void main(String[] Gaben) 
	{
        Scanner x = new Scanner(System.in);
        System.out.println("Lemme aLtErNaTiNe CaPs your sentence onichan: \n");
        String testObject = x.nextLine();
        x.close();
        System.out.println("\nHere is your result king:\n");
        int StatTrak = 0; 
        for (int i = 0; i < testObject.length(); i++) {
            char ram = testObject.charAt(i);
            if (ram >= 'a' && ram <= 'z')
			{ 
                if (StatTrak % 2 != 0) 
				{
                    System.out.print((char) (ram - 32));
                } 
				else
				{
                    System.out.print(ram);
                }
                StatTrak++;
            } 
			else if (ram >= 'A' && ram <= 'Z') 
			{ 
                if (StatTrak % 2!= 0) 
				{
                    System.out.print(ram);
                } 
				else 
				{
                    System.out.print((char) (ram + 32));
                }
                StatTrak++;
            } 
			else 
			{ 
                System.out.print(ram);
            }
        }
		System.out.println("\n\n");
    }
}