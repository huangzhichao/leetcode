public class Problem48 {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        Print.print(matrix);
    }
    public static void rotate(int[][] matrix) {
        int n,m;
        if(matrix.length %2 ==1){
            n = matrix.length/2;
            m = matrix.length/2+1;
        }else{
            n = m = matrix.length/2;
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-j-1][i];
                matrix[matrix.length-j-1][i] = matrix[matrix.length-i-1][matrix.length-j-1];
                matrix[matrix.length-i-1][matrix.length-j-1] = matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1] = t;
            }
        }
    }
}
