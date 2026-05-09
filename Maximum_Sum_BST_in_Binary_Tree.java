package Lec31;

public class Maximum_Sum_BST_in_Binary_Tree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int maxSumBST(TreeNode root) {
			return ValidBST(root).ans;
		}

		public BstPair ValidBST(TreeNode root) {
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = ValidBST(root.left);
			BstPair rbp = ValidBST(root.right);
			BstPair sbp = new BstPair();
			sbp.min = Math.min(lbp.min, Math.min(rbp.min, root.val));
			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.val));
			sbp.sum = lbp.sum + rbp.sum + root.val;
			if (lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val) {
				sbp.isbst = true;
				sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
			} else {
				sbp.isbst = false;
				sbp.ans = Math.max(lbp.ans, rbp.ans);
			}
			return sbp;
		}

		class BstPair {
			boolean isbst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			int sum = 0;
			int ans = 0;

		}

	}
}
