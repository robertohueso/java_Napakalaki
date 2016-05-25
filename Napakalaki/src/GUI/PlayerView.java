/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.CultistPlayer;
import NapakalakiGame.Napakalaki;
import NapakalakiGame.Player;
import NapakalakiGame.Treasure;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author roberto
 */
public class PlayerView extends javax.swing.JPanel {
    private Player playerModel;
    private Napakalaki napakalakiModel;

    /**
     * Creates new form PlayerView
     */
    public PlayerView() {
        initComponents();
    }
    
    public void setNapakalaki(Napakalaki game){
        this.napakalakiModel = game;
    }
    
    public void setPlayer(Player player){
        this.playerModel = player;
        name.setText(player.getName());
        level.setText(Integer.toString(playerModel.getLevels()));
        combat_level.setText(Integer.toString(playerModel.getCombatLevel()));
        if(player instanceof CultistPlayer)
            cultist_bool.setText("Si");
        else
            cultist_bool.setText("No");
        cultist_amount.setText(Integer.toString(CultistPlayer.getTotalCultistPlayers()));
        this.fillTreasurePanel(hiddenTreasures, playerModel.getHiddenTreasures());
        this.fillTreasurePanel(visibleTreasures, playerModel.getVisibleTreasures());
        if(player.getPendingBadConsequence() != null){
            PendingBadConsequenceView aPBC = new PendingBadConsequenceView();
            aPBC.setBadConsequence(player.getPendingBadConsequence());
            aPBC.setVisible(true);
            pendingBC.add(aPBC);
        }
        repaint();
        revalidate();
    }
    
    private ArrayList<Treasure> getSelectedTreasures(JPanel aPanel){
        TreasureView tv;
        ArrayList<Treasure> output = new ArrayList();
        for(Component c:aPanel.getComponents()){
            tv = (TreasureView) c;
            if(tv.isSelected())
                output.add(tv.getTreasure());
        }
        return output;
    }
    
    private void fillTreasurePanel(JPanel aPanel, ArrayList<Treasure> aList){
        aPanel.removeAll();
        
        for(Treasure t:aList){
            TreasureView aTreasureView = new TreasureView();
            aTreasureView.setTreasure(t);
            aTreasureView.setVisible(true);
            aPanel.add(aTreasureView);
        }
        
        aPanel.repaint();
        aPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cultist_amount = new javax.swing.JLabel();
        cultist_bool = new javax.swing.JLabel();
        combat_level = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hiddenTreasures = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        visibleTreasures = new javax.swing.JPanel();
        makeVisible = new javax.swing.JButton();
        discardTreasures = new javax.swing.JButton();
        discardAllTreasures = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pendingBC = new javax.swing.JPanel();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Level");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setText("Combat Level");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setText("Sectario");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setText("Cantidad Sectarios");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cultist_amount.setText("jLabel6");

        cultist_bool.setText("jLabel6");

        combat_level.setText("jLabel6");

        level.setText("jLabel6");

        name.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel7.setText("Tesoros Ocultos");

        hiddenTreasures.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setText("Tesoros Visibles");

        visibleTreasures.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        makeVisible.setText("Make Visible");
        makeVisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeVisibleActionPerformed(evt);
            }
        });

        discardTreasures.setText("Discard Treasures");
        discardTreasures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardTreasuresActionPerformed(evt);
            }
        });

        discardAllTreasures.setText("Discard All Treasures");
        discardAllTreasures.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discardAllTreasuresActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel8.setText("Mal Rollo Pendiente");

        pendingBC.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(makeVisible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discardTreasures)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(discardAllTreasures)
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(level)
                            .addComponent(hiddenTreasures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combat_level)
                            .addComponent(cultist_bool)
                            .addComponent(cultist_amount))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pendingBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(name))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(level)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combat_level)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cultist_bool))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cultist_amount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(hiddenTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(visibleTreasures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(pendingBC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makeVisible)
                    .addComponent(discardTreasures)
                    .addComponent(discardAllTreasures)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void makeVisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeVisibleActionPerformed
        ArrayList<Treasure> selHidden = getSelectedTreasures(hiddenTreasures);
        napakalakiModel.makeTreasuresVisible(selHidden);
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_makeVisibleActionPerformed

    private void discardTreasuresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardTreasuresActionPerformed
        ArrayList<Treasure> selHidden = getSelectedTreasures(hiddenTreasures);
        ArrayList<Treasure> selVisible = getSelectedTreasures(visibleTreasures);
        napakalakiModel.discardHiddenTreasures(selHidden);
        napakalakiModel.discardVisibleTreasures(selVisible);
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardTreasuresActionPerformed

    private void discardAllTreasuresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discardAllTreasuresActionPerformed
        napakalakiModel.getCurrentPlayer().discardAllTreasures();
        setPlayer(napakalakiModel.getCurrentPlayer());
    }//GEN-LAST:event_discardAllTreasuresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel combat_level;
    private javax.swing.JLabel cultist_amount;
    private javax.swing.JLabel cultist_bool;
    private javax.swing.JButton discardAllTreasures;
    private javax.swing.JButton discardTreasures;
    private javax.swing.JPanel hiddenTreasures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel level;
    private javax.swing.JButton makeVisible;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pendingBC;
    private javax.swing.JPanel visibleTreasures;
    // End of variables declaration//GEN-END:variables
}
