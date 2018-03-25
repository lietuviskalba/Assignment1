package part2JavadocsLinkedSequenceStudy.OurLinkedList;


public class LinkedSequence<T>{
	
	private Node<T> top;
	private Node<T> current;
	private Node<T> last;
	//Constructor for LinkedSequence class
	public LinkedSequence() 
	{
		top = null;
		current = null;
		last = null;
	}
	
	//method to add element after current element
	public void addAfter(T element) 
	{
		Node<T> newNode = new Node<T>(element);
		
		if(size()==0) {
			current = newNode;
			top = current;
		}
		else {
			newNode.setPrev(current);
			newNode.setNext(current.getNext());
			if(current.getNext() != null)
				current.getNext().setPrev(newNode);
			current.setNext(newNode);
			current = newNode;
		}
	}
	//
	public void addAll(LinkedSequence<T> seq) 
	{
		if(isCurrent()) {
			last = current;
			while(last.getNext() != null) {
				last = last.getNext();
			}
		}
		
		if(seq != null) {
			if(seq.top != null) {
				last.setNext(seq.top);
				seq.top.setPrev(last);
			}
		}
		
	}
	//method to add element before current element
	public void addBefore(T element) 
	{
		Node<T> newNode = new Node<T>(element);
		//Case when top is null
		if(size()==0) {
			current = newNode;
			top = current;
		}
		//Case when top is the only element
		else if(size() == 1) {
			newNode.setNext(current);
			current.setPrev(newNode);
			current = newNode;
			top = current;
		}
		else {
			newNode.setNext(current);
			newNode.setPrev(current.getPrev());
			current.getPrev().setNext(newNode);
			current.setPrev(newNode);
			current = newNode;
		}
	}
	
	public void advance() 
	{
		if(current.getNext() == null)
			System.out.println("Cannot move forward");	
		else
			current = current.getNext();
	}
	
	public void backward() {
		if(current.getPrev() == null)
			System.out.println("Cannot move backward");
		else
			current = current.getPrev();
	}
	
	public T clone() 
	{
		return null;
	}
	
	
	public T getCurrent() 
	{
		if(isCurrent())
			return current.getInfo();
		throw new java.lang.IllegalStateException();
	}
	
	public boolean isCurrent() 
	{
		return current != null;	
	}
	
	//Get the current node
	public Node<T> myCurrent(){
		return current;
	}
	
	public void removeCurrent() 
	{
		if(current.getNext() != null && current.getPrev() != null) {
			current.getNext().setPrev(current.getPrev());
			current.getPrev().setNext(current.getNext());
			current = current.getNext();
		}
		else if(current.getPrev() == null) {
			current = current.getNext();
			top = current;
		}
		else {
			current = current.getPrev();
			current.setNext(null);
		}
	}
	
	public void printCurrentSequence() {
		Node<T> n = top;
		while(n != null) {
			if(this.current != null && n.getInfo() == this.current.getInfo())
				System.out.println(n.getInfo() + "<<< current");
			else
			System.out.println(n.getInfo());
			n = n.getNext();
		}
	}
	
	public int size() 
	{
		Node<T> n = top;
		int count=0;
		while(n != null) {
			count++;
			n = n.getNext();
		}
		return count;
	}
	
	public void start() 
	{
		if(isCurrent()) {
			top = current;
		}
		
		else {
			System.out.println("The sequence has no element");
		}
	}
}

