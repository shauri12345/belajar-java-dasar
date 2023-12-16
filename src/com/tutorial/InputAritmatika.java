package com.tutorial;

import java.util.Scanner;

public class InputAritmatika {
    public static void main(String[] args) {
        int panjang, lebar,luas,tinggi,volume;

        Scanner userInput = new Scanner(System.in);
        //membuat luas persegi panjang
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();
        luas = panjang * lebar;
        System.out.println("luas = " + luas);

        System.out.println("menghitung volume");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas * tinggi;
        System.out.println("volume = " + volume);
    }
}
