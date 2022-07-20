package Practiceproject;

import java.util.LinkedList;
import java.util.Scanner;

public class Emailidvalidate {
	public static void valid(LinkedList<String>ll) {
		System.out.println("Enter the Email ID: ");
		Scanner sc1 = new Scanner(System.in);
	      String sc=sc1.next();
	      int map=0;

		for(String element:ll) {
	    	  if(element.equals(sc)) {
	    		  map=1;
	    		  break;
	    	  }
	      }
		if(map==1)
		{
			System.out.println("Given Email id is valid");
		}
		else
		{
			System.out.println("You have entered wrong Email id");
		}
	}
	public static void main(String[] args) {
		LinkedList <String> ll=new LinkedList<String>();
		  ll.add("saisiva@gmail.com");
	      ll.add("siva@gmail.com");
	      ll.add("kumar@gmail.com");
	      ll.add("praneeth@gmail.com");
	      ll.add("sairam@gmail.com");
	      
	      //Emailidvalidate a =new Emailidvalidate();
	      Emailidvalidate.valid(ll);
	    
	     
	}
}