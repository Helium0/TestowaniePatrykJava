import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class TestCountTextValue {
    public CountTextValue testText = new CountTextValue();

    HashMap<String,Integer> testMap =  new HashMap<>();
    public String test (String text){
        testMap.put("Ala ma kota, kota ma Ala", 1);
        return "Ala ma kota, kota ma Ala";
    }



    @Test
    public void testTextResult(){
        Assertions.assertEquals("Ala ma kota, kota ma Ala ", testText.countTextMethod(test("Ala ma kota, kota ma Ala")));
    }

}
