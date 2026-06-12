import java.util.Scanner;
public class task06 {
    public static void main(String[] Gaben) {
        Scanner x = new Scanner(System.in);
		System.out.print("Input the value of n: "); 
        int n = x.nextInt();  
		x.close();
        int y = 0;
        for (int i = 1; i <= n; i++) 
		{
            y += Math.pow(i,2) * (int) Math.pow(-1, i + 1);
        }
        System.out.println("Output is " + y); 
    }
}
