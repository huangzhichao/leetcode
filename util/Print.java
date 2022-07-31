import java.util.Collection;

public class Print {
    public static <E> void print(Collection<E> collection){
        for (E e : collection){
            if(e instanceof Collection){
                print((Collection)e);
            }else{
                System.out.println(e);
            }
        }
    }

    public static void print(String collection){
        System.out.println(collection);
    }

    public static <E> void print(int[] collection){
        for (int e : collection){
            System.out.println(e);
        }
    }

    public static <E> void print(long[] collection){
        for (long e : collection){
            System.out.println(e);
        }
    }

    public static <E> void print(char[] collection){
        for (char e : collection){
            System.out.println(e);
        }
    }

    public static <E> void print(int[][] collection){
        for (int[] el : collection){
            for (int e : el){
                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println();
        }
    }


    //    public static <E> void print(E[] collection){
//        for (E e : collection){
//            System.out.print(e);
//            System.out.print(" ");
//        }
//        System.out.println();
//    }

    public static void print(ListNode node){
        while (node != null){
            System.out.print(node.val+ "     ");
            node = node.next;
        }
        System.out.println();
    }

    public static <E> void print(E[][] content){
        for (E[] el : content){
            for (E e : el){
                System.out.print(e);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
