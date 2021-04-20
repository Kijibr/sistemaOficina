package Interfaces;

import Classes.Peca;
import Dao.DaoPeca;
import javax.swing.JOptionPane;

public class FrmPeca extends javax.swing.JFrame {

    Peca pc = new Peca();
    DaoPeca dao = new DaoPeca();
    
    public FrmPeca() {
        initComponents();
        setLocationRelativeTo(null); //centraliza a aba
    }

    private void passa_dados(){
        pc.setNome(txtnome.getText());
        pc.setPreco_unitario(Double.parseDouble(txtpreco_unitario.getText()));
        pc.setQt_estoque(txtqt_estoque.getText());
    }
    
    private void mostra_dados(){
        txtid.setText(String.valueOf(pc.getIdpeca()));
        txtnome.setText(pc.getNome());
        txtpreco_unitario.setText(String.valueOf(pc.getPreco_unitario()));
        txtqt_estoque.setText(pc.getQt_estoque());
    }
    
    private void limpar(){
        txtid.setText("");
        txtnome.setText("");
        txtpreco_unitario.setText("");
        txtqt_estoque.setText("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnome = new javax.swing.JTextField();
        txtpreco_unitario = new javax.swing.JTextField();
        txtqt_estoque = new javax.swing.JTextField();
        btsave = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        btseachnome = new javax.swing.JButton();
        btsearchcod = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel2.setText("Controle de Peças");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Código");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel4.setText("Preço Unit");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel5.setText("Qt Estoque");

        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Media-Floppy-32.png"))); // NOI18N
        btsave.setText("Salvar");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Clear-32.png"))); // NOI18N
        btclear.setText("Limpar");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        btseachnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btseachnome.setBorder(null);
        btseachnome.setBorderPainted(false);
        btseachnome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btseachnome.setFocusPainted(false);
        btseachnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseachnomeActionPerformed(evt);
            }
        });

        btsearchcod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btsearchcod.setBorder(null);
        btsearchcod.setBorderPainted(false);
        btsearchcod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btsearchcod.setFocusPainted(false);
        btsearchcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchcodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtpreco_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btsearchcod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtqt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btseachnome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 278, Short.MAX_VALUE)
                        .addComponent(btsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btclear)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btseachnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btsearchcod, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtpreco_unitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtqt_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btclear)
                            .addComponent(btsave))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
        passa_dados();
        dao.cadastrar(pc);
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado !" + pc.getNome());
        limpar();
    }//GEN-LAST:event_btsaveActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        limpar();
    }//GEN-LAST:event_btclearActionPerformed

    private void btseachnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseachnomeActionPerformed
        pc.setNome(txtnome.getText());
                dao.buscacod(pc);
        mostra_dados();
    }//GEN-LAST:event_btseachnomeActionPerformed

    private void btsearchcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchcodActionPerformed
        pc.setIdpeca(Integer.parseInt(txtid.getText()));
        dao.buscacod(pc);
        mostra_dados();
    }//GEN-LAST:event_btsearchcodActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclear;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btseachnome;
    private javax.swing.JButton btsearchcod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtpreco_unitario;
    private javax.swing.JTextField txtqt_estoque;
    // End of variables declaration//GEN-END:variables
}
