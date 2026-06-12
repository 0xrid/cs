public class task09
{
    public static void main(String[] Gaben)
    {
		int sum = 0;
		for(int i = 1; i<=10; i++)
		{
			System.out.println("Current number: "+i+", Sum: "+ (sum+=i));
		}
    }
}    