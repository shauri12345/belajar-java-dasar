package com.tutorial;

import java.util.Scanner;

public class LatInputAritmatika {
    public static void main(String[] args) {
        System.out.println("mengitung luas segitiga");
        Scanner userInput = new Scanner(System.in);
        int alas, tinggi,luas;
        System.out.print("alas = " );
        alas = userInput.nextInt();
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        luas = (alas * tinggi) /2;
        System.out.println("luas = " + luas);
    }
}
