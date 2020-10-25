## Vectors

Vector implements List. Yet, vectors were present in JDK 1.0, and List was introduced in 1.2 - later vectors were modified to work with List. Has a 'capacity' method, dictating the size-equivalent of the vector.

The capacity of the vector is dynamic, and if we exceed the capacity, the vector will increase its capacity by 100% (it will double in size)

If comparing to an ArrayList, which works in a very similar way, with dynamic sizing etc. The ArrayList, however, increases its capacity by 50% - much more memory friendly. 