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
public class Treasure {
    //Variables
    private String name;
    private int bonus;
    private TreasureKind type;

    //Metodos publicos
    public Treasure(String n, int bonus, TreasureKind t){
        this.name = n;
        this.bonus = bonus;
        this.type = t;
    }

    public String getName(){
        return this.name;
    }

    public int getBonus(){
        return this.bonus;
    }

    public TreasureKind getType(){
        return this.type;
    }

    @Override
    public String toString(){
      return this.name + "\n\t Tipo:" + this.type + "\n\t Bonus Nivel: " + this.bonus;
    }
}
