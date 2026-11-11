package com.myfirstcorejavaproject.looping;

import java.util.Scanner;

public class Demo8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;

        for (int i = 2; i < n; i++) {

            int n3 = n1 + n2;

            n1 = n2;
            n2 = n3;
        }

        int a = n2;
        int b = n1;

        for (int i = n - 1; i >= 0; i--) {

            System.out.print(a + " ");

            int c = a - b;

            a = b;
            b = c;
        }

        sc.close();
    }
}