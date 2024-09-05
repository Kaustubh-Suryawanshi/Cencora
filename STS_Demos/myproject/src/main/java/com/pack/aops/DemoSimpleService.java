package com.pack.aops;

public class DemoSimpleService {
	
	private String sname;
    private int sid;
    public String getSName() {
        return sname;
    } 
    public void setSName(String sname) {
        this.sname = sname;
    }
    public int getSId() {
        return sid;
    }
    public void setSId(int sid) {
        this.sid = sid;
    }
    public void printSNameId() {
        System.out.println("DemoSimpleService : Method printSNameId() : My full name is " + sname + " and my sid is " + sid);
    }
    public void checkSName() {
        if (sname.length() < 20) {
            throw new IllegalArgumentException();
        }
    }
    public void Test(String message){
        System.out.println("DemoSimpleService : Method Test() : Testing! " + message);
    }


}
