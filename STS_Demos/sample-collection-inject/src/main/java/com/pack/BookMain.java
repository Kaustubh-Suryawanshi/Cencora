package com.pack;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.model.BookCollection;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext contct= new ClassPathXmlApplicationContext("collection.xml");
		BookCollection bkcoll= (BookCollection) contct.getBean("bookcollection");
		System.out.println("---access list---");        
		List<String> list=bkcoll.getMyList();
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//access set
		System.out.println("---access set---");
		Set<String> set=bkcoll.getMySet();
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		//access map
		System.out.println("---access map---");
		Map<Integer,String> map=bkcoll.getMyMap();
		System.out.println(map.get(0));
		System.out.println(map.get(1));
		//access properties
		System.out.println("---access properties---");
		Properties prop=bkcoll.getMyProp();
		System.out.println(prop.getProperty("propKeyA"));
		System.out.println(prop.getProperty("propKeyB"));        
		//Access Book List
		System.out.println("---Access Book List---");
		System.out.println(bkcoll.getBookList().get(0).getBookName());
		System.out.println(bkcoll.getBookList().get(1).getBookName());
		((AbstractApplicationContext) contct).close();

	}

}
