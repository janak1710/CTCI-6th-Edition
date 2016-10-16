package trees.graphs;

public class ValidBST {

	public static void main(String args[]) {
		TreeNode root = new TreeNode(0);
		isValidBST(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
	}

	private static boolean isValidBST(TreeNode root, int max, int min) {
		if (root == null)
			return true;
		else if (root.val > max || root.val < min)
			return false;
		return isValidBST(root.left, root.val, min)
				&& isValidBST(root.right, max, root.val);
	}

}
