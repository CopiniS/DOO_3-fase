
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Tela_cadastro extends javax.swing.JPanel {
    ArrayList<Cliente> listaClientes;
    ArrayList<Administrador> listaAdministradores;
    
    public Tela_cadastro() {
        initComponents();
        this.listaClientes = listaClientes;
        this.listaAdministradores = listaAdministradores;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        bt_adm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_cliente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Cadastro");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = -25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 58, 0, 0);
        add(jLabel2, gridBagConstraints);

        bt_adm.setBackground(new java.awt.Color(255, 102, 0));
        bt_adm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_adm.setForeground(new java.awt.Color(255, 255, 255));
        bt_adm.setText("Adminitrador");
        bt_adm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_admMouseClicked(evt);
            }
        });
        bt_adm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_admActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        add(bt_adm, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 60, 0, 0);
        add(jLabel3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 60, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 70, 0, 0);
        add(jLabel5, gridBagConstraints);

        bt_cliente.setBackground(new java.awt.Color(255, 102, 0));
        bt_cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_cliente.setForeground(new java.awt.Color(255, 255, 255));
        bt_cliente.setText("Cliente");
        bt_cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_clienteMouseClicked(evt);
            }
        });
        bt_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 26);
        add(bt_cliente, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 219;
        gridBagConstraints.ipady = 214;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 50, 33, 0);
        add(jLabel4, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_admActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_admActionPerformed
        
    }//GEN-LAST:event_bt_admActionPerformed

    private void bt_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clienteActionPerformed
        
    }//GEN-LAST:event_bt_clienteActionPerformed

    private void bt_admMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_admMouseClicked
        Janela.t5 = new Tela_cadastro_admi();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t3);
        janela.add(Janela.t5, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_admMouseClicked

    private void bt_clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_clienteMouseClicked
        Janela.t4 = new Tela_cadastroCliente();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t3);
        janela.add(Janela.t4, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_clienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_adm;
    private javax.swing.JButton bt_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
