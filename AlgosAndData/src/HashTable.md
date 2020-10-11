## Hash Tables

Hash tables are arrays where we translate and assign values to an index.

Key -> (Hash) Function -> Hash code (index)
The function is, more often than not, a modulo operator with value.

What if we have two keys,
3, and 13, and our function is X % 5...
Hash code for both would be 3..
This is known as a collision


## How do we deal with collisions? 

### 1 - Linear Probing?

Why not just put the newest key to insert at the next available location.
Sounds good as a simple solution, but what if other positions are full.

We wanted has tables to immediately look at one position and get our desired answer -
this solution seems to undermine that.


### 2 - Separate Chaining?

Keep a linked list instead of a single element in a particular position in hash table.


How do we deal with resizing?





