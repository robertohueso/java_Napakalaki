/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NapakalakiGame;

import GUI.*;
import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class Main {
    private static Napakalaki game;
    private static NapakalakiView napakalakiView;
    private static ArrayList<String> names;
    
    public static void main(String[] args){
        
        game = Napakalaki.getInstance();
        napakalakiView = new NapakalakiView();
        
        Dice.createInstance(napakalakiView);
        
        PlayerNamesCapture namesCapture = new PlayerNamesCapture(napakalakiView, true);
        names = namesCapture.getNames();
        game.initGame(names);
        napakalakiView.setNapakalaki(game);
        napakalakiView.setVisible(true);
        
    }
}
