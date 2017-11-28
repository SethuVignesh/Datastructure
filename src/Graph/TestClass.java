package Graph;

public class TestClass {
    public static void main(String[] args) {
        Graph graph= new UndirectedGraph(10);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
//        graph.addEdge(3,9);
//        graph.addEdge(4,1);
//        graph.addEdge(5,2);
//        graph.addEdge(6,3);
//        graph.addEdge(7,3);
//        graph.addEdge(6,8);
//        graph.addEdge(0,1);


//        DFS dfs= new DFS(graph);
//        dfs.dfs(1);

        BFS bfs= new BFS(graph);
        bfs.bfs(1);
    }
}
