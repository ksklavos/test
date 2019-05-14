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
public class CheckOddOrEven {
    public static String OddOrEven(int a){
        return ((a & 1) == 0 ? "Even": "odd");
    }
    
    public static void main (String args[]){
        System.out.println(OddOrEven(18)); 
    }
}

