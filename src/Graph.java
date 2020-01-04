import java.util.LinkedList;

public class Graph {
    private int V;
    private LinkedList<Integer>[] adj;
    Graph(int v){
        this.V = v;
        adj = new LinkedList[v];
    }
}
