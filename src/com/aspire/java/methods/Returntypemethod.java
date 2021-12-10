package com.aspire.java.methods;

public class Returntypemethod {
    public static void main(String[] args)
    {
        int i=returnmethod();
        System.out.println(i);
        System.out.println(method2());
    }
    public static int returnmethod()
    {
        int a=10;
        int b=20;
        int c=a+b;
        return c;
    }
    public static String method2()
    {
        String name="Aspire Training Institute";
        return name;
    }
}
