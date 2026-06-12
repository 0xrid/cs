import java.util.Scanner;
public class task04
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Input string to reverse: ");
		String input = x.nextLine();
		x.close();
		char[] storage = input.toCharArray();
		System.out.print("Reversed String: ");
		for(int i =input.length()-1; i>=0;i--)
		{
			System.out.print(storage[i]);
		}

    }
}    
    