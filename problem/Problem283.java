public class Problem283 {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};
        moveZeroes(a);
        Print.print(a);
    }

    public static void moveZeroes(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (;j<nums.length;j++){
            nums[j] = 0;
        }
    }
}
