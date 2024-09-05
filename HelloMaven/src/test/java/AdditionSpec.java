import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AdditionSpec {
    @BeforeEach
    public void testBefore()
    {
        System.out.println("Setting Before");
    }

    @Test
    public void testaddition()
    {
        int r=AdditionDemo.add(2,8);
//        assert(10,r,"Success");
        assertEquals(10,r,"Success");
    }

    @Test
    public void testSub()
    {
        int r=AdditionDemo.sub(8,6);
//        assert(10,r,"Success");
        assertEquals(2,r);
    }

    @Test
    public void testmul()
    {
        int r=AdditionDemo.mul(2,8);
//        assert(10,r,"Success");
        assertEquals(16,r,"wrong");
    }



    @AfterEach
    public void testAfter(){
        System.out.println("setting after");
    }
}
