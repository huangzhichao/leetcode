public class Problem860 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,20}));
    }

    public static boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;
        for (int b : bills){
            if(b == 5){
                fiveCount++;
            }else if(b ==10){
                if(fiveCount == 0){
                    return false;
                }
                fiveCount--;
                tenCount++;
            }else if(b == 20){
                if(tenCount>0 && fiveCount>0){
                    fiveCount --;
                    tenCount--;
                }else if(fiveCount >= 3){
                    fiveCount -= 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
