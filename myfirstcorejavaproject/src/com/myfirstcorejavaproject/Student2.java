package com.myfirstcorejavaproject;

public class Student2 {
	int sid;
	String name;
	Student2(int sid, String name){
		this.sid=sid;
		this.name=name;
	
	}
	
	Student2(){
		sid=1001;
		name="unkown";
		
	}

	 void main() {
             Student2 st=new Student2();
             st.sid=101;
             st.name="ankitha";
            // System.out.println(st.sid);
             //System.out.println(st.name);
             st.studentinfo() ;
             System.out.println("*************************");
             Student2 st1=new Student2(100,"ankitha");
            st1. studentinfo() ;
            Student2 st2=new Student2();
            st2.studentinfo();
           //  System.out.println(st1.sid);
             //System.out.println(st1.name);
	}
	void studentinfo() {
	System.out.println(sid);
       System.out.println(name);
		
	}

}
