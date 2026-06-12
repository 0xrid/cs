import java.util.Scanner;
public class task03
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
        int[] rArr = new int[nArr.length];
        int count = nArr.length-1;
        for(int StatTrak=0; StatTrak<rArr.length; StatTrak++)
        { 
            rArr[StatTrak] = nArr[count];
            count--;
        }
        System.out.print("Reversed using a new array: ");
        for(int StatTrak=0; StatTrak<rArr.length; StatTrak++)
        {
            System.out.print(rArr[StatTrak]+" ");
        }

        for(int StatTrak=0; StatTrak<nArr.length/2; StatTrak++)
        {    
            int temp = nArr[StatTrak];
            nArr[StatTrak] = nArr[nArr.length-1-StatTrak];
            nArr[nArr.length-1-StatTrak] = temp;    
        }
        System.out.println();
        System.out.print("Reversed the original array: ");
        for(int StatTrak=0; StatTrak<rArr.length; StatTrak++)
        {
            System.out.print(nArr[StatTrak]+" ");
        }
    }
}    