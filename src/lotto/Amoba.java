/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lotto;

import java.util.Scanner;

/**
 *
 * @author LukácsAlexandra(SZOF
 */
public class Amoba {
    
    static Scanner sc = new Scanner(System.in, "latin2");
    
    public static void main(String[] args) {
        System.out.print("Az elso jel (x/o): ");
        String kezdo = sc.nextLine();
        final int MERET = 3;
        String[] amoba = new String[MERET*MERET];
        amoba[0] = kezdo;
        
        for (int i = 0; i < MERET*MERET; i++) {
            amoba[i] = Math.random()>.5 ? "x" : "o";
        }
        
        for (int i = 0; i < MERET*MERET; i++) {
            
        }
    }
}
