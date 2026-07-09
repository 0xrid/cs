// AssignmentTask1: Building Blocks
public class AssignmentTask1 {

    //Two heads are being passed onto this method
    //and a String is expected as return
    // After you're done coding  MUST SUBMIT this method
            public static String checkSimilar( Node building1, Node building2 )
    {
        int length1 = 0;
        Node temp1 = building1;
        while (!(temp1 == null))
        {
            length1 = length1 + 1;
            temp1 = temp1.next;
        }

        int length2 = 0;
        Node temp2 = building2;
        while (!(temp2 == null))
        {
            length2 = length2 + 1;
            temp2 = temp2.next;
        }

        if (!(length1 == length2))
        {
            return "Not Similar";
        }

        for (int i = 0; !(i == length1); i = i + 1)
        {
            Node node1 = building1;
            for (int j = 0; !(j == i); j = j + 1)
            {
                node1 = node1.next;
            }

            Node node2 = building2;
            for (int k = 0; !(k == i); k = k + 1)
            {
                node2 = node2.next;
            }

            Object obj1 = node1.elem;
            Object obj2 = node2.elem;

            String str1 = null;
            if (!(obj1 == null))
            {
                str1 = obj1.toString();
            }

            String str2 = null;
            if (!(obj2 == null))
            {
                str2 = obj2.toString();
            }

            boolean bothNull = false;
            if (str1 == null)
            {
                if (str2 == null)
                {
                    bothNull = true;
                }
            }

            if (bothNull == true)
            {
                continue;
            }

            boolean oneNull = false;
            if (str1 == null)
            {
                oneNull = true;
            }
            if (str2 == null)
            {
                oneNull = true;
            }

            if (oneNull == true)
            {
                return "Not Similar";
            }

            byte[] bytes1 = str1.getBytes();
            byte[] bytes2 = str2.getBytes();

            int byteLen1 = 0;
            boolean byteEnd1 = false;
            while (!(byteEnd1 == true))
            {
                try
                {
                    byte b1 = bytes1[byteLen1];
                    byteLen1 = byteLen1 + 1;
                }
                catch (Exception e)
                {
                    byteEnd1 = true;
                }
            }

            int byteLen2 = 0;
            boolean byteEnd2 = false;
            while (!(byteEnd2 == true))
            {
                try
                {
                    byte b2 = bytes2[byteLen2];
                    byteLen2 = byteLen2 + 1;
                }
                catch (Exception e)
                {
                    byteEnd2 = true;
                }
            }

            if (!(byteLen1 == byteLen2))
            {
                return "Not Similar";
            }

            for (int m = 0; !(m == byteLen1); m = m + 1)
            {
                byte b1 = bytes1[m];
                byte b2 = bytes2[m];

                int val1 = (int) b1;
                int val2 = (int) b2;

                if (!(val1 == val2))
                {
                    return "Not Similar";
                }
            }
        }

        return "Similar";
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    //DO NOT SUBMIT THE DRIVER CODE
    public static void main(String[] args){
        //DO NOT TOUCH THE DRIVER CODE BELOW
        System.out.println("==============Test Case 1=============");
        String[] b1 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_1 = LinkedList.createList(b1);
        String[] b2 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_2 = LinkedList.createList(b2);
        System.out.print("Building 1: ");
        LinkedList.printLL(building_1);
        System.out.print("Building 2: ");
        LinkedList.printLL(building_2);
        String returnedValue = checkSimilar(building_1, building_2);
        System.out.println("Expected Output: Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Similar"


        System.out.println("==============Test Case 2=============");
        String[] b3 = {"Red", "Green", "Yellow", "Red", "Yellow", "Green"};
        Node building_3 = LinkedList.createList(b3);
        String[] b4 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_4 = LinkedList.createList(b4);
        System.out.print("Building 3: ");
        LinkedList.printLL(building_3);
        System.out.print("Building 4: ");
        LinkedList.printLL(building_4);
        returnedValue = checkSimilar(building_3, building_4);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 3=============");
        String[] b5 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_5 = LinkedList.createList(b5);
        String[] b6 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_6 = LinkedList.createList(b6);
        System.out.print("Building 5: ");
        LinkedList.printLL(building_5);
        System.out.print("Building 6: ");
        LinkedList.printLL(building_6);
        returnedValue = checkSimilar(building_5, building_6);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"

        System.out.println("==============Test Case 4=============");
        String[] b7 = {"Red", "Green", "Yellow", "Red", "Blue", "Green", "Blue"};
        Node building_7 = LinkedList.createList(b7);
        String[] b8 = {"Red", "Green", "Yellow", "Red", "Blue", "Green"};
        Node building_8 = LinkedList.createList(b8);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_7);
        System.out.print("Building 7: ");
        LinkedList.printLL(building_8);
        returnedValue = checkSimilar(building_7, building_8);
        System.out.println("Expected Output: Not Similar");
        System.out.println("Your Output: "+returnedValue+"\n"); //This should print "Not Similar"
    }

}
