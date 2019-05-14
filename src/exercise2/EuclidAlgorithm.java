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
public class EuclidAlgorithm {
    
    
    
    public static int egcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    
    public static void main(String[] args){
        
        System.out.println(egcd(21, 14));
    }
}
