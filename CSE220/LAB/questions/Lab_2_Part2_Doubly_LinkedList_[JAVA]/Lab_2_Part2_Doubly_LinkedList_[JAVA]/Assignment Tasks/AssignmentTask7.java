public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end)
{
    DNode originalLast = dh.prev;
    DNode current = dh.next;
    
    while (!(current == originalLast.next))
    {
        DNode nextNode = current.next;
        int val = (Integer)current.elem;
        
        if ((val >= start) && (val <= end))
        {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            
            DNode last = dh.prev;
            last.next = current;
            current.prev = last;
            current.next = dh;
            dh.prev = current;
        }
        
        current = nextNode;
    }
}

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
