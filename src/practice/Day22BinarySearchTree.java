package practice;

import java.util.*;
import java.io.*;

class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int data) {
		this.data = data;
		left = right = null;
	}
}

class Day22BinarySearchTree {

	public static int getHeight(TreeNode root) {
		// Write your code here
		if (root == null)
			return -1;
		else
			return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	public static TreeNode insert(TreeNode root, int data) {
		if (root == null) {
			return new TreeNode(data);
		} else {
			TreeNode cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		TreeNode root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}