package Linkedin;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class MergeSortedLinkedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Create a dummy node to start the merged list
		ListNode dummy = new ListNode(0);
		ListNode current = dummy;
		ListNode h1 = l1; // Iterate through both lists until one of them is empty
		ListNode h2 = l2;
		while (h1 != null && h2 != null) {
			if (h1.val < h2.val) {
				current.next = h1;
				current = current.next;
				h1 = h1.next;
			} else {
				current.next = h2;
				current = current.next;
				h2 = h2.next;
			}
		}
		current.next = h1 != null ? h1 : h2;
		return dummy.next; // Skip the dummy node
	}

	// Helper method to print a linked list
	public void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Example usage
		MergeSortedLinkedLists merger = new MergeSortedLinkedLists();

		// Create two sorted linked lists
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);

		// Merge the lists
		ListNode merged = merger.mergeTwoLists(l1, l2);

		// Print the merged list
		System.out.println("Merged List:");
		merger.printList(merged);
	}
}
