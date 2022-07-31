public class Problem1161 {

    public static void main(String[] args) {
        TreeNode case1 = new TreeNode(1, new TreeNode(7, new TreeNode(7), new TreeNode(-8)), new TreeNode(0));
        System.out.println(maxLevelSum(case1));
    }

    public static int maxLevelSum(TreeNode root) {
        long[] a = new long[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = Long.MIN_VALUE;
        }
        process(0, root, a);
        Print.print(a);
        long min = Long.MIN_VALUE;
        int result = -1;
        for (int i = 0; i < 1000; i++) {
            if (a[i] > min) {
                min = a[i];
                result = i + 1;
            }
        }
        return result;
    }

    public static void process(int c, TreeNode node, long[] a) {
        if (node == null) {
            return;
        }
        a[c] = a[c] == Long.MIN_VALUE ? node.val : a[c] + node.val;
        process(c + 1, node.left, a);
        process(c + 1, node.right, a);
    }
}
