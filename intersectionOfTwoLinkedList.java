import java.util.HashSet;

public class intersectionOfTwoLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA=headA.next;
        }
        while (headB != null) {
            if(set.contains(headB)){
                return headB;
            }
            set.add(headB);
            headB=headB.next;
        }
        return headA;
    }

    public static void main(String[] args) {
        intersectionOfTwoLinkedList obj = new intersectionOfTwoLinkedList();
        ListNode head = obj.new ListNode(4);
        head.next = obj.new ListNode(1);
        head.next.next = obj.new ListNode(8);
        head.next.next.next = obj.new ListNode(4);
        head.next.next.next.next = obj.new ListNode(5);
        ListNode head2 = obj.new ListNode(5);
        head2.next = obj.new ListNode(6);
        head2.next.next = obj.new ListNode(1);
        head2.next.next.next = head.next.next;
        head2.next.next.next.next = head.next.next.next;
        head2.next.next.next.next.next = head.next.next.next.next;
        System.out.println(getIntersectionNode(head, head2).val);
    }
}
