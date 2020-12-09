import java.util.Collection;

public class Print {
    public static <E> void print(Collection<E> collection){
        for (E e : collection){
            System.out.println(e);
        }
    }

    public static <E> void print(int[] collection){
        for (int e : collection){
            System.out.println(e);
        }
    }

    public static void print(ListNode node){
        while (node != null){
            System.out.print(node.val+ "     ");
            node = node.next;
        }
        System.out.println();
    }
}
