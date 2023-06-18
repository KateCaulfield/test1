package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int s = scanner.nextInt();
        System.out.print("Цифры в числе " + s + ": ");
        ArrayList<Integer> digits = new ArrayList<Integer>();
        while (s != 0) {
            int digit = s % 10;
            digits.add(digit);
            s /= 10;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            System.out.print(digits.get(i) + " ");
        }
    }
}