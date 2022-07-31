import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Problem1181 {
    public static void main(String[] args) {
        System.out.println(smallestSubsequence("abcbcacb"));
    }

    static class Modal{
        public int index;
        public char value;

        public Modal(int index,char value){
            this.index = index;
            this.value = value;
        }
    }

    public static String smallestSubsequence(String s) {
        char[] chars = s.toCharArray();
        List<Modal> modalList = new ArrayList<>();
        modalList.add(new Modal(0,chars[0]));
        for (int i=1;i<chars.length-1;i++){
            if(chars[i]<chars[i-1] && chars[i]<chars[i+1]){
                modalList.add(new Modal(i,chars[i]));
            }
        }
        modalList.add(new Modal(chars.length-1,chars[chars.length-1]));
        modalList.sort(new Comparator<Modal>() {
            @Override
            public int compare(Modal o1, Modal o2) {
                return o1.value-o2.value;
            }
        });
        List<Modal> modalListFilter = new ArrayList<>();
        modalListFilter.add(modalList.get(0));
        for (int i=1;i<modalList.size();i++){
            if(modalList.get(i).index>modalList.get(i-1).index){
                modalListFilter.add(modalList.get(i));
            }
        }
        modalList.clear();
        modalListFilter.add(modalListFilter.get(0));
        for (int i=1;i<modalListFilter.size();i++){
            if(modalListFilter.get(i).value>modalListFilter.get(i-1).value){
                modalList.add(modalListFilter.get(i));
            }
        }
        Print.print(modalListFilter);
//        StringBuilder stringBuilder = new StringBuilder();
//        int start = 0;
//        int end = index;
//        while(true){
//            int min = Integer.MAX_VALUE;
//            int s
//            for (int i=start;i<end;i++){
//
//            }
//        }

        return "";
    }
}
