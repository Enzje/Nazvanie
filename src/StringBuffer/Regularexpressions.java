package StringBuffer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regularexpressions {
    public static void main(String[] args) {
        String string1 = "Hello";
        boolean boolean1 = Pattern.matches("Hello", string1);
        if (boolean1){
            System.out.println("Sofp");
        }
        else {
            System.out.println("ne sovp");
        }
        Pattern pattern = Pattern.compile("hello");
        Matcher matcher = pattern.matcher(string1);
        System.out.println(matcher);
        boolean found = matcher.matches();
        if (found){
            System.out.println("sofp");
        }
        else {
            System.out.println("ne sofp");
        }
    }


}
