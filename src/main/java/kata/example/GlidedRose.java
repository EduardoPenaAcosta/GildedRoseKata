package kata.example;


import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class GlidedRose {

    protected Object add(String givenText){
        String delimiter = "[,:\\n]";
        ArrayList<String> negative_numbers = new ArrayList<String>();

        if(!givenText.isEmpty()){
            int result = 0;
            if(givenText.startsWith("//"))delimiter = "[" + givenText.charAt(2) + ":\n]";
            String[] splittedGivenInput = givenText.substring(4).split(delimiter);
            System.out.println(Arrays.toString(splittedGivenInput));
            System.out.println(delimiter);
            for(String splittedInput : splittedGivenInput){
                if(Pattern.matches(".*[a-zA-Z]+.*",splittedInput)) continue;
                if(!splittedInput.isEmpty() && parseInt(splittedInput) > 0){
                    result += parseInt(splittedInput);
                }else{
                    if(StringUtils.isNumeric(splittedInput) && parseInt(splittedInput) < 0) negative_numbers.add(splittedInput);
                }
            }
            if(!negative_numbers.isEmpty()) return "Negatives not allowed " + negative_numbers;
            return result;
        }

        return 0;
    }

    

}
