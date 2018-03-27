package part2JavadocsLinkedSequenceStudy.OurLinkedList;


public class LinkedSequence<T> extends java.lang.Object implements java.lang.Cloneable,
ILinkedSequence<T>{

	private Node<T> current, top, bottom;
	
	public LinkedSequence() {
		current = null;
		top = null;
		bottom = null;	
	}
	@Override
	public void addAfter(T element) {
		// TODO Add an element after a current element
		//Pre-conditions: Sequence has at least one element
		if(element != null) {
		Node<T> node = new Node<T>(element);
		// if top is null
		if(top == null) {
			current = node;
			top = current;
			
		}
		else {
			//if current element is in the middle of any two elements
			if(current.getTail() != null) {
				node.setHead(current);
				node.setTail(current.getTail());
				current.getTail().setHead(node);
				current.setTail(node);
				current = node;
			}
			// if current element is the last element
			else {
				current.setTail(node);
				node.setHead(current);
				current = node;
			}
		}
		}
		else
			throw new java.lang.NullPointerException("***Input element cannot be null!!!");
		
	}

	@Override
	public void addAll(ILinkedSequence<T> seq) {
		//Pre-condition : seq must not be null
		if(seq != null)
		{
		ILinkedSequence<T> temp = seq.clone();
		getBottom().setTail(temp.getTop());
		temp.getTop().setHead(getBottom());
		}
		else {
			throw new java.lang.NullPointerException("***Sequence cannot be null!!!");
		}
	}
	
	@Override
	public LinkedSequence<T> clone() {
		LinkedSequence<T> clSc = new LinkedSequence<T>();
		Node<T> node = top;
		while(node != null) {
			clSc.addAfter(node.getInfo());
			node = node.getTail();
		}
		return clSc;
	}
	@Override
	public void addBefore(T element) {
		// Pre-condition: current is not null
		Node<T> node = new Node<T>(element);
		if(isCurrent()) {
			//Current is top element
			if(current.equals(top)) {
				current.setHead(node);
				node.setTail(current);
				current = node;
				top = current;
			}
			//Current is not top element
			else {
				//current is in between any two elements
				node.setTail(current);
				node.setHead(current.getHead());
				current.getHead().setTail(node);
				current.setHead(node);
				current = node;
			}
		}
		
	}
	
	@Override
	public void advance() {
		// Pre-condition : no current element
		if(isCurrent()) {
			current = current.getTail();
		}
	}

	@Override
	public T getCurrent() {
		//Pre-condition: There is current element
		if(isCurrent()) return current.getInfo();
		
		throw new java.lang.IllegalStateException("There is no current element");
	}

	@Override
	public boolean isCurrent() {
		// TODO Check whether there is a pointer to current element
		
		return current != null;
	}

	@Override
	public void removeCurrent() {
		// Pre-condition : There must be current element
		if(isCurrent()) {
			//Current is the top element
			if(current.equals(top)) {
				current = current.getTail();
				top = current;
			}
			//Current is the last element
			else if(current.equals(getBottom())) {
				current = null;
			}
			//Current is in between 2 elements
			else {
				current.getHead().setTail(current.getTail());
				current.getTail().setHead(current.getHead());
				current = current.getTail();
			}
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		Node<T> node = top;
		int count = 0;
		while(node != null) {
			count++;
			node = node.getTail();
		}
		return count;
	}

	@Override
	public void start() {
		// Post-condition:  if this sequence has no elements at all, then there is no current element
		if(isCurrent()) {
			top = current;
		}
		
	}
	
	//Test methods
	
	@Override
	public void printSequence() {
		Node<T> n = top;
		while(n != null) {
			if(n.equals(current)) {
				System.out.println(n.getInfo() + "<< Current Element");
			}
			else
				System.out.println(n.getInfo());
			n = n.getTail();
	}
	}
	
	@Override
	public Node<T> getBottom() {
		// Get bottom node
		if(isCurrent())
		{
		bottom = current;
		while(bottom.getTail() != null) bottom = bottom.getTail();
		return bottom;
		}
		
		throw new java.lang.IllegalStateException("There is no current element");
	}
	@Override
	public Node<T> getTop() {
		// Get top element
		if(top != null)
			return top;
		throw new java.lang.IllegalStateException("There is no top element");
	}
	
	public static<T> LinkedSequence<T> concatenaton(ILinkedSequence<T> s1, ILinkedSequence<T> s2){
		LinkedSequence<T> w = new LinkedSequence<T>();
		if(s1 != null)
		{
		s1.addAll(s2);
		Node<T> node = s1.getTop();
		while(node != null) {
			w.addAfter(node.getInfo());
			node = node.getTail();
		}
		w.advance();
		}
		return w;
	}

}