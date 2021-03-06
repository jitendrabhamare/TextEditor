package spelling;

import java.util.LinkedList;

/**
 * A class that implements the Dictionary interface using a LinkedList
 *
 */
public class DictionaryLL implements Dictionary 
{

	private LinkedList<String> dict;
	private int size;
	
    // TODO: Add a constructor
	public DictionaryLL() {
		dict = new LinkedList<String>();
		size = 0;
	}


    /** Add this word to the dictionary.  Convert it to lowercase first
     * for the assignment requirements.
     * @param word The word to add
     * @return true if the word was added to the dictionary 
     * (it wasn't already there). */
    public boolean addWord(String word) {
    	// TODO: Implement this method
    	// Covert to lowercase
    	word = word.toLowerCase();
    	// Check if word is already present
    	if (dict.contains(word)) {
    		return false;
    	}
    	
    	// Add the word and return true
    	dict.add(word);
    	size++;
        return true;
    }


    /** Return the number of words in the dictionary */
    public int size()
    {
        // TODO: Implement this method
        return size;
    }

    /** Is this a word according to this dictionary? */
    public boolean isWord(String s) {
        //TODO: Implement this method
    	s = s.toLowerCase();
    	if (dict.contains(s)) {
    		return true;
    	}    	
    	//System.out.println("word: " + s + " not present!!");
    	return false;        
    }

    
}
