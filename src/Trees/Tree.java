package Trees;

public class Tree {
    Node root;

    public int height(Node root) {

        if (root == null) return 0;

        if (isLeaf(root)) return 1;

        int left = height(root.getLeft());
        int right = height(root.getRight());


        return 1 + maxOf(left, right);

    }

    public int maxOf(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public boolean isLeaf(Node root) {
        if (root.getLeft() == null && root.getRight() == null) return true;

        return false;
    }

    public void printLevel(Node root, int level) {

        if (root == null) return;

        if (level == 1) {
            System.out.print(root.getData()+" ");
        } else if (level > 1) {
            printLevel(root.getLeft(), level - 1);
            printLevel(root.getRight(), level - 1);

        }
    }
}
