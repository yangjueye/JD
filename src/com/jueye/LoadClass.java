package com.jueye;

public class LoadClass {
	static int a[] = new int[6]; 
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * ClassLoader classLoader=ClassLoader.getSystemClassLoader(); Class
		 * clazz=classLoader.loadClass("com.jueye.B"); clazz.forName("com.jueye.B");
		 */
		System.out.println ( a[0] ); 
	}
	
}
class A{

    static {

        System.out.print("A");

    }

}
class B {  
	   static {  
	     Integer first = new Integer(3);  
	     Integer second = 3;                
	     int three = 3;  
	     System.out.println(first==second);   
	     System.out.println(first==three);  
	    }  
	}
