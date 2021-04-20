package Interfaces;

import Classes.Cliente;
import Dao.DaoCliente;
import javax.swing.JOptionPane;

public class FrmCliente extends javax.swing.JFrame {

    Cliente cli = new Cliente();
    DaoCliente dao = new DaoCliente();
             
    public FrmCliente() {
        initComponents();
        setLocationRelativeTo(null); //centraliza a aba
    }
    
    private void passa_dados(){
        cli.setNome(txtnome.getText());
        cli.setTelefone(txttelefone.getText());
        cli.setCep(txtcep.getText());
        cli.setNumero(Integer.parseInt(txtnumero.getText()));
        cli.setComplemento(txtcomplemento.getText());
    }
    
    private void mostra_dados(){
        txtid.setText(String.valueOf(cli.getIdcliente()));
        txtnome.setText(cli.getNome());
        txttelefone.setText(cli.getTelefone());
        txtcep.setText(cli.getCep());
        txtnumero.setText(String.valueOf(cli.getNumero()));
        txtcomplemento.setText(cli.getComplemento());
    }
    
    private void limpar(){
        txtid.setText("");
        txtnome.setText("");
        txttelefone.setText("");
        txtcep.setText("");
        txtnumero.setText("");
        txtcomplemento.setText("");
    
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcep = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtrua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcomplemento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtuf = new javax.swing.JTextField();
        btsave = new javax.swing.JButton();
        btsearchcod = new javax.swing.JButton();
        btseachnome = new javax.swing.JButton();
        btclear = new javax.swing.JButton();
        btalterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Controle de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Código");

        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Nome");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setText("Cep");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setText("Bairro");

        txtbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbairroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setText("Telefone");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setText("Rua");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setText("Número");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setText("Complemento");

        txtcomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcomplementoActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setText("Cidade");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setText("UF");

        btsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Media-Floppy-32.png"))); // NOI18N
        btsave.setText("Salvar");
        btsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaveActionPerformed(evt);
            }
        });

        btsearchcod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btsearchcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsearchcodActionPerformed(evt);
            }
        });

        btseachnome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icon-busca.png"))); // NOI18N
        btseachnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btseachnomeActionPerformed(evt);
            }
        });

        btclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Edit-Clear-32.png"))); // NOI18N
        btclear.setText("Limpar");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        btalterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Gnome-Accessories-Text-Editor-32.png"))); // NOI18N
        btalterar.setText("Alterar");
        btalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btalterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcep))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btsearchcod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btseachnome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btalterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btsave)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btclear))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btseachnome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btsearchcod, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(txtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtuf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btsave)
                        .addComponent(btclear))
                    .addComponent(btalterar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtcomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcomplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcomplementoActionPerformed

    private void txtbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbairroActionPerformed

    private void btsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaveActionPerformed
       passa_dados();
       dao.cadastrar(cli);
       JOptionPane.showMessageDialog(null, "Cliente Cadastrado !" + cli.getNome());
       limpar();
    }//GEN-LAST:event_btsaveActionPerformed

    private void btsearchcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsearchcodActionPerformed
       cli.setIdcliente(Integer.parseInt(txtid.getText()));
       dao.buscacod(cli);
        mostra_dados(); //mostra o que tem na classe
    }//GEN-LAST:event_btsearchcodActionPerformed

    private void btseachnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btseachnomeActionPerformed
        cli.setNome(txtnome.getText());
        dao.buscacod(cli);
        mostra_dados();
    }//GEN-LAST:event_btseachnomeActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        limpar();
    }//GEN-LAST:event_btclearActionPerformed

    private void btalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btalterarActionPerformed
       cli.setIdcliente(Integer.parseInt(txtid.getText()));
       passa_dados();
       dao.alterar(cli);
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");

        
    }//GEN-LAST:event_btalterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btalterar;
    private javax.swing.JButton btclear;
    private javax.swing.JButton btsave;
    private javax.swing.JButton btseachnome;
    private javax.swing.JButton btsearchcod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcomplemento;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtrua;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JTextField txtuf;
    // End of variables declaration//GEN-END:variables

}
