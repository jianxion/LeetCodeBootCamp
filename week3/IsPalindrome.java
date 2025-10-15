public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = findMid(head);
        ListNode reversed_mid_head = reverse(mid);
        ListNode p = head, q = reversed_mid_head;
        while (p != null && q != null) {
            if (p.val != q.val) return false;
            p = p.next;
            q = q.next;
        }
        return true;
    }

    public ListNode findMid(ListNode node) {
        ListNode p = node;
        ListNode q = node;
        while (p != null && p.next != null) {
            p = p.next.next;
            q = q.next;
        }
        return q;
    }

    public ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode p = node;
        while (p != null) {
            ListNode nextNode = p.next;
            p.next = prev;
            prev = p;
            p = nextNode;
        }
        return prev;
    }
}
