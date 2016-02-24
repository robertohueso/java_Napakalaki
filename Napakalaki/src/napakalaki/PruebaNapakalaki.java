/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package napakalaki;

import java.util.ArrayList;
import java.util.Arrays;

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
        
        BadConsequence bc;
        Prize prize;
        
        //Byakhees
        bc = new BadConsequence("Pierdes tu armadura visible y otra oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList(Arrays.asList(TreasureKind.ARMOR)));
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Byakhees de bonanza", 8, bc, prize));
        
        //Chibithulhu
        bc = new BadConsequence("Embobados del con el lindo primigeneo te descartas"
                + "de tu casco visible",
                0, new ArrayList(Arrays.asList(TreasureKind.HELMET)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Chibithulhu", 2, bc, prize));
        
        //El sopor de Dunwich
        bc = new BadConsequence("El primordial bostezo contagioso. Pierdes el calzado visible",
                0, new ArrayList(Arrays.asList(TreasureKind.SHOES)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("El sopor de Dunwich", 2, bc, prize));
        
        //Angeles de la noche ibicenca
        bc = new BadConsequence("Te atrapan para llevarte de fiesta y te dejan caer"
                + "en mitad del vuelo. Descarta 1 mano visible y 1 mano oculta",
                0, new ArrayList(Arrays.asList(TreasureKind.ONEHAND)),
                new ArrayList(Arrays.asList(TreasureKind.ONEHAND)));
        prize =  new Prize(4, 1);
        monstruos.add(new Monster("El sopor de Dunwich", 14, bc, prize));
        
        //El gorrón en el umbral
        bc = new BadConsequence("Pierdes todos tus tesoros visibles",
                0, 10, 0);
        prize =  new Prize(3, 1);
        monstruos.add(new Monster("El gorron en el umbral", 10, bc, prize));
        
        //H.P Munchcraft
        bc = new BadConsequence("Pierdes la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("H.P Munchcraft", 6, bc, prize));
        
        //Bichgooth
        bc = new BadConsequence("Sientes bichos bajo la ropa. Descarta"
                + "la armadura visible",
                0, new ArrayList(Arrays.asList(TreasureKind.ARMOR)),
                new ArrayList());
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("Bichgooth", 2, bc, prize));
        
        //El rey rosa
        bc = new BadConsequence("Pierdes 5 niveles y 3 tesoros visibles",
                5, 3, 0);
        prize =  new Prize(4, 2);
        monstruos.add(new Monster("El rey rosa", 13, bc, prize));
        
        //La que redacta en las tinieblas
        bc = new BadConsequence("Toses los pulmones y pierdes 2 niveles",
                2, 0, 0);
        prize =  new Prize(1, 1);
        monstruos.add(new Monster("La que redacta en las tinieblas", 2, bc, prize));
        
        //Los hondos
        bc = new BadConsequence("Estos monstruos resultan bastante superficiales"
                + "y te aburren mortalmente. Estas muerto");
        prize =  new Prize(2, 1);
        monstruos.add(new Monster("Los hondos", 8, bc, prize));
        
        
        /*
        //monstruos.add()
        Prize prize = new Prize(4, 5);
        BadConsequence badCons = new BadConsequence("Hola esto es una prueba", 4, 8, 7);
        Monster monster = new Monster("Ralph", 5, badCons, prize);
        
        System.out.println(monster.toString());
        */
    }
    
}
