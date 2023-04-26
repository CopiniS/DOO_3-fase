
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_cadastro_admi extends javax.swing.JPanel {
    static ArrayList<Administrador> listaAdministradores;
    
    
    
    public Tela_cadastro_admi() {
        initComponents();
        listaAdministradores = new ArrayList<>();
    }
   
    public Administrador criaAdministrador(){
        Administrador a1 = new Administrador();
        
        
        a1.setNome(tx_nome.getText());
        a1.setCargo(tx_cargo.getText());
        a1.setUsuario(tx_usuario.getText());
        a1.setSenha(tx_senha.getText());
        a1.setRepitaSenha(tx_repitaSenha.getText());
        
        return a1;
    }
    
    public void limparTextos(){
        tx_nome.setText("");
        tx_cargo.setText("");
        tx_usuario.setText("");
        tx_senha.setText("");
        tx_repitaSenha.setText("");
        
    }
    
    public boolean tratarErro(){
        boolean existeErro = false;
        
        if(tx_nome.getText().isBlank() || tx_cargo.getText().isBlank()||
        tx_usuario.getText().isBlank() || tx_senha.getText().isBlank() ||  tx_repitaSenha.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            existeErro = true;
        }
        
        else if(!tx_senha.getText().equals(tx_repitaSenha.getText())){
            JOptionPane.showMessageDialog(null, "Digite senhas iguais", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            existeErro = true;
        }
        
        else if(!listaAdministradores.isEmpty() || !Tela_cadastroCliente.listaClientes.isEmpty()){
            if(!listaAdministradores.isEmpty()){
                for(int i=0; i<listaAdministradores.size(); i++){
                    if(listaAdministradores.get(i).getUsuario().equals(tx_usuario.getText())){
                        JOptionPane.showMessageDialog(null, "Este usuario ja está em uso", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
                        existeErro = true;
                    }
                }
            }
        
            if(!Tela_cadastroCliente.listaClientes.isEmpty()){
                for(int i=0; i<Tela_cadastroCliente.listaClientes.size(); i++){
                    if(Tela_cadastroCliente.listaClientes.get(i).getUsuario().equals(tx_usuario.getText())){
                        JOptionPane.showMessageDialog(null, "Este usuario ja está em uso", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
                        existeErro = true;
                    }
                }
            }
        }
        return existeErro;
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_nome = new javax.swing.JTextField();
        tx_cargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        bt_salvar = new javax.swing.JButton();
        bt_login = new javax.swing.JButton();
        tx_senha = new javax.swing.JPasswordField();
        tx_repitaSenha = new javax.swing.JPasswordField();
        lb_back = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(429, 518));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Cadastrar Administrador");
        add(jLabel1);
        jLabel1.setBounds(60, 20, 293, 27);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Nome: ");
        add(jLabel2);
        jLabel2.setBounds(60, 70, 70, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Cargo:");
        add(jLabel4);
        jLabel4.setBounds(60, 140, 58, 27);

        tx_nome.setBackground(new java.awt.Color(255, 255, 255));
        tx_nome.setForeground(new java.awt.Color(0, 0, 0));
        add(tx_nome);
        tx_nome.setBounds(60, 100, 280, 22);

        tx_cargo.setBackground(new java.awt.Color(255, 255, 255));
        tx_cargo.setForeground(new java.awt.Color(0, 0, 0));
        tx_cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_cargoActionPerformed(evt);
            }
        });
        add(tx_cargo);
        tx_cargo.setBounds(60, 170, 280, 22);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Usuário:");
        add(jLabel6);
        jLabel6.setBounds(60, 210, 80, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Senha:");
        add(jLabel7);
        jLabel7.setBounds(60, 280, 70, 33);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Repita a senha:");
        add(jLabel8);
        jLabel8.setBounds(60, 350, 140, 25);
        add(jLabel9);
        jLabel9.setBounds(500, 0, 94, 89);

        tx_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tx_usuario.setForeground(new java.awt.Color(0, 0, 0));
        add(tx_usuario);
        tx_usuario.setBounds(60, 240, 280, 22);

        bt_salvar.setBackground(new java.awt.Color(255, 153, 102));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(0, 0, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });
        add(bt_salvar);
        bt_salvar.setBounds(300, 460, 111, 39);

        bt_login.setBackground(new java.awt.Color(255, 153, 102));
        bt_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(0, 0, 0));
        bt_login.setText("Tela de Login");
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_loginMouseClicked(evt);
            }
        });
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });
        add(bt_login);
        bt_login.setBounds(20, 460, 111, 39);

        tx_senha.setBackground(new java.awt.Color(255, 255, 255));
        add(tx_senha);
        tx_senha.setBounds(60, 310, 280, 22);

        tx_repitaSenha.setBackground(new java.awt.Color(255, 255, 255));
        add(tx_repitaSenha);
        tx_repitaSenha.setBounds(60, 380, 280, 22);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_429-518.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 430, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_loginActionPerformed

    private void bt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseClicked
        Janela.t2 = new Tela_login();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t5);
        janela.add(Janela.t2, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_loginMouseClicked

    private void tx_cargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_cargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_cargoActionPerformed

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        
        
        
        if(tratarErro()==false){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Tudo filé", JOptionPane.INFORMATION_MESSAGE);
            listaAdministradores.add(criaAdministrador());
            limparTextos();
        }
    }//GEN-LAST:event_bt_salvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_login;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JTextField tx_cargo;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JPasswordField tx_repitaSenha;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
