<h6>
CS-324-2: Introduction to the Design of Algorithms <br>
Spring 2021 <br>
Northeastern Illinois University <br>
Knuth-Morris-Pratt Algorithm <br>
Due Date: 05/01/21 at 9:00 p.m. <br>
Final Project <br>
Syema Ailia :shipit:
</h6>

#### Knuth-Morris-Pratt Algorithm 

---
>The Knuth–Morris–Pratt string-searching algorithm 
(or KMP algorithm) searches for occurrences of a "word" 
W within a main "text string" S by employing the observation 
that when a mismatch occurs, the word itself embodies sufficient 
information to determine where the next match could begin, thus 
bypassing re-examination of previously matched characters. 
--<cite>Wikipedia</cite>
---

1. `KMP.java` contains the KMP Algorithm that returns an array of indices where the pattern was found.
   The algorithm consists of the following methods:
   - **calculatePrefixLength(pattern)** Takes a pattern string to be searched and calculates the prefix length.
   - **searchForPattern(text, pattern)** Takes a pattern, and the text to search through.
   

2. `KMPTest.java` A file containing tests to take care of any edge cases and ensure that the KMP algorithm works correctly.

