package org.tnsif.classandobject;
import java.util.Scanner;
//driver class
public class ConstructorDemo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int id;
		String Custname;
        String city;
        customer c=new customer(19,"sneha","nashik");
         
        //Method calling
        c.display();
        
        
        System.out.println("Enter Id,customer name and city");
        id=sc.nextInt();
        sc.nextLine();
        
        Custname=sc.nextLine();
        city=sc.nextLine();
        
        //object of class
        customer c1=new customer();
        c1.setId(id);
        c1.setCity(city);
        
        //Method calling
        //c1.display();
        
        System.out.println(c1.getId());
        System.out.println(c1.getCity());
        
		
	}
   
   
   
}
