/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author iMac
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter a word");
        String word=input.nextLine();
        
        char[] reverse = word.toCharArray();
        for (int i = reverse.length-1; i >= 0; i--){
        System.out.print(reverse[i]);
        }
    }

}
