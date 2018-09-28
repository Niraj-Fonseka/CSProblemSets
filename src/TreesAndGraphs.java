import java.util.ArrayList;
import java.util.LinkedList;
import java.io.*;
import java.util.*;

public class TreesAndGraphs{

    public static Graph CreateGraph(int vertices){
        return new Graph(vertices);
    }


}


class Node {
    public string name;
    public Node[] children;
}

class Tree {
    public Node root;



    
}


/*
 class Graph without Node Class
 */
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

    //Bredth First search -----------------------------------------------------------------
    void BFS(int source , int numVertices , int find ){
        boolean visited[] = new boolean[numVertices];

        BFSHelper(source,visited, find);
    }

    private void BFSHelper(int source , boolean[]visited , int find){
        LinkedList<Integer> queqe = new LinkedList<Integer>();
        visited[source] = true;
        queqe.add(source);
        boolean found = false;
        while(queqe.size() != 0){
            //dequeue a vertex from the quque and print
            source = queqe.poll();

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adjList[source].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if (n == find) {
                    found = true;
                    break;
                }
                if (!visited[n]){
                    visited[n] = true;
                    queqe.add(n);
                }
            }
            if (found){
                break;
            }
        }
        if (!found){
            System.out.println("Node not found : " + find);
        }
    }

    // Depth first search -----------------------------------------------------------------
    void DFS(int source , int numVertices){
        boolean visited[] = new boolean[numVertices];

        DFShelper(source,visited);
    }


    // v = source
    private void DFShelper(int v , boolean [] visited){
        visited[v] = true;

        //Printing out the visisted list of nodes
        System.out.println(v + " " );
        //Creating a list iterator to iterate through the linked list
        Iterator<Integer> i = adjList[v].listIterator();
        while(i.hasNext()){

            //Extracting out each child for the node we are checking ( v -> v1 , v2 , v3 )
            int n = i.next();
            //If the node has not been marked as visited recurse over that
            if (!visited[n]){
                DFShelper(n , visited);
            }
        }
    }

    //---------------------------------------------------------------------------------------
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