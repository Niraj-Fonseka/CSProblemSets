public class Main {

    public static void main(String[] args) {

        System.out.println("Starting the CS ProblemSets Project");
      //  ArraysAndStrings();
        TreesAndGraphs();

    }

    public static void TreesAndGraphs(){
        Graph graphDFS = TreesAndGraphs.CreateGraph(5);
        graphDFS.addEdge(0,1);
        graphDFS.addEdge(0,2 );
        graphDFS.addEdge(2,4);
        graphDFS.addEdge(4,2);
        graphDFS.addEdge(1,2);
        graphDFS.printGraph();
        graphDFS.DFS(4,5);


        Graph graphBFS = TreesAndGraphs.CreateGraph(10);
        graphBFS.addEdge(0,1);
        graphBFS.addEdge(1,2 );
        graphBFS.addEdge(2,3);
        graphBFS.addEdge(3,4);
        graphBFS.addEdge(3,5);
        graphBFS.addEdge(3,6);
        graphBFS.addEdge(5,7);
        graphBFS.addEdge(5,8);
        graphBFS.addEdge(6,9);
        graphBFS.printGraph();
        graphBFS.BFS(0,10 , 11);
    }



    public  static void ArraysAndStrings(){
        String str = "Help";
        boolean bool = ArraysAndStrings.IsUnique(str);
        System.out.println(bool);
        System.out.println();


        String perm1 = "Hello";
        String perm2 = "hEllo";
        boolean isPerm = ArraysAndStrings.chekPermutations(perm1,perm2);
        System.out.println(isPerm);
        System.out.println();


        String url = "Mr John Smith";
        String urlFyed = ArraysAndStrings.URLify(url,12);
        System.out.println(urlFyed);
        System.out.println();


        String output = ArraysAndStrings.StringComparison("aabcccca");
        System.out.println(output);

        int[][] ImageMatrix = new int[][]{
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };
        ArraysAndStrings.RotateMatrix(ImageMatrix);


        int[][] zeroMatrix = new int[][]{
                { 1, 2, 3 , 4},
                { 5, 6, 7 , 0 },
                { 9, 10, 11,12}
        };
        ArraysAndStrings.ZeroMatrix(zeroMatrix);
    }
}
