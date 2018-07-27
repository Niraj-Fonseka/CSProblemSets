import java.util.Arrays;

public class ArraysAndStrings {



    /*
       Given a string check if all the chars are unique
     */
    public static boolean IsUnique(String s){
      //this assumes the characters are ascii
        System.out.println("Running IsUnique");
        if (s.length() > 128) {
            return false;
        }

        boolean [] char_set = new boolean[128];

                for(int i = 0 ; i < s.length() ; i++){
                    int val = s.charAt(i);
                            if (char_set[val]) {
                                return false;
                            }
                            char_set[val] = true;
                }

                return true;
    }


    /*
     Given two string check if the one string is a permutation of the other
     */
    public static boolean chekPermutations(String a , String b){

        System.out.println("Running CheckPermutations");
        String sorted_a = Sort(a.toLowerCase());
        String sorted_b = Sort(b.toLowerCase());


        if (sorted_a.length() != sorted_b.length()){
            return false;
        }else if (sorted_a.equals(sorted_b)){
            return  true;
        }

        return false;
    }


    public static String Sort( String a) {
        char [] charDump = a.toCharArray();
        Arrays.sort(charDump);

        return new  String(charDump);
    }


    /*
        Method to replace spaces with %20
     */

    public static String URLify(String a , int length){
        System.out.println("Running URLify");

        char [] strArr = a.toCharArray();
        StringBuilder sb = new StringBuilder();
                for(int i = 0 ; i < strArr.length ; i++){
                    if ((int)strArr[i] == 32) {
                        sb.append("%20");
                    }else {
                        sb.append(strArr[i]);
                    }
                }

                return sb.toString();
    }
}
