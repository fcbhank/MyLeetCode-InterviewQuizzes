package tencent50.easy._253_lowest_common_ancestor_of_a_binary_search_tree;

/**
 * @author blind_panther
 * @date 2019/11/1 下午1:15
 */
public class Solution {
    // 递归法
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findPorQ(root, p, q);
    }

    /**
     * @param node 当前根结点
     * @param p
     * @param q
     * @return node 下如果能找到 p 就返回 p，能找到 q 就返回 q，如果都能找到就返回 node
     */
    private TreeNode findPorQ(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null) {
            return null;
        }
        if (node == p || node == q) {
            // 说明此时 p 或 q 为对方的父辈结点
            return node;
        }

        TreeNode left = findPorQ(node.left, p, q);
        TreeNode right = findPorQ(node.right, p, q);
        if (left != null && right != null) {
            return node;
        } else if (left == null && right != null) {
            return right;
        } else if (left != null) {
            return left;
        }
        return null;
    }
}
