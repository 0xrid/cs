import java.util.Scanner;
public class task06
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Lemme reverse your sentence: ");
		String testObject = x.nextLine();
		String[] storage = testObject.split(" ");
		x.close();	
		System.out.println("Here is your result king: \n");
		for(int i =storage.length-1; i>=0;i--)
		{
			System.out.print(storage[i]+" ");
		}
		System.out.println("\n");
    }
}   