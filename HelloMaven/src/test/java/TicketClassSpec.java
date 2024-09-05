import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TicketClassSpec {

    @BeforeEach
    public  void setUp()
    {
    }

    @Test
    public void checkIfListEmpty()
    {
        List<Ticket> t=TicketClass.getTickets();
        assertTrue(t.isEmpty(),"List is not empty");
    }
}
