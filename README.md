# MathCombinationExample
In this java program, program will generate random (length of the word you entered) letters word with using the letters in your word.

Ex: How many different words can we generate with in lettes ENGINEER ?
The formula:
There are 8 letters in the word ENGINEER. 3E, 2N, 1G, 1I, 1R.  You are going to replace these letters in 8 space area.
- - - - - - - -
8C3(first replace E's) (8 blank - 3 E letter)
5C2(second replace N's) (5 blank left - 2 N letter)
3! (We can replace 3 different letters in 3! way)

8C3 * 5C2 * 3! == (8!) / (3! * 2!) is TRUE also.
