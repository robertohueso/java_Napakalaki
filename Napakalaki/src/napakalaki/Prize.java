/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

/**
 *
 * @author roberto
 */
public class Prize {
    //Datos miembros
    private int treasures;
    private int level;
    
    //Constructor
    public Prize(int treasures, int level){
        this.treasures = treasures;
        this.level = level;
    }
    
    //Getters basicos
    public int getTreasures(){
        return this.treasures;
    }
    
    public int getLevel(){
        return this.level;
    }
    
}
