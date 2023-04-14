
package trabalho_doo;

import java.awt.BorderLayout;
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
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        bt_cadastrarUsuario = new javax.swing.JButton();
        bt_entrar = new javax.swing.JButton();
        cb_rememberMe = new javax.swing.JCheckBox();
        tx_senha = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        jPasswordField1.setText("jPasswordField1");

        setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 0, 0, 0);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Usuário:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 158, 0, 0);
        add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Senha:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(28, 158, 0, 0);
        add(jLabel6, gridBagConstraints);

        tx_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tx_usuario.setForeground(new java.awt.Color(0, 0, 0));
        tx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_usuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 10, 0, 0);
        add(tx_usuario, gridBagConstraints);

        bt_cadastrarUsuario.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastrarUsuario.setForeground(new java.awt.Color(255, 153, 51));
        bt_cadastrarUsuario.setText("Cadastre-se");
        bt_cadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarUsuarioMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 148, 0, 0);
        add(bt_cadastrarUsuario, gridBagConstraints);

        bt_entrar.setBackground(new java.awt.Color(255, 255, 255));
        bt_entrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_entrar.setForeground(new java.awt.Color(255, 153, 51));
        bt_entrar.setText("Entrar");
        bt_entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_entrarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(bt_entrar, gridBagConstraints);

        cb_rememberMe.setForeground(new java.awt.Color(255, 153, 51));
        cb_rememberMe.setText("Remember me");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        add(cb_rememberMe, gridBagConstraints);

        tx_senha.setBackground(new java.awt.Color(255, 255, 255));
        tx_senha.setForeground(new java.awt.Color(0, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 116;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(38, 12, 0, 0);
        add(tx_senha, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 308;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 128, 0, 0);
        add(jSeparator1, gridBagConstraints);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Copini - PC\\OneDrive\\Documentos\\Caixa_Branca_login.png")); // NOI18N
        jLabel3.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.gridheight = 10;
        gridBagConstraints.ipadx = -639;
        gridBagConstraints.ipady = -593;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(110, 130, 0, 0);
        add(jLabel3, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Copini - PC\\OneDrive\\Documentos\\login_laranja.png")); // NOI18N
        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 11;
        gridBagConstraints.ipadx = -630;
        gridBagConstraints.ipady = -191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 4);
        add(jLabel1, gridBagConstraints);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
