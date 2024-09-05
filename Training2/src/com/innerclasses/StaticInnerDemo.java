package com.innerclasses;

class Test{
    static int var=29;
    static class inner{
        void print()
        {
            System.out.println("var="+var);
        }
    }
}

public class StaticInnerDemo {

    static class Inner{
        class Innermost{
            static int var2=16;
        }
    }

    public static void main(String[] args) {
        Test.inner t= new Test.inner();
        t.print();

        System.out.println(Inner.Innermost.var2);
    }
}
