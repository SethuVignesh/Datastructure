package Trees;

public class Test {
    public static void main(String args[])
    {
        Tree tree = new Tree();
        tree.root= new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4)) ;
        tree.root.getLeft().setRight(new Node(5)) ;

        System.out.println("DFS of binary tree is ");
        DFS dfs= new DFS();
        dfs.preOrder(tree.root);
        System.out.println("");
        dfs.inOrder(tree.root);
        System.out.println("");
        dfs.postOrder(tree.root);
        System.out.println("");

        System.out.println("BFS of binary tree is ");
        BFS bfs= new BFS();
        System.out.println("Iterative ");
        bfs.levelOrderIterative(tree.root);
        System.out.println("");
        System.out.println("Recursive ");
        bfs.levelOrderRecursive(tree.root);
    }
}
