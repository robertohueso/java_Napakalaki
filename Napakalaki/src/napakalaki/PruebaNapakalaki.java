/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class PruebaNapakalaki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Monster> monstruos = new ArrayList();
        
        //monstruos.add()
        Prize prize = new Prize(4, 5);
        BadConsequence badCons = new BadConsequence("Hola esto es una prueba", 4, 8, 7);
        Monster monster = new Monster("Ralph", 5, badCons, prize);
        
        System.out.println(monster.toString());
    }
    
}
