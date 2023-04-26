
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class Tela_Inicial extends javax.swing.JPanel {
    static ArrayList<Produto> listaAdicionados;
    
    public Tela_Inicial() {
        initComponents();
        listaAdicionados = new ArrayList();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lb_icon = new javax.swing.JLabel();
        bt_castro = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lb_backGround = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jLabel2.setText("jLabel2");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(480, 392));
        setLayout(null);

        lb_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fox Logo_supermercado_199-240.png"))); // NOI18N
        add(lb_icon);
        lb_icon.setBounds(130, 20, 199, 240);

        bt_castro.setBackground(new java.awt.Color(255, 153, 102));
        bt_castro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_castro.setForeground(new java.awt.Color(0, 0, 51));
        bt_castro.setText("Cadastre-se");
        bt_castro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_castroMouseClicked(evt);
            }
        });
        bt_castro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_castroActionPerformed(evt);
            }
        });
        add(bt_castro);
        bt_castro.setBounds(30, 280, 130, 40);

        bt_login.setBackground(new java.awt.Color(255, 153, 102));
        bt_login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_login.setForeground(new java.awt.Color(0, 0, 0));
        bt_login.setText("Login");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });
        add(bt_login);
        bt_login.setBounds(320, 280, 130, 40);
        add(jLabel5);
        jLabel5.setBounds(0, 0, 0, 0);

        lb_backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_480 - 392.jpg"))); // NOI18N
        lb_backGround.setText("back");
        add(lb_backGround);
        lb_backGround.setBounds(0, 0, 480, 390);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_castroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_castroActionPerformed
        
    }//GEN-LAST:event_bt_castroActionPerformed

    private void bt_castroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_castroMouseClicked
        Janela.t3 = new Tela_cadastro();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t1);
        janela.add(Janela.t3, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_castroMouseClicked

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Janela.t2 = new Tela_login();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t1);
        janela.add(Janela.t2, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_loginMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_castro;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lb_backGround;
    private javax.swing.JLabel lb_icon;
    // End of variables declaration//GEN-END:variables
}
