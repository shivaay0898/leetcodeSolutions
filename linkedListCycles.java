import java.util.HashSet;
import java.util.Set;

public class linkedListCycles {
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> visitedRef=new HashSet<>();
        // while(head!=null){
        //     if(visitedRef.contains(head)){
        //         return true;
        //     }
        //     visitedRef.add(head);
        //     head=head.next;
        // }
        // return false;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            if(slow==fast){
                return true;
            }
            slow=head.next;
            fast=head.next.next;
        }
        return false;
    }
}
