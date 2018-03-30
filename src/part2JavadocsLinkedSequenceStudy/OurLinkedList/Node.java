/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Quan Trinh>
*Student Number:     <101094529>
*Date:				 2018 - 03 - 29
*Description:        <Node contains information of itself, the previous node and the next node>
****************************************************************************************************/


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
