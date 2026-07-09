public class AssignmentTask5 {

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
    int sum = 0;
    boolean madeChange = true;
    
    while (madeChange == true) {
        madeChange = false;
        
        int length = 0;
        Node temp = dh.next;
        while (!(temp == dh)) {
            length = length + 1;
            temp = temp.next;
        }
        
        int i = 0;
        while (i < length) {
            Node current = dh.next;
            Node prev = dh;
            int j = 0;
            while (j < i) {
                prev = current;
                current = current.next;
                j = j + 1;
            }
            
            int val = 0;
            if (current.elem instanceof Integer) {
                val = (Integer)current.elem;
            } else {
                val = Integer.parseInt(current.elem.toString());
            }
            
            if (val % 2 == 1 || val % 2 == -1) {
                sum = sum + val;
                prev.next = current.next;
                madeChange = true;
                break;
            }
            
            i = i + 1;
        }
    }
    
    Node newNode = new Node(sum);
    Node temp = dh;
    while (!(temp.next == dh)) {
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.next = dh;
}

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
