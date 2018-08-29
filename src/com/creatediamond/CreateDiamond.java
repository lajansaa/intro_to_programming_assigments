package com.creatediamond;

public class CreateDiamond {
    public static void main(String[] args) {
        // Given a number n, print a centered triangle.
        printIsos(3);

        // Given a number n, print a centered diamond with your name in place of the middle line.
        printDiamond(3);

        // Given a number n, print a centered diamond with your name in place of the middle line.
        printDiamondWithName(3, "isa");

    }

    static void printIsos(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printIsos(int x, int skipLine) {
        for (int i = 0; i < x - skipLine; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printInvertedIsos(int x) {
        for (int i = x - 1; i >= 0; i--) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printInvertedIsos(int x, int skipLine) {
        for (int i = x - 1 - skipLine; i >= 0; i--) {
            for (int j = 0; j < x - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void printDiamond(int x) {
        printIsos(x);
        printInvertedIsos(x, 1);
    }

    static void printDiamondWithName(int x, String name) {
        printIsos(x, 1);
        System.out.println(name);
        printInvertedIsos(x, 1);
    }

}
