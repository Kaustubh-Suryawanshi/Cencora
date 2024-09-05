import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookSpec {
    @BeforeEach
    public void before(){
        System.out.println("before each taste case");

    }

    @Test
    public void bookEmptyorNot()
    {
        Books b=new Books();
        List<String> list=b.getBooks();
        assertTrue(list.isEmpty(),()->"books should be empty");
//        assertFalse(list.isEmpty(),()->"books should  be empty");
    }

    @AfterEach
    public void after()
    {
        System.out.println("aftre each test case");
    }
}
