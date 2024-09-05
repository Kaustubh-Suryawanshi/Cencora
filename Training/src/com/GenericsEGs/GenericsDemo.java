package com.GenericsEGs;


class Box<T>{
    T value;
    public void setContent(T content){
        this.value =content;
    }

    public T getValue()
    {
        return value;
    }

    public <T> void printArray(T[] arr )
    {
        for(T e:arr)
        {
            System.out.println(e);
        }
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        Box <Integer> in=new Box<>();
        in.setContent(112);
        System.out.println(in.getValue());

        Box<String> str= new Box<>();
        str.setContent("Kaustubh");
        System.out.println(str.getValue());

        Box demo=new Box();

        Integer[] nums={1,2,3,4};
        String[] strs={"akdhb","ajgf","ahg"};

        demo.printArray(nums);
        demo.printArray(strs);
    }
}
