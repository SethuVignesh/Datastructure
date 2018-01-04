package Trees;

public class DFS {


    public void preOrder(Node root) {
        if (root == null) return;
        //sout
        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.getLeft());
        System.out.println(root.getData());
        inOrder(root.getRight());
    }

    public void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getData());
    }
}


