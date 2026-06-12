import java.util.Scanner;
public class task01
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Lemme upper case your string senpai UwU: ");
		String testObject = x.nextLine(),finalObject;
		x.close();
		char[] storage = testObject.toCharArray();
		for (int i = 0; i <= testObject.length() - 1; i++) 
		{
			int asciiValue = testObject.codePointAt(i);
			if(asciiValue<=122 && asciiValue>=97)
			{
				asciiValue-=32;			
			}
			System.out.print((char)asciiValue);
		}
    }
}    
    