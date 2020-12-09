import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem841 {
    public static void main(String[] args) {
        List lsit = new ArrayList();
        System.out.println(lsit.get(0));
//        System.out.println(canVisitAllRooms(Arrays.asList(Arrays.asList(1,3),Arrays.asList(3,0,1),Arrays.asList(2),Arrays.asList(0))));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> keys = new HashSet<>(rooms.size());
        func(0,keys,rooms);
        for (int i=0;i<rooms.size();i++){
            if(!keys.contains(i)){
                return false;
            }
        }
        return true;
    }

    public static void func(Integer key,Set<Integer> keys,List<List<Integer>> rooms){
        if(keys.contains(key)){
            return;
        }
        keys.add(key);
        for (Integer newKey :rooms.get(key)){
            func(newKey,keys,rooms);
        }
    }
}
