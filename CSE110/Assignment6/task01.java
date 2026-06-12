import java.util.Scanner;

public class task01
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("value of N homie?: ");
        int nValue = x.nextInt();
        int[] nArr = new int[nValue];
        for(int StatTrak =0; StatTrak < nArr.length5;StatTrak++)
        {
            System.out.print("Enter a number: ");
            nArr[StatTrak] = x.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int StatTrak =0; StatTrak < nValue;StatTrak++)
        {
            System.out.println(StatTrak+": "+nArr[StatTrak]);
        }
        int[] reArr = new int[nValue+1];
        for(int StatTrak =0; StatTrak < nArr.length; StatTrak++)
        {
            reArr[StatTrak] = nArr[StatTrak];
        }
        System.out.print("Additional number to be added to the new array?: ");
        reArr[reArr.length-1] = x.nextInt();
        System.out.print("Resized array: ");
        for(int StatTrak =0; StatTrak < reArr.length;StatTrak++)
        {
            System.out.print(reArr[StatTrak]+" ");
        }
    }
}