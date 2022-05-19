import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class PointTest {
    private Result result;

    @Before
    public void init(){
        result = new Result();
    }

    @After
    public void resetPoint() {
        result = null;
    }

    @Test
    public void test1(){
        result.setR(2);
        result.setX(0);
        result.setY(1);
        result.checkHit();
        assertEquals("yes", "ye");

    }

}
