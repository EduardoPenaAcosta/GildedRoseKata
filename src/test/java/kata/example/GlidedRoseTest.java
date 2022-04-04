package kata.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlidedRoseTest {

    GlidedRose gr = new GlidedRose();

    @Test
    public void ifTextIsEmpty(){
       assertEquals(0, gr.add(""));
    }

    @Test
    public void ifDetectsANumber(){
        assertEquals(1, gr.add("1"));
    }

    @Test
    public void sumArrayNumbers(){
        assertEquals(2, gr.add("1,1"));
    }

    @Test
    public void sumArrayNumbersWithLetters(){
        assertEquals(7, gr.add("1,2,a,4"));
    }

    @Test
    public void sumArrayNumbersWithLettersAndSpacers(){
        assertEquals(7, gr.add("1,2,A,\n,4"));
    }
}
