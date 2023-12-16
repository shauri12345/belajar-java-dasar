package com.tutorial;
public class OperatorLogika {
    public static void main(String[] args) {
        boolean a,b,c;
        //or (||)
        System.out.println("ini adalah or");
        a = false;
        b = false;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a||b);
        System.out.println(a + " && " + b + "=" + c);

        a = true;
        b = false;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a||b);
        System.out.println(a + " && " + b + " = " + c);

        //and &&
        System.out.println("ini adalah and");

        a = false;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + "=" + c);

        a = true;
        b = false;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a && b);
        System.out.println(a + " && " + b + " = " + c);

        //xor (^)
        System.out.println(" ini adalah xor");

        a = false;
        b = false;
        c = (a^b);
        System.out.println(a + " && " + b + " = " + c);

        a = false;
        b = true;
        c = (a ^ b);
        System.out.println(a + " && " + b + "=" + c);

        a = true;
        b = false;
        c = (a ^ b);
        System.out.println(a + " && " + b + " = " + c);

        a = true;
        b = true;
        c = (a ^ b);
        System.out.println(a + " && " + b + " = " + c);

        //not /negasi/flipping
        System.out.println("negasi");
        a = false;
        c = !a;
        System.out.println(a +"(!)" + c);

        a = true;
        c = !a;
        System.out.println(a +"(!)" + c);
    }
}
