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
        ListNode ans = obj.new ListNode();
        ListNode tempAns=ans;
        int carry = 0;
        while (l1 != null || l2 != null || carry>0) {
            if(l1!=null){
                carry+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                carry+=l2.val;
                l2=l2.next;
            }
            tempAns.next=obj.new ListNode(carry%10);
            carry/=10;
            tempAns=tempAns.next;
        }
        return ans.next;
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
