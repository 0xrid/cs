
public class task03
{
    public static void main(String[] task03)
    {
	int sum = 0;
	for(int i = 1; i<=600;i++)
	{
		if(i%7==0&&i%9==0)
		{
			sum +=i;
		}
		
	}
	System.out.print("sum of multiples of both 7 and 9 up to 600 is "+sum);
    }
}    
    