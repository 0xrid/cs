
public class task05
{
    public static void main(String[] gaben)
    {
    int sum = 0;
	for(int i = 1; i<=600;i++)
	{
		if(i%7==0&&i%9==0)
		{
			continue;
		} 
		else if(i%7==0||i%9==0)
		{
			sum +=i;
		}
		
	}
	System.out.print("addition of all numbers that are multiples of either 7 or 9 but not both, up to 600 is "+sum);
    }  
}  