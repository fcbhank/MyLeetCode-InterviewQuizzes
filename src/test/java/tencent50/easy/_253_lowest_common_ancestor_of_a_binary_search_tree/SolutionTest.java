package tencent50.easy._253_lowest_common_ancestor_of_a_binary_search_tree;

import org.junit.jupiter.api.Test;

/**
 * @author blind_panther
 * @date 2019/11/1 下午1:21
 */
public class SolutionTest {
    private TreeNode node6;
    private TreeNode node2;
    private TreeNode node8;
    private TreeNode node0;
    private TreeNode node4;
    private TreeNode node7;
    private TreeNode node9;
    private TreeNode node3;
    private TreeNode node5;

    @Test
    public void test() {
        TreeNode root = initTree();
        Solution solution = new Solution();
        System.out.println(solution.lowestCommonAncestor(root, node2, node8).val);
        System.out.println(solution.lowestCommonAncestor(root, node2, node4).val);
    }


    public TreeNode initTree() {
        // 初始构造二叉树
        node6 = new TreeNode(6);
        node2 = new TreeNode(2);
        node8 = new TreeNode(8);
        node0 = new TreeNode(0);
        node4 = new TreeNode(4);
        node7 = new TreeNode(7);
        node9 = new TreeNode(9);
        node3 = new TreeNode(3);
        node5 = new TreeNode(5);

        node6.left = node2;
        node6.right = node8;

        node2.left = node0;
        node2.right = node4;

        node8.left = node7;
        node8.right = node9;

        node4.left = node3;
        node4.right = node5;

        return node6;
    }
}
