public class  Problem1343 {
    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{11,13,17,23,29,31,7,5,2,3},3,5));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        if(arr.length<k){
            return 0;
        }
        int sum = 0;
        for (int i=0;i<k;i++){
            sum += arr[i];
        }
        if(sum>=k*threshold){
            res++;
        }
        int m = k;
        while(m<arr.length){
            sum = sum-arr[m-k]+arr[m];
            if(sum>=k*threshold){
                res++;
            }
            m++;
        }
        return res;
    }
}
