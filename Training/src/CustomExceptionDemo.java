class invalidIpAddress extends Exception{

    invalidIpAddress(String msg)
    {
        super(msg);
    }
    public static void compareIP(String ip) throws invalidIpAddress {
        if(ip != "192.203.37.0") throw  new invalidIpAddress("Wrong IP ");
        else System.out.println("Connected");
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            invalidIpAddress.compareIP("123.45.78");

        }catch (invalidIpAddress e){
            System.out.println("Provide ip address as 192.203.37.0");
            e.printStackTrace();
        }
    }
}
