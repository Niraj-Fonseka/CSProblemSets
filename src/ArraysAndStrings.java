import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndStrings {


     /*
        Zero Matrix
     */
    public static void ZeroMatrix(int [][]zeroMatrix){
        System.out.println("Running Zero Matrix ");
        boolean [] zeroRows = new boolean[zeroMatrix.length];
        boolean [] zeroCols = new boolean[zeroMatrix[0].length];

        int value;
        Print2DMatrix(zeroMatrix);
        
        ArrayList<Integer> indexesToSkip = new ArrayList<Integer>();
        for(int i = 0 ; i < zeroMatrix.length ; i++){
            for(int k = 0 ; k < zeroMatrix[0].length; k++){
                    value = zeroMatrix[i][k];
                    if (value == 0) {
                        zeroRows[i] = true;
                        zeroCols[k] = true;
                    }
            }
        }

        //Zero Rows
        for (int zeroRow = 0 ; zeroRow < zeroRows.length ; zeroRow++){
            if (zeroRows[zeroRow]) {
                for (int k = 0 ; k < zeroMatrix[0].length ; k++) {
                    zeroMatrix[zeroRow][k] = 0;
                }
            }
        }

        //Zero Cols
        for (int zeroCol = 0 ; zeroCol < zeroCols.length ; zeroCol++){
            if (zeroCols[zeroCol]) {
                for (int k = 0 ; k < zeroMatrix.length ; k++) {
                    zeroMatrix[k][zeroCol] = 0;
                }
            }
        }


        Print2DMatrix(zeroMatrix);

    }


    /*
     Rotate Matrix
     */

    public static void RotateMatrix(int[][] imageMatrix) {
        System.out.println("Running Rotate Matrix : 1.6");
        Print2DMatrix(imageMatrix);

        int[][] rotatedMatrix = new int[imageMatrix.length][imageMatrix.length];
        int valueToRotate;
        for (int i = 0; i < imageMatrix.length; i++) {
            for (int k = 0; k < imageMatrix.length; k++) {
                valueToRotate = imageMatrix[i][k];
                rotatedMatrix[k][(imageMatrix.length - 1) - i] = valueToRotate;
            }
        }
        System.out.println();
        Print2DMatrix(rotatedMatrix);

    }

    public static void Print2DMatrix(int [][] imageMatrix) {

        for (int row = 0 ; row < imageMatrix.length ;row++) {
            for(int col = 0; col < (imageMatrix[0]).length ; col++) {
                System.out.print(imageMatrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
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
