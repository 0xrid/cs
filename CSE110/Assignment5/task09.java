import java.util.Scanner;
public class task09
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.println("Plwase enter your passwowd Senpai UwU: ");
		String passcode = x.nextLine();
		boolean capCheckStatus = false, smallCheckStatus = false, digitCheckStatus = false, spCharStatus = false, passLengthStatus = false;
		for(int i = 0;i<=passcode.length()-1;i++)
		{
			char ram = passcode.charAt(i);
			if(ram>='a' && ram<='z')
			{
				smallCheckStatus = true;
			}
			if(ram>='A' && ram<='Z')
			{
				capCheckStatus = true;
			}
			if(ram>='0' && ram<='9')
			{
				digitCheckStatus = true;
			}
			if ((ram >= 33 && ram <= 47) || (ram >= 58 && ram <= 64) || (ram >= 91 && ram <= 96) || (ram >= 123 && ram <= 126)) 
			{ 
				spCharStatus = true;
			}
		}
		if(passcode.length()>=8)
		{
			passLengthStatus = true;
		}
		System.out.println("Password Strength Status: ");
		if(capCheckStatus&&smallCheckStatus&&digitCheckStatus&&spCharStatus&&passLengthStatus)
		{
			System.out.print("Hard");
		}
		else
		{
			System.out.print("Soft");
		}
		System.out.println("\n\n");
    }
}    
    