public class mergeNodesInBetweenTwoArrays {

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

    public ListNode mergeNodes(ListNode head) {
        if (head.val == 0) {
            head = head.next;
        }
        ListNode temp = head;
        int tempSum = 0;
        ListNode ans = new ListNode();
        ListNode finalAns = ans;
        while (temp.next != null) {
            if (temp.val == 0) {
                temp = temp.next;
            }
            while (temp.val != 0) {
                tempSum += temp.val;
                temp = temp.next;
            }
            ans.val = tempSum;
            if(temp.next!=null){
                ans.next = new ListNode();
            }
            ans = ans.next;
            tempSum = 0;
        }
        return finalAns;
    }
}
