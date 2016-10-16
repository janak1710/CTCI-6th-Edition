package linked.lists;

public class RemoveDuplicatesUnsorted {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1).next = new ListNode(1).next = null;

	}

	private static ListNode removeDuplicates(ListNode list) {
		ListNode head = list;
		ListNode curr = head;
		while (curr != null && curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return head;
	}

	private static ListNode mergeSort(ListNode list) {
		if (list == null || list.next == null)
			return list;

		ListNode slow = list;
		ListNode fast = list;
		ListNode prev = null;
		ListNode left = list;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = null;
		ListNode right = slow;
		left = mergeSort(left);
		right = mergeSort(right);
		return merge(left, right);
	}

	private static ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;
		ListNode head = null;
		if (l1.val < l2.val) {
			head = l1;
			head.next = merge(l1.next, l2);
		} else {
			head = l2;
			head.next = merge(l1, l2.next);
		}
		return head;
	}

}
