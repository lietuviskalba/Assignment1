package  part2JavadocsLinkedSequenceStudy.OurLinkedList;



public class Node <T>{
	
	//private variables
	private Node<T> head, tail;
	private T element;
	
	//Constructor
	public Node(T info) {
		head = null;
		tail = null;
		this.element = info;
	}
	
	//Get and Set head
	public Node<T> getHead(){
		return head;
	}
	public void setHead(Node<T> head) {
		this.head = head;
	}
	//Get and Set tail
	public Node<T> getTail(){
		return tail;
	}
	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
	//Get and Set information
	public T getInfo() {
		return element;
	}
	public void setInfo(T element) {
		this.element = element;
	}

}
