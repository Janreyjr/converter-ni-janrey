/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saka.naman;

import java.util.Scanner;

/**
 *
 * @author Guerrero_CPE
 */
public class SAKANAMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input;
        input = new java.util.Scanner(System.in);
        System.out.println("Choose operator"
                         + "1. C to f"
                         + "2. F to C"
                         + "3. K to f"
                         + "4. K to C"
                         + "5. C to K"
                         + "6. F to K");
         System.out.println("Choose a conversion: ");
         int a= input.nextInt();
         
        
         if (a==1)  {
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println(("ang resulta kay" +(b*9/5)+32)+ "Fahrenheit");
        } else if (a==2){
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println(("ang resulta kay" +(b-32)*5/9)+ "Celsius");
        } else if (a==3){
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println(("ang resulta kay" +((b-273.15)*1.8)+32)+ "Fahrenheit");
        } else if (a==4){
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println("ang resulta kay" +(b-273.15)+ "Celsius");
        } else if (a==5){
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println("ang resulta kay" +(b+273.15)+ "Kelvin");
        }else if (a==6){
            System.out.println("Enter ang kainit");
            double b = input.nextInt();
            System.out.println(("ang resulta kay" +((b-32)*5/9)+273.15)+ "Kelvin");
        }else {
            
        }
       
       }


         }
        
    
    

