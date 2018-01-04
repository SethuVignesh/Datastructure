package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    private Queue<Node> queue = new LinkedList<Node>();

    public void levelOrderIterative(Node root) {
        if (root == null) return;

        queue.add(root);

        while (queue.isEmpty() == false) {

            Node temp = queue.poll();

            System.out.print(temp.getData() + "--");

            if (temp.getLeft() != null) queue.add(temp.getLeft());
            if (temp.getRight() != null) queue.add(temp.getRight());

        }
    }

    public void levelOrderRecursive(Node root) {
        Tree tree = new Tree();
        int height = tree.height(root);

        for (int i = 0; i < height; i++) {
            tree.printLevel(root, i + 1);
        }
    }


}
