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
- src/document/Document.java
- src/document/BasicDocument.java
