
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_alteracaoEstoque extends javax.swing.JPanel {
    String produto;
    boolean foiAlterado;
        
    public Tela_alteracaoEstoque(String produto) {
        initComponents();
        
        this.produto = produto;
        lb_produto.setText(produto);
        acharEstoqueAtual(produto);
        tx_estoqueAtual.setEditable(false);
        this.foiAlterado = true;
        
    }
    
    public void acharEstoqueAtual(String produto){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                tx_estoqueAtual.setText(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
            }
        }
    }
    
    public void alterarEstoque(String produto){
        if(rb_entrada.isSelected()){
            double valorAtualizado = Double.parseDouble(tx_valor.getText()) + Double.parseDouble(tx_estoqueAtual.getText());
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(String.valueOf(valorAtualizado));
                    foiAlterado = true;
                }
            }
        }     
        
        else if(rb_saida.isSelected()){
            
            if(Double.parseDouble(tx_valor.getText()) <= Double.parseDouble(tx_estoqueAtual.getText())){
                double valorAtualizado = Double.parseDouble(tx_estoqueAtual.getText()) - Double.parseDouble(tx_valor.getText());
                for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                        Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(String.valueOf(valorAtualizado));
                        tx_estoqueAtual.setText(String.valueOf(valorAtualizado));
                        tx_valor.setText("");
                        foiAlterado = true;
                    }   
                }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "O estoque atual é menor do que a saída", "ERRO", JOptionPane.ERROR_MESSAGE);
                foiAlterado = false;
            }
        }
        
        else{
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(tx_valor.getText());
                    tx_estoqueAtual.setText(tx_valor.getText());
                    tx_valor.setText("");
                    foiAlterado = true;
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        lb_produto = new javax.swing.JLabel();
        rb_entrada = new javax.swing.JRadioButton();
        rb_saida = new javax.swing.JRadioButton();
        rb_alteracao = new javax.swing.JRadioButton();
        tx_valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_estoque = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_estoqueAtual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 102, 0));
        setPreferredSize(new java.awt.Dimension(480, 319));
        setLayout(null);

        lb_produto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_produto.setForeground(new java.awt.Color(255, 153, 0));
        lb_produto.setText("<produto>");
        add(lb_produto);
        lb_produto.setBounds(140, 10, 210, 32);

        buttonGroup1.add(rb_entrada);
        rb_entrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_entrada.setForeground(new java.awt.Color(255, 255, 255));
        rb_entrada.setText("Entrada");
        rb_entrada.setOpaque(false
        );
        add(rb_entrada);
        rb_entrada.setBounds(32, 65, 90, 25);

        buttonGroup1.add(rb_saida);
        rb_saida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_saida.setForeground(new java.awt.Color(255, 255, 255));
        rb_saida.setText("Saída");
        rb_saida.setOpaque(false);
        add(rb_saida);
        rb_saida.setBounds(196, 65, 62, 25);

        buttonGroup1.add(rb_alteracao);
        rb_alteracao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_alteracao.setForeground(new java.awt.Color(255, 255, 255));
        rb_alteracao.setText("Alteração");
        rb_alteracao.setOpaque(false);
        rb_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_alteracaoActionPerformed(evt);
            }
        });
        add(rb_alteracao);
        rb_alteracao.setBounds(341, 65, 90, 25);

        tx_valor.setBackground(new java.awt.Color(255, 255, 255));
        tx_valor.setForeground(new java.awt.Color(255, 255, 255));
        tx_valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_valor.setOpaque(false
        );
        tx_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_valorActionPerformed(evt);
            }
        });
        tx_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_valorKeyTyped(evt);
            }
        });
        add(tx_valor);
        tx_valor.setBounds(130, 130, 100, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("EstoqueAtual:");
        add(jLabel2);
        jLabel2.setBounds(250, 130, 100, 28);

        bt_voltar.setBackground(new java.awt.Color(255, 153, 102));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(20, 250, 111, 39);

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
        bt_salvar.setBounds(340, 250, 111, 39);
        add(jLabel3);
        jLabel3.setBounds(394, 133, 65, 0);
        add(lb_estoque);
        lb_estoque.setBounds(394, 133, 47, 0);
        add(jLabel1);
        jLabel1.setBounds(420, 133, 0, 0);
        add(jLabel4);
        jLabel4.setBounds(394, 133, 65, 0);

        tx_estoqueAtual.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoqueAtual.setForeground(new java.awt.Color(255, 255, 255));
        tx_estoqueAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_estoqueAtual.setOpaque(false);
        add(tx_estoqueAtual);
        tx_estoqueAtual.setBounds(350, 130, 100, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Digite o valor:");
        add(jLabel7);
        jLabel7.setBounds(20, 130, 100, 28);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_480-325.jpg"))); // NOI18N
        add(jLabel5);
        jLabel5.setBounds(0, 0, 480, 320);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_alteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_alteracaoActionPerformed
       
    }//GEN-LAST:event_rb_alteracaoActionPerformed

    private void tx_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_valorActionPerformed
       
    }//GEN-LAST:event_tx_valorActionPerformed

    private void tx_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_valorKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_valorKeyTyped

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        if(!rb_alteracao.isSelected() && !rb_entrada.isSelected() && !rb_saida.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione alguma das opçoes para mudar o estoque", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(tx_valor.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "digite um valor para alterar o estoque", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        
        else if(foiAlterado != false){
            System.out.println(foiAlterado);
            alterarEstoque(produto);
            JOptionPane.showMessageDialog(null, "Estoque alterado com sucesso", "Tudo certo", JOptionPane.INFORMATION_MESSAGE);
        }
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    tx_estoqueAtual.setText(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
                }
            }
        
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        
        Janela.t6 = new Tela_listaProdutos_adm();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t10);
        janela.add(Janela.t6, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_estoque;
    private javax.swing.JLabel lb_produto;
    private javax.swing.JRadioButton rb_alteracao;
    private javax.swing.JRadioButton rb_entrada;
    private javax.swing.JRadioButton rb_saida;
    private javax.swing.JTextField tx_estoqueAtual;
    private javax.swing.JTextField tx_valor;
    // End of variables declaration//GEN-END:variables
}
