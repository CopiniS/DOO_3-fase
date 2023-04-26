
package trabalho_doo;

import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_login extends javax.swing.JPanel {
    
    Cliente clienteLogin;
    
    
    
    public Tela_login() {
        initComponents();
        
        
        
    }
    
    public boolean verificaSenhaCliente(){
        boolean existeLogin = false;
        
        if(Tela_cadastroCliente.listaClientes != null){
            
            for(int i=0; i<Tela_cadastroCliente.listaClientes.size(); i++){
                if(Tela_cadastroCliente.listaClientes.get(i).getUsuario().equals(tx_usuario.getText())
                        && Tela_cadastroCliente.listaClientes.get(i).getSenha().equals(tx_senha.getText())){
                    existeLogin = true;
                    this.clienteLogin = Tela_cadastroCliente.listaClientes.get(i);
                }
            }
        }
        return existeLogin;
    }
    
    public boolean verificaSenhaAdministrador(){
        boolean existeLogin = false;
         
        if(Tela_cadastro_admi.listaAdministradores != null){ 
            for(int i=0; i<Tela_cadastro_admi.listaAdministradores.size(); i++){
                if(Tela_cadastro_admi.listaAdministradores.get(i).getUsuario().equals(tx_usuario.getText()) 
                        && Tela_cadastro_admi.listaAdministradores.get(i).getSenha().equals(tx_senha.getText())){
                    existeLogin = true;
                   
                }
            }
        }
        return existeLogin;
     }
    
    public void acessarListaProdutosClientes(){
            Janela.t11 = new Tela_listaProdutos_cliente(this.clienteLogin);
            Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.t2);
            janela.add(Janela.t11, BorderLayout.CENTER);
            janela.pack();
            
    }
    
    public void acessarListaProdutosAdministradores(){
            Janela.t6 = new Tela_listaProdutos_adm();
            Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.t2);
            janela.add(Janela.t6, BorderLayout.CENTER);
            janela.pack(); 
    }
    
    public void acessarCadastroUsuario(){
            Janela.t3 = new Tela_cadastro();
            Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.t2);
            janela.add(Janela.t3, BorderLayout.CENTER);
            janela.pack();
    }
    
    public void checkBoxRememeberMe(){
        if(!cb_rememberMe.isSelected()){
            tx_usuario.setText("");
            tx_senha.setText("");
        }
    }
    
    
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        lb_login = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        bt_cadastrarUsuario = new javax.swing.JButton();
        bt_entrar = new javax.swing.JButton();
        cb_rememberMe = new javax.swing.JCheckBox();
        tx_senha = new javax.swing.JPasswordField();
        lb_usuario = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        lb_back = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setPreferredSize(new java.awt.Dimension(480, 392));
        setLayout(null);

        lb_login.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_login.setForeground(new java.awt.Color(255, 153, 51));
        lb_login.setText("Login");
        add(lb_login);
        lb_login.setBounds(190, 30, 64, 32);

        tx_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tx_usuario.setForeground(new java.awt.Color(255, 255, 255));
        tx_usuario.setOpaque(false);
        tx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_usuarioActionPerformed(evt);
            }
        });
        add(tx_usuario);
        tx_usuario.setBounds(140, 130, 180, 22);

        bt_cadastrarUsuario.setBackground(new java.awt.Color(255, 153, 102));
        bt_cadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_cadastrarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        bt_cadastrarUsuario.setText("Cadastre-se");
        bt_cadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarUsuarioMouseClicked(evt);
            }
        });
        add(bt_cadastrarUsuario);
        bt_cadastrarUsuario.setBounds(30, 320, 140, 40);

        bt_entrar.setBackground(new java.awt.Color(255, 153, 102));
        bt_entrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(0, 0, 0));
        bt_entrar.setText("Entrar");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });
        add(bt_entrar);
        bt_entrar.setBounds(310, 320, 140, 40);

        cb_rememberMe.setForeground(new java.awt.Color(255, 153, 51));
        cb_rememberMe.setText("Remember me");
        add(cb_rememberMe);
        cb_rememberMe.setBounds(140, 250, 110, 20);

        tx_senha.setBackground(new java.awt.Color(255, 255, 255));
        tx_senha.setForeground(new java.awt.Color(255, 255, 255));
        tx_senha.setOpaque(false);
        add(tx_senha);
        tx_senha.setBounds(140, 210, 180, 22);

        lb_usuario.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 153, 0));
        lb_usuario.setText("Usuario:");
        add(lb_usuario);
        lb_usuario.setBounds(140, 100, 70, 22);

        lb_senha.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lb_senha.setForeground(new java.awt.Color(255, 153, 0));
        lb_senha.setText("Senha:");
        add(lb_senha);
        lb_senha.setBounds(140, 180, 60, 22);

        lb_back.setForeground(new java.awt.Color(255, 153, 0));
        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_480 - 392.jpg"))); // NOI18N
        lb_back.setText("jLabel1");
        add(lb_back);
        lb_back.setBounds(0, 0, 480, 392);
    }// </editor-fold>//GEN-END:initComponents

    private void tx_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_usuarioActionPerformed

    private void bt_entrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_entrarMouseClicked
        if(verificaSenhaCliente()){
            switch(JOptionPane.showConfirmDialog(null, "Este é um login de cliente, deseja continuar?", "Segue o baile", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)){
                        case 0: 
                        acessarListaProdutosClientes();
                        break;
            }
        }
        
        else if(verificaSenhaAdministrador()){
            switch(JOptionPane.showConfirmDialog(null, "Este é um login de administrador, deseja continuar?", "Segue o baile", 
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)){
                        case 0: 
                        acessarListaProdutosAdministradores();
                        break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Login ou Senha incorretos", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        checkBoxRememeberMe();
        
    }//GEN-LAST:event_bt_entrarMouseClicked

    private void bt_cadastrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarUsuarioMouseClicked
        acessarCadastroUsuario();
    }//GEN-LAST:event_bt_cadastrarUsuarioMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrarUsuario;
    private javax.swing.JButton bt_entrar;
    private javax.swing.JCheckBox cb_rememberMe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_login;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
