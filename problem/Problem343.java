public class Problem343 {
    public static void main(String[] args) {
        System.out.println(integerBreak(58));
    }

    public static int integerBreak(int n) {
        if(n==2){
            return 1;
        }
        if(n==3){
            return 2;
        }
        if(n%3 == 0){
            return (int) Math.pow(3,n/3);
        }
        else if(n%3 == 1){
            return (int) (4 * Math.pow(3,(n/3)-1));
        }else{
            return (int) (2*Math.pow(3,n/3));
        }
    }
}
