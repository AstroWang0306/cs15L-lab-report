import static org.junit.Assert.*;
import org.junit.*;

public class LabReport2Test{
    @Test
    public void production(){
        assertEquals(3, LabReport2.product(3,4));
    }
}