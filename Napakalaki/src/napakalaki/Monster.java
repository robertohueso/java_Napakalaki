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
public class Monster {
    //Datos miembro
    private String name;
    private int combatLevel;
    private Prize prize;
    private BadConsequence badCons;
    
    //Constructor
    public Monster(String name, int level, BadConsequence bc, Prize prize){
        this.name = name;
        this.combatLevel = level;
        //FIXME ¿Es necesario constructor de copia?
        this.prize = prize;
        this.badCons = bc;
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public int getCombatLevel(){
        return this.combatLevel;
    }
    
    //Devuelve el estado en forma de String
    @Override
    public String toString(){
        return "Name = " + this.name +
                " Combat Level = " + Integer.toString(this.combatLevel) +
                " Prize: " + this.prize.toString() +
                " Bad Consequence: " + this.badCons.toString();
    }
}
