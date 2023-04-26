
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
        bt_estoque = new javax.swing.JButton();
        bt_imprimirCatalogo = new javax.swing.JButton();
        bt_cadastrarProdutos = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        bt_voltaLogin = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1050, 851));
        setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 102, 0));

        jList_produto.setBackground(new java.awt.Color(255, 255, 255));
        jList_produto.setForeground(new java.awt.Color(255, 255, 255));
        jList_produto.setOpaque(false);
        jList_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_produtoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList_produto);

        add(jScrollPane2);
        jScrollPane2.setBounds(81, 313, 197, 488);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setForeground(new java.awt.Color(255, 102, 0));

        jList_estoque.setBackground(new java.awt.Color(255, 255, 255));
        jList_estoque.setForeground(new java.awt.Color(255, 255, 255));
        jList_estoque.setOpaque(false);
        jList_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_estoqueMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jList_estoque);

        add(jScrollPane3);
        jScrollPane3.setBounds(608, 313, 161, 488);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setForeground(new java.awt.Color(255, 102, 0));

        jList_categoria.setBackground(new java.awt.Color(255, 255, 255));
        jList_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jList_categoria.setOpaque(false);
        jList_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_categoriaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList_categoria);

        add(jScrollPane4);
        jScrollPane4.setBounds(284, 313, 151, 488);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setForeground(new java.awt.Color(255, 102, 0));

        jList_lucro.setBackground(new java.awt.Color(255, 255, 255));
        jList_lucro.setForeground(new java.awt.Color(255, 255, 255));
        jList_lucro.setOpaque(false);
        jList_lucro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_lucroMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jList_lucro);

        add(jScrollPane5);
        jScrollPane5.setBounds(441, 313, 161, 488);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("%Lucro");
        add(jLabel1);
        jLabel1.setBounds(485, 266, 73, 45);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Produto");
        add(jLabel2);
        jLabel2.setBounds(116, 266, 73, 45);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Categoria");
        add(jLabel3);
        jLabel3.setBounds(311, 266, 96, 45);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Estoque");
        add(jLabel4);
        jLabel4.setBounds(648, 266, 73, 45);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Lista de Produtos");
        add(jLabel5);
        jLabel5.setBounds(316, 21, 216, 32);

        bt_editar.setBackground(new java.awt.Color(255, 153, 102));
        bt_editar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_editar.setForeground(new java.awt.Color(0, 0, 0));
        bt_editar.setText("Editar");
        bt_editar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_editarMouseClicked(evt);
            }
        });
        add(bt_editar);
        bt_editar.setBounds(810, 320, 200, 30);

        bt_estoque.setBackground(new java.awt.Color(255, 153, 102));
        bt_estoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_estoque.setForeground(new java.awt.Color(0, 0, 0));
        bt_estoque.setText("Alterar estoque");
        bt_estoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_estoqueMouseClicked(evt);
            }
        });
        bt_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_estoqueActionPerformed(evt);
            }
        });
        add(bt_estoque);
        bt_estoque.setBounds(810, 620, 200, 30);

        bt_imprimirCatalogo.setBackground(new java.awt.Color(255, 153, 102));
        bt_imprimirCatalogo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_imprimirCatalogo.setForeground(new java.awt.Color(0, 0, 0));
        bt_imprimirCatalogo.setText("Imprimir Catálogo");
        bt_imprimirCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirCatalogoMouseClicked(evt);
            }
        });
        add(bt_imprimirCatalogo);
        bt_imprimirCatalogo.setBounds(570, 110, 200, 30);

        bt_cadastrarProdutos.setBackground(new java.awt.Color(255, 153, 102));
        bt_cadastrarProdutos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_cadastrarProdutos.setForeground(new java.awt.Color(0, 0, 0));
        bt_cadastrarProdutos.setText("Cadastrar Produto");
        bt_cadastrarProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarProdutosMouseClicked(evt);
            }
        });
        add(bt_cadastrarProdutos);
        bt_cadastrarProdutos.setBounds(80, 110, 200, 30);

        bt_remover.setBackground(new java.awt.Color(255, 153, 102));
        bt_remover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_remover.setForeground(new java.awt.Color(0, 0, 0));
        bt_remover.setText("Remover");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });
        add(bt_remover);
        bt_remover.setBounds(810, 460, 200, 30);

        bt_voltaLogin.setBackground(new java.awt.Color(255, 153, 102));
        bt_voltaLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltaLogin.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltaLogin.setText("Voltar ao Login");
        bt_voltaLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltaLoginMouseClicked(evt);
            }
        });
        bt_voltaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltaLoginActionPerformed(evt);
            }
        });
        add(bt_voltaLogin);
        bt_voltaLogin.setBounds(810, 770, 200, 30);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1050-851.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 1050, 850);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_estoqueActionPerformed

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

    private void bt_estoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_estoqueMouseClicked
        if(jList_produto.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione o produto que deseja editar", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        else{
        
        Janela.t10 = new Tela_alteracaoEstoque(jList_produto.getSelectedValue());
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t6);
        janela.add(Janela.t10, BorderLayout.CENTER);
        janela.pack();
        }
    }//GEN-LAST:event_bt_estoqueMouseClicked

    private void bt_voltaLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltaLoginMouseClicked
        Janela.t2 = new Tela_login();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t6);
        janela.add(Janela.t2, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltaLoginMouseClicked

    private void bt_voltaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltaLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrarProdutos;
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_estoque;
    private javax.swing.JButton bt_imprimirCatalogo;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_voltaLogin;
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
    private javax.swing.JLabel lb_back;
    // End of variables declaration//GEN-END:variables
}
