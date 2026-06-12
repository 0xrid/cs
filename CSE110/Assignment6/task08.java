import java.util.Scanner;

public class SubsetCheck {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.print("Please enter the length of array 1: ");
        int sizeDragonlore = x.nextInt();
        int[] arr1 = new int[sizeDragonlore];
        System.out.println("Please enter the elements of the arr1:");
        for (int StatTrak = 0; StatTrak < sizeDragonlore; StatTrak++) arr1[StatTrak] = x.nextInt();

        System.out.print("Please enter the length of array 2: ");
        int sizeHowl = x.nextInt();
        int[] arr2 = new int[sizeHowl];
        System.out.println("Please enter the elements of the arr2:");
        for (int StatTrak = 0; StatTrak < sizeHowl; StatTrak++) arr2[StatTrak] = x.nextInt();

        int count = 0;
        for (int StatTrak = 0; StatTrak < sizeHowl; StatTrak++)
            for (int Souvenier = 0; Souvenier < sizeDragonlore; Souvenier++)
                if (arr2[StatTrak] == arr1[Souvenier]) {
                    count++;
                    break;
                }

        System.out.println(count == sizeHowl ? "Array 2 is a subset of Array 1." : "Array 2 is not a subset of Array 1.");

        x.close();
    }
}
