package org.example;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = 523134;
        int y = 325423;
        int a = x % y;

        if (a != 0) {
            if (a > 1000) {
                System.out.println("Ostatak je veci od 1000!");
            } else {
                System.out.println("Ostatk je manji od 1000!");
            }

        } else {
            System.out.println("Ostatak pri deljenju je 0!");
        }

    }

//    static void calculatingNumbers(){
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Unesi prvi broj ");
//        int a = scanner.nextInt();
//
//        System.out.println("Unesi drugi broj ");
//        int b = scanner.nextInt();
//
//        System.out.println("Unesi operator ");
//        String o = scanner.next();
//
//        if (o.equals("+")) {
//            System.out.println("Rezultat je " + (a+b));
//
//        }
//        else if (o.equals("=")) {
//            System.out.println("Rezultat je " + (a-b));
//        }
//        else if (o.equals("*")) {
//            System.out.println("Rezultat je " + (a*b));
//        }
//        else if (o.equals("/")) {
//            System.out.println("Rezultat je " + (a/b));
//        }
//
//
//    }
}






