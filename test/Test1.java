public class Test1 {

    private static final int N = 10;
    private static final int m = 10;

    public static void main(String[] args) {
        int[][] a = new int[N][m];
        System.out.println("随机生成：");

        for (int i = 0; i< N; i++){
            for (int j=0;j<m;j++){
                if(i==0&&j==0){
                    a[i][j] = 0;
                }else{
                    a[i][j] = (int)(Math.random()*100);
                }
                System.out.print(String.format("%6d",a[i][j]));
            }
            System.out.println();
        }

        for (int i = 0; i< N; i++){
            for (int j=0;j<m;j++){
                if(i==0&&j==0){

                }else if(i==0){
                    a[i][j] = a[i][j-1] + a[i][j];
                }else if(j==0){
                    a[i][j] = a[i-1][j] + a[i][j];
                }else{
                    a[i][j] = Math.min(a[i-1][j],a[i][j-1]) + a[i][j];
                }
            }
        }

        System.out.println("输出结果：");
        for (int i = 0; i< N; i++){
            for (int j=0;j<m;j++){
                System.out.print(String.format("%6d",a[i][j]));
            }
            System.out.println();
        }
    }
}
