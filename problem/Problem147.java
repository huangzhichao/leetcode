public class Problem147 {
    public static void main(String[] args) {
        Print.print(insertionSortList(ListNode.generate()));
    }

    public static ListNode insertionSortList(ListNode head) {
        ListNode flag = head.next;
        while(flag != null){
            ListNode index1 = head;
            ListNode index2 = head;
            while(flag.val >= index1.val){
                index2 = index1;
                index1 = index1.next;
            }
            int a = flag.val;


            flag = flag.next;
        }
        return head;
    }
}
