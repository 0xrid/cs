public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2)
{
    DNode curr1 = dh1.next;
    DNode curr2 = dh2.next;
    
    while (!(curr1 == null) && !(curr2 == null))
    {
        DNode next1 = curr1.next;
        DNode next2 = curr2.next;
        
        curr1.next = curr2;
        curr2.prev = curr1;
        
        curr2.next = next1;
        
        if (!(next1 == null))
        {
            next1.prev = curr2;
        }
        
        curr1 = next1;
        curr2 = next2;
    }
    
    DNode lastNode = dh1;
    while (!(lastNode.next == null))
    {
        lastNode = lastNode.next;
    }
    
    lastNode.next = dh1;
    dh1.prev = lastNode;
}

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
