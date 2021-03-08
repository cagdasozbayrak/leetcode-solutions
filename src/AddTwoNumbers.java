public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int length = 0;
        ListNode node1 = l1;
        ListNode node2 = l2;
        ListNode result = new ListNode();
        ListNode head = result;
        int carry = 0;
        while(node1 != null || node2 != null || carry > 0){
            int val1 = node1 == null ? 0 : node1.val;
            int val2 = node2 == null ? 0 : node2.val;
            int val = val1+val2+carry;
            carry = val/10;
            val = val - (carry*10);
            result.next = new ListNode(val);
            result = result.next;
            if(node1 != null){
                node1 = node1.next;
            }
            if(node2 != null) {
                node2 = node2.next;
            }
        }

        return head.next;
    }
}
