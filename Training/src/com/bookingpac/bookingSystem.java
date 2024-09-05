package com.bookingpac;


import java.util.Scanner;

interface Booking{
    public void bookTicket();
    public void invoice();
}

abstract class  User{
    abstract public void getDetails();
}

class RailwayBook implements Booking{
    Scanner sc=new Scanner(System.in);
    public void bookTicket() {
        System.out.println("Select the trains form below list: 1) deccan express\n 2) Rajdhani express");
        int ch= sc.nextInt();
        switch(ch)
        {
            case 1:

            case 2:

        }
    }

    @Override
    public void invoice() {

    }
}

class FlightBook implements Booking{

    @Override
    public void bookTicket() {

    }

    @Override
    public void invoice() {

    }
}

public class bookingSystem {
}
