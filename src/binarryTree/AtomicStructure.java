package binarryTree;

import java.util.*;


//Maximum Depth — 104
//Level Order Traversal — 102
//Validate BST — 98
//Inorder Traversal — 94
//Lowest Common Ancestor — 236

public class AtomicStructure {
	
	class TreeNode{
		int val ;
		TreeNode left;
		TreeNode right;
		
		
		TreeNode(int val){
			this.val = val;
		}
		
		
		// inorder l root right come in leetcode
		public void inorder(TreeNode root, List<Integer> result) {
		    if (root == null) {
		        return;
		    }

		    inorder(root.left, result);
		    result.add(root.val);
		    inorder(root.right, result);
		}
		
		// this too root left right
		public void preorder(TreeNode root, List<Integer> result) {
		    if (root == null) {
		        return;
		    }

		    result.add(root.val);
		    preorder(root.left, result);
		    preorder(root.right, result);
		}
		
		// dont want to right every time here every i think is the leetcode problem
		public void postorder(TreeNode root, List<Integer> result) {
		    if (root == null) {
		        return;
		    }

		    postorder(root.left, result);
		    postorder(root.right, result);
		    result.add(root.val);
		}
		
		public int maxDepth(TreeNode root) { // maximum depth of tree 
		    if (root == null) {
		        return 0;
		    }

		    int leftHeight = maxDepth(root.left);
		    int rightHeight = maxDepth(root.right);

		    return 1 + Math.max(leftHeight, rightHeight); // return 1 + Math.max(0, 0);
		}
		
		
		//Binary Tree Level Order Traversal — LeetCode 102
		
		public List<List<Integer>> levelOrder(TreeNode root) {
		    List<List<Integer>> result = new ArrayList<>();

		    if (root == null) {
		        return result;
		    }

		    Queue<TreeNode> queue = new LinkedList<>();
		    queue.offer(root);

		    while (!queue.isEmpty()) {
		        int levelSize = queue.size();
		        List<Integer> currentLevel = new ArrayList<>();

		        for (int i = 0; i < levelSize; i++) {
		            TreeNode current = queue.poll();
		            currentLevel.add(current.val);

		            if (current.left != null) {
		                queue.offer(current.left);
		            }

		            if (current.right != null) {
		                queue.offer(current.right);
		            }
		        }

		        result.add(currentLevel);
		    }

		    return result;
		}
		
		public boolean isSameTree(TreeNode p, TreeNode q) {
		    if (p == null && q == null) {
		        return true;
		    }

		    if (p == null || q == null) {
		        return false;   //leetcode 100
		    }

		    if (p.val != q.val) {
		        return false;
		    }

		    return isSameTree(p.left, q.left)
		            && isSameTree(p.right, q.right);
		}
		
		public boolean isValidBST(TreeNode root) {
		    return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
		}

		private boolean validate(TreeNode node, long min, long max) {
		    if (node == null) {
		        return true;
		    }

		    if (node.val <= min || node.val >= max) { //leetcode 98
		        return false; //leetcode 98
		    }

		    return validate(node.left, min, node.val)
		            && validate(node.right, node.val, max);
		}
		
		public TreeNode lowestCommonAncestor(
		        TreeNode root,
		        TreeNode p,
		        TreeNode q) {

		    if (root == null || root == p || root == q) {
		        return root;
		    }

		    TreeNode left = lowestCommonAncestor(root.left, p, q);
		    TreeNode right = lowestCommonAncestor(root.right, p, q); //leetcode 236

		    if (left != null && right != null) {
		        return root;
		    }

		    return left != null ? left : right;
		}
		
		
		public TreeNode searchBST(TreeNode root, int val) {
		    if (root == null || root.val == val) {
		        return root;
		    }

		    if (val < root.val) {
		        return searchBST(root.left, val);
		    }

		    return searchBST(root.right, val);
		} //leetcode 700
	}

}
