public class Problem387 {
    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }

    public static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for( int i=0;i<26;i++){
            arr[i] = -2;
        }
        for (int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a'] == -2){
                arr[s.charAt(i)-'a'] = i;
            }else{
                arr[s.charAt(i)-'a'] = -1;
            }

        }
        int min = -1;
        for (int i=0;i<26;i++){
            if(arr[i] >= 0){
                if(min == -1){
                    min = arr[i];
                }else if(min > arr[i]){
                    min  = arr[i];
                }
            }
        }
        return min;
    }
}
