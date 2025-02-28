public class BinaryTree {
    static int maxDiameter = 0;

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    // Base case: height of null node is 0
    private int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        if (leftHeight == -1) return -1;

        int rightHeight = height(node.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1; // If the height difference is greater than 1, the tree is unbalanced.
        return Math.max(leftHeight, rightHeight) + 1;  // Each node adds a level to the height. Without +1, we would ignore the current node’s contribution to the total height.
    }

    //Problem 2: Diameter of a Binary Tree
    public static int diameterOfBinaryTree(TreeNode root) {
        height2(root);
        return maxDiameter;
    }

    public static int height2(TreeNode node) {

        if (node == null) return 0;

        int leftHeight1 = height2(node.left);
        int rightHeight1 = height2(node.right);

        maxDiameter = Math.max(maxDiameter, leftHeight1 + rightHeight1);
        return Math.max(leftHeight1, rightHeight1) + 1;
    }

    //Problem 3: Check if Two Binary Trees are the Same
    public static boolean areTwoTreesSame(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.value != q.value) return false;

        return areTwoTreesSame(p.left, q.left) && areTwoTreesSame(p.right, q.right);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        //input 1
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(binaryTree.isBalanced(root));

        //input 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(2);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(3);
        root2.left.left.left = new TreeNode(4);
        root2.left.left.right = new TreeNode(4);
        System.out.println(binaryTree.isBalanced(root2));

        //input 3
        TreeNode root3 = null;
        System.out.println(binaryTree.isBalanced(root3));

        //Problem 2
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(3);
        root4.right.left = new TreeNode(4);
        root4.right.right = new TreeNode(5);
        System.out.println("Diameter of the binary tree is " + diameterOfBinaryTree(root4));

        //Problem 3
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println("are two trees same: " + areTwoTreesSame(p, q));

        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);

        TreeNode q1 = new TreeNode(1);
        q1.right = new TreeNode(3);
        System.out.println("are two trees same: " + areTwoTreesSame(p1, q1));

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);
        p2.right = new TreeNode(1);

        TreeNode q2 = new TreeNode(1);
        q2.left = new TreeNode(1);
        q2.right = new TreeNode(2);
        System.out.println("are two trees same: " + areTwoTreesSame(p2, q2));


    }
}
