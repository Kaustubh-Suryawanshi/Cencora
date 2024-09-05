package com.pack;

import com.pack.complexexample.Invoice;
import com.pack.myexample.Greet;
import com.pack.myexample.ObjExample;
import com.pack.myexample.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        /*ApplicationContext context=new ClassPathXmlApplicationContext("tp.xml");
        Greet obj=(Greet) context.getBean("demo1");
        System.out.println(obj.getMsg());

        ObjExample obj= (ObjExample) context.getBean("demo2");
        obj.display();

        Student st= (Student) context.getBean("demo3");
        st.display();*/

        ApplicationContext context2=new ClassPathXmlApplicationContext("producteg.xml");
        Invoice obj= (Invoice) context2.getBean("productD");
        obj.get_item_details();




    }

}