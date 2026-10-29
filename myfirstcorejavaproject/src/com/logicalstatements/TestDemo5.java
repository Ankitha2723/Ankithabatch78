package com.logicalstatements;

import java.util.Scanner;

//WA POC  related to order invoice Management
public class TestDemo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String yn="";
		double total=0;
		do {
			System.out.println("select category like veg/nonveg/starters/drinks:");
		
		String catg=sc.next();
		
		switch(catg) {
		            
		case"veg"->{
			String vyn="";
			double veg_total_price=0;
			do {
				System.out.println("enter the item:");
			String veg_item=sc.next();
			
			
			switch(veg_item) {
			
			case"pbm"->{System.out.println("panneer butter masala-price 250/-rs");
			double pbm_price=250;
			veg_total_price+=pbm_price;
			}
			case "vp" -> {
			    System.out.println("Veg Pulao - price 180/-rs");
			    double vp_price = 180;
			    veg_total_price += vp_price;
			}

			case "c" -> {
			    System.out.println("Chole - price 150/-rs");
			    double c_price = 150;
			    veg_total_price += c_price;
			}

			case "pd" -> {
			    System.out.println("Paneer Do Pyaza - price 220/-rs");
			    double pd_price = 220;
			    veg_total_price += pd_price;
			}

			case "m" -> {
			    System.out.println("Malai Kofta - price 230/-rs");
			    double m_price = 230;
			    veg_total_price += m_price;
			}

			case "vd" -> {
			    System.out.println("Veg Dum Biryani - price 200/-rs");
			    double vd_price = 200;
			    veg_total_price += vd_price;
			}

			case "dm" -> {
			    System.out.println("Dal Makhani - price 180/-rs");
			    double dm_price = 180;
			    veg_total_price += dm_price;
			}

			case "pm" -> {
			    System.out.println("Palak Paneer - price 210/-rs");
			    double pm_price = 210;
			    veg_total_price += pm_price;
			}

			case "vm" -> {
			    System.out.println("Veg Manchurian - price 160/-rs");
			    double vm_price = 160;
			    veg_total_price += vm_price;
			}

			case "pp" -> {
			    System.out.println("Paneer Pakoda - price 140/-rs");
			    double pp_price = 140;
			    veg_total_price += pp_price;
			}

			case "k" -> {
			    System.out.println("Kaju Curry - price 250/-rs");
			    double k_price = 250;
			    veg_total_price += k_price;
			}
			default->System.out.println("Enterd item is not available :");
				
			
			}
			System.out.println("do you want to continue with  veg items click y for yes n for no");
			vyn=sc.next();
			}while(vyn.equalsIgnoreCase("y"));
			System.out.println("veg total price is:"+  veg_total_price );
			total+=veg_total_price;
			
			}
		case"non-veg"->{
			String nvyn="";
			double nonveg_total_price=0;
			do {
				System.out.println("entered non veg item:");
			
			String nv_item=sc.next();
			
			switch(nv_item) {
			
			 case "cb" -> {
	                System.out.println("Chicken Biryani - price 280/-rs");
	                double cb_price = 280;
	                nonveg_total_price += cb_price;
	            }

	            case "mb" -> {
	                System.out.println("Mutton Biryani - price 350/-rs");
	                double mb_price = 350;
	                nonveg_total_price += mb_price;
	            }

	            case "cf" -> {
	                System.out.println("Chicken Fry - price 220/-rs");
	                double cf_price = 220;
	                nonveg_total_price += cf_price;
	            }

	            case "cc" -> {
	                System.out.println("Chicken Curry - price 250/-rs");
	                double cc_price = 250;
	                nonveg_total_price += cc_price;
	            }

	            case "mc" -> {
	                System.out.println("Mutton Curry - price 320/-rs");
	                double mc_price = 320;
	                nonveg_total_price += mc_price;
	            }

	            case "tf" -> {
	                System.out.println("Tandoori Chicken - price 300/-rs");
	                double tf_price = 300;
	                nonveg_total_price += tf_price;
	            }

	            case "cfry" -> {
	                System.out.println("Chicken 65 - price 240/-rs");
	                double cfry_price = 240;
	                nonveg_total_price += cfry_price;
	            }

	            case "fb" -> {
	                System.out.println("Fish Biryani - price 290/-rs");
	                double fb_price = 290;
	                nonveg_total_price += fb_price;
	            }

	            case "pf" -> {
	                System.out.println("Prawn Fry - price 280/-rs");
	                double pf_price = 280;
	                nonveg_total_price += pf_price;
	            }

	            case "egc" -> {
	                System.out.println("Egg Curry - price 180/-rs");
	                double egc_price = 180;
	                nonveg_total_price += egc_price;
	            }default->System.out.println("enterd item is not available");
		}
			System.out.println("do you want continue with nonveg items click y for yes n for no");
			nvyn=sc.next();
			}while(nvyn.equalsIgnoreCase("y"));
			System.out.println("total price :"+ nonveg_total_price);
			total+=nonveg_total_price;
		}
		case"starters"->{
			String syn="";
			double starters_total_price=0;
			do {
			System.out.println("Enterd starters items :");
			String starters=sc.next();
			
			switch(starters) {
			 case "vp" -> {
	                System.out.println("Veg Pakoda - price 120/-rs");
	                double vp_price = 120;
	                starters_total_price += vp_price;
	            }

	            case "gc" -> {
	                System.out.println("Gobi 65 - price 150/-rs");
	                double gc_price = 150;
	                starters_total_price += gc_price;
	            }

	            case "vm" -> {
	                System.out.println("Veg Manchurian - price 160/-rs");
	                double vm_price = 160;
	                starters_total_price += vm_price;
	            }

	            case "cp" -> {
	                System.out.println("Chicken Pakoda - price 200/-rs");
	                double cp_price = 200;
	                starters_total_price += cp_price;
	            }

	            case "cc" -> {
	                System.out.println("Chicken Chilli - price 220/-rs");
	                double cc_price = 220;
	                starters_total_price += cc_price;
	            }

	            case "pp" -> {
	                System.out.println("Paneer Pakoda - price 140/-rs");
	                double pp_price = 140;
	                starters_total_price += pp_price;
	            }

	            case "sp" -> {
	                System.out.println("Samosa - price 40/-rs");
	                double sp_price = 40;
	                starters_total_price += sp_price;
	            }

	            case "on" -> {
	                System.out.println("Onion Pakoda - price 100/-rs");
	                double on_price = 100;
	                starters_total_price += on_price;
	            }

	            case "tf" -> {
	                System.out.println("Tandoori Fish - price 280/-rs");
	                double tf_price = 280;
	                starters_total_price += tf_price;
	            }

	            case "mp" -> {
	                System.out.println("Mushroom Pepper Fry - price 180/-rs");
	                double mp_price = 180;
	                starters_total_price += mp_price;
	            }

	            default -> System.out.println("Entered item is not available.");
	        }

	        System.out.println("Do you want to continue with starters? Enter y for yes or n for no:");
	        syn=sc.next();

			}while(syn.equalsIgnoreCase("y"));
			System.out.println("total_price :"+  starters_total_price);
			total+=starters_total_price;
		}
		case"drinks"->{
			String dyn="";
			double total_price=0;
			
			do {
			System.out.println("enterd drink :");
			String drinks=sc.next();
			switch(drinks) {
			
			case"tp"->{
				System.out.println("thumsup -price=100");
				double tp_price=100;
				total_price+=tp_price;
			}
			case "coke" -> {
			    System.out.println("Coca-Cola - price 80/-rs");
			    double coke_price = 80;
			    total_price += coke_price;
			}

			case "sp" -> {
			    System.out.println("Sprite - price 70/-rs");
			    double sp_price = 70;
			    total_price += sp_price;
			}

			case "ma" -> {
			    System.out.println("Maaza - price 60/-rs");
			    double ma_price = 60;
			    total_price += ma_price;
			}

			case "fr" -> {
			    System.out.println("Frooti - price 40/-rs");
			    double fr_price = 40;
			    total_price += fr_price;
			}

			case "mj" -> {
			    System.out.println("Mango Juice - price 100/-rs");
			    double mj_price = 100;
			    total_price += mj_price;
			}

			case "oj" -> {
			    System.out.println("Orange Juice - price 90/-rs");
			    double oj_price = 90;
			    total_price += oj_price;
			}

			case "lm" -> {
			    System.out.println("Lime Soda - price 50/-rs");
			    double lm_price = 50;
			    total_price += lm_price;
			}

			case "cc" -> {
			    System.out.println("Cold Coffee - price 120/-rs");
			    double cc_price = 120;
			    total_price += cc_price;
			}

			case "ms" -> {
			    System.out.println("Milkshake - price 130/-rs");
			    double ms_price = 130;
			    total_price += ms_price;
			}

			case "w" -> {
			    System.out.println("Mineral Water - price 20/-rs");
			    double w_price = 20;
			    total_price += w_price;
			}default->System.out.println("enterd drink is not available");
			
			}
			System.out.println("do you want continue with drinks click y for yes and n for no");
			dyn=sc.next();
			}while(dyn.equalsIgnoreCase("y"));
			System.out.println("total price :" + total_price);
			total+=total_price;
		
	}
		default->System.out.println("enterd category not avilable");

}
		System.out.println("do you want continue for category click y for yes and click n for no");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("final bill :" + total );
		
}
}
