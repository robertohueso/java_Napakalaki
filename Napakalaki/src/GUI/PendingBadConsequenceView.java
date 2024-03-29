/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import NapakalakiGame.BadConsequence;
import NapakalakiGame.DeathBadConsequence;
import NapakalakiGame.NumericBadConsequence;
import NapakalakiGame.SpecificBadConsequence;

/**
 *
 * @author roberto
 */
public class PendingBadConsequenceView extends javax.swing.JPanel {
    private BadConsequence bcModel;

    /**
     * Creates new form PendingBadConsequenceView
     */
    public PendingBadConsequenceView() {
        initComponents();
    }
    
    public void setBadConsequence(BadConsequence badCons){
        this.bcModel = badCons;
        this.updateView();
        repaint();
    }
    
    public void updateView(){
        if(bcModel instanceof NumericBadConsequence){
            NumericBadConsequence model = (NumericBadConsequence) bcModel;
            this.hiddenText.setText(Integer.toString(model.getNHiddenTreasures()));
            this.visibleText.setText(Integer.toString(model.getNVisibleTreasures()));
        }else if(bcModel instanceof SpecificBadConsequence){
            SpecificBadConsequence model = (SpecificBadConsequence) bcModel;
            this.hiddenText.setText(model.getSpecificHiddenTreasures().toString());
            this.visibleText.setText(model.getSpecificVisibleTreasures().toString());
        }else if(bcModel instanceof DeathBadConsequence){
            NumericBadConsequence model = (NumericBadConsequence) bcModel;
            this.hiddenText.setText(Integer.toString(model.getNHiddenTreasures()));
            this.visibleText.setText(Integer.toString(model.getNVisibleTreasures()));
        }
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
        hiddenText = new javax.swing.JLabel();
        visibleText = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setText("Ocultos");

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setText("Visibles");

        hiddenText.setText("jLabel3");

        visibleText.setText("jLabel3");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hiddenText)
                    .addComponent(visibleText))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(hiddenText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(visibleText))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hiddenText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel visibleText;
    // End of variables declaration//GEN-END:variables
}
