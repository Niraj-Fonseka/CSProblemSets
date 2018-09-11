public class Main {

    public static void main(String[] args) {

        System.out.println("Starting the CS ProblemSets Project");
      //  ArraysAndStrings();
        TreesAndGraphs();

    }

    public static void TreesAndGraphs(){
        Graph graph = TreesAndGraphs.CreateGraph(3);

        graph.printGraph();
        //Testing Graph
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3 );

        graph.printGraph();
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
