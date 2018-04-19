/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.*; 
/**
 *
 * @author iMac
 */
public class Mock {
 
  
    public static void main(String[] args) {
     
    Scanner input = new Scanner (System.in);
    
    int weight;
    double height;
    double bodyFatMen;
    double bMi;
    byte age;
    
    System.out.println("Weight in kilograms");
    weight = input.nextInt();
    System.out.println ("Height in meters");
    height = input.nextDouble();
    System.out.println("Age");
    age = input.nextByte();
    
    bMi = (weight/height)/height;
    System.out.println("Body mass index" + " " + bMi);
    
    bodyFatMen = (1.20 * bMi) + (0.23 * age/100) - 4.4;
    System.out.println("Body Fat % = " + bodyFatMen + "%");
    
        
    
    
    } 
    
   }  
    

    

