package trees.graphs;

public class MinimalTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;
		return compute(nums, 0, nums.length - 1);
	}

	private TreeNode compute(int[] nums, int left, int right) {
		TreeNode root = null;
		if (left <= right) {
			int mid = left + (right - left) / 2;
			root = new TreeNode(nums[mid]);
			root.left = compute(nums, left, mid - 1);
			root.right = compute(nums, mid + 1, right);
		}
		return root;
	}
}
