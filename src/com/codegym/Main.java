package com.codegym;

import java.util.Scanner;

public class Main {

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng cần in");
        int numbers = sc.nextInt();
        String result = "";
        int count = 2;

        for (int i = 1; i <= numbers; count++) {
            if (isPrime(count)) {
                result = result + count + " ";
                i++;
            }
        }

        System.out.println(result);
    }
}
