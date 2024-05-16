
class TreeNode2 {
    int data;
    TreeNode2 left, right;

    public TreeNode2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class q7 {
    TreeNode2 root;

    public TreeNode2 deleteNode(TreeNode2 root, int key) {
        if (root == null)
            return null;

        if (key < root.data)
            root.left = deleteNode(root.left, key);
        else if (key > root.data)
            root.right = deleteNode(root.right, key);
        else {
            // Case 1 & 2: Node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: Node with two children
            root.data = minValue(root.right);
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    int minValue(TreeNode2 root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }

    void inorderTraversal(TreeNode2 root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        q7 tree = new q7();
        tree.root = new TreeNode2(50);
        tree.root.left = new TreeNode2(30);
        tree.root.right = new TreeNode2(70);
        tree.root.left.left = new TreeNode2(20);
        tree.root.left.right = new TreeNode2(40);
        tree.root.right.left = new TreeNode2(60);
        tree.root.right.right = new TreeNode2(80);

        System.out.println("Inorder traversal before deletion:");
        tree.inorderTraversal(tree.root);

        int key = 30;
        tree.root = tree.deleteNode(tree.root, key);

        System.out.println("\nInorder traversal after deletion of " + key + ":");
        tree.inorderTraversal(tree.root);
    }
}