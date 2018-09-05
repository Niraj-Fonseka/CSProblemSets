public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Starting the CS ProblemSets Project");

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

    }
}
