public class offer11 {
    public static void main(String[] args) {
        System.out.println(minArray(new int[]{1,2,3,4}));
    }

    public static int minArray(int[] numbers) {
        int result = numbers[0];
        for (int i=1;i<numbers.length;i++){
            if(numbers[i]<numbers[i-1]){
                return numbers[i];
            }
        }
        return result;
    }
}
