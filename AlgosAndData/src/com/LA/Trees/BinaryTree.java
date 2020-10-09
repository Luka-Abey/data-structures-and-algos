package com.LA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
 TreeNode<E> root;
 
 public void levelOrder() {
	 Queue <TreeNode<E>> = new LinkedList <TreeNode<E>>();
	 q.add(root);
	 while(!q.isEmpty()) {
		 TreeNode<E> curr = q.remove();
		 if(curr != null) {
			 curr.visit();
			 q.add(curr.getLeftChild());
			 q.add(curr.getRightChild());
		 }
	 }
 }
}


