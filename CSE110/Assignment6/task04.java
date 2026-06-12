import java.util.Scanner;
public class task04
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
        System.out.print("Original array: ");
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            System.out.print(nArr[StatTrak]+" ");
        }
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            if(nArr[StatTrak]>0)
            {
                nArr[StatTrak] = 1;
            }
            else
            {
                nArr[StatTrak] = 0;
            }   
        }
        System.out.print("\nAfter modification: ");
        for(int StatTrak=0; StatTrak<nArr.length; StatTrak++)
        {
            System.out.print(nArr[StatTrak]+" ");
        }
    }
}