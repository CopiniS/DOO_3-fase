
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

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        lb_total = new javax.swing.JLabel();
        lb_back = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(684, 644));
        setLayout(null);

        jList_produtos.setBackground(new java.awt.Color(255, 255, 255));
        jList_produtos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jList_produtos.setOpaque(false
        );
        jList_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList_produtosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList_produtos);

        add(jScrollPane1);
        jScrollPane1.setBounds(36, 277, 214, 270);
        add(jLabel1);
        jLabel1.setBounds(45, 40, 94, 24);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Lista de Produtos");
        add(jLabel5);
        jLabel5.setBounds(212, 6, 219, 32);

        tx_infosProduto.setBackground(new java.awt.Color(255, 255, 255));
        tx_infosProduto.setColumns(20);
        tx_infosProduto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tx_infosProduto.setForeground(new java.awt.Color(0, 0, 0));
        tx_infosProduto.setRows(5);
        tx_infosProduto.setOpaque(false);
        jScrollPane2.setViewportView(tx_infosProduto);

        add(jScrollPane2);
        jScrollPane2.setBounds(290, 280, 360, 163);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Informações do produto selecionado:");
        add(jLabel2);
        jLabel2.setBounds(290, 230, 330, 31);

        bt_addCarrinho.setBackground(new java.awt.Color(255, 153, 102));
        bt_addCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_addCarrinho.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_addCarrinho);
        bt_addCarrinho.setBounds(280, 480, 180, 27);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Produtos");
        add(jLabel3);
        jLabel3.setBounds(40, 230, 90, 31);

        cb_categoria.setBackground(new java.awt.Color(255, 153, 102));
        cb_categoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        add(cb_categoria);
        cb_categoria.setBounds(40, 160, 158, 30);

        cb_marca.setBackground(new java.awt.Color(255, 153, 102));
        cb_marca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        add(cb_marca);
        cb_marca.setBounds(400, 160, 158, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Marca");
        add(jLabel7);
        jLabel7.setBounds(400, 114, 60, 25);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Categoria");
        add(jLabel8);
        jLabel8.setBounds(45, 114, 119, 25);

        bt_irCarrinho.setBackground(new java.awt.Color(255, 153, 102));
        bt_irCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_irCarrinho.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_irCarrinho);
        bt_irCarrinho.setBounds(480, 480, 180, 29);

        lb_valorCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_valorCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        lb_valorCarrinho.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_valorCarrinho.setText("<Valor do carrinho>");
        lb_valorCarrinho.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(lb_valorCarrinho);
        lb_valorCarrinho.setBounds(500, 590, 170, 30);

        bt_voltar.setBackground(new java.awt.Color(255, 153, 102));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
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
        add(bt_voltar);
        bt_voltar.setBounds(40, 580, 175, 29);

        lb_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(0, 0, 0));
        lb_total.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_total.setText("Total:");
        lb_total.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        add(lb_total);
        lb_total.setBounds(440, 590, 59, 30);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_680-640.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 680, 640);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList_produtos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_valorCarrinho;
    private javax.swing.JTextArea tx_infosProduto;
    // End of variables declaration//GEN-END:variables
}
