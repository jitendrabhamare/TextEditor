package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// Create LLNode objects for head and tail
		head = new LLNode<E>();
		tail = new LLNode<E>();
		// Link them
		head.next = tail;
		tail.prev = head;
		// Assign size=0 for an empty list
		size = 0;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// throw an exception if element is null
		if (element == null) {
			throw new NullPointerException("The Object cannot store null pointers."); 
		}
		
		// create a node
		LLNode<E> newNode = new LLNode<E>(element);
		
		// when you add an element to an empty list
		if (size == 0) {
			head.next = newNode;
			newNode.next = tail;
			tail.prev = newNode;
			newNode.prev = head;			
		}
		// for a list with already existing elements
		else {
			LLNode<E> lastNode = tail.prev;
			lastNode.next = newNode;
			newNode.next = tail;
			tail.prev = newNode;
			newNode.prev = lastNode;			
		}
		size++;
		
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// throw an exception if index is out of bounds
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index of a list cannot be out of bounds.");
		}
		
		LLNode<E> nextNode = head.next;
		for (int i = 0; i < index; i++) {
			nextNode = nextNode.next; 
		}
		return nextNode.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// throw an exception if element is null
		if (element == null) {
			throw new NullPointerException("The Object cannot store null pointers."); 
		}
		
		// if index is out of bound
		if (index < 0 || index > size) {
			throw new IndexOutOfBoundsException("Index value cannot be out of bounds.");
		}
		
		// Create a new node
		LLNode<E> newNode = new LLNode(element);
		// Go to node at index value
		LLNode<E> nextNode = head.next;
		for (int i=0; i<index; i++) {
			nextNode = nextNode.next;
		}
		LLNode<E> prevNode = nextNode.prev;
		
		// link newNode between prevNode and nextNode
		prevNode.next = newNode;
		newNode.next = nextNode;
		nextNode.prev = newNode;
		newNode.prev = prevNode;	
		
		size++;
		
	}


	/** Return the size of the list */
	public int size() 
	{
		LLNode<E> nextNode = head.next;
		int size = 0;
		
		while (nextNode != tail) {
			nextNode = nextNode.next;
			size++;
		}				
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// throw an exception if index is out of bounds
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index of a list cannot be out of bounds.");
		}
		
		//Traverse to the node to be removed and connect its prev to next
		LLNode<E> remNode = head.next;
		for (int i = 0; i<index; i++) {
			remNode = remNode.next;
		}
		LLNode<E> prevNode = remNode.prev;
		LLNode<E> nextNode = remNode.next;
		
		prevNode.next = nextNode;
		nextNode.prev = prevNode;
		size--;
			
		return remNode.data;
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// throw an exception if element is null
		if (element == null) {
			throw new NullPointerException("The Object cannot store null pointers."); 
		}
		
		// throw an exception if index is out of bounds
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index of a list cannot be out of bounds.");
		}
		
		// Traverse to the node and replace data
		LLNode<E> setNode = head.next;
		for (int i=0; i<index; i++) {
			setNode = setNode.next;
		}
		
		E oldValue = setNode.data;
		setNode.data = element;		
			
		return oldValue;
	}
	
	public String toString() {
        String result = "";
        LLNode<E> current = head.next;
        while(current.next != null){
            result += current.data;
            if(current.next != null){
                 result += ", ";
            }
            current = current.next;
        }
        return "List: " + result;
	}
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}
	
	public LLNode() 
	{
		this.data = null;
		this.prev = null;
		this.next = null;
	}

}
