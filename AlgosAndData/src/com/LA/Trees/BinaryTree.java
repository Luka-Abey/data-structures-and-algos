package com.LA.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<E> {
 TreeNode<E> root;
 
 public void levelOrder() {
	 Queue <TreeNode<E>> q = new LinkedList <TreeNode<E>>();
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
 
 private void preOrder() {
	 if(node != null) {
		 node.visit();
		 preOrder(node.getLeftChild());
		 preOrder(node.getRightChild());
	 }
 }
 
 public void preOrder() {
	 this.preOrder(root);
 }
}


