public class binarytoIntegerLinkedList { 
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
    public static int getDecimalValue(ListNode head) {
        int decVal=0;
        while(head!=null){
           decVal=decVal*2+head.val;
           head=head.next;
        }
        return decVal;
    }

    public static void main(String[] args) {
        binarytoIntegerLinkedList b = new binarytoIntegerLinkedList();
        ListNode head = b.new ListNode(1);
        head.next = b.new ListNode(0);
        head.next.next=b.new ListNode(1);
        System.out.println(getDecimalValue(head));
    }
}
