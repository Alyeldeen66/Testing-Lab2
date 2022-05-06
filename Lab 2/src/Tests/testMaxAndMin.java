import static org.junit.Assert.*;
import org.junit.Test;

public class testMaxAndMin {
    @Test
    public void test1(){
        MaxAndMin object = new MaxAndMin();
        int [] arr = {8,64,27,83,46,27,4};
        assertEquals(83,object.getMax(arr));
        assertEquals(4,object.getMin(arr));
    }
    @Test
    public void test2(){
        MaxAndMin object = new MaxAndMin();
        int [] arr = {5};
        assertEquals(5,object.getMax(arr));
        assertEquals(5,object.getMin(arr));
    }
    @Test
    public void test3(){
        MaxAndMin object = new MaxAndMin();
        int [] arr = {77,78};
        assertEquals(78,object.getMax(arr));
        assertEquals(77,object.getMin(arr));
    }
    @Test
    public void test4(){
        MaxAndMin object = new MaxAndMin();
        int [] arr = {-41,-65,-77,-23,-37,-17,-10};
        assertEquals(-10,object.getMax(arr));
        assertEquals(-77,object.getMin(arr));
    }
    @Test
    public void test5(){
        MaxAndMin object = new MaxAndMin();
        int [] arr = {8,64,27,83,46,27,-10};
        assertEquals(83,object.getMax(arr));
        assertEquals(-10,object.getMin(arr));
    }
}
