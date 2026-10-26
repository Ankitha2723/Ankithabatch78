package com.myfirstcorejavaproject;

public class Test {
    Test() {
        this(10);
        System.out.println("A");
    }

    Test(int x) {
        this(10, 20);
        System.out.println("B");
    }

    Test(int x, int y) {
        System.out.println("C");
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}

	