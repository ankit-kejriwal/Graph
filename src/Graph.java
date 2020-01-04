import java.util.Iterator;
import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer>[] adj;

    Graph(int v){
        this.V = v;
        adj = new LinkedList[v];
        for (int i =0;i<adj.length;i++){
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v,int w){
        adj[v].add(w);
    }

    void BFS(int s){
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[s] =true;
        queue.add(s);
        while (queue.size() !=0){
            s = queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int temp = i.next();
                if(!visited[temp]){
                    visited[temp] = true;
                    queue.add(temp);
                }
            }
        }
    }
}

class Main{
    public static void main(String[] args){
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.BFS(2);
        System.out.println();
        g.BFS(1);
    }
}
