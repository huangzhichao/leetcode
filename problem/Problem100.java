public class Problem100 {
    public static boolean isSame = true;

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(1);
        treeNode.left.left = new TreeNode(2);
        treeNode.left.left.left = new TreeNode(3);
        System.out.println(isSameTree(treeNode,treeNode));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        isSame = true;
        search(p,q);
        return isSame;
    }

    private static void search(TreeNode p, TreeNode q){
        if(p==null && q==null){

        }else if(p==null || q==null){
            isSame = false;
        }else{
            if(p.val == q.val){
                search(p.left,q.left);
                search(p.right,q.right);
            }else{
                isSame = false;
            }
        }

    }
}
