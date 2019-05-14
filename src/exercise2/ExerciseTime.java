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
public class ExerciseTime {
    public static void printAmerican(String day , String month , int date , int year) {
        System.out.println(day + "," + month + " " + date + " , " + year) ;
    }
    public static void printEuropean( String day , String month , int date , int year ) {
        System.out.println( day + " " + date + " " + month + " , " + year ) ;
    }
    public static void main ( String [ ] args ) {
        String day = " Thursday " ;
        String month = " February " ;
        int year = 2010;
        int date = 11;
        printAmerican ( day , month , date , year ) ;
        printEuropean ( day , month , date , year ) ;
    }
}