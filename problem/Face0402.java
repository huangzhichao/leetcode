public class Face0402 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next= new ListNode(3);
        listNode.next.next.next= new ListNode(4);
        listNode.next.next.next.next= new ListNode(5);

        System.out.println(kthToLast(listNode,2));
    }

    public static int kthToLast(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;

        for (int i=0;i<k;i++){
            right = right.next;
        }
        while( right != null){
            left = left.next;
            right = right.next;
        }
        return left.val;
    }

}
