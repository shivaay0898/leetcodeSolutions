public class mergeTwoSortedLists {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    // public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    //     if(list1==null||list2==null){
    //         return list1==null?list2:list1;
    //     }
    //     ListNode head=null;
    //     ListNode tail=null;
    //     if(list1.val>list2.val){
    //         head=tail=list2;
    //         list2=list2.next;
    //     }
    //     else{
    //         head=tail=list1;
    //         list1=list1.next;
    //     }
    //     while(list1!=null && list2!=null){
    //         if(list1.val<=list2.val){
    //             tail.next=list1;
    //             tail=list1;
    //             list1=list1.next;
    //         }
    //         else if(list2.val<=list1.val){
    //             tail.next=list2;
    //             tail=list2;
    //             list2=list2.next;
    //         }
    //     }
    //     if(list1==null){
    //         tail.next=list2;
    //     }
    //     else{
    //         tail.next=list1;
    //     }
    //     return head;
    //}
}
