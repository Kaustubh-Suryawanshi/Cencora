package com.Innerclasses;

public class OuterClass {
     class inner{
        class innermost{
            public  int innermostvar=10;
        }
    }

    public static void main(String[] args) {
         OuterClass out = new OuterClass();
        OuterClass.inner in= out.new inner();
        inner.innermost inm=in.new innermost();
        System.out.println(inm.innermostvar);
    }


}
