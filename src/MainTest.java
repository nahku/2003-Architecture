import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MainTest {
    @Test
    public void handle_special_case_true() throws Exception{
        ArrayList<Double> results=new ArrayList<Double>();
        results.add(1.0);
        results.add(1.0);
        results.add(2.0);
        results.add(2.0);
        Double[] unique_array = {1.0,2.0};
        assertTrue(Main.handle_special_case(results, unique_array));
    }

    @Test
    public void handle_special_case_false() throws Exception{
        ArrayList<Double> results=new ArrayList<Double>();
        results.add(1.0);
        results.add(1.0);
        results.add(1.0);
        results.add(2.0);
        Double[] unique_array = {1.0,2.0};
        assertFalse(Main.handle_special_case(results, unique_array));
    }

}

