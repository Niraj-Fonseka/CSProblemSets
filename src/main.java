import java.lang.reflect.Array;

public class main {

    public static void main (String [] args){
        System.out.println("Starting the CS ProblemSets Project");

        String str = "Help";
        System.out.printf("String to check %s \n" , str);
        boolean bool = ArraysAndStrings.IsUnique(str);
        System.out.println(bool);
    }
}
