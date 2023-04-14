
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_editarProdutos extends javax.swing.JPanel {
    String produto;
    public Tela_editarProdutos(String produto) {
        initComponents();
        this.produto = produto;
        iniciarCaixasTextos();    }
    
    public void iniciarCaixasTextos(){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                tx_nome.setText(Tela_cadastroProdutos.listaProdutos.get(i).getNome());
                tx_categoria.setText(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria());
                tx_precoCusto.setText(Tela_cadastroProdutos.listaProdutos.get(i).getPrecoCusto());
                tx_precoVenda.setText(Tela_cadastroProdutos.listaProdutos.get(i).getPrecoVenda());
                tx_fornecedor.setText(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor());
                tx_marca.setText(Tela_cadastroProdutos.listaProdutos.get(i).getMarca());
                tx_estoque.setText(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
            }
        }
     }
    public void editaProduto(){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                Tela_cadastroProdutos.listaProdutos.get(i).setNome(tx_nome.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setCategoria(tx_categoria.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setPrecoCusto(tx_precoCusto.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setPrecoVenda(tx_precoVenda.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setFornecedor(tx_fornecedor.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setMarca(tx_marca.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(tx_estoque.getText());
                
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel6 = new javax.swing.JLabel();
        tx_estoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_precoVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_marca = new javax.swing.JTextField();
        tx_nome = new javax.swing.JTextField();
        tx_categoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        bt_salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tx_precoCusto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tx_fornecedor = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Preço de venda:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 23;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(84, 26, 0, 0);
        add(jLabel6, gridBagConstraints);

        tx_estoque.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_estoqueKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 182;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 6, 0, 0);
        add(tx_estoque, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("Marca:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 26, 0, 0);
        add(jLabel7, gridBagConstraints);

        tx_precoVenda.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoVendaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 58;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 6, 0, 0);
        add(tx_precoVenda, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 51));
        jLabel8.setText("Estoque:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 39, 0, 0);
        add(jLabel8, gridBagConstraints);

        tx_marca.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 24;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 35;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 163;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 0);
        add(tx_marca, gridBagConstraints);

        tx_nome.setBackground(new java.awt.Color(255, 255, 255));
        tx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 218;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 12, 0, 0);
        add(tx_nome, gridBagConstraints);

        tx_categoria.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 35;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 144;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(42, 6, 0, 0);
        add(tx_categoria, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 51));
        jLabel9.setText("Categoria:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(41, 26, 0, 0);
        add(jLabel9, gridBagConstraints);

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 36, 29, 0);
        add(bt_voltar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Editar Produto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 37, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Nome: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 39, 0, 0);
        add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 60;
        gridBagConstraints.ipadx = 624;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        add(jSeparator1, gridBagConstraints);

        bt_salvar.setBackground(new java.awt.Color(255, 255, 255));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(255, 102, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 58;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 4, 29, 0);
        add(bt_salvar, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Preço de custo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(84, 39, 0, 0);
        add(jLabel4, gridBagConstraints);

        tx_precoCusto.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoCustoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 133;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(86, 6, 0, 0);
        add(tx_precoCusto, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Fornecedor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 39, 0, 0);
        add(jLabel5, gridBagConstraints);

        tx_fornecedor.setBackground(new java.awt.Color(255, 255, 255));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 170;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 10, 0, 0);
        add(tx_fornecedor, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nomeActionPerformed

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        if(tx_nome.getText().isBlank() || tx_categoria.getText().isBlank()||tx_fornecedor.getText().isBlank()||
        tx_marca.getText().isBlank() || tx_precoCusto.getText().isBlank() || tx_precoVenda.getText().isBlank() || 
        tx_estoque.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(!Tela_cadastroProdutos.listaProdutos.isEmpty()){
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(tx_nome.getText())){
                    JOptionPane.showMessageDialog(null, "Este nome de produto ja está cadastrado", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }
        }
        else{
        editaProduto();
        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso", "Tudo certo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bt_salvarMouseClicked
    
    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela.t6 = new Tela_listaProdutos_adm();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t9);
        janela.add(Janela.t6, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void tx_precoCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_precoCustoKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_precoCustoKeyTyped

    private void tx_precoVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_precoVendaKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_precoVendaKeyTyped

    private void tx_estoqueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tx_estoqueKeyTyped
        String caracteres="0987654321";
        if(!caracteres.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tx_estoqueKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tx_categoria;
    private javax.swing.JTextField tx_estoque;
    private javax.swing.JTextField tx_fornecedor;
    private javax.swing.JTextField tx_marca;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JTextField tx_precoCusto;
    private javax.swing.JTextField tx_precoVenda;
    // End of variables declaration//GEN-END:variables
}
