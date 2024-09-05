package com.collectionprac;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> booked = new LinkedList<>();
        Queue<String> waiting = new LinkedList<>();

        waiting.offer("shyam");
        waiting.offer("iqehdgbqj");
        waiting.offer("hdfjgda");
        waiting.offer("ahdg");

        Queue<String> cancelled = new LinkedList<>();
        boolean choice=true;
        do {
            System.out.println("choose:\n 1.book\n 2.cancel");
            int ch;
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.println("Enter name:");
                String name = sc.next();
                booked.add(name);
                System.out.println("\n"+booked);
            } else {
                System.out.println("Enter name:");
                String name = sc.next();
                int index = booked.indexOf(name);
                booked.remove(name);
                cancelled.offer(name);
                booked.add(index, waiting.poll());
                System.out.println("\n"+cancelled);
            }
            System.out.println("\n\nwant to continue\n 1.yes\n 2.no");
            int ch2=sc.nextInt();
            if(ch2==2) choice=false;
        }while(choice);

        System.out.println("Finals Lists:\n");
        System.out.println(booked);
        System.out.println(cancelled);
        System.out.println(waiting);
    }
}
