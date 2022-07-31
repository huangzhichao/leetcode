public class Problem50 {
    public static void main(String[] args) {
        System.out.println(myPow(12,2));
    }

    public static double myPow(double x, int n) {
        double result = x;
        while(n>0){
            if(n % 2 ==1){
                result  = result * result * x;
            }else{
                result  = result * result;
            }
            n /= 2;
        }
        return result;
    }
}
