package Graph;

import java.util.LinkedList;

public class UndirectedGraph implements Graph {

    LinkedList[] adjList;
    int vertices;
    int edges;

    UndirectedGraph(int vertices){
        adjList= new LinkedList[vertices];
        this.vertices=vertices;

        for(int i=0;i<adjList.length;i++){
            adjList[i]= new LinkedList();
        }
    }

    public void addEdge(int v, int w){
        adjList[v].add(w);
        adjList[w].add(v);
        edges++;
    }

    public LinkedList getAdjList(int v) {
        return adjList[v];
    }

    public LinkedList[] getAdjList() {
        return adjList;
    }
}