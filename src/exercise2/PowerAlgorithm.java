package exercise2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell_admin
 */
public class PowerAlgorithm {
    
    public static int pow( int a, int n) {
        if ( n == 0 ) {
            return 1;
        }
        return ( a * pow(a,n-1));
    }
    
    public static void main(String[] args){
        System.out.println(pow(2,2));
    }
    
    
    
}
