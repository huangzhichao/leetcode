public class Problem292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(1));
    }

    public static boolean canWinNim(int n) {
        if(n==1){
            return false;
        }
        if(n<=4){
            return true;
        }
        return n%4!=0;
    }
}