
package com.logicalstatements;

import java.util.Scanner;

public class TestDemo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double totalprice = 0;

        do {
            System.out.println("Enter category: cloths / eledevices");
            String catog = sc.next();

            switch (catog) {

                case "cloths" -> {

                    String cyn = "";
                    double ct_price = 0;

                    do {
                        System.out.println("Enter clothes item: sh / p / s");
                        String item = sc.next();

                        switch (item) {

                            case "sh" -> {
                                System.out.println("Shirt - Rs.500");
                                double shirt_price = 500;
                                ct_price += shirt_price;
                            }

                            case "p" -> {
                                System.out.println("Pant - Rs.1000");
                                double pant_price = 1000;
                                ct_price += pant_price;
                            }

                            case "s" -> {
                                System.out.println("Saree - Rs.15000");
                                double saree_price = 15000;
                                ct_price += saree_price;
                            }

                            default ->
                                System.out.println("Entered item is not available");
                        }

                        System.out.println(
                            "Do you want to continue with clothes? Enter y or n:"
                        );
                        cyn = sc.next();

                    } while (cyn.equalsIgnoreCase("y"));

                    System.out.println("Clothes total: Rs." + ct_price);

                    totalprice += ct_price;
                }

                case "eledevices" -> {

                    String eys = "";
                    double elect_price = 0;

                    do {
                        System.out.println("Enter device: mob / lap / tv");
                        String device = sc.next();

                        switch (device) {

                            case "mob" -> {
                                System.out.println("Mobile - Rs.25000");
                                double m_price = 25000;
                                elect_price += m_price;
                            }

                            case "lap" -> {
                                System.out.println("Laptop - Rs.500000");
                                double l_price = 500000;
                                elect_price += l_price;
                            }

                            case "tv" -> {
                                System.out.println("Television - Rs.600000");
                                double t_price = 600000;
                                elect_price += t_price;
                            }

                            default ->
                                System.out.println("Entered device is not available");
                        }

                        System.out.println(
                            "Do you want to continue with electronic devices? Enter y or n:"
                        );
                        eys = sc.next();

                    } while (eys.equalsIgnoreCase("y"));

                    System.out.println("Electronics total: Rs." + elect_price);

                    totalprice += elect_price;
                }

                default ->
                    System.out.println("Entered category is not available");
            }

            System.out.println("Do you want to continue shopping? Enter y or n:");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("y"));

        System.out.println("Final price: Rs." + totalprice);

        sc.close();
    }
}
