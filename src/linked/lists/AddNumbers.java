package linked.lists;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static ListNode addDigits(ListNode headA, ListNode headB, int carry) {
		if (headA == null && headB == null && carry == 0) {
			return null;
		}
		int res = 0;
		if (headA != null)
			res += headA.val;
		if (headB != null)
			res += headB.val;
		res += carry;

		ListNode temp = new ListNode(res % 10);

		temp.next = addDigits(headA == null ? null : headA.next,
				headB == null ? null : headB.next, res / 10);

		return temp;
	}

	public static ListNode addDigitsRev(ListNode headA, ListNode headB,
			int carry) {
		if (headA == null && headB == null && carry == 0) {
			return null;
		}
		ListNode temp1 = addDigitsRev(headA.next, headB.next, carry);

		int res = 0;

		res += headA.val;
		res += headB.val;

		res += carry;
		ListNode temp = new ListNode(res % 10);
		carry = res / 10;

		temp.next = temp1;
		temp1 = temp;

		return temp1;
	}

}
