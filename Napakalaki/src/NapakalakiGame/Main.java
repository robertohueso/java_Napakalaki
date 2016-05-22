/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import GUI.Dice;
import GUI.NapakalakiView;

/**
 *
 * @author roberto
 */
public class Main {
    protected static Napakalaki game;
    protected static NapakalakiView napakalakiView;
    
    public static void main(String[] args){
        Main.game = Napakalaki.getInstance();
        Main.napakalakiView = new NapakalakiView();
        
        Dice.createInstance(napakalakiView);
        napakalakiView.setNapakalaki(game);
        napakalakiView.setVisible(true);
        
    }
}
