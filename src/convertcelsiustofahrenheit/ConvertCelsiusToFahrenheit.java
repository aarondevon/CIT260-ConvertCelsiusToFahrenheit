/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertcelsiustofahrenheit;

/**
 *
 * @author awesome
 */
import java.util.Scanner;
public class ConvertCelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cTemp, fTemp;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a temperature in Celsius:");
        while (!keyboard.hasNextInt()) { 
            System.out.println("Please enter a valid temperature.");
            keyboard.nextLine();
        } 
        cTemp = keyboard.nextInt();
        
        fTemp = (9 / 5) * cTemp + 32;
        
        System.out.println(cTemp + " degrees celsuis is " + fTemp + " degrees fahrenheit.");
        keyboard.close();
    }
}
