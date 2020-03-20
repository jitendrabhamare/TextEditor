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

### 2. Making Flesch Score Calculation More Efficient
- Optimize the implementation of the Document class and then measure how much faster the new implementation is.
-  Implementate EfficientDocument such that code counts the number of words, sentences and syllables in the document and store these values in the appropriate member variables so that when the method is over, **they never have to be re-calculated**.
-  **Determine and plot how much faster EfficientDocument is than BasicDocument in computing a single Flesch score** for a document by calculating the Big-O running time of the code to compute the Flesch score for BasicDocument and EfficientDocument.

<kbd>![](https://github.com/jitendrabhamare/TextEditor/blob/master/img/BasicDoc-vs-EffDoc.png)</kbd>

#### Code
- [src/document/BasicDocument.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/BasicDocument.java)
- [src/document/EfficientDocument.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/EfficientDocument.java)
- [src/document/DocumentBenchmarking.java](https://github.com/jitendrabhamare/TextEditor/blob/master/src/document/DocumentBenchmarking.java)


### 
