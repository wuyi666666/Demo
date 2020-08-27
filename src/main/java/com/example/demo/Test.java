package com.example.demo;

public class Test {
    final int i = 10;
    public Test(){
        System.out.println("S");
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        F f = new F();
        f.clone();
    }
}
class F{
    public F(){
        System.out.println("F");
    }
    public F ss(){
        return new F();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}