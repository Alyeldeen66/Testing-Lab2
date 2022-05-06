
import static org.junit.Assert.*;
import org.junit.Test;

public class testEvenOrOdd {
    @Test
   public void successfulEven(){
        EvenOrOdd object = new EvenOrOdd();
        assertEquals("Even",object.check(10));
    }
    @Test
    public void successfulEven2(){
        EvenOrOdd object = new EvenOrOdd();
        assertEquals("Even",object.check(2));
    }
    @Test
    public void successfulOdd(){
        EvenOrOdd object = new EvenOrOdd();
        assertEquals("Odd",object.check(1));
    }
    @Test
    public void successfulOdd2(){
        EvenOrOdd object = new EvenOrOdd();
        assertEquals("Odd",object.check(11));
    }
    @Test(expected = IllegalArgumentException.class)
    public void successfulNegativeNumber(){
        EvenOrOdd object = new EvenOrOdd();
        object.check(-10);
    }
    @Test
    public void successfulZero(){
        EvenOrOdd object = new EvenOrOdd();
        assertEquals("Even",object.check(0));
    }
}
