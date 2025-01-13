Your goal for this MP is to recreate a portion of the ArrayList class called
BetterArray which will be stored in BetterArray.java. The BetterArray class
should implement the methods found in the Java Quick Reference and that are
listed below. The BetterArray class is required to store values in an array
called array that is public for testing purposes. In an effort to alleviate
running time concerns associated with constant copying of array values, an
additional measure should be put in place. Whenever an additional item is added,
instead of just adding one additional spot, the size of the array should be
doubled (while still keeping the size of the BetterArray at the appropriate
value). For example, when a new BetterArray is created it's size should be 0.
Then after a new item is added, it's size is then 1. After a new item is added,
the size of the array will double to 2 and then to 4 and then to 8 and so on.
This effectively changes the cumulative running time of the add methods from
linear to logarithmic.

int size()
Returns the number of elements in the list

boolean add(int item)
appends item to the end of the list; returns true

void add(int index, int item)
Inserts item at position index, moving elements at position index and higher to
the right and adds 1 to size

int get(int index)
Returns the element at position index in the list

int set(int index, int item)
Replaces the element at position index with item; returns the element formerly
at position index

int remove(int index)
Removes element from position index, moving elements at position index+1 and
higher to the left and subtracts 1 from size; returns the element formerly at
position index
