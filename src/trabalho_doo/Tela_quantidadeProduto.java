
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

public class Tela_quantidadeProduto extends javax.swing.JPanel {
    
    String produtoTxt;
    
    public Tela_quantidadeProduto(String produto) {
        initComponents();
        this.produtoTxt = produto;
        tx_preco.setText(achaProduto(produto).getPrecoVenda());
        tx_preco.setEnabled(false);
        
    }
    
    public Produto achaProduto(String nome){
        Produto p1 = new Produto();
        for(Produto produto : Tela_cadastroProdutos.listaProdutos){
            if(produto.getNome().equals(nome)){
               p1 = produto;
            }
        }
        return p1;
    }

    public void alteraPreco(){
        
        if(tx_preco.getText().isBlank()){
        double quantidade = Double.parseDouble(tx_quantidade.getText());
        double preco = Double.parseDouble(tx_preco.getText());
        
        double result = quantidade * preco;
        lb_valorTotal.setText(String.valueOf(result));
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_produto = new javax.swing.JLabel();
        tx_quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tx_preco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lb_valorTotal = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();

        lb_produto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lb_produto.setText("<Produto>");

        tx_quantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tx_quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_quantidade.setText("1");
        tx_quantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_quantidadeKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Quantidade:");

        tx_preco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tx_preco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Preço:");

        lb_valorTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_valorTotal.setText("<valor>");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Total:");

        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(lb_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tx_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_preco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lb_valorTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bt_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tx_quantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_quantidadeKeyTyped
        alteraPreco();
    }//GEN-LAST:event_tx_quantidadeKeyTyped

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        
        Tela_listaProdutos_cliente.listaAdicionados.add(achaProduto(produtoTxt));
        achaProduto(produtoTxt).setQuantidade(Integer.parseInt(tx_quantidade.getText()));
        
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t13);
        janela.add(Janela.t11, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_salvarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_produto;
    private javax.swing.JLabel lb_valorTotal;
    private javax.swing.JTextField tx_preco;
    private javax.swing.JTextField tx_quantidade;
    // End of variables declaration//GEN-END:variables
}
