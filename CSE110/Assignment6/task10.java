public class task10
{
    public static void main(String[] Gaben) 
    {
        int[] marks = {100, 47, 85, 94, 5, 50};
        String[] names = {"Henry", "Mari", "Herry", "Jack", "Lily", "Oliver"};
        int length = marks.length;
        for (int StatTrak = 0; StatTrak <=marks.length -1 - 1; StatTrak++) 
        {
            for (int Souvenier = 0; Souvenier <=marks.length -1 - StatTrak - 1; Souvenier++) 
            {
                if (marks[Souvenier] > marks[Souvenier + 1]) {
                    int StorageMarks = marks[Souvenier];
                    marks[Souvenier] = marks[Souvenier + 1];
                    marks[Souvenier + 1] = StorageMarks;
                    String StorageNames = names[Souvenier];
                    names[Souvenier] = names[Souvenier + 1];
                    names[Souvenier + 1] = StorageNames;
                }
            }
        }

        System.out.println("Sorted Array: ");
        for (int StatTrak = 0; StatTrak <=marks.length -1; StatTrak++) 
        {
            System.out.print(marks[StatTrak] + " ");
        }
        System.out.println();
        for (int StatTrak = 0; StatTrak <=marks.length -1; StatTrak++)
         {
            System.out.print(names[StatTrak] + " ");
        }
        System.out.println();
    }
}
