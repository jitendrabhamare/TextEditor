# TextEditor

## Introduction
The project is part of MOOC course **'Data Structures and Performance'** under Specialization 'Object Oriented Java Programming: Data Structures and Beyond' offered by University of California, San Diego. 
Aim of this project is to build a smart text editor/processor that incorporates “intelligent” behaviors of modern-day text interfaces including **autocomplete, flagging misspelled words** and **spelling auto-correct**. 

The code being developed here is what’s called “back-end” code, in that I worked with the text, and not directly with any user interface components. This facilitates to focus and really dig in and experiment with the different data structures learnt and analyze running times for each of them. A snazzy user interface (aka “front-end”) is provided so that a user can see the application of all of the functionality she implements.

## Features

### 1. Analyze How Easy to Read is Your Writing?
- Calculate Flesch score, which indicates how easy to read is the text. 
- The **Flesch Readability Score** is a measure of the reading complexity of a piece of text (developed by author Rudolf Flesch) that approximates how easy a piece of text is to read based on the number of sentences, words and syllables in that text. Higher scores indicate text that is simple to read, while lower scores indicate more complex text.

![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/moocTextEditor-Flesch-score.png)

#### Code
- [src/document/Document.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/Document.java)
- [src/document/BasicDocument.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/BasicDocument.java)

### 2. Making Flesch Score Calculation More Efficient & Benchmarking
- Optimize the implementation of the Document class and then measure how much faster the new implementation is.
-  Implementate EfficientDocument such that code counts the number of words, sentences and syllables in the document and store these values in the appropriate member variables so that when the method is over, **they never have to be re-calculated**.
-  **Determine and plot how much faster EfficientDocument is than BasicDocument in computing a single Flesch score** for a document by calculating the Big-O running time of the code to compute the Flesch score for BasicDocument and EfficientDocument.

<kbd>![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/BasicDoc-vs-EffDoc.png)</kbd>

#### Code
- [src/document/BasicDocument.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/BasicDocument.java)
- [src/document/EfficientDocument.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/EfficientDocument.java)
- [src/document/DocumentBenchmarking.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/DocumentBenchmarking.java)


### 3. Implement Markov Text Generation using a List of Lists.
- Implement and Test a Linked List Data Structure
- Implement Markov Text Generator that -
    - Train the data by adding the sourceText and building a list of list-nodes where each list-node contains a word and list of all of its 'nextWords'. 
    - Generate a text (of size based on number of words requested) by randomly choosing 'nextWord' from list of list-nodes. 

#### Here is an example  
<kbd>![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/moocTextEditor-MarkovText.png)</kbd>


#### Code
- [src/textgen/MyLinkedList.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/textgen/MyLinkedList.java)
- [src/textgen/MarkovTextGenerator.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/textgen/MarkovTextGenerator.java)
- [src/textgen/MarkovTextGeneratorLoL.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/textgen/MarkovTextGeneratorLoL.java)


### 4. Spell checking and more benchmarking
- Implement a dictionary of words of using a LinkedList vs a Binary Search Tree and compare the performance.
- Check if a word is in dictionary (in both DS LinkedList and BST). If not, flag misspelled words.   
- Calculate the running time to find words in each Dictionary implementation by running the DictionaryBenchmarking class. 

#### Running Time Comparison 
<kbd>![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/LL-vs-BST-Benchmarking.png)</kbd>

#### Spell-Checking Demo
<kbd>![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/moocTextEditor-Spell-Checking.png)</kbd>

#### Code
- [src/spelling/DictionaryLL.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/spelling/DictionaryLL.java)
- [src/spelling/DictionaryBST.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/spelling/DictionaryBST.java)
- [src/spelling/DictionaryBenchmarking.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/spelling/DictionaryBenchmarking.java)

### 5. Autocomplete
- implement a **Trie data structure** to enable the autocomplete functionality of the text editor. 
- Use a trie data structure to store the words in a dictionary and use the breadth first search algorithm to implement predictCompletions method that returns list of words from typed String.

#### Autocomplete Demo
<kbd>![alt gif1]()</kbd>

#### Code


