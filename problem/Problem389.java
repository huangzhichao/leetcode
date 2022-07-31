public class Problem389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("ababa","aaabbc"));
    }

    public static char findTheDifference(String s, String t) {
        int result = 0;
        for (char c : s.toCharArray()){
            result = result ^ (int)c;
        }

        for (char c : t.toCharArray()){
            result = result ^ (int)c;
        }
        return (char)result;
    }
}
