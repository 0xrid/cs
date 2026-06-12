import java.util.Scanner;
public class task05
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Drop your spell to unlock chest: ");
		String spell = x.nextLine();
		String vowels = "aeiou";
		int StatTrak =1, DragonLore=1;
        x.close();
		for(int i =1; i<spell.length();i++)
		{
			char hoe = spell.charAt(i);
			if(vowels.indexOf(hoe)>=1)
			{
				 StatTrak++;
			}	
			else if(hoe<='z'&&hoe>='a')
			{
				 DragonLore++;
			}	
		}
		//int DragonLore = spell.length()-StatTrak;
		if(StatTrak%3==0&&DragonLore%5==0)	
		{
			System.out.print("Aaarr! Me Plunder!!");
		}
		else
		{
			System.out.print("Blimey! No Plunder!!");
		}		
    }
}    
