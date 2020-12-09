public class Problem134 {
    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int min = Integer.MAX_VALUE;
        int total = 0;
        int minIndex = 0;
        for (int i=0;i<gas.length;i++){
            total = total + gas[i] - cost[i];
            if(total<min){
                min = total;
                minIndex = i;
            }
        }
        return total>=0?(minIndex+1)%gas.length:-1;
    }
}
