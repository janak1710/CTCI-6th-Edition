package trees.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> resultLists = new ArrayList<List<Integer>>();
		if (root == null)
			return resultLists;
		Queue<TreeNode> currList = new LinkedList<TreeNode>();
		List<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode> next = new LinkedList<TreeNode>();
		currList.offer(root);
		while (!currList.isEmpty()) {
			TreeNode curr = currList.poll();
			result.add(curr.val);
			if (curr.left != null)
				next.offer(curr.left);

			if (curr.right != null)
				next.offer(curr.right);
			if (currList.isEmpty()) {
				currList = next;
				next = new LinkedList<TreeNode>();
				resultLists.add(result);
				result = new ArrayList<Integer>();
			}
		}

		return resultLists;
	}

}
