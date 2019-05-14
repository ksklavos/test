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
public class FactorialRecursive {
    public static double recFuct(int n){
        if (n<=1)
                return 1;
        else
            return n*recFuct(n-1);
    
    }
    
    public static void main(String args[]){
        System.out.println(recFuct(80));
    }
}
