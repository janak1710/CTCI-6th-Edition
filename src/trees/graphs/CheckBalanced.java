package trees.graphs;

public class CheckBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static int isBalanced(TreeNode root) {
		if (root == null)
			return -1;
		int lht = isBalanced(root.left);
		int rht = isBalanced(root.right);
		
		if (lht == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (rht == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		else if (Math.abs(lht - rht) > 1)
			return Integer.MIN_VALUE;
		else
			return 1 + Math.max(lht, rht);
	}
}
