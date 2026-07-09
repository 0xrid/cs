// AssignmentTask2: Organize Books
import java.util.Arrays;
public class AssignmentTask2{
    
    // MUST SUBMIT this method
        public static Node organizeBooks(Node head, Integer[] popularity)
    {
        int arrLen = 0;
        boolean arrEnd = false;
        while (!(arrEnd == true))
        {
            try
            {
                Integer tempVal = popularity[arrLen];
                arrLen = arrLen + 1;
            }
            catch (Exception e)
            {
                arrEnd = true;
            }
        }

        int listLen = 0;
        Node tempNode = head;
        while (!(tempNode == null))
        {
            listLen = listLen + 1;
            tempNode = tempNode.next;
        }

        for (int i = 0; !(i == listLen); i = i + 1)
        {
            for (int j = 0; !(j == listLen - 1 - i); j = j + 1)
            {
                Integer val1 = popularity[j];
                Integer val2 = popularity[j + 1];

                int int1 = 0;
                if (!(val1 == null))
                {
                    int1 = val1.intValue();
                }

                int int2 = 0;
                if (!(val2 == null))
                {
                    int2 = val2.intValue();
                }

                boolean shouldSwap = false;
                if (int1 < int2)
                {
                    shouldSwap = true;
                }

                if (shouldSwap == true)
                {
                    Integer tempInt = popularity[j];
                    popularity[j] = popularity[j + 1];
                    popularity[j + 1] = tempInt;

                    Node nodeJ = head;
                    for (int k = 0; !(k == j); k = k + 1)
                    {
                        nodeJ = nodeJ.next;
                    }

                    Node nodeJ1 = nodeJ.next;

                    Object tempElem = nodeJ.elem;
                    nodeJ.elem = nodeJ1.elem;
                    nodeJ1.elem = tempElem;
                }
            }
        }

        return head;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT MAKE ANY MODIFICATIONS IN THE TESTER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE BELOW
    public static void main(String[] args) {
        System.out.println("=================Test Case 1=================");
        Node books = LinkedList.createList(new String[]{"Dune", "IT", "Coraline", "Inferno", "Twilight"});
        Integer[] arr = { 8, 10, 5, 10, 6 };

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books);
        System.out.println(Arrays.toString(arr));
        
        System.out.println("\nExpected Output");
        System.out.println("IT -> Inferno -> Dune -> Twilight -> Coraline");
        
        System.out.println("Your Output");
        books = organizeBooks( books, arr );
        LinkedList.printLL(books);

       
        System.out.println("=================Test Case 2=================");
        Node books2 = LinkedList.createList(new String[]{"Hamlet", "Persuasion", "It", "Dracula", "Beloved"});
        Integer[] arr2 = {7, 9, 9, 6, 7};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("\nExpected Output");
        System.out.println("Persuasion -> It -> Hamlet -> Beloved -> Dracula");

        System.out.println("Your Output");
        books2 = organizeBooks(books2, arr2);
        LinkedList.printLL(books2);


        System.out.println("=================Test Case 3=================");
        Node books3 = LinkedList.createList(new String[]{"Matilda", "Franny", "Foundation", "Carrie", "Misery"});
        Integer[] arr3 = {5, 8, 8, 10, 6};

        System.out.println("Sample Given LinkedList and Popularity array:  ");
        LinkedList.printLL(books3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\nExpected Output");
        System.out.println("Carrie -> Franny -> Foundation -> Misery -> Matilda");

        System.out.println("Your Output");
        books3 = organizeBooks(books3, arr3);
        LinkedList.printLL(books3);

    }
}
