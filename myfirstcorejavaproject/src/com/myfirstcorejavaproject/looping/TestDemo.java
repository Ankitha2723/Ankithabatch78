package com.myfirstcorejavaproject.looping;

import java.util.Random;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rn=sc.nextInt(10);
		
	
		
		
		
		
		Random rs=new Random();
		
		
		for(int i=1;i<=3;i++) {
			System.out.println("enter a number ");
			int guess=sc.nextInt();
			if(guess==rn){
				System.out.println("congratulations! you guessed the correct number");
			}
			else if (guess<rn){
				System.out.println("Too Low! try Again");
				
			}
			else  {
				System.out.println("Too high! Try Again ");
			}	
		}
		System.out.println("Game over");
		System.out.println("guessed number"+rn);
		// TODO Auto-generated method stub

	}

}
