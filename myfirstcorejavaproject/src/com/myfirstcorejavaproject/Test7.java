package com.myfirstcorejavaproject;

class Test7 {

    int a = 10;
    int b = 20;

    void Addition() {
        int result = a + b;
        System.out.println("Addition = " + result);
    }

    public static void main(String[] args) {

        Test7 obj = new Test7();

        obj.Addition();
    }
}