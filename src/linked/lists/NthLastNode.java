package linked.lists;

public class NthLastNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode nthLastNode(ListNode head, int k) {
		ListNode one = head;
		while (k > 0) {
			head = head.next;
			k--;
		}
		ListNode two = head;
		while (one != null) {
			one = one.next;
			two = two.next;
		}
		return two;
	}

}
