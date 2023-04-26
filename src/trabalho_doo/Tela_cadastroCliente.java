
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
        lb_title = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
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
        lb_back = new javax.swing.JLabel();

        jPasswordField3.setText("jPasswordField3");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(429, 518));
        setLayout(null);

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_title.setForeground(new java.awt.Color(255, 153, 51));
        lb_title.setText("Cadastrar Cliente");
        add(lb_title);
        lb_title.setBounds(107, 21, 241, 27);

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(255, 153, 51));
        lb_nome.setText("Nome: ");
        add(lb_nome);
        lb_nome.setBounds(53, 66, 70, 27);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("CPF:");
        add(jLabel5);
        jLabel5.setBounds(53, 133, 40, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        add(jLabel7);
        jLabel7.setBounds(391, 337, 66, 27);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Repita a Senha:");
        add(jLabel8);
        jLabel8.setBounds(50, 340, 140, 27);

        tx_nome.setBackground(new java.awt.Color(255, 255, 255));
        tx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nomeActionPerformed(evt);
            }
        });
        add(tx_nome);
        tx_nome.setBounds(53, 99, 283, 22);

        tx_cpf.setBackground(new java.awt.Color(255, 255, 255));
        tx_cpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_cpfKeyTyped(evt);
            }
        });
        add(tx_cpf);
        tx_cpf.setBounds(53, 166, 209, 22);

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
        bt_salvar.setBounds(240, 450, 150, 40);

        bt_telaLogin.setBackground(new java.awt.Color(255, 153, 102));
        bt_telaLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_telaLogin.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_telaLogin);
        bt_telaLogin.setBounds(40, 450, 150, 39);

        tx_senha.setBackground(new java.awt.Color(255, 255, 255));
        add(tx_senha);
        tx_senha.setBounds(53, 300, 209, 22);

        tx_repitaSenha.setBackground(new java.awt.Color(255, 255, 255));
        add(tx_repitaSenha);
        tx_repitaSenha.setBounds(53, 380, 209, 22);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 51));
        jLabel10.setText("Senha:");
        add(jLabel10);
        jLabel10.setBounds(50, 270, 66, 25);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Usuário:");
        add(jLabel11);
        jLabel11.setBounds(50, 200, 80, 27);

        tx_usuario.setBackground(new java.awt.Color(255, 255, 255));
        tx_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_usuarioActionPerformed(evt);
            }
        });
        add(tx_usuario);
        tx_usuario.setBounds(50, 230, 283, 22);

        jLabel9.setPreferredSize(new java.awt.Dimension(426, 518));
        add(jLabel9);
        jLabel9.setBounds(305, 306, 94, 89);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_429-518.jpg"))); // NOI18N
        lb_back.setText("jLabel3");
        add(lb_back);
        lb_back.setBounds(0, 0, 430, 520);
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

    private void tx_cpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_cpfKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_cpfKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_telaLogin;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_title;
    private javax.swing.JTextField tx_cpf;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JPasswordField tx_repitaSenha;
    private javax.swing.JPasswordField tx_senha;
    private javax.swing.JTextField tx_usuario;
    // End of variables declaration//GEN-END:variables
}
