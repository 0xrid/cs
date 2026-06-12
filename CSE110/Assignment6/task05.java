import java.util.Scanner;
public class task05
{
    public static void main(String[] Gaben)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int[] nArr = new int[x.nextInt()];
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            System.out.print("Enter a number: ");
            nArr[StatTrak] = x.nextInt();
        }
        System.out.print("lemme find first index of this number: ");
        int tempStorage = x.nextInt();
        for(int StatTrak=0; StatTrak<=nArr.length; StatTrak++)
        {
            if(StatTrak==nArr.length)
            {
                System.out.print("Element not found");
            }
            else if(nArr[StatTrak]==tempStorage)
            {
                System.out.print("found "+tempStorage+" at index "+StatTrak);
                break;
            }  
        }
    }
}