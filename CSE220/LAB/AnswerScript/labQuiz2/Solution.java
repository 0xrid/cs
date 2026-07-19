import java.util.Scanner;

public class Solution {

	public static void alternateRemove(Node head) {
		// Write your solution here
		// Enable AutoSave option in VS Code
		Node current = head;
		int count = 0;

		while(current!=null && current.next!=null)
			{
			Node nextNode=current.next.next;
			current.next=nextNode;
			current=nextNode;

		}


		current=head;



		for(int i = 0; i< count; i++ )
		{
			System.out.print(current.elem + "->");
			current=current.next.next;
		}

	}

	//DO NOT CHANGE ANY CODES BELOW OTHERWISE YOU'LL GET 0
	//DO NOT TOUCH ANY CODES BELOW
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		String[] sArr = str.split(" -> ");
		Node head = new Node(sArr[0]);
		Node n = head;
		for (int i = 1; i < sArr.length; i++) {
			Node newN = new Node(sArr[i]);
			n.next = newN;
			n = n.next;
		}

		alternateRemove(head);

		for (n = head; n != null; n = n.next) {
			System.out.print(n.elem);
			if (n.next != null)
				System.out.print(" -> ");
		}
		System.out.println();

		scanner.close();
	}

}

class Node {
	Object elem;
	Node next;

	public Node(Object e) {
		this.elem = e;
		this.next = null;
	}
}