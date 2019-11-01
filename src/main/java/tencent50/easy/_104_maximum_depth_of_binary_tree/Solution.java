package tencent50.easy._104_maximum_depth_of_binary_tree;

class Solution {
    public int maxDepth(TreeNode root) {
        int currentDepth = 0;
        if (root == null)
            return currentDepth;
        currentDepth = 1;
        return leftRightMax(root, currentDepth);
    }

    /**
     * 二叉树两边的最大深度即为根节点深度
     * @param node 当前节点
     * @param currentDepth 当前深度
     * @return 左右子树较大的深度
     */
    public int leftRightMax(TreeNode node, int currentDepth) {
        if (node.left == null && node.right == null)
            return currentDepth;
        else {
            currentDepth++;
            if (node.left != null && node.right == null) {
                return leftRightMax(node.left, currentDepth);
            } else if (node.left == null) {
                return leftRightMax(node.right, currentDepth);
            }
            return Math.max(leftRightMax(node.left, currentDepth), leftRightMax(node.right, currentDepth));
        }
    }
}
