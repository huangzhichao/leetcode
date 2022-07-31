public class Problem738 {
    public static void main(String[] args) {
        System.out.println(monotoneIncreasingDigits(123332));
    }

    public static int monotoneIncreasingDigits(int N) {
        int[] arr = new int[10];
        int i = 0;
        while (N > 0) {
            int c = N % 10;
            N = N / 10;
            arr[i] = c;
            i++;
        }
        int result = arr[i];
        int flag = arr[i];
        int eqFlag = 0;
        i--;
        while (i >= 0) {
            if (arr[i] > flag) {
                result = result * 10 + arr[i];
                flag = arr[i];
                eqFlag = 0;
                i--;
            }else if(arr[i] == flag){
                result = result * 10 + arr[i];
                flag = arr[i];
                eqFlag++;
                i--;
            }
            else {
                result = result/(int) Math.pow(10, eqFlag) * (int) Math.pow(10, i+eqFlag+1) - 1;
                i = -1;
            }
        }
        return result;
    }
}
