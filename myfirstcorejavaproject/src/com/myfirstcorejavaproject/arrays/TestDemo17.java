
package com.myfirstcorejavaproject.arrays;

import java.util.Scanner;

public class TestDemo17 {

    public static void main(String[] args) {

        int[] array = {4, 5, 7, 1, 3};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter k element:");
        int k = sc.nextInt();

        int largest = Integer.MAX_VALUE;
        int kelement = 0;

        for (int i = 0; i < k; i++) {

            int max = Integer.MIN_VALUE;

            for (int j = 0; j < array.length; j++) {

                if (array[j] > max && array[j] < largest) {
                    max = array[j];
                }
            }

            largest = max;
            kelement = max;
        }

        System.out.println(k + "th largest element is: " + kelement);

        
    }
}
