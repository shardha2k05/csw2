

class TreeNode {
    int data;
    TreeNode left;
	TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class q5 {
    TreeNode root;

    public TreeNode createTree(int[] arr) {
        return createTree1(arr, 0, arr.length - 1);
    }

    private TreeNode createTree1(int[] arr, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);

        node.left = createTree1(arr, start, mid - 1);
        node.right = createTree1(arr, mid + 1, end);

        return node;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        q5 tree = new q5();
        tree.root = tree.createTree(arr);

        System.out.println("In-order traversal of the constructed BST:");
        tree.inOrderTraversal(tree.root);
    }
}
