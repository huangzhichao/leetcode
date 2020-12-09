public class Problem104 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);
        treeNode.left.left = new TreeNode(1);
        System.out.println(maxDepth(treeNode));
    }

    public static int maxDepth(TreeNode root) {
        return search(0,root);
    }

    private static int search(int curr,TreeNode node){
        if(node == null){
            return curr;
        }else{
            return Math.max(search(curr+1,node.left),search(curr+1,node.right));
        }
    }
}
