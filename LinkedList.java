package bridgelabz;
public class LinkedList {
	class Node {
		int num;
		Node next;
		
		public Node(int num) {
			this.num = num;
			this.next = null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int num) {
		Node newNode = new Node(num);
		 
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	public void addNodeATend(int num) {
		Node newNode = new Node(num);
		 
		if (head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	public void display() {
		Node current = head;

		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of singley linked list:");
		while(current != null) {
			System.out.println(current.num+"");
			current = current.next;
		}
		System.out.println();	
	}
	public static void main(String[] args) {
		System.out.println("Welcome to Linked Problems");
		
		LinkedList list = new LinkedList();
		
		list.addNode(56);
		list.addNode(30);
		list.addNode(70);
		
		list.addNodeATend(70);
		list.addNodeATend(30);
		list.addNodeATend(56);
		
		list.display();
	}
}
