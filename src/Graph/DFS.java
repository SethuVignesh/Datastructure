package Graph;

public class DFS {
    Graph G;
    boolean[] marked;

    DFS(Graph G){
        this.G=G;
        marked= new boolean[G.getAdjList().length];
    }
    void dfs(int start){
        DFSearch(G,start);
    }

    void DFSearch(Graph G,int start){
        marked[start]=true;
        System.out.print(" "+start);

        for(int w:G.getAdjList(start)){
            if(!marked[w]){
                DFSearch(G,w);
            }
        }
    }
}
