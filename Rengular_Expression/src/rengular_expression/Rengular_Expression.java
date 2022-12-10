
package rengular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Rengular_Expression {

   
    public static void main(String[] args) {
       String toBeSearched = "1abjhc50245";
       String patternToSearched = "[0-9,a-z, A-Z]+";
       boolean found;
       
       // using two classes
       Pattern pattern = Pattern.compile(patternToSearched);
       Matcher matcher = pattern.matcher(toBeSearched);
       
       found = matcher.matches();
       System.out.println("found = " + found);
       
        
    }
    
}
