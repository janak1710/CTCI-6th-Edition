package linked.lists;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		ListNode curr = head;
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = null;
		ListNode right = slow;
		if (fast != null) {
			right = right.next;
			slow.next = null;
		}
		prev = null;
		while (right != null) {
			ListNode next = right.next;
			right.next = prev;
			prev = right;
			right = next;
		}
		while (curr != null) {
			if (curr.val != prev.val)
				return false;
			curr = curr.next;
			prev = prev.next;
		}
		return true;
	}

}
