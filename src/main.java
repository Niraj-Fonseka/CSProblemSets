public class Main {

    public static void main(String[] args) {

        System.out.println("Starting the CS ProblemSets Project");
        ArraysAndStrings();


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

        byte[][] ImageMatrix = new byte[][]{
                { 0, 0, 0},
                { 0, 0, 0}
        };
       ArraysAndStrings.RotateMatrix(ImageMatrix);
    }
}
