package com.aspire.java.constructor;
//User defiv=ned constructor
public class sample2
{
    int a;
    int b;
    int c;


    sample2()
    {
        a=10;
        b=20;
    }
    public static void main(String[] args) {
        sample2 object =new sample2();
        object.method1();
    }
    public void method1()
    {
        c=a+b;
        System.out.println(c);
    }
}
