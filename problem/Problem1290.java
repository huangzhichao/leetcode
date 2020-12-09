public class Problem1290 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next= new ListNode(1);
        listNode.next.next.next= new ListNode(0);
        listNode.next.next.next.next= new ListNode(1);
        System.out.println(getDecimalValue(listNode));
    }

    public static int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null){
            result = result*2+head.val;
            head = head.next;
        }
        return result;
    }
}
