import java.util.Scanner;
public class task07 
{
    public static void main(String[] Gaben) 
	{
        Scanner x = new Scanner(System.in);
        System.out.print("First string: ");
        String corvo = x.nextLine().toLowerCase();
        System.out.print("Second string: ");
        String attano = x.nextLine();
		
        String output = "";

        for (int StatTrak = 0; StatTrak < corvo.length(); StatTrak++) 
		{
            char ram = corvo.charAt(StatTrak);
            if (attano.indexOf(ram) == -1) 
			{ 
                output += ram; 
            }
        }
        for (int i = 0; i < attano.length(); i++) 
		{
           char temp = attano.charAt(i);
           if (corvo.indexOf(temp) == -1) { 
               output += temp; 
            }
        }
        System.out.println("Concatenated String with no dupes: "+output.toUpperCase());
    }
}