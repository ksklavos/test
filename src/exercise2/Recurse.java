/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author dell_admin
 */
public class Recurse {
    public static char first(String s){
        return s.charAt(0);
    }
    
    public static String rest(String s){
        return s.substring(1,s.length());
    }
    
    public static int length(String s){
        return s.length();
    }
    
    public static void print(String s){
      if (length(s)>0){
        System.out.println(first(s));
        print(rest(s));
      }
    }
     
    public static String reverseString(String s) {
	if (length(s) == 1) {
            return s; 
	}
	else {
           // String reversed = reverseString(rest(s)) + first(s); 
            return reverseString(rest(s)) + first(s); 
	}
    }
    
    public static void printBackwards(String s) {
	if (length(s) > 1) {
            printBackwards(rest(s));
	}
        System.out.println(first(s)); 
    }
    
    public static void main(String[] args){
        String phrase="Hello World";
        
        System.out.println(length(phrase));
        System.out.println(first(phrase));
        System.out.println(rest(phrase));
        print(phrase);
        System.out.println(reverseString(phrase));
        //printBackwards(phrase);
        
    }
}
