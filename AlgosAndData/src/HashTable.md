## Hash Tables

Hash tables are arrays where we translate and assign keys to values.

Key -> (Hash) Function -> Hash code (index)
The function is, more often than not, a modulo operator with value.
To hash characters, we use ASCII and then pass this value through the function.

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


## How do we deal with full hash tables?

Resize the table? Since we are working with arrays, the only way to resize is to create a 
new table, new hash function, and reinsert everything... this is costly.

## What about ordering data?

There is no data ordering capability. We need to manually sort etc.

## Pros though?

On average 0(1) lookup, insert, and remove time. Resizing and ordering? Forget about it.

## Sets or maps??

### Hash set
Just tells you if an item is in the set or not. Just store words etc.

add(E e) adds specified element to the set if not already present
contains(Object o) returns true if set contains the specified element

### Hash map
Stores two things: the key and data associated with the key.

get(Object key) returns the value to which the key is mapped, or null
put(K key, V value) associates the specified value with the specified key.







