package com.cote.level0;
import java.util.Scanner;

public class ScanPrintPCCE1 {

    public static void main(String[] args) {
        String msg = new Scanner(System.in).next();
        int val1 = Integer.parseInt(new Scanner(System.in).next());
        String val2 = new Scanner(System.in).next();

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + "10");
    }
}
