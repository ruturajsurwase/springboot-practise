package aaaa;

public class Test
{
   public A m1()
   {
	   B b =new B();
	   
	     b.x=500;
	     
	     return b;
   }
   
   public static void main(String[] args) 
   {
	  Test t =new Test();
	  
	       B y= (B)t.m1();
	       
	       System.out.println(y.x);
   }
}
