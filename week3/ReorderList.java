import java.util.List;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode midNode = findMid(head), reversed_mid_head = reverse(midNode.next);
        ListNode p = head, q = reversed_mid_head;
        midNode.next = null;
        while (q != null) {
            ListNode nextp = p.next;
            ListNode nextq = q.next;

            p.next = q;
            q.next = nextp;

            p = nextp;
            q = nextq;
        }
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
