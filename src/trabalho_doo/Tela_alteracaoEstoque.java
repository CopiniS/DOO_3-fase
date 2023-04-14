
package trabalho_doo;

import javax.swing.JOptionPane;

public class Tela_alteracaoEstoque extends javax.swing.JPanel {
    String produto;
        
    public Tela_alteracaoEstoque(String produto) {
        initComponents();
        
        this.produto = produto;
        lb_produto.setText(produto);
        acharEstoqueAtual(produto);
        
    }
    
    public void acharEstoqueAtual(String produto){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                lb_estoqueAtual.setText(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
            }
        }
    }
    
    public void alterarEstoque(String produto){
        if(rb_entrada.isSelected()){
            double valorAtualizado = Double.parseDouble(tx_valor.getText()) + Double.parseDouble(lb_estoqueAtual.getText());
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(String.valueOf(valorAtualizado));
                }
            }
        }     
        
        else if(rb_saida.isSelected()){
            double valorAtualizado = Double.parseDouble(tx_valor.getText()) - Double.parseDouble(lb_estoqueAtual.getText());
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(String.valueOf(valorAtualizado));
                    lb_estoqueAtual.setText(String.valueOf(valorAtualizado));
                    tx_valor.setText("");
                }
            }
        }
        
        else{
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                    Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(tx_valor.getText());
                    lb_estoqueAtual.setText(tx_valor.getText());
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
        jLabel5 = new javax.swing.JLabel();
        rb_entrada = new javax.swing.JRadioButton();
        rb_saida = new javax.swing.JRadioButton();
        rb_alteracao = new javax.swing.JRadioButton();
        lb_produto = new javax.swing.JLabel();
        tx_valor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        bt_salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lb_estoque = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lb_estoqueAtual = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 102, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Estoque");

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

        lb_produto.setForeground(new java.awt.Color(255, 102, 0));
        lb_produto.setText("Produto");

        tx_valor.setBackground(new java.awt.Color(255, 255, 255));
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

        bt_salvar.setBackground(new java.awt.Color(255, 255, 255));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(255, 102, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        lb_estoqueAtual.setForeground(new java.awt.Color(255, 102, 0));
        lb_estoqueAtual.setText("Estoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lb_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tx_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_estoque, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb_estoqueAtual))
                                .addGap(0, 18, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(rb_entrada)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(101, 101, 101)
                                .addComponent(rb_saida, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(rb_alteracao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addGap(33, 33, 33))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_entrada)
                    .addComponent(rb_saida)
                    .addComponent(rb_alteracao))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lb_estoque)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(lb_estoqueAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        if(!rb_alteracao.isSelected() && !rb_entrada.isSelected() && !rb_saida.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione alguma das opçoes para mudar o estoque", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
        alterarEstoque(produto);
        JOptionPane.showMessageDialog(null, "Estoque alterado com sucesso", "Tudo certo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void tx_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_valorKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_valorKeyTyped


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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_estoque;
    private javax.swing.JLabel lb_estoqueAtual;
    private javax.swing.JLabel lb_produto;
    private javax.swing.JRadioButton rb_alteracao;
    private javax.swing.JRadioButton rb_entrada;
    private javax.swing.JRadioButton rb_saida;
    private javax.swing.JTextField tx_valor;
    // End of variables declaration//GEN-END:variables
}
