package com.myfirstcorejavaproject;

public class Institute2 {
	static String trainername="Sevitha";
    static String trainername2="manisha";
    String employeename;
    int empid;
    String empde;
	 static Institute em1 = new Institute();

    void show() {
    	em1.employeename="ankitha";
		em1.empid=101;
		em1.empde="trainer";
    	System.out.println("employeename:"+em1.employeename);
		System.out.println("emid:"+em1.empid);
		System.out.println("empde:"+em1.empde);
    }


	public static void main(String[] args) {
		System.out.println("main method called");
		em1.show();
		// TODO Auto-generated method stub

	}

}
