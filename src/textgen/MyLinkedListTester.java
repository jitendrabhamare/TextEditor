/**
 * 
 */
package textgen;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author UC San Diego MOOC team
 *
 */
public class MyLinkedListTester {

	private static final int LONG_LIST_LENGTH =10; 

	MyLinkedList<String> shortList;
	MyLinkedList<Integer> emptyList;
	MyLinkedList<Integer> longerList;
	MyLinkedList<Integer> list1;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Feel free to use these lists, or add your own
	    shortList = new MyLinkedList<String>();
		shortList.add("A");
		shortList.add("B");
		emptyList = new MyLinkedList<Integer>();
		longerList = new MyLinkedList<Integer>();
		for (int i = 0; i < LONG_LIST_LENGTH; i++)
		{
			longerList.add(i);
		}
		list1 = new MyLinkedList<Integer>();
		list1.add(65);
		list1.add(21);
		list1.add(42);
		
		System.out.println(list1.toString());
		
	}

	
	/** Test if the get method is working correctly.
	 */
	/*You should not need to add much to this method.
	 * We provide it as an example of a thorough test. */
	@Test
	public void testGet()
	{
		//test empty list, get should throw an exception
		try {
			emptyList.get(0);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
			
		}
		
		// test short list, first contents, then out of bounds
		assertEquals("Check first", "A", shortList.get(0));
		assertEquals("Check second", "B", shortList.get(1));
		
		try {
			shortList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			shortList.get(2);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		// test longer list contents
		for(int i = 0; i<LONG_LIST_LENGTH; i++ ) {
			assertEquals("Check "+i+ " element", (Integer)i, longerList.get(i));
		}
		
		// test off the end of the longer array
		try {
			longerList.get(-1);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		
		}
		try {
			longerList.get(LONG_LIST_LENGTH);
			fail("Check out of bounds");
		}
		catch (IndexOutOfBoundsException e) {
		}
		
	}
	
	
	/** Test removing an element from the list.
	 * We've included the example from the concept challenge.
	 * You will want to add more tests.  */
	@Test
	public void testRemove()
	{
		int a = list1.remove(0);
		assertEquals("Remove: check a is correct ", 65, a);
		assertEquals("Remove: check element 0 is correct ", (Integer)21, list1.get(0));
		assertEquals("Remove: check size is correct ", 2, list1.size());
		
		// TODO: Add more tests here
		try {
			shortList.remove(-1);
			fail("Check if index is out of bound.");
		}
		catch (IndexOutOfBoundsException e) {			
		}
		
		try {
			longerList.remove(2555);
			fail("Check if index is out of bound.");
		}
		catch (IndexOutOfBoundsException e) {			
		}
		
		int b = longerList.remove(4);
		assertEquals("Remove: check b is correct ", 4, b);
		assertEquals("Remove: check size is correct ", 9, longerList.size());	
		
	}
	
	/** Test adding an element into the end of the list, specifically
	 *  public boolean add(E element)
	 * */
	@Test
	public void testAddEnd()
	{
        // TODO: implement this test
		try {
			emptyList.add(null);
			fail("Check if element is not null.");
		}
		catch (NullPointerException e) {			
		}
		
		try {
			shortList.add(null);
			fail("Check if element is not null.");
		}
		catch (NullPointerException e) {			
		}
		
		shortList.add("C");
		assertEquals("Check last", "C", shortList.get(2));		
		
		longerList.add(15);
		assertEquals("Check last", (Integer)15, longerList.get(LONG_LIST_LENGTH));					
	}

	
	/** Test the size of the list */
	@Test
	public void testSize()
	{
		// TODO: implement this test
		assertEquals("testSize: emptyList size ", 0, emptyList.size());
		assertEquals("testSize: shortList size ", 2, shortList.size());
		assertEquals("testSize: longerList size ", 10, longerList.size());
		
		// Add element and check if size increased
		longerList.add(25);
		assertEquals("testSize: longerList size ", 11, longerList.size());
	}

	
	
	/** Test adding an element into the list at a specified index,
	 * specifically:
	 * public void add(int index, E element)
	 * */
	@Test
	public void testAddAtIndex()
	{
        // TODO: implement this test
		try {
			emptyList.add(0, null);
			fail("Check if element is not null.");
		}
		catch (NullPointerException e) {			
		}
		
		try {
			shortList.add(-1, "G");
			fail("Check if index is out of bound.");
		}
		catch (IndexOutOfBoundsException e) {			
		}
		
		try {
			longerList.add(11, 100);
			fail("Check if index is out of bound.");
		}
		catch (IndexOutOfBoundsException e) {			
		}
		
		shortList.add(0, "Z" );
		assertEquals("Check first element: ", "Z", shortList.get(0));
		
		
		longerList.add(3, 55 );
		assertEquals("Check 3rd element: ", (Integer)55, longerList.get(3));
		
	}
	
	/** Test setting an element in the list */
	@Test
	public void testSet()
	{
	    try {
	    	shortList.set(0, null);
	    		fail("Check if element is not null.");
	    }
	    catch (NullPointerException e) {			
	    }
	
	    try {
	    	shortList.set(-1, "F");
	    	fail("Check if element is not null.");
	    }
	    catch (IndexOutOfBoundsException e) {			
		}
	    
	    try {
	    	shortList.set(100, "J");
	    	fail("Check if element is not null.");
	    }
	    catch (IndexOutOfBoundsException e) {			
		}
	    
	    int a = list1.set(1, 99);
		assertEquals("Remove: check a is correct ", 21, a);
		assertEquals("Remove: check element 0 is correct ", (Integer)99, list1.get(1));
		assertEquals("Remove: check size is correct ", 3, list1.size());    
	    
	}
	
	
	// TODO: Optionally add more test methods.
	
}
