/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lotto;

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
public class Lotto {

    
    public static void main(String[] args) {
        /* deklarálás */
        final int DB = 90;
        boolean[] szamok = new boolean[DB+1];
        
        /* inicializálás */
        for (int i = 0; i < DB+1; i++) {
            szamok[i] = false;
        }
        
        /* húzás */
        int db = 0;
        while(db < 5){
           int i = (int) (Math.random()*90)+1;
           if(!(szamok[i])){
               szamok[i]=true;
               db++;
           }
        }
        
        /* eredmény megjelenítése */
        System.out.println("A nyerő számok: ");
        for (int i = 0; i < DB+1; i++) {
            if(szamok[i]){
                System.out.print(i + " " );
            }
        }
        System.out.println(" ");
    }
    
}
