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
public class LogikaiBekak {
    
    static Scanner sc = new Scanner(System.in, "latin2"); 
    
    public static void main(String[] args) {
        String beka = "🐸";
        String level = "__";
        String[] jatekter = {beka, beka, beka, level};
        int[] lepesek = {1, 2, 3, 4};
        
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println("");
        
        for (int i = 0; i < jatekter.length; i++) {
            System.out.printf("%-2s ", i+1);
        }
        System.out.println("");
        
        for (int i = 0; i < jatekter.length; i++) {
            int valasztas = sc.nextInt();
            System.out.println("Melyikkel mész: " + valasztas);
        }
    }
}
