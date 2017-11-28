package Graph;


import java.util.LinkedList;

public interface Graph {
   void  addEdge(int v,int w);
   LinkedList<Integer> getAdjList(int v);
   LinkedList<Integer>[] getAdjList();
}
