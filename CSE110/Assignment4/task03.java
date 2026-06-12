import java.util.Scanner;
public class task03
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
		System.out.print("Provide an integer bruh: ");
		int i = x.nextInt();
		int neg =0, neggar=0, num;
		for(int j =1; j<=i;j++)
		{
			System.out.print("Enter number "+j+": ");
			num = x.nextInt();
			if(num<0){
				neg++;
			}
			else{
				neggar++;
			}
		}
			x.close();
			System.out.println("\n\n"+neggar+" Non-negative Numbers");
			System.out.print(neg+" Negative Numbers");
    }
}    
    
