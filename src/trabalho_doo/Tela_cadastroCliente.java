
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Tela_cadastroCliente extends javax.swing.JPanel {
    static ArrayList<Cliente> listaClientes; 
    
    
    public Tela_cadastroCliente() {
        initComponents();
        this.listaClientes = new ArrayList();
    }
    
    public Cliente criaCliente(){
        Cliente c1 = new Cliente();
        
        c1.setNome(tx_nome.getText());
        c1.setCpf(tx_cpf.getText());
        c1.setUsuario(tx_usuario.getText());
        c1.setSenha(tx_senha.getText());
        c1.setRepitaSenha(tx_repitaSenha.getText());
        
        return c1;
    }
    
    public void limparTextos(){
        tx_nome.setText("");
        tx_cpf.setText("");
        tx_usuario.setText("");
        tx_senha.setText("");
        tx_repitaSenha.setText("");
    }
    
    public boolean tratarErro(){
        
        boolean existeErro = false;
        
        if(tx_nome.getText().isBlank() || tx_cpf.getText().isBlank() || tx_usuario.getText().isBlank() || tx_senha.getText().isBlank() || 
        tx_repitaSenha.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            existeErro = true;
        }
        
        else if(!tx_senha.getText().equals(tx_repitaSenha.getText())){
            JOptionPane.showMessageDialog(null, "Digite senhas iguais", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            existeErro = true;
        }
        
        else if(!listaClientes.isEmpty() || !Tela_cadastro_admi.listaAdministradores.isEmpty()){
            if(!listaClientes.isEmpty()){
            for(int i=0; i<listaClientes.size(); i++){
                if(listaClientes.get(i).getUsuario().toString().equals(tx_usuario.getText())){
                    JOptionPane.showMessageDialog(null, "Este usuario ja está em uso", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
                    existeErro = true;
                }
            }
            }
            if(!Tela_cadastro_admi.listaAdministradores.isEmpty()){
                for(int i=0; i<Tela_cadastro_admi.listaAdministradores.size(); i++){
                    if(Tela_cadastro_admi.listaAdministradores.get(i).getUsuario().equals(tx_usuario.getText())){
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

        jPasswordField3 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tx_nome = new javax.swing.JTextField();
        tx_cpf = new javax.swing.JTextField();
        bt_salvar = new javax.swing.JButton();
        bt_telaLogin = new javax.swing.JButton();
        tx_senha = new javax.swing.JPasswordField();
        tx_repitaSenha = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tx_usuario = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPasswordField3.setText("jPasswordField3");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Cadastrar Cliente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Nome: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("CPF:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Repita a Senha:");

        tx_nome.setBackground(new java.awt.Color(255, 255, 255));
        tx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nomeActionPerformed(evt);
            }
        });

        tx_cpf.setBackground(new java.awt.Color(255, 255, 255));

        bt_salvar.setBackground(new java.awt.Color(255, 255, 255));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(255, 102, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        bt_telaLogin.setBackground(new java.awt.Color(255, 255, 255));
        bt_telaLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_telaLogin.setForeground(new java.awt.Color(255, 102, 0));
        bt_telaLogin.setText("Tela de Login");
        bt_telaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_telaLoginMouseClicked(evt);
            }
        });
        bt_telaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_telaLoginActionPerformed(evt);
            }
        });

        tx_senha.setBackground(new java.awt.Color(255, 255, 255));

        tx_repitaSenha.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        jLabel10.setText("Senha:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 51));
        jLabel11.setText("Usuário:");

        tx_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_usuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_telaLogin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tx_nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tx_senha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tx_repitaSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                    .addComponent(tx_usuario, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(tx_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_repitaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_telaLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nomeActionPerformed

    private void tx_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_usuarioActionPerformed

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        
        if(tratarErro() == false){
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso", "Tudo filé", JOptionPane.INFORMATION_MESSAGE);
            listaClientes.add(criaCliente());
            limparTextos();
        }
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_telaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_telaLoginMouseClicked
        Janela.t2 = new Tela_login();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t4);
        janela.add(Janela.t2, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_telaLoginMouseClicked

    private void bt_telaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_telaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_telaLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_telaLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tx_cpf;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JPasswordField tx_repitaSenha;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
