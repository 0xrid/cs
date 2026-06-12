import java.util.Scanner;
public class task11
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("From: ");
		int corvo = x.nextInt();
		System.out.print("To: ");
		int attano = x.nextInt();
        x.close();
		System.out.println("Armstrong numbers are: \n");
		while(corvo<=attano)
		{
			int sum=0;
			int gordon = corvo;
			while(gordon!=0)
			{
			  sum+=(Math.pow((gordon%10),3));
			  gordon/=10;
			}
			if(sum==corvo)
			{
				System.out.println(corvo);
			}
			corvo++;
		}

    }
}    
    
