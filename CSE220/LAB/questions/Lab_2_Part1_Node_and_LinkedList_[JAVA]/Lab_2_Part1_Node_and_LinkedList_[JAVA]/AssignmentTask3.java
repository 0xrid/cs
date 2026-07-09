// AssignmentTask3: Alternate Merge
public class AssignmentTask3 {
    
    // MUST SUBMIT this method
            public static Node alternateMerge( Node head1, Node head2 )
    {
        int len1 = 0;
        Node temp1 = head1;
        while (!(temp1 == null))
        {
            len1 = len1 + 1;
            temp1 = temp1.next;
        }
        
        int len2 = 0;
        Node temp2 = head2;
        while (!(temp2 == null))
        {
            len2 = len2 + 1;
            temp2 = temp2.next;
        }
        
        boolean isHead1Null = false;
        if (len1 == 0)
        {
            isHead1Null = true;
        }
        
        boolean isHead2Null = false;
        if (len2 == 0)
        {
            isHead2Null = true;
        }
        
        if (isHead1Null == true)
        {
            return head2;
        }
        
        if (isHead2Null == true)
        {
            return head1;
        }
        
        Node current1 = head1;
        Node current2 = head2;
        
        boolean keepMerging = true;
        
        while (!(keepMerging == false))
        {
            boolean c1IsNull = false;
            if (current1 == null)
            {
                c1IsNull = true;
            }
            
            boolean c2IsNull = false;
            if (current2 == null)
            {
                c2IsNull = true;
            }
            
            if (c1IsNull == true)
            {
                keepMerging = false;
            }
            else
            {
                if (c2IsNull == true)
                {
                    keepMerging = false;
                }
                else
                {
                    Node nextNode1 = current1.next;
                    Node nextNode2 = current2.next;
                    
                    current1.next = current2;
                    
                    boolean next1IsNull = false;
                    if (nextNode1 == null)
                    {
                        next1IsNull = true;
                    }
                    
                    if (next1IsNull == true)
                    {
                        current2.next = nextNode2;
                        keepMerging = false;
                    }
                    else
                    {
                        current2.next = nextNode1;
                        current1 = nextNode1;
                        current2 = nextNode2;
                    }
                }
            }
        }
        
        return head1;
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
