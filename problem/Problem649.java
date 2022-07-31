import java.util.LinkedList;
import java.util.Queue;

public class Problem649 {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RDD"));
    }

    public static String predictPartyVictory(String senate) {
        Queue<Integer> rQuene = new LinkedList<Integer>();
        Queue<Integer> dQuene = new LinkedList<Integer>();
        int n = senate.length();
        for (int i=0;i<n;i++){
            if(senate.charAt(i) == 'R'){
                rQuene.offer(i);
            }else{
                dQuene.offer(i);
            }
        }
        while(!rQuene.isEmpty() && !dQuene.isEmpty()){
            int r = rQuene.element();
            int d = dQuene.element();
            dQuene.poll();
            rQuene.poll();
            if(r < d){
                rQuene.offer(r+n);
            }else{
                dQuene.offer(r+n);
            }
        }
        if(rQuene.isEmpty()){
            return "Dire";
        }else{
            return "Radiant";
        }


    }
}
