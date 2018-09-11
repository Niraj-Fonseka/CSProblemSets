import java.util.ArrayList;
import java.util.LinkedList;

public class TreesAndGraphs{

    public static Graph CreateGraph(int vertices){
        return new Graph(vertices);
    }


}



class Graph {

    //Number of vertices
    private int Vertices;
    //Adjacency Matrix
    private LinkedList<Integer> adjList[];

    public Graph(int numVertices){
        this.Vertices = numVertices;
        this.adjList = new LinkedList[numVertices];

        for(int i = 0 ; i < Vertices ;i++){
            adjList[i] = new LinkedList();
        }
    }


    void addEdge(int v , int w) {
        adjList[v].add(w);
    }
    
     void printGraph(){
        System.out.println("Printing Graph : ");
        for(int i = 0 ; i < this.Vertices ; i++) {
            System.out.printf("Vertex : %d \n", i);
            for (Integer adjListNode : this.adjList[i]) {
                System.out.printf("%d -> %d \n" , i , adjListNode);
            }
        }
         System.out.println("Ending Printing of the Graph\n\n");
    }
}