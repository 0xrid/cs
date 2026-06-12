import java.util.Scanner;
public class task09
{
    public static void main(String[] Gaben) 
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] nArr = new int[x.nextInt()];
        for (int StatTrak = 0; StatTrak <=nArr.length -1; StatTrak++) 
        {
            System.out.print("Enter a number: ");
            nArr[StatTrak] = x.nextInt();
        }
        System.out.print("Original Array: ");
        for (int StatTrak = 0; StatTrak <=nArr.length -1; StatTrak++) 
        {
            System.out.print(nArr[StatTrak] + " ");
        }
        System.out.println();
        for (int StatTrak = 0; StatTrak <=nArr.length -1 - 1; StatTrak++) 
        {
            int maxIndex = StatTrak;
            for (int Souvenier = StatTrak + 1; Souvenier <=nArr.length -1; Souvenier++) 
            {
                if (nArr[Souvenier] > nArr[maxIndex]) 
                {
                    maxIndex = Souvenier;
                }
            }
            int storage = nArr[maxIndex];
            nArr[maxIndex] = nArr[StatTrak];
            nArr[StatTrak] = storage;
        }
        System.out.print("Sorted Array: ");
        for (int StatTrak = 0; StatTrak <=nArr.length -1; StatTrak++) 
        {
            System.out.print(nArr[StatTrak] + " ");
        }
        System.out.println();
        x.close();
    }
}