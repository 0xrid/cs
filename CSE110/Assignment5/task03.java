import java.util.Scanner;
public class task03
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Input phrases: ");
		String phrases = x.nextLine();
		System.out.print("split based on what bro?: ");
		String bomb = x.nextLine();
		String[] storage = phrases.split(bomb);
		x.close();	
		System.out.println("Here is your result king: \n");
		for(int i =0; i<=storage.length-1;i++)
		{
			System.out.println(storage[i]);
		}
    }
}    
    