
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_alteracaoEstoque extends javax.swing.JPanel {
    String produto;
        
    public Tela_alteracaoEstoque(String produto) {
        initComponents();
        
        this.produto = produto;
        lb_produto.setText(produto);
        acharEstoqueAtual(produto);
        tx_estoqueAtual.setEnabled(false);
        
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
                }
            }
        }     
        
        else if(rb_saida.isSelected()){
            double valorAtualizado = Double.parseDouble(tx_valor.getText()) - Double.parseDouble(tx_estoqueAtual.getText());
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(String.valueOf(valorAtualizado));
                    tx_estoqueAtual.setText(String.valueOf(valorAtualizado));
                    tx_valor.setText("");
                }
            }
        }
        
        else{
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(tx_valor.getText());
                    tx_estoqueAtual.setText(tx_valor.getText());
                    tx_valor.setText("");
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
        jSeparator1 = new javax.swing.JSeparator();
        bt_salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_estoque = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tx_estoqueAtual = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 102, 0));

        lb_produto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_produto.setForeground(new java.awt.Color(255, 102, 0));
        lb_produto.setText("<produto>");

        buttonGroup1.add(rb_entrada);
        rb_entrada.setText("Entrada");

        buttonGroup1.add(rb_saida);
        rb_saida.setText("Saída");

        buttonGroup1.add(rb_alteracao);
        rb_alteracao.setText("Alteração");
        rb_alteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_alteracaoActionPerformed(evt);
            }
        });

        tx_valor.setBackground(new java.awt.Color(255, 255, 255));
        tx_valor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("EstoqueAtual:");

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        bt_salvar.setBackground(new java.awt.Color(255, 255, 255));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(255, 102, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        tx_estoqueAtual.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoqueAtual.setForeground(new java.awt.Color(255, 153, 51));
        tx_estoqueAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Digite o valor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(rb_entrada)
                        .addGap(101, 101, 101)
                        .addComponent(rb_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_estoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(rb_alteracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(394, 394, 394)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 18, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tx_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_produto)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_entrada)
                    .addComponent(rb_saida)
                    .addComponent(rb_alteracao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tx_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lb_estoque)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_estoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
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
        else{
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_estoque;
    private javax.swing.JLabel lb_produto;
    private javax.swing.JRadioButton rb_alteracao;
    private javax.swing.JRadioButton rb_entrada;
    private javax.swing.JRadioButton rb_saida;
    private javax.swing.JTextField tx_estoqueAtual;
    private javax.swing.JTextField tx_valor;
    // End of variables declaration//GEN-END:variables
}
