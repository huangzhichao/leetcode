public class Problem31 {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        nextPermutation(a);
        Print.print(a);
    }

    public static void nextPermutation(int[] nums) {
        if(nums.length<2){
            return;
        }
        int j = nums.length-2;
        for (;j>=0;j--){
            if(nums[j]<nums[j+1]){
                break;
            }
        }

    }
}
