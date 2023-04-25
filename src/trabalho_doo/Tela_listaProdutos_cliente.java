
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;

public class Tela_listaProdutos_cliente extends javax.swing.JPanel {
    DefaultListModel<String> modelProdutos;
    ArrayList<Produto> listaFiltrosCat;
    ArrayList<Produto> listaFiltrosFor;
    ArrayList<Produto> listaFiltrosMarca;
    ArrayList<Produto> listaFiltrosGeral;
    static ArrayList<Produto> listaAdicionados;
    Cliente clienteLogado;
    
    public Tela_listaProdutos_cliente(Cliente clientelogado) {
        initComponents();
        
        modelProdutos = new DefaultListModel<>();
        jList_produtos.setModel(modelProdutos);
        iniciarJlists();
        iniciarComboBox();
        listaAdicionados = new ArrayList();
        listaFiltrosCat = new ArrayList();
        listaFiltrosMarca = new ArrayList();
        listaFiltrosFor = new ArrayList();
        listaFiltrosGeral = new ArrayList();
        this.clienteLogado = clientelogado;
        tx_infosProduto.setEnabled(false);
        
    }
    
    public void iniciarJlists(){
        if(Tela_cadastroProdutos.listaProdutos !=null){
               
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                modelProdutos.addElement(Tela_cadastroProdutos.listaProdutos.get(i).getNome());
           }
        }
    }
    
    public void iniciarComboBox(){
        
        ArrayList<String> listaExclusivosCategoria = new ArrayList();
        ArrayList<String> listaExclusivosFornecedor = new ArrayList();
        ArrayList<String> listaExclusivosMarca = new ArrayList();
        
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(!listaExclusivosCategoria.contains(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria())){
                    listaExclusivosCategoria.add(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria());
            }
        }
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(!listaExclusivosFornecedor.contains(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor())){
                    listaExclusivosFornecedor.add(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor());
            }
        }
        
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                if(!listaExclusivosMarca.contains(Tela_cadastroProdutos.listaProdutos.get(i).getMarca())){
                    listaExclusivosMarca.add(Tela_cadastroProdutos.listaProdutos.get(i).getMarca());
                    
            }
        }
        
        cb_categoria.addItem("");
        cb_fornecedor.addItem("");
        cb_marca.addItem("");
        for(int i=0; i<listaExclusivosCategoria.size(); i++){
            cb_categoria.addItem(listaExclusivosCategoria.get(i));
        }
        for(int i=0; i<listaExclusivosFornecedor.size(); i++){
            cb_fornecedor.addItem(listaExclusivosFornecedor.get(i));
        }
        for(int i=0; i<listaExclusivosMarca.size(); i++){
            cb_marca.addItem(listaExclusivosMarca.get(i));
        }
    }
    
    public void FiltrarLista(){
        
        if(listaFiltrosCat.equals("") && listaFiltrosFor.equals("")) {
            listaFiltrosGeral = listaFiltrosMarca;
        } 
        else if(listaFiltrosCat.equals("") && listaFiltrosMarca.equals("")) {
            listaFiltrosGeral = listaFiltrosFor;
        }   
        else if(listaFiltrosFor.equals("") && listaFiltrosMarca.equals("")) {
            listaFiltrosGeral = listaFiltrosFor;
        } 
        else {
        
            for(int i=0; i<listaFiltrosCat.size(); i++){
                if(listaFiltrosFor.contains(listaFiltrosCat.get(i)) && listaFiltrosMarca.contains(listaFiltrosCat.get(i))){
                    listaFiltrosGeral.add(listaFiltrosCat.get(i));
                }
            }
            
            for(int i=0; i<listaFiltrosFor.size(); i++){
                if(listaFiltrosCat.contains(listaFiltrosFor.get(i)) && listaFiltrosMarca.contains(listaFiltrosFor.get(i))){
                    listaFiltrosGeral.add(listaFiltrosFor.get(i));
                }
            }
            
            for(int i=0; i<listaFiltrosMarca.size(); i++){
                if(listaFiltrosFor.contains(listaFiltrosMarca.get(i)) && listaFiltrosCat.contains(listaFiltrosMarca.get(i))){
                    listaFiltrosGeral.add(listaFiltrosMarca.get(i));
                }
            }
            
        }
        
        
        modelProdutos.removeAllElements();
        for(int i=0; i<listaFiltrosGeral.size(); i++){
            modelProdutos.addElement(listaFiltrosGeral.get(i).getNome());
        }
    }
    
    public void limparTxArea(){
        tx_infosProduto.setText("");
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
        cb_fornecedor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bt_irCarrinho = new javax.swing.JButton();
        lb_valorCarrinho = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jList_produtos.setBackground(new java.awt.Color(255, 255, 255));
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

        cb_fornecedor.setBackground(new java.awt.Color(255, 255, 255));
        cb_fornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_fornecedorMouseClicked(evt);
            }
        });
        cb_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_fornecedorActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Filtrar:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Fornecedor");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Marca");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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

        lb_valorCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        lb_valorCarrinho.setText("Valor do carrinho");

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

        jLabel10.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_irCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_valorCarrinho)
                .addGap(12, 12, 12))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_addCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel3)
                                        .addGap(43, 43, 43))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_categoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cb_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt_addCarrinho))
                        .addGap(39, 39, 39)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_irCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_valorCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_addCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addCarrinhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_addCarrinhoActionPerformed

    private void cb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_categoriaActionPerformed

    private void cb_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_marcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_marcaActionPerformed

    private void cb_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_fornecedorActionPerformed

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
        if(!cb_categoria.getSelectedItem().equals("")){
        
        listaFiltrosCat = new ArrayList<>();
        if(!cb_categoria.getSelectedItem().toString().equals("")){
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
        }
    }//GEN-LAST:event_cb_categoriaMouseClicked

    private void cb_marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_marcaMouseClicked
        if(!cb_marca.getSelectedItem().equals("")){
        
        listaFiltrosMarca = new ArrayList<>();
        if(!cb_marca.getSelectedItem().toString().equals(null)){
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
        }
    }//GEN-LAST:event_cb_marcaMouseClicked

    private void cb_fornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_fornecedorMouseClicked
        if(!cb_fornecedor.getSelectedItem().equals("")){
        
        listaFiltrosFor = new ArrayList<>();
        if(!cb_fornecedor.getSelectedItem().toString().equals(null)){
                for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor().equals(cb_fornecedor.getSelectedItem().toString())){
                        listaFiltrosFor.add(Tela_cadastroProdutos.listaProdutos.get(i));
                    }
                }
            }
        
        else{
            listaFiltrosFor = Tela_cadastroProdutos.listaProdutos;
        }
        FiltrarLista();
        }
    }//GEN-LAST:event_cb_fornecedorMouseClicked

    private void bt_addCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_addCarrinhoMouseClicked
                
        
            Janela.t13 = new Tela_quantidadeProduto(jList_produtos.getSelectedValue());
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
    private javax.swing.JComboBox<String> cb_fornecedor;
    private javax.swing.JComboBox<String> cb_marca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList_produtos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_valorCarrinho;
    private javax.swing.JTextArea tx_infosProduto;
    // End of variables declaration//GEN-END:variables
}
