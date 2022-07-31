import java.util.PriorityQueue;

public class Problem1046 {
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones){
            pq.add(stone);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a>b){
                pq.add(a-b);
            }
        }
        return pq.size()==0?0:pq.poll();
    }
}
