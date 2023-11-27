import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMinusNumbers {
    public SumTable testTable = new SumTable ();
    int [] table = {-1,-3,-5} ;

    @Test
    public void testTableResult(){
        Assertions.assertEquals(-9, testTable.sumArray(table));
    }


}
