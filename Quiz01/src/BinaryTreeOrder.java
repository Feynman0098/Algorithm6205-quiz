import java.util.ArrayList;
import java.util.List;

public class BinaryTreeOrder {

    public static List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public static void addToList(TreeNode node, int level) {
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

        levels.get(level).add(node.val);

        if (node.left != null)
            addToList(node.left, level + 1);
        if (node.right != null)
            addToList(node.right, level + 1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        addToList(root, 0);
        return levels;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        System.out.println(levelOrder(node1));

    }
}
