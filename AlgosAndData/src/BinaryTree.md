A tree whose elements have no more than two children - the left and right child.

Nodes at certain points on a binary tree can contain 1) data 2) pointer to left child 3) pointer to right child.

There is also a root pointer for the highest node in the tree.

Stanford says binary trees have an elegant recursive pointer structure. The recursive definition is: a binary tree is either empty (null pointer) or is made of a single node, where the left and right pointers each point to a binary tree.


### Binary SEARCH tree

Also known as an ordered binary tree, where the nodes are arranged in order. Elements in the left subtree of a given node are <= given node, and elements in the right subtree are > given node.