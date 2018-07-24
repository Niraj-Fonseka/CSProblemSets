public class ArraysAndStrings {



    /*
       Given a string check if all the chars are unique
     */
    public static boolean IsUnique(String s){
      //this assumes the characters are ascii

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

    }

}
