package kata.example;

import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class GlidedRose {

    protected int add(String givenText){

        if(!givenText.isEmpty()){
            int result = 0;
            String[] splittedGivenInput = givenText.split("[,:\\n]");
            for(String slittedInput : splittedGivenInput){

                if(Pattern.matches(".*[a-zA-Z]+.*",slittedInput)) continue;
                if(!slittedInput.isEmpty()) result += parseInt(slittedInput);
            }
            return result;
        }

        return 0;
    }

}
