import java.awt.*;

public class SnorDexPage1 extends javax.swing.JFrame {
    public static TypeChartLoader typeLoader;

    public SnorDexPage1() {
        initComponents();
        
        PanelKonten.removeAll();

        PanelKonten.setLayout(new java.awt.BorderLayout());

        Pokedex pPanel = new Pokedex();

        pPanel.setPreferredSize(PanelKonten.getPreferredSize());

        PanelKonten.add(pPanel, java.awt.BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();

        instance = this;

        typeLoader = TypeChartLoader.load();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    public static SnorDexPage1 instance;

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Abilitybtn = new javax.swing.JButton();
        PokeDexBtn = new javax.swing.JButton();
        MoveDexBuuton = new javax.swing.JButton();
        ItemsDex = new javax.swing.JButton();
        LocationDex = new javax.swing.JButton();
        TypeDex = new javax.swing.JButton();
        NatureDex = new javax.swing.JButton();
        PanelKonten = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(29, 32, 38));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Pokemon Solid", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 90, 123));
        jLabel1.setText("SnorDex");

        Abilitybtn.setBackground(new java.awt.Color(29, 32, 38));
        Abilitybtn.setFont(new java.awt.Font("Pokemon Solid", 0, 36)); // NOI18N
        Abilitybtn.setForeground(new java.awt.Color(49, 90, 123));
        Abilitybtn.setText("Ability dex");
        Abilitybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbilitybtnActionPerformed(evt);
            }
        });

        PokeDexBtn.setBackground(new java.awt.Color(29, 32, 38));
        PokeDexBtn.setFont(new java.awt.Font("Pokemon Solid", 0, 36)); // NOI18N
        PokeDexBtn.setForeground(new java.awt.Color(49, 90, 123));
        PokeDexBtn.setText("Pokédex");
        PokeDexBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeDexBtnActionPerformed(evt);
            }
        });

        MoveDexBuuton.setBackground(new java.awt.Color(29, 32, 38));
        MoveDexBuuton.setFont(new java.awt.Font("Pokemon Solid", 0, 36)); // NOI18N
        MoveDexBuuton.setForeground(new java.awt.Color(49, 90, 123));
        MoveDexBuuton.setText("Moves dex");
        MoveDexBuuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveDexBuutonActionPerformed(evt);
            }
        });

        ItemsDex.setBackground(new java.awt.Color(29, 32, 38));
        ItemsDex.setFont(new java.awt.Font("Pokemon Solid", 0, 36)); // NOI18N
        ItemsDex.setForeground(new java.awt.Color(49, 90, 123));
        ItemsDex.setText("Items dex");
        ItemsDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsDexActionPerformed(evt);
            }
        });

        LocationDex.setBackground(new java.awt.Color(29, 32, 38));
        LocationDex.setFont(new java.awt.Font("Pokemon Solid", 0, 30)); // NOI18N
        LocationDex.setForeground(new java.awt.Color(49, 90, 123));
        LocationDex.setText("Location dex");
        LocationDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationDexActionPerformed(evt);
            }
        });

        TypeDex.setBackground(new java.awt.Color(29, 32, 38));
        TypeDex.setFont(new java.awt.Font("Pokemon Solid", 0, 36)); // NOI18N
        TypeDex.setForeground(new java.awt.Color(49, 90, 123));
        TypeDex.setText("Type dex");
        TypeDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypeDexActionPerformed(evt);
            }
        });

        NatureDex.setBackground(new java.awt.Color(29, 32, 38));
        NatureDex.setFont(new java.awt.Font("Pokemon Solid", 0, 35)); // NOI18N
        NatureDex.setForeground(new java.awt.Color(49, 90, 123));
        NatureDex.setText("Nature dex");
        NatureDex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatureDexActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NatureDex, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TypeDex, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationDex, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemsDex, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Abilitybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MoveDexBuuton, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PokeDexBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PokeDexBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(MoveDexBuuton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(Abilitybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(ItemsDex, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(LocationDex, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(TypeDex, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(NatureDex, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelKontenLayout = new javax.swing.GroupLayout(PanelKonten);
        PanelKonten.setLayout(PanelKontenLayout);
        PanelKontenLayout.setHorizontalGroup(
            PanelKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1135, Short.MAX_VALUE)
        );
        PanelKontenLayout.setVerticalGroup(
            PanelKontenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(PanelKonten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelKonten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbilitybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbilitybtnActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        AbilityDex aPanel = new AbilityDex();
        aPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(aPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_AbilitybtnActionPerformed

    private void PokeDexBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeDexBtnActionPerformed
        PanelKonten.removeAll();

        PanelKonten.setLayout(new java.awt.BorderLayout());

        Pokedex pPanel = new Pokedex();

        pPanel.setPreferredSize(PanelKonten.getPreferredSize());

        PanelKonten.add(pPanel, java.awt.BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_PokeDexBtnActionPerformed

    private void MoveDexBuutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveDexBuutonActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        MoveDex mPanel = new MoveDex();
        mPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(mPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_MoveDexBuutonActionPerformed

    private void ItemsDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsDexActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        ItemsDex iPanel = new ItemsDex();
        iPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(iPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_ItemsDexActionPerformed

    private void LocationDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationDexActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        LocationDex lPanel = new LocationDex();
        lPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(lPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_LocationDexActionPerformed

    private void TypeDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypeDexActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        TypeDex tPanel = new TypeDex();
        tPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(tPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_TypeDexActionPerformed

    private void NatureDexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatureDexActionPerformed
        PanelKonten.removeAll();
        PanelKonten.setLayout(new java.awt.BorderLayout());

        NatureDex nPanel = new NatureDex();
        nPanel.setPreferredSize(PanelKonten.getPreferredSize());
        PanelKonten.add(nPanel, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }//GEN-LAST:event_NatureDexActionPerformed

    public void showMoveDetail(MoveData data) {
        // tampilkan panel detail move di PanelKonten
    }
    
    public void showPokemonDetail(PokemonData data){

        PanelKonten.removeAll();

        PanelKonten.setLayout(new BorderLayout());

        typeLoader = TypeChartLoader.loadFromJson("TypeChart.json");

        PokeDetail detail = new PokeDetail(typeLoader);

        detail.setPokemon(data);

        PanelKonten.add(detail, BorderLayout.CENTER);

        PanelKonten.revalidate();
        PanelKonten.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SnorDexPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SnorDexPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SnorDexPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SnorDexPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SnorDexPage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Abilitybtn;
    private javax.swing.JButton ItemsDex;
    private javax.swing.JButton LocationDex;
    private javax.swing.JButton MoveDexBuuton;
    private javax.swing.JButton NatureDex;
    private javax.swing.JPanel PanelKonten;
    private javax.swing.JButton PokeDexBtn;
    private javax.swing.JButton TypeDex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
