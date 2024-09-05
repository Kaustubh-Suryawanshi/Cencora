package com.pack.model;

import java.util.*;

public class BookCollection {
	private List<String> myList;
	private Set<String> mySet;
	private Map<Integer,String> myMap;	
	private Properties myProp;	
	private List<Book> bookList;
	public BookCollection()
	{
		
		
	}
	
	public BookCollection(List<String> myList, Set<String> mySet, Map<Integer, String> myMap, Properties myProp,
			List<Book> bookList) {
		super();
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.myProp = myProp;
		this.bookList = bookList;
	}
	public List<String> getMyList() {
		return myList;
	}
	public void setMyList(List<String> myList) {
		this.myList = myList;
	}
	public Set<String> getMySet() {
		return mySet;
	}
	public void setMySet(Set<String> mySet) {
		this.mySet = mySet;
	}
	public Map<Integer, String> getMyMap() {
		return myMap;
	}
	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}
	public Properties getMyProp() {
		return myProp;
	}
	public void setMyProp(Properties myProp) {
		this.myProp = myProp;
	}
	public List<Book> getBookList() {
		return bookList;
	}
	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}