package validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    public static void main(String[] args) {
        System.out.println(Validate("Hello I am AdrianPolanco", "Adrian"));
    }

    public static boolean Validate(String expresion, String regex){
        //Creating the pattern
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        //Comparing the input to the pattern
        Matcher matcher = pattern.matcher(expresion);
        //Checking the result of the matching
        boolean match = matcher.find();

        return match;
    }
}
