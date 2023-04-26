
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

        jLabel2 = new javax.swing.JLabel();
        bt_adm = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_cliente = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Cadastro");
        add(jLabel2);
        jLabel2.setBounds(120, 30, 220, 39);

        bt_adm.setBackground(new java.awt.Color(255, 153, 102));
        bt_adm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_adm.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_adm);
        bt_adm.setBounds(30, 220, 160, 90);
        add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);
        add(jLabel1);
        jLabel1.setBounds(62, 118, 5, 5);

        jLabel5.setBackground(new java.awt.Color(255, 102, 0));
        add(jLabel5);
        jLabel5.setBounds(0, 0, 0, 0);

        bt_cliente.setBackground(new java.awt.Color(255, 153, 102));
        bt_cliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_cliente.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_cliente);
        bt_cliente.setBounds(280, 220, 153, 90);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_480 - 392.jpg"))); // NOI18N
        lb_back.setText("jLabel6");
        add(lb_back);
        lb_back.setBounds(0, 0, 480, 390);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_back;
    // End of variables declaration//GEN-END:variables
}
