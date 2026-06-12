import java.util.Scanner;
public class task02
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Lemme check your palindrome senpai UwU: ");
		String testObject = x.nextLine();
		x.close();
		String palindromeStorage ="";
		char[] storage = testObject.toCharArray();	
		for(int i =testObject.length()-1; i>=0;i--)
		{
			palindromeStorage+=storage[i];
		}
		System.out.print("Fact Status: ");
		System.out.print(testObject.equals(palindromeStorage));
    }
}    
    