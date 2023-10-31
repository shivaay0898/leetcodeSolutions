class addTwoNumbersLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        addTwoNumbersLinkedList obj = new addTwoNumbersLinkedList();
        ListNode ans = obj.new ListNode(0);
        ListNode tempAns=ans;
        int carry = 0;
        while (l1 != null && ans != null && l2 != null ) {
            int tempsum = l1.val + l2.val;
            ans.val = tempsum + carry;
            if (tempsum / 10 == 1) {
                carry = 1;
            } else
                carry = 0;
            l1 = l1.next;
            l2 = l2.next;
            ans = ans.next;
        }
        return tempAns;
    }

    public static void main(String[] args) {
        addTwoNumbersLinkedList obj = new addTwoNumbersLinkedList();
        ListNode head1 = obj.new ListNode(2);
        head1.next = obj.new ListNode(4);
        head1.next.next = obj.new ListNode(3);
        ListNode head2 = obj.new ListNode(5);
        head2.next = obj.new ListNode(6);
        head2.next.next = obj.new ListNode(4);
        ListNode head3 = addTwoNumbers(head1, head2);
        System.out.println(head3.val+" "+head3.next.val+" "+head3.next.next.val);
    }

}
