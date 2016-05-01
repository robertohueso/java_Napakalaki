/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

/**
 *
 * @author roberto
 */
public class Prize {
    //Datos miembros
    private int treasures;
    private int levels;
    
    //Constructor
    public Prize(int treasures, int level){
        this.treasures = treasures;
        this.levels = level;
    }
    
    //Getters basicos
    public int getTreasures(){
        return this.treasures;
    }
    
    public int getLevels(){
        return this.levels;
    }
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return "Ganas " + this.treasures + " tesoros y " +
                this.levels + " niveles.";
    }
    
}
