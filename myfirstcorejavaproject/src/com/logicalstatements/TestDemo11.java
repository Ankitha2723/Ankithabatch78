

package com.logicalstatements;
import java.util.Scanner;


public class TestDemo11 {

	public static void main(String[] args) {
		
//WA POC  related to order invoice Management

		Scanner sc=new Scanner(System.in);
		
			System.out.println("select category like veg/nonveg/starters/drinks:");
		
		String catg=sc.next();
		
		switch(catg) {
		            
		case"veg"->{
			String vyn="";
			double veg_total_price=0;
			
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
			System.out.println(veg_total_price);
		}
			
			
		case"non-veg"->{
			
				System.out.println("entered non veg item:");
			double nonveg_total_priice=0;
			String nv_item=sc.next();
			
			switch(nv_item) {
			
			 case "cb" -> {
	                System.out.println("Chicken Biryani - price 280/-rs");
	                double cb_price = 280;
	                nonveg_total_priice += cb_price;
	            }

	            case "mb" -> {
	                System.out.println("Mutton Biryani - price 350/-rs");
	                double mb_price = 350;
	                nonveg_total_priice += mb_price;
	            }

	            case "cf" -> {
	                System.out.println("Chicken Fry - price 220/-rs");
	                double cf_price = 220;
	                nonveg_total_priice += cf_price;
	            }

	            case "cc" -> {
	                System.out.println("Chicken Curry - price 250/-rs");
	                double cc_price = 250;
	                nonveg_total_priice += cc_price;
	            }

	            case "mc" -> {
	                System.out.println("Mutton Curry - price 320/-rs");
	                double mc_price = 320;
	                nonveg_total_priice += mc_price;
	            }

	            case "tf" -> {
	                System.out.println("Tandoori Chicken - price 300/-rs");
	                double tf_price = 300;
	                nonveg_total_priice += tf_price;
	            }

	            case "cfry" -> {
	                System.out.println("Chicken 65 - price 240/-rs");
	                double cfry_price = 240;
	                nonveg_total_priice += cfry_price;
	            }

	            case "fb" -> {
	                System.out.println("Fish Biryani - price 290/-rs");
	                double fb_price = 290;
	                nonveg_total_priice += fb_price;
	            }

	            case "pf" -> {
	                System.out.println("Prawn Fry - price 280/-rs");
	                double pf_price = 280;
	                nonveg_total_priice += pf_price;
	            }

	            case "egc" -> {
	                System.out.println("Egg Curry - price 180/-rs");
	                double egc_price = 180;
	                nonveg_total_priice += egc_price;
	            }default->System.out.println("enterd item is not available");
		
			
		}
		
			}default->System.out.println("renterd category is not availbale");

	        
}
}
		}
