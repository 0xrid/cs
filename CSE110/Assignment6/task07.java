public class task07 
{
    public static void main(String[] Gaben) 
  {
        int[] nArr = {23, 100, 23, 56, 100};

        System.out.print("Input array: ");
        for (int StatTrak = 0; StatTrak <= nArr.length - 1; StatTrak++) 
        {
            System.out.print(nArr[StatTrak] + " ");
        }
        System.out.println();

        int[] yetAnotherArr = new int[nArr.length];
        int capacity = 0;

        for (int StatTrak = 0; StatTrak <= nArr.length - 1; StatTrak++) 
        {
            int Souvenier;
            for (Souvenier = 0; Souvenier < capacity; Souvenier++) 
            {
                if (nArr[StatTrak] == yetAnotherArr[Souvenier]) 
                {
                    break;
                }
            }
            if (Souvenier == capacity) 
            {
                yetAnotherArr[capacity++] = nArr[StatTrak];
            }
        }

        System.out.print("New array: ");
        for (int StatTrak = 0; StatTrak < capacity; StatTrak++) 
        {
            System.out.print(yetAnotherArr[StatTrak] + " ");
        }
        System.out.println();
    }
}
