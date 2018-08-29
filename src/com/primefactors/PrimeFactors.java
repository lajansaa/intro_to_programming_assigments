package com.primefactors;

public class PrimeFactors {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if (num % 2 == 0) {
            System.out.print("2 ");
            while (num % 2 == 0) {
                num /= 2;
            }
        }
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
        if (num > 2) {
            System.out.print(num);
        }

    }
}
