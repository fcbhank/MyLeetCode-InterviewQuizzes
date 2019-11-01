package tencent50.easy._104_maximum_depth_of_binary_tree;

import org.junit.jupiter.api.Test;
import tencent50.easy._104_maximum_depth_of_binary_tree.Solution;
import tencent50.easy._104_maximum_depth_of_binary_tree.TreeNode;

public class SolutionTest {
    @Test
    public void test() {
        TreeNode node3 = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        node3.left = node9;
        node3.right = node20;

        node9.left = null;
        node9.right = null;
        node20.left = node15;
        node20.right = node7;

        node15.left = null;
        node15.right = null;
        node7.left = null;
        node7.right = null;

        System.out.println(new Solution().maxDepth(node3));

    }
}
