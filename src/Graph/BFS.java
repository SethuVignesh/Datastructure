package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    Graph G;
    boolean[] marked;

    BFS(Graph G){
        this.G=G;
        marked= new boolean[G.getAdjList().length];
    }

    void bfs(int start){
        bfs(G,start);
    }
    void bfs(Graph G,int start){

        Queue<Integer> q= new LinkedList<>();

        q.add(start);

        while (!q.isEmpty()){

            int v=q.remove();
            marked[v]=true;
            System.out.print(" "+v);
            for(int w:G.getAdjList(v)){
                if(!marked[w])
                 q.add(w);
            }
        }

    }
}
