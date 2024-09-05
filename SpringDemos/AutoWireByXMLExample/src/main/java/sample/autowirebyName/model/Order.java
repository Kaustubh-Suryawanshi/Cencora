package sample.autowirebyName.model;

public class Order {
    private int orderid;
    private String orderDetails;
    private int qty;

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderid=" + orderid +
                ", orderDetails='" + orderDetails + '\'' +
                ", qty=" + qty +
                '}';
    }
}
