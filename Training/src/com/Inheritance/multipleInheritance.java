package com.Inheritance;

interface flyobj{
    public void fly();
}
interface flyvehical{
    public void wings();
}


class Aeroplane implements flyobj,flyvehical{

    @Override
    public void fly() {
        System.out.println("can fly");
    }

    @Override
    public void wings() {
        System.out.println("Has wings");
    }
}

public class multipleInheritance {
    public static void main(String[] args) {
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.fly();
        aeroplane.wings();
    }
}
