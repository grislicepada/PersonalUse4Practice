/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FirstPract;

import java.util.Scanner;

public class ArithmeticChuchu {
    public static void main (String[] args){
        
        Scanner scanner = new Scanner (System.in);
        
//        start nata diri ug print
        
       System.out.println( "Input First Number:");
        int x = scanner.nextInt ();
       System.out.println( "Input First Number:");
        int y = scanner.nextInt ();
       System.out.println( "Input First Number:");
        int z = scanner.nextInt ();

//    after ma kuha ang gusto nimo nga value sa variable 
//
        System.out.println( "("+z+"+"+y+")*"+x+"="+((z+y)*x));
        System.out.println("("+y+"*"+x+"+"+z+")"+"/"+y+"="+((y*x+z)/y));
        System.out.println(y+"*"+x+"-"+"("+z+"-"+y+")"+"="+(y*x-(z-y)));
        
    }
}