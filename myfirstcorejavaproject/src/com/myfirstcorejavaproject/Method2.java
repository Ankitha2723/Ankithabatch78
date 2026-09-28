package com.myfirstcorejavaproject;

public class Method2 {
	static void Addition(int a, int b) {
		int sum = (a + b);
		System.out.println("ADdition of two num:" + sum);
	}

	static void Subtraction(int a, int b) {
		System.out.println("subtraction:" + (a - b));
	}

	static void Multiplication(int a, int b) {
		System.out.println("multiplication:" + (a * b));
	}

	static void Divistion(int a, int b) {
		System.out.println("Divistion:" + (a / b));
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Addition(10, 20);
		Subtraction(30, 10);
		Multiplication(10, 40);
		Divistion(30, 10);
		Modulus(20, 4);
		Square(10);
		Cube(30f);
		Temperature(30F);
		Swap(10,20);
		Circle(20);
		Rectangle(20,10);
		SimpleIntrest(10,20,30);
		Percentage(99,80,75);
		AreaofTrainagle(10,20);
		Distance(100,20);
		BMi(20,55);
		Grosssal(10,30,100);
	}

	static void Modulus(int a, int b) {
		System.out.println("modulus:" + (a % b));
	}
    static void Square(int n) {
    	 int result=n * n;
    	 System.out.println("Square:"+ result);
    }
    static void Cube( float f) {
     float result=f * f * f;
     System.out.println("cube:"+ result);
    }
    static void Temperature(float a) {
    	 float result = (a *  9/5) + 32;
    	System.out.println("Temparature:"+ result);
    }
    static void Swap(int a , int b) {
    	int temp=a;
    	a=b;
    	b=temp	;
    	System.out.println("Swap:"+temp);
    	System.out.println("Swap:"+a);

    	
    }
    static void Circle(float r ) {
    double Area = (3.14* r * r);
    System.out.println("area of circle:"+ Area);
}
    static void  Rectangle(int l,int b) {
    	 int Rectangle= l * b;
    	 System.out.println("Reactangle:"+ Rectangle);
    }
    static void SimpleIntrest(int P, int R , int T ) {
    int SI = (P  *  R  *  T) / 100;
    System.out.println("SimpleIntrst:"+ SI);
}
    static void Percentage(int a,int b, int c) {
    	 float Percentage=((a+b+c)/3) * 100;
    	 System.out.println("percentage:"+ Percentage);
    }
    static void AreaofTrainagle(float b,float h) {
  float  Result= (b * h) / 2;
  System.out.println("Traingle:"+Result);
    
}
    static void Distance(float speed, float Time) {
    	double Result=speed * Time;
    	System.out.println("Distance:"+Result);
    }
    static void BMi(float height,float weight) {
  float result = weight / (height * height);
  System.out.println("Bmi:"+result);
}
    static void Grosssal(float basic,int HRA,int DA ) {
    float Result=basic + HRA + DA;
    System.out.println("Grosssal:"+Result);
}
}