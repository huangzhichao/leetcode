public class Problem342 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }

    public static boolean isPowerOfFour(int n) {
        while(n>=4){
            if(n % 4 != 0){
                return false;
            }
            n /= 4;
        }
        return n == 1;
    }
}
