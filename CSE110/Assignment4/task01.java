import java.util.Scanner;
public class task01
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("How man numbers huh? ");
		int numb = x.nextInt(), num,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,sum=0,count=0;
        
		for(int i =1; i<=numb;i++)
		{
			System.out.print("Sl. "+i+" number: ");
			num = x.nextInt();
			if((num%2==0)&&(num>0))
			{
				if(num<min)
			{
				min=num;
			} if(num>max)
			{
				max=num;
			}
			count++;
			sum+=num;
			}
		}
		x.close();
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
		System.out.println("Average: "+sum/count);
    }
}    
    
