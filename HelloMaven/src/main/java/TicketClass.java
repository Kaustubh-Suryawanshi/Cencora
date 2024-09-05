import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


class Ticket{
    int id;
    String name;
    double price;

    public Ticket() {
    }

    public Ticket(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class TicketClass {
    public static List<Ticket> getTickets(){
        List<Ticket> list = new ArrayList<>();

        list.add( new Ticket(1,"sam",123.56));
        list.add( new Ticket(2,"ram",323.56));
        list.add( new Ticket(3,"kam",13.56));


        List<Ticket> startwithM= list.stream().filter(s ->s.name.startsWith("m")).collect(Collectors.toList());
        return startwithM;
    }
}
