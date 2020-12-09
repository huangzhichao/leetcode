import java.util.Random;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode generate(){
        Random random = new Random();
        ListNode node = new ListNode(random.nextInt());
        node.next = new ListNode(random.nextInt());
        node.next.next = new ListNode(random.nextInt());
        node.next.next.next = new ListNode(random.nextInt());
        node.next.next.next.next = new ListNode(random.nextInt());
        System.out.println("generate ListNode:");
        Print.print(node);
        return node;
    }
}
