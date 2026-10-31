package com.logicalstatements;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String yn="";
		double total=0;
		
		
		
		do {
			System.out.println("enterd category :");
			String cato=sc.next();
			switch(cato) {
			case"fruits"->{
				String fyn="";
				double fruit_total=0;
			
				do {
			
				System.out.println("enterd fruit item :");
				String item=sc.next();
				switch(item) {
				case"ap"->{
					System.out.println("apple -price=20/-rs");
					double ap_price=20;
					fruit_total+=ap_price;
					
					}
				
				case "bn" -> {
				    System.out.println("Banana - price 10/-rs");
				    double bn_price = 10;
				    fruit_total += bn_price;
				}

				case "mg" -> {
				    System.out.println("Mango - price 80/-rs");
				    double mg_price = 80;
				    fruit_total += mg_price;
				}

				case "og" -> {
				    System.out.println("Orange - price 15/-rs");
				    double og_price = 15;
				    fruit_total += og_price;
				}

				case "gr" -> {
				    System.out.println("Grapes - price 60/-rs");
				    double gr_price = 60;
				    fruit_total += gr_price;
				}

				case "wm" -> {
				    System.out.println("Watermelon - price 50/-rs");
				    double wm_price = 50;
				    fruit_total += wm_price;
				}

				case "pp" -> {
				    System.out.println("Pineapple - price 70/-rs");
				    double pp_price = 70;
				    fruit_total += pp_price;
				}

				case "pg" -> {
				    System.out.println("Pomegranate - price 100/-rs");
				    double pg_price = 100;
				    fruit_total += pg_price;
				}

				case "st" -> {
				    System.out.println("Strawberry - price 120/-rs");
				    double st_price = 120;
				    fruit_total += st_price;
				}

				case "pw" -> {
				    System.out.println("Papaya - price 40/-rs");
				    double pw_price = 40;
				    fruit_total += pw_price;
				}

				case "ki" -> {
				    System.out.println("Kiwi - price 30/-rs");
				    double ki_price = 30;
				    fruit_total += ki_price;
				}default->System.out.println("enter fruits are not avilable");
				
				}
				System.out.println("do you want to continue with fruits click y for yes and n for no");
				fyn=sc.next();
				
				
			}while(fyn.equalsIgnoreCase("y"));
				System.out.println("total fruits price:"+fruit_total);
				total+=fruit_total;
				
			}
			case"vegetables"->{
				String vyn="";
				double veg_total_price=0;
				do {
				System.out.println("enterd veg items:");
				String vegtab=sc.next();
				switch(vegtab) {
				case"p"->{
					System.out.println("potato per kg -price=40");
					double p_price=40;
					veg_total_price+=p_price;
				}
				
				case "br" -> {
				    System.out.println("Broccoli - price 180/-rs");
				    double br_price = 180;
				    veg_total_price += br_price;
				}

				case "cu" -> {
				    System.out.println("Cucumber - price 60/-rs");
				    double cu_price = 60;
				    veg_total_price += cu_price;
				}

				case "ca" -> {
				    System.out.println("Capsicum - price 100/-rs");
				    double ca_price = 100;
				    veg_total_price += ca_price;
				}

				case "pu" -> {
				    System.out.println("Pumpkin - price 80/-rs");
				    double pu_price = 80;
				    veg_total_price += pu_price;
				}

				case "bi" -> {
				    System.out.println("Beetroot - price 70/-rs");
				    double bi_price = 70;
				    veg_total_price += bi_price;
				}

				case "ra" -> {
				    System.out.println("Radish - price 50/-rs");
				    double ra_price = 50;
				    veg_total_price += ra_price;
				}

				case "po" -> {
				    System.out.println("Potato - price 40/-rs");
				    double po_price = 40;
				    veg_total_price += po_price;
				}

				case "on" -> {
				    System.out.println("Onion - price 50/-rs");
				    double on_price = 50;
				    veg_total_price += on_price;
				}

				case "gr" -> {
				    System.out.println("Green Beans - price 90/-rs");
				    double gr_price = 90;
				    veg_total_price += gr_price;
				}

				case "co" -> {
				    System.out.println("Corn - price 70/-rs");
				    double co_price = 70;
				    veg_total_price += co_price;
				}default-> System.out.println("enterd vegetables are   not available :");
				
				
				}
				System.out.println("do you want to continue with vetables click y for yes n for no...?");
				vyn=sc.next();
				
				}while(vyn.equalsIgnoreCase("y"));
		//}default-> System.out.println("enterd vegetables are   not available :");
				System.out.println("total vegetables bill:"+veg_total_price);
				total+=veg_total_price;
					
		// TODO Auto-generated method stub

	}default->System.out.println("enterd category is not available");
			}
			System.out.println("do you want to continue  with category click y for yes click n for no");
			yn=sc.next();
	}while(yn.equalsIgnoreCase("y"));
		System.out.println("final price :"+total);

}
}
