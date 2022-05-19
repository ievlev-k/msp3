import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class AreaTest {
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
        assertEquals("yes", result.getAnswer());

    }
//
//    @Test
//    public void checkRectangle(){
//        result.setR(10);
//        for (int i = -10; i < 0; i+=0.5) {
//            for (int j = -5; j < 0; j+=0.5) {
//                result.setX(i);
//                result.setY(j);
//                result.checkHit();
//                assertEquals("yes", result.getAnswer());
//            }
//        }
//    }
//
//    @Test
//    public void checkTriangle(){
//        result.setR(10);
//        for (int i = 0; i < 10; i+=1) {
//            for (int j = 0; j < 50; j+=0.5) {
//                result.setY(j);
//                result.setX(i);
//                result.checkHit();
//                assertEquals(result.getPoint(), (i>= 0 && j >= 0 && 10 >= j + 2*i));
//            }
//        }
//    }
//
//    @Test
//    public void checkCircle(){
//        result.setR(10);
//        for (int i = 0; i < 50; i+=1) {
//            for (int j = -100; j < 0; j+=1) {
//                result.setY(j);
//                result.setX(i);
//                result.checkHit();
//                assertEquals(result.getPoint(), (i>=0 && j <= 0 && (i*i + j*j <= 10*10/4)));
//            }
//        }
//    }
//
//    @Test
//    public void underArea(){
//        result.setR(10);
//        result.setX(100);
//        result.setY(200);
//        assertEquals("no", result.getAnswer());
//    }

}
