package sample.autowirebyName.model;

public class Customer {
    private int custid;
    private String name;
    private Order order1;

    public int getCustid() {
        return custid;
    }

    public void setCustid(int custid) {
        this.custid = custid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Order getOrder1() {
        return order1;
    }

    public void setOrder1(Order order1) {
        this.order1 = order1;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custid=" + custid +
                ", name='" + name + '\'' +
                ", order1=" + order1 +
                '}';
    }
}
