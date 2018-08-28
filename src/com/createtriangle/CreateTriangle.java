package com.createtriangle;

public class CreateTriangle {
    public static void main(String[] args) {
        // Print one asterisk to the console.
        printOne();

        // Given a number n, print n asterisks on one line.
        printHorizontal(8);

        // Given a number n, print n lines, each with one asterisks.
        printVertical(3);

        // Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.).
        printRightTriangle(3);
    }

    static void printOne() {
        System.out.println("*");
    }

    static void printHorizontal(int x) {
        for (int i = 0; i < x; i++) {
            System.out.print("*");
        }
    }

    static void printVertical(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("*");
        }
    }

    static void printRightTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
