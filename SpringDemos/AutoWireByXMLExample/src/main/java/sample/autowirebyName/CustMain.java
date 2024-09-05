package sample.autowirebyName;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.autowirebyName.model.Customer;

public class CustMain {
    public static void main(String[] args) {
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        Object bean= context.getBean("customer");
        System.out.println((Customer) bean);
    }

}
