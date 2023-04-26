
package trabalho_doo;

import java.awt.BorderLayout;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

public class Tela_listaProdutos_cliente extends javax.swing.JPanel {
    DefaultListModel<String> modelProdutos;
    ArrayList<Produto> listaFiltrosCat;
    ArrayList<Produto> listaFiltrosMarca;
    ArrayList<Produto> listaFiltrosGeral;
    Cliente clienteLogado;
    
    
    public Tela_listaProdutos_cliente(Cliente clientelogado) {
        initComponents();
        
        modelProdutos = new DefaultListModel();
        jList_produtos.setModel(modelProdutos);
        listaFiltrosCat = new ArrayList();
        listaFiltrosMarca = new ArrayList();
        listaFiltrosGeral = new ArrayList();
        this.clienteLogado = clientelogado;
        tx_infosProduto.setEditable(false);
        iniciarComboBox();
    }
    
   
    
    public void iniciarComboBox(){
        
        ArrayList<String> listaExclusivosCategoria = new ArrayList();
        ArrayList<String> listaExclusivosMarca = new ArrayList();
        
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(!listaExclusivosCategoria.contains(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria())){
                    listaExclusivosCategoria.add(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria());
            }
        }
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(!listaExclusivosMarca.contains(Tela_cadastroProdutos.listaProdutos.get(i).getMarca())){
                    listaExclusivosMarca.add(Tela_cadastroProdutos.listaProdutos.get(i).getMarca());
                    
            }
        }
        
        cb_categoria.addItem("");
        cb_marca.addItem("");
        
        for(int i=0; i<listaExclusivosCategoria.size(); i++){
            cb_categoria.addItem(listaExclusivosCategoria.get(i));
        }
        
        for(int i=0; i<listaExclusivosMarca.size(); i++){
            cb_marca.addItem(listaExclusivosMarca.get(i));
        }
    }
    
    public void FiltrarLista(){
        listaFiltrosGeral = new ArrayList();
        
        try{
        if(cb_categoria.getSelectedItem().equals("") && !cb_marca.getSelectedItem().equals("")) {
            listaFiltrosGeral = listaFiltrosMarca;
        } 
        else if(cb_marca.getSelectedItem().equals("") && !cb_categoria.getSelectedItem().equals("")) {
            listaFiltrosGeral = listaFiltrosCat;
            
        }
        
        else if(cb_categoria.getSelectedItem().equals("") && cb_marca.getSelectedItem().equals("")){
            listaFiltrosGeral = Tela_cadastroProdutos.listaProdutos;
           
        }
        
        else {
        
            for(int i=0; i<listaFiltrosCat.size(); i++){
                if(listaFiltrosMarca.contains(listaFiltrosCat.get(i))){
                    listaFiltrosGeral.add(listaFiltrosCat.get(i));
                }
            }
        }
            
        modelProdutos.removeAllElements();
        for(int i=0; i<listaFiltrosGeral.size(); i++){
            modelProdutos.addElement(listaFiltrosGeral.get(i).getNome());
        }
        }
        
        catch(Exception e){
            
        }
    }
    
    public void limparTxArea(){
        tx_infosProduto.setText("");
    }
    
    public void limparItensAdicionados(){
          
            for(int i=0; i<Tela_Inicial.listaAdicionados.size(); i++){
                if(modelProdutos.contains(i)){
                    modelProdutos.removeElement(Tela_Inicial.listaAdicionados.get(i));
                }
            }
        
    }
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList_produtos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tx_infosProduto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        bt_addCarrinho = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cb_categoria = new javax.swing.JComboBox<>();
        cb_marca = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_irCarrinho = new javax.swing.JButton();
        lb_valorCarrinho = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jList_produtos.setBackground(new java.awt.Color(255, 255, 255));
        jList_produtos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jList_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_produtos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Lista de Produtos");

        tx_infosProduto.setBackground(new java.awt.Color(255, 255, 255));
        tx_infosProduto.setColumns(20);
        tx_infosProduto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tx_infosProduto.setForeground(new java.awt.Color(0, 0, 0));
        tx_infosProduto.setRows(5);
        jScrollPane2.setViewportView(tx_infosProduto);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Informações do produto selecionado:");

        bt_addCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_addCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_addCarrinho.setForeground(new java.awt.Color(255, 102, 0));
        bt_addCarrinho.setText("Adicionar ao carrinho");
        bt_addCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_addCarrinhoMouseClicked(evt);
            }
        });
        bt_addCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addCarrinhoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Produtos");

        cb_categoria.setBackground(new java.awt.Color(255, 255, 255));
        cb_categoria.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cb_categoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_categoriaMouseClicked(evt);
            }
        });
        cb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoriaActionPerformed(evt);
            }
        });

        cb_marca.setBackground(new java.awt.Color(255, 255, 255));
        cb_marca.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cb_marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_marcaMouseClicked(evt);
            }
        });
        cb_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_marcaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 0));
        jLabel8.setText("Categoria");

        bt_irCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        bt_irCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_irCarrinho.setForeground(new java.awt.Color(255, 102, 0));
        bt_irCarrinho.setText("Ir ao Carrinho");
        bt_irCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_irCarrinhoMouseClicked(evt);
            }
        });
        bt_irCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_irCarrinhoActionPerformed(evt);
            }
        });

        lb_valorCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lb_valorCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        lb_valorCarrinho.setText("<Valor do carrinho>");

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 102, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        bt_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jLabel3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(bt_irCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(32, 32, 32)
                                                    .addComponent(lb_valorCarrinho))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt_addCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jLabel2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addGap(100, 100, 100)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_addCarrinho)
                                .addGap(41, 41, 41)
                                .addComponent(bt_irCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_valorCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addCarrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addCarrinhoActionPerformed

    private void cb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoriaActionPerformed
        if(!cb_categoria.getSelectedItem().toString().equals("")){
            listaFiltrosCat = new ArrayList<>();
            
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria().equals(cb_categoria.getSelectedItem().toString())){
                    listaFiltrosCat.add(Tela_cadastroProdutos.listaProdutos.get(i));
                    
                }
            }
        }
            
        
        else{
            listaFiltrosCat = Tela_cadastroProdutos.listaProdutos;
        }
        
        FiltrarLista();
        
    }//GEN-LAST:event_cb_categoriaActionPerformed

    private void cb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_marcaActionPerformed
        if(!cb_marca.getSelectedItem().toString().equals("")){
        
        listaFiltrosMarca = new ArrayList<>();
        
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(Tela_cadastroProdutos.listaProdutos.get(i).getMarca().equals(cb_marca.getSelectedItem().toString())){
                        listaFiltrosMarca.add(Tela_cadastroProdutos.listaProdutos.get(i));
                }
            }
       }
        else{
            listaFiltrosMarca = Tela_cadastroProdutos.listaProdutos;
        }
        FiltrarLista();
        
    }//GEN-LAST:event_cb_marcaActionPerformed

    private void bt_irCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_irCarrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_irCarrinhoActionPerformed

    private void bt_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_voltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_voltarActionPerformed

    private void jList_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList_produtosMouseClicked
        limparTxArea();
        tx_infosProduto.append(Tela_cadastroProdutos.listaProdutos.get(jList_produtos.getSelectedIndex()).getCategoria() + "\n");
        tx_infosProduto.append(Tela_cadastroProdutos.listaProdutos.get(jList_produtos.getSelectedIndex()).getFornecedor() + "\n");
        tx_infosProduto.append(Tela_cadastroProdutos.listaProdutos.get(jList_produtos.getSelectedIndex()).getMarca() + "\n");
        tx_infosProduto.append(Tela_cadastroProdutos.listaProdutos.get(jList_produtos.getSelectedIndex()).getEstoque() + "\n");
        tx_infosProduto.append(Tela_cadastroProdutos.listaProdutos.get(jList_produtos.getSelectedIndex()).getPrecoVenda() + "\n");
    }//GEN-LAST:event_jList_produtosMouseClicked

    private void cb_categoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_categoriaMouseClicked
        
    }//GEN-LAST:event_cb_categoriaMouseClicked

    private void cb_marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_marcaMouseClicked
       
    }//GEN-LAST:event_cb_marcaMouseClicked

    private void bt_addCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCarrinhoMouseClicked
              
            Janela.t13 = new Tela_quantidadeProduto(jList_produtos.getSelectedValue(), clienteLogado);
            Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.t11);
            janela.add(Janela.t13, BorderLayout.CENTER);
            janela.pack();
    }//GEN-LAST:event_bt_addCarrinhoMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
            Janela.t2 = new Tela_login();
            Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
            janela.getContentPane().remove(Janela.t11);
            janela.add(Janela.t2, BorderLayout.CENTER);
            janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_irCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_irCarrinhoMouseClicked
        Janela.t12 = new Tela_carrinho(clienteLogado);
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t11);
        janela.add(Janela.t12, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_irCarrinhoMouseClicked
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addCarrinho;
    private javax.swing.JButton bt_irCarrinho;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JComboBox<String> cb_categoria;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList_produtos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_valorCarrinho;
    private javax.swing.JTextArea tx_infosProduto;
    // End of variables declaration//GEN-END:variables
}
