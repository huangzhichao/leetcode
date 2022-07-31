public class Problem135 {
    public static void main(String[] args) {
        System.out.println(candy(new int[]{1,3,2,2,1}));
    }

    public static int candy(int[] ratings) {
        int mark = 1;
        int min = 1;
        int total = 1;
        for (int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]){
                mark++;
            }else if(ratings[i]<=ratings[i-1]){
                if(mark>1){
                    mark--;
                }
            }
            if(mark<min){
                min = mark;
            }
            total += mark;
        }
        return total-((min-1)*ratings.length);
    }
}
