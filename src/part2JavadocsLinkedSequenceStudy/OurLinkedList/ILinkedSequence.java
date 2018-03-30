/****************************************************************************************************
*Project:            <COMP2080_ASSIGN1_NULL_AND_VOID>
*Assignment:         <assignment 1>
*Author(s):          <Quan Trinh>
*Student Number:     <101094529>
*Date:				 2018 - 03 - 29
*Description:        <just an interface>
****************************************************************************************************/
package part2JavadocsLinkedSequenceStudy.OurLinkedList;

public interface ILinkedSequence<T>{
	//add interface for all required methods
	public void addAfter(T element);
	public void addAll(ILinkedSequence<T> seq);
	public void addBefore(T element);
	public void advance();
	public T getCurrent();
	public boolean isCurrent();
	public void removeCurrent();
	public int size();
	public ILinkedSequence<T> clone();
	public void start();
	//Test methods
	public void printSequence();
	public Node<T> getBottom();
	public Node<T> getTop();
	
	
}
