package com.LA.Trees;

public class TreeNode<E> {
	private E value;
	private TreeNode<E> parent;
	private TreeNode<E> left;
	private TreeNode<E> right;
	
	public TreeNode (E val, TreeNode<E> par) {
		this.value = val;
		this.parent = par;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode<E> addLeftChild(E val){
		this.left = new TreeNode<E>(val, this);
		return this.left;
	}
	
	public TreeNode<E> addRightChild(E val){
		this.right = new TreeNode<E>(val, this);
		return this.right;
	}
	
}
