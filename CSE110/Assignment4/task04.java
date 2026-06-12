import java.util.Scanner;
public class task04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the amount of \nprime numbers required to print: ");
        int amount= x.nextInt();
        x.close();
        int count = 0
		for(int num=2;count < amount;num++) 
		{
            boolean optimusPrime = true;           
                for (int i = 2; i <= Math.sqrt(num); i++) 
				{
                    if (num % i == 0) 
					{
                        optimusPrime= false;
                        break;
                    }
                }
            
            if (optimusPrime) 
			{
                System.out.println(num);
                count++;
            }
        }
    }
}	

