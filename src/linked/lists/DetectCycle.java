package linked.lists;

public class DetectCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		boolean cycleExists = false;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				cycleExists = true;
				break;
			}
		}
		if (cycleExists) {
			fast = head;
			while (fast != slow) {
				fast = fast.next;
				slow = slow.next;
			}
			return slow;
		}
		return null;
	}

}
