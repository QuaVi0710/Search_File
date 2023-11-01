/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;

/**
 *
 * @author QuaVi
 */
public class Validate {
    public static String checkInput() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                String input = sc.nextLine().trim();
                if(input.isEmpty()) {
                    throw new Exception();
                } 
                return input;
            } catch(Exception e) {
                System.out.print("*Can't empty. Let's enter again: ");
            }
        }
    }
    
}
