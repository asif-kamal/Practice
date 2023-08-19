class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode temp;
            invertTree(root.left); // Invert left subtree
            invertTree(root.right); // Invert right subtree
            
            // Swap the inverted left and right subtrees
            temp = root.left;
            root.left = root.right;
            root.right = temp;
            
            return root; // Return the root of the modified tree
        }
    }

    public static void main(String[] args) {
        int[] binaryTree = {4,2,7,1,3,6,9};
        
    }
}
