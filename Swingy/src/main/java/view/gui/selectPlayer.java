package view.gui;


public class selectPlayer extends javax.swing.JFrame {

    /**
     * Creates new form selectPlayer
     */
    public selectPlayer() {
        initComponents();
    }
    private SwingyJF prev;
    
    public selectPlayer(SwingyJF aThis) {
        initComponents();
        prev = aThis;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();
        protectiveArmorLBL = new javax.swing.JLabel();
        helmLBL = new javax.swing.JLabel();
        helmCBX = new javax.swing.JComboBox<>();
        attackLBL = new javax.swing.JLabel();
        defenceLBL = new javax.swing.JLabel();
        attackTxtLbl = new javax.swing.JLabel();
        defenceTxtLbl = new javax.swing.JLabel();
        imageLBL = new javax.swing.JLabel();
        heroNameLBL = new javax.swing.JLabel();
        HeroNameTBX = new javax.swing.JTextField();
        weaponOfChoice = new javax.swing.JLabel();
        weaponCBX = new javax.swing.JComboBox<>();
        heroClassLBL = new javax.swing.JLabel();
        heroClassCBX = new javax.swing.JComboBox<>();
        hitPointsLBL = new javax.swing.JLabel();
        protectiveArmorCBX = new javax.swing.JComboBox<>();
        hitPointsTxtLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        selectHeroLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        exitBTN.setText("exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        backBTN.setText("back");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        protectiveArmorLBL.setText("Armor of choice");

        helmLBL.setText("helm");

        helmCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "gogo'sMagic", "KZNSpecial", "limpopoGlory" }));
        helmCBX.setEnabled(false);

        attackLBL.setText("Attack");

        defenceLBL.setText("Defense");

        attackTxtLbl.setBackground(new java.awt.Color(204, 255, 204));
        attackTxtLbl.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        attackTxtLbl.setText("Attack");

        defenceTxtLbl.setBackground(new java.awt.Color(255, 204, 204));
        defenceTxtLbl.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        defenceTxtLbl.setText("Attack");

        imageLBL.setBackground(new java.awt.Color(0, 102, 102));
        imageLBL.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N

        heroNameLBL.setText("Hero Name");

        HeroNameTBX.setEnabled(false);

        weaponOfChoice.setText("weapon of choice");

        weaponCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Slayer's Exe", "sword of the lord's charm", "black fury spear", "arieliunous bow", "twigs twin blades" }));
        weaponCBX.setEnabled(false);

        heroClassLBL.setText("Hero class");

        heroClassCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Knight", "BlackMagicWarrior", "shadower", " " }));
        heroClassCBX.setEnabled(false);

        hitPointsLBL.setText("hit points");

        protectiveArmorCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "granny's cat", "rynxGlove", "ridpants", "knightOfWands", "knightOfValor" }));
        protectiveArmorCBX.setEnabled(false);

        hitPointsTxtLbl.setBackground(new java.awt.Color(204, 204, 255));
        hitPointsTxtLbl.setFont(new java.awt.Font("Lucida Handwriting", 3, 18)); // NOI18N
        hitPointsTxtLbl.setText("Attack");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        selectHeroLBL.setBackground(new java.awt.Color(204, 255, 255));
        selectHeroLBL.setFont(new java.awt.Font("Broadway", 1, 24)); // NOI18N
        selectHeroLBL.setForeground(new java.awt.Color(102, 102, 102));
        selectHeroLBL.setText("select hero");
        selectHeroLBL.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(defenceLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(hitPointsLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(defenceTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(hitPointsTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectHeroLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 574, Short.MAX_VALUE)
                        .addComponent(exitBTN)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heroNameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HeroNameTBX, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(weaponOfChoice)
                                    .addComponent(weaponCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(heroClassCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heroClassLBL))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(protectiveArmorLBL)
                                    .addComponent(protectiveArmorCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(helmLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(helmCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(attackLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(attackTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(247, 247, 247)
                    .addComponent(imageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(heroClassLBL)
                                .addGap(18, 18, 18)
                                .addComponent(heroClassCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(weaponOfChoice)
                                        .addGap(23, 23, 23)
                                        .addComponent(weaponCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(protectiveArmorLBL)
                                        .addGap(18, 18, 18)
                                        .addComponent(protectiveArmorCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(helmLBL)
                                        .addGap(18, 18, 18)
                                        .addComponent(helmCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addComponent(heroNameLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(HeroNameTBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defenceLBL)
                            .addComponent(hitPointsLBL))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(defenceTxtLbl)
                            .addComponent(hitPointsTxtLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectHeroLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitBTN)
                    .addComponent(backBTN))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(imageLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(122, 122, 122)
                            .addComponent(attackLBL)
                            .addGap(16, 16, 16)
                            .addComponent(attackTxtLbl)))
                    .addContainerGap(42, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBTNActionPerformed

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        prev.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBTNActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField HeroNameTBX;
    private javax.swing.JLabel attackLBL;
    private javax.swing.JLabel attackTxtLbl;
    private javax.swing.JButton backBTN;
    private javax.swing.JLabel defenceLBL;
    private javax.swing.JLabel defenceTxtLbl;
    private javax.swing.JButton exitBTN;
    private javax.swing.JComboBox<String> helmCBX;
    private javax.swing.JLabel helmLBL;
    private javax.swing.JComboBox<String> heroClassCBX;
    private javax.swing.JLabel heroClassLBL;
    private javax.swing.JLabel heroNameLBL;
    private javax.swing.JLabel hitPointsLBL;
    private javax.swing.JLabel hitPointsTxtLbl;
    private javax.swing.JLabel imageLBL;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> protectiveArmorCBX;
    private javax.swing.JLabel protectiveArmorLBL;
    private javax.swing.JLabel selectHeroLBL;
    private javax.swing.JComboBox<String> weaponCBX;
    private javax.swing.JLabel weaponOfChoice;
    // End of variables declaration//GEN-END:variables
}
