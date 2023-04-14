
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Tela_listaProdutos_adm extends javax.swing.JPanel {
    DefaultListModel<String> modelProdutos;
    DefaultListModel<String> modelCategoria;
    DefaultListModel<String> modelLucro;
    DefaultListModel<String> modelEstoque;
    

    public Tela_listaProdutos_adm() {
        initComponents();
        
        modelProdutos = new DefaultListModel<>();
        modelCategoria = new DefaultListModel<>();
        modelLucro = new DefaultListModel<>();
        modelEstoque = new DefaultListModel<>();
        
        jList_produto.setModel(modelProdutos);
        jList_categoria.setModel(modelCategoria);
        jList_lucro.setModel(modelLucro);
        jList_estoque.setModel(modelEstoque);
        
        iniciarJlists();
    }
    
    public void iniciarJlists(){
        if(Tela_cadastroProdutos.listaProdutos !=null){
                if(!modelProdutos.isEmpty()){
                    modelProdutos.removeAllElements();
                    modelCategoria.removeAllElements();
                    modelLucro.removeAllElements();
                    modelEstoque.removeAllElements();
                }
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                modelProdutos.addElement(Tela_cadastroProdutos.listaProdutos.get(i).getNome());
                modelCategoria.addElement(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria());
                modelLucro.addElement(calculaLucro(i));
                modelEstoque.addElement(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
                
           }
          
        }
    }
    
    public String calculaLucro(int i){
        double lucro;
        String lucroTxt;
        
        
        lucro = (Double.parseDouble(Tela_cadastroProdutos.listaProdutos.get(i).precoVenda)- Double.parseDouble(Tela_cadastroProdutos.listaProdutos.get(i).precoCusto)) / 
                (Double.parseDouble(Tela_cadastroProdutos.listaProdutos.get(i).precoCusto)) * 100;
        lucroTxt = String.valueOf(lucro);
            
        return lucroTxt;
    }
        
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_produto = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList_estoque = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList_categoria = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList_lucro = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bt_editar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        bt_imprimirCatalogo = new javax.swing.JButton();
        bt_cadastrarProdutos = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 102, 0));

        jList_produto.setBackground(new java.awt.Color(255, 255, 255));
        jList_produto.setForeground(new java.awt.Color(0, 0, 0));
        jList_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_produtoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_produto);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(255, 102, 0));

        jList_estoque.setBackground(new java.awt.Color(255, 255, 255));
        jList_estoque.setForeground(new java.awt.Color(0, 0, 0));
        jList_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_estoqueMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_estoque);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(255, 102, 0));

        jList_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jList_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jList_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_categoriaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList_categoria);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setForeground(new java.awt.Color(255, 102, 0));

        jList_lucro.setBackground(new java.awt.Color(255, 255, 255));
        jList_lucro.setForeground(new java.awt.Color(0, 0, 0));
        jList_lucro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_lucroMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList_lucro);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("%Lucro");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Produto");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Categoria");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Estoque");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Lista de Produtos");

        bt_editar.setBackground(new java.awt.Color(255, 255, 255));
        bt_editar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_editar.setForeground(new java.awt.Color(255, 102, 0));
        bt_editar.setText("Editar");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 102, 0));
        jButton3.setText("Alterar estoque");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        bt_imprimirCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        bt_imprimirCatalogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_imprimirCatalogo.setForeground(new java.awt.Color(255, 102, 0));
        bt_imprimirCatalogo.setText("Imprimir Catálogo");
        bt_imprimirCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirCatalogoMouseClicked(evt);
            }
        });

        bt_cadastrarProdutos.setBackground(new java.awt.Color(255, 255, 255));
        bt_cadastrarProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_cadastrarProdutos.setForeground(new java.awt.Color(255, 102, 0));
        bt_cadastrarProdutos.setText("Cadastrar Produto");
        bt_cadastrarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarProdutosMouseClicked(evt);
            }
        });

        bt_remover.setBackground(new java.awt.Color(255, 255, 255));
        bt_remover.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_remover.setForeground(new java.awt.Color(255, 102, 0));
        bt_remover.setText("Remover");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_cadastrarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(271, 271, 271)
                        .addComponent(bt_imprimirCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_imprimirCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_cadastrarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                        .addComponent(jScrollPane4)
                        .addComponent(jScrollPane5)
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_cadastrarProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarProdutosMouseClicked
        Janela.t7 = new Tela_cadastroProdutos();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t6);
        janela.add(Janela.t7, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_cadastrarProdutosMouseClicked

    private void bt_imprimirCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimirCatalogoMouseClicked
        Janela.t8 = new Tela_imprimeCatalogo();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t6);
        janela.add(Janela.t8, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_imprimirCatalogoMouseClicked

    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
       if(jList_produto.isSelectionEmpty()){
        JOptionPane.showMessageDialog(null, "Selecione o produto que deseja editar", "ERRO", JOptionPane.ERROR_MESSAGE);
       }
       else{
        Janela.t9 = new Tela_editarProdutos(jList_produto.getSelectedValue());
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t6);
        janela.add(Janela.t9, BorderLayout.CENTER);
        janela.pack();
       }
    }//GEN-LAST:event_bt_editarMouseClicked

    private void jList_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_produtoMouseClicked
        jList_categoria.setSelectedIndex(jList_produto.getSelectedIndex());
        jList_lucro.setSelectedIndex(jList_produto.getSelectedIndex());
        jList_estoque.setSelectedIndex(jList_produto.getSelectedIndex());
    }//GEN-LAST:event_jList_produtoMouseClicked

    private void jList_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_categoriaMouseClicked
       jList_produto.setSelectedIndex(jList_categoria.getSelectedIndex());
       jList_lucro.setSelectedIndex(jList_categoria.getSelectedIndex());
       jList_estoque.setSelectedIndex(jList_categoria.getSelectedIndex());
    }//GEN-LAST:event_jList_categoriaMouseClicked

    private void jList_lucroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_lucroMouseClicked
        jList_produto.setSelectedIndex(jList_lucro.getSelectedIndex());
        jList_categoria.setSelectedIndex(jList_lucro.getSelectedIndex());
        jList_estoque.setSelectedIndex(jList_lucro.getSelectedIndex());
        
    }//GEN-LAST:event_jList_lucroMouseClicked

    private void jList_estoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_estoqueMouseClicked
        jList_produto.setSelectedIndex(jList_estoque.getSelectedIndex());
        jList_categoria.setSelectedIndex(jList_estoque.getSelectedIndex());
        jList_lucro.setSelectedIndex(jList_estoque.getSelectedIndex());
    }//GEN-LAST:event_jList_estoqueMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked
        switch(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o produto "+Tela_cadastroProdutos.listaProdutos.get(jList_produto.getSelectedIndex()).nome, 
                                        "Responda para continuar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)){
            case 0: Tela_cadastroProdutos.listaProdutos.remove(jList_produto.getSelectedIndex());
                    iniciarJlists();
        }
        
    }//GEN-LAST:event_bt_removerMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrarProdutos;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_imprimirCatalogo;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList_categoria;
    private javax.swing.JList<String> jList_estoque;
    private javax.swing.JList<String> jList_lucro;
    private javax.swing.JList<String> jList_produto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
