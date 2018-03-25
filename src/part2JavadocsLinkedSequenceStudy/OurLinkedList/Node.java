package part2JavadocsLinkedSequenceStudy.OurLinkedList;


public class Node <T>{
	private Node<T> next, prev;
	private T element;
	
	public Node(T element) {
		next = null;
		prev = null;
		this.element = element;
	}
	
	public T getInfo() {
		return element;
	}
	
	public void setInfo(T element) {
		this.element = element;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getPrev(){
		return prev;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

}
