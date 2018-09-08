import java.util.Arrays;

public class ArraysAndStrings {



    /*
     Rotate Matrix
     */

    public static void RotateMatrix(byte[][] image){
        System.out.println("Running Rotate Matrix : 1.6");



    }


    public void Print2DMatrix(byte [][] matrix) {

    }

    /*
        String comparison
    */
    public static String StringComparison(String str){
        System.out.println("Running String Comparison : 1.6");
        char [] strToChar = str.toCharArray();

        int count = 0;
        String finalStr = "";

        for(int i =0 ; i < strToChar.length -1 ; i++){
            if (strToChar[i] == strToChar[i+1]){
                count++;
            }else{
                finalStr += strToChar[i-1] + count;
                count = 0;
            }
        }

        return finalStr;
    }
    /*
        One away
    */
    public static boolean  OneAway(String str , String str2){
        System.out.println("Running One Way : 1.5");
        //check if strings are equal

        //if one string is lower than the other in length check if the big one contains the low one and if it don

        if (str.equals(str2)) {
            return true;
        }

        int strLen = str.length();
        int str2Len = str2.length();

        if (strLen < str2Len){

            if (str2.contains(str)){

                if((str2Len - strLen) <= 1 ){
                    return true;
                }

                return false;
            }else {
                return false;
            }
        }else{

            if (str.contains(str2)){

                if((strLen - str2Len) <= 1 ){
                    return true;
                }

                return false;

            }else{
                return false;

            }
        }

    }

    /*
       Palindrome Permutation
    */
    public static void PalindromePermutation(String str){

    }
    /*
       Given a string check if all the chars are unique
     */
    public static boolean IsUnique(String s){
        //this assumes the characters are ascii
        System.out.println("Running IsUnique : 1.1");
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

        System.out.println("Running CheckPermutations : 1.2");
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
