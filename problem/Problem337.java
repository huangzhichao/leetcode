public class Problem337 {
    public static int[] a;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(1);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.left.left = new TreeNode(3);
        System.out.println(rob(treeNode));
    }

    public static int rob(TreeNode root) {
        a = new int[1000];
        search(0,root);
        a[1] = Math.max(a[0],a[1]);
        for (int i=2;i<1000;i++){
            if(a[i]+a[i-2]>a[i-1]){
                a[i] = a[i]+a[i-2];
            }else{
                a[i] = a[i-1];
            }
        }
        Print.print(a);
        return a[999];
    }

    private static void search(int curr,TreeNode node){

        if(node != null) {
            a[curr] += node.val;
            search(curr + 1, node.left);
            search(curr + 1, node.right);
        }
    }
}
