
public class Linkedlist {
	Node head;
	private int size;

	Linkedlist() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	public void addFirst(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		newnode.next = head;
		head = newnode;
	}

	public void addLast(String data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			return;
		}
		Node currnode = head;
		while (currnode.next != null) {
			currnode = currnode.next;
		}
		currnode.next = newnode;
	}

	public void printlist() {
		if (head == null) {
			System.out.print("list is empty");
			return;
		}
		Node currnode = head;
		while (currnode != null) {
			System.out.print(currnode.data + " -> ");
			currnode = currnode.next;
		}
		System.out.println("Null");
	}

	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}

	public void deleteLast() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		if (head.next == null) {
			head = null;
			return;
		}
		Node secondnode = head;
		Node lastnode = head.next;
		while (lastnode.next != null) {
			lastnode = lastnode.next;
			secondnode = secondnode.next;
		}
		secondnode.next = null;
	}

	public int getSize() {
		return size;
	}
	public void reverselinkedlist()
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Node prev = head;
		Node curr= head.next;
		
		while(curr!=null)
		{
			Node nextnode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextnode;
		}
		head.next=null;
		head = prev;
	}

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addFirst("a");
		list.addFirst("is");
		list.printlist();
		list.addLast("list");
		list.printlist();
//		list.deleteFirst();
//		list.deleteLast();
		list.printlist();
		System.out.println(list.getSize());
		list.addLast("list");
		list.printlist();
		System.out.println(list.getSize());
		list.reverselinkedlist();
		list.printlist();
		System.out.println(list.getSize());
	}
}
