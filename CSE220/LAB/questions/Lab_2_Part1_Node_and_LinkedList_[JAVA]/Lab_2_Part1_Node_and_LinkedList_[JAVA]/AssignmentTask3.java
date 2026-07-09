// AssignmentTask3: Alternate Merge
public class AssignmentTask3 {
    
    // MUST SUBMIT this method
        public static Node alternateMerge( Node head1, Node head2 )
    {
        if (head1 == null)
        {
            return head2;
        }

        if (head2 == null)
        {
            return head1;
        }

        Node current1 = head1;
        Node current2 = head2;
        Node result = head1;

        boolean list1HasMore = true;
        boolean list2HasMore = true;

        while (!(list1HasMore == false && list2HasMore == false))
        {
            if (current1 != null)
            {
                Node next1 = current1.next;

                if (current2 != null)
                {
                    Node next2 = current2.next;

                    current1.next = current2;

                    if (next1 != null)
                    {
                        current2.next = next1;
                    }
                    else
                    {
                        current2.next = null;
                        list2HasMore = false;
                    }

                    current1 = next1;
                    current2 = next2;
                }
                else
                {
                    list2HasMore = false;
                }
            }
            else
            {
                list1HasMore = false;
            }
        }

        return result;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head1 = LinkedList.createList(new Integer[]{1,2,6,8,11});
        Node head2 = LinkedList.createList(new Integer[]{5,7,3,9,4});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        Node result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 1 -> 5 -> 2 -> 7 -> 6 -> 3 -> 8 -> 9 -> 11 -> 4
        System.out.println();
        
        System.out.println("\n==============Test Case 2=============");
        head1 = LinkedList.createList(new Integer[]{5,3,2,-4});
        head2 = LinkedList.createList(new Integer[]{-4,-6,1});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 5 -> -4 -> 3 -> -6 -> 2 -> 1 -> -4
        System.out.println();

        System.out.println("\n==============Test Case 3=============");
        head1 = LinkedList.createList(new Integer[]{4,2,-2,-4});
        head2 = LinkedList.createList(new Integer[]{8,6,5,-3});
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head1);
        System.out.print("Linked List 1: ");
        LinkedList.printLL(head2);
        result = alternateMerge(head1, head2);
        System.out.println("\nExpected output: 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3");
        System.out.print( "Your output: ");
        LinkedList.printLL(result); //This should print 4 -> 8 -> 2 -> 6 -> -2 -> 5 -> -4 -> -3
        System.out.println();
    }
}
