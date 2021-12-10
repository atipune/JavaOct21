package com.aspire.java.methods;

//Main method-->value-->another parameterized method-->addition--> retun sum value to main method

public class CombiRetunPara {
    public static void main(String[] args)
    {
        int d=method(10,20);
        System.out.println(d);

        CombiRetunPara object= new CombiRetunPara();
        int l=object.method2(10,20);
        System.out.println(l);
    }
    public static int method(int a, int b)
    {
        int c;
        c=a+b;
        return c;
    }
    public int method2(int i, int j)
    {
        int k;
        k=j-i;
        return k;
    }
}
