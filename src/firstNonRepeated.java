import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class firstNonRepeated {

    public static String firstNonRepeated (String s){

        //hashmap stores characters of the string and number of occurrences
        Map<Character, Integer> chars = new LinkedHashMap<>();

        //going through the string to find number of occurrences of characters
        char [] arr = s.toCharArray();
        for (char i : arr){
            chars.put(i, chars.getOrDefault(i,0)+1);
        }

        //the first character to equal 1 is the first non-repeated character in the string
        for (Map.Entry<Character, Integer> e : chars.entrySet()) {
            if (e.getValue() == 1) {
                return "First non-repeated character: " + e.getKey().toString();
            }
        }
        //empty string returned if there is no non-repeated character in the string
        return "";
    }


    public static void main(String[] args) {//main method for testing the function
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter string: ");
            String s = in.next();
            System.out.println(firstNonRepeated(s));
            System.out.print("Continue? (y/n): ");
            String cont = in.next();
            if (Objects.equals(cont, "y")){
                continue;
            }
            else
                break;

        }
    }
}
