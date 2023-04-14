
package trabalho_doo;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Tela_imprimeCatalogo extends javax.swing.JPanel {

    public Tela_imprimeCatalogo() {
        initComponents();
    }
    
    public ArrayList separacao(){
        ArrayList<Produto> listaOrdenada = new ArrayList();
        if(rb_categoria.isSelected()){
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=i+1; j<Tela_cadastroProdutos.listaProdutos.size(); j++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria().equals(Tela_cadastroProdutos.listaProdutos.get(j).getCategoria())){
                        listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(j));
                    }
                }
            }
        }
        
        else if(rb_forndecedor.isSelected()){
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=i+1; j<Tela_cadastroProdutos.listaProdutos.size(); i++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor().equals(Tela_cadastroProdutos.listaProdutos.get(j).getFornecedor())){
                        listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(j));
                    }
                }
            }
        }
        
        else{
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=i+1; j<Tela_cadastroProdutos.listaProdutos.size(); i++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getMarca().equals(Tela_cadastroProdutos.listaProdutos.get(j).getMarca())){
                        listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(j));
                    }
                }
            }
        }
            return listaOrdenada;
    }
    
    public void Preco(ArrayList<Produto> listaOrdenada){
        if(rb_somenteVenda.isSelected()){
            
            for(int i =0; i<listaOrdenada.size();i++){
                 System.out.println(listaOrdenada.get(i).nome + " - Categoria: " + listaOrdenada.get(i).getCategoria() + " - Fornecedor: " + listaOrdenada.get(i).fornecedor + " - Marca: " +
                                    listaOrdenada.get(i).getMarca() + " - Preço: " + listaOrdenada.get(i).precoVenda);       
            }
        }
        
        else if(rb_custoVenda.isSelected()){
            for(int i =0; i<listaOrdenada.size();i++){
                 System.out.println(listaOrdenada.get(i).nome + " - Categoria: " + listaOrdenada.get(i).getCategoria() + " - Fornecedor: " + listaOrdenada.get(i).fornecedor + " - Marca: " +
                                    listaOrdenada.get(i).getMarca() + " - Preço de custo: " + listaOrdenada.get(i).precoCusto + " - Preço de Venda: " + listaOrdenada.get(i).precoVenda);  
            }
        }
       
        else{
            for(int i =0; i<listaOrdenada.size();i++){
                 System.out.println(listaOrdenada.get(i).nome + " - CAtegoria: " + listaOrdenada.get(i).getCategoria() + " - Fornecedor: " + listaOrdenada.get(i).fornecedor + " - Marca: " +
                                    listaOrdenada.get(i).getMarca());     
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        rb_categoria = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rb_forndecedor = new javax.swing.JRadioButton();
        rb_marca = new javax.swing.JRadioButton();
        rb_somenteVenda = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        rb_custoVenda = new javax.swing.JRadioButton();
        rb_naoPrecos = new javax.swing.JRadioButton();
        bt_voltar = new javax.swing.JButton();
        bt_imprime = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Catálogo");

        buttonGroup1.add(rb_categoria);
        rb_categoria.setForeground(new java.awt.Color(255, 102, 0));
        rb_categoria.setText("Categoria");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Separar por:");

        buttonGroup1.add(rb_forndecedor);
        rb_forndecedor.setForeground(new java.awt.Color(255, 102, 0));
        rb_forndecedor.setText("Fornecedor");

        buttonGroup1.add(rb_marca);
        rb_marca.setForeground(new java.awt.Color(255, 102, 0));
        rb_marca.setText("Marca");

        buttonGroup2.add(rb_somenteVenda);
        rb_somenteVenda.setForeground(new java.awt.Color(255, 102, 0));
        rb_somenteVenda.setText("Mostrar somente de venda");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Preço:");

        buttonGroup2.add(rb_custoVenda);
        rb_custoVenda.setForeground(new java.awt.Color(255, 102, 0));
        rb_custoVenda.setText("Mostrar preço de custo e de venda");

        buttonGroup2.add(rb_naoPrecos);
        rb_naoPrecos.setForeground(new java.awt.Color(255, 102, 0));
        rb_naoPrecos.setText("Não exibir preços");

        bt_voltar.setBackground(new java.awt.Color(255, 255, 255));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(255, 102, 0));
        bt_voltar.setText("Voltar");

        bt_imprime.setBackground(new java.awt.Color(255, 255, 255));
        bt_imprime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_imprime.setForeground(new java.awt.Color(255, 102, 0));
        bt_imprime.setText("Imprimir");
        bt_imprime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(155, 155, 155)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rb_forndecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rb_somenteVenda)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rb_custoVenda)
                                .addComponent(rb_naoPrecos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_imprime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_forndecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(rb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rb_somenteVenda)
                        .addGap(18, 18, 18)
                        .addComponent(rb_custoVenda)
                        .addGap(18, 18, 18)
                        .addComponent(rb_naoPrecos)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_imprime, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimeMouseClicked
        if((!rb_categoria.isSelected() && !rb_forndecedor.isSelected() && !rb_marca.isSelected())) {
            JOptionPane.showMessageDialog(null, "Selecione um método de separação", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(!rb_somenteVenda.isSelected() && !rb_custoVenda.isSelected() && !rb_custoVenda.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione um método de Preço", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        else{
            Preco(separacao());
        }
    }//GEN-LAST:event_bt_imprimeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_imprime;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rb_categoria;
    private javax.swing.JRadioButton rb_custoVenda;
    private javax.swing.JRadioButton rb_forndecedor;
    private javax.swing.JRadioButton rb_marca;
    private javax.swing.JRadioButton rb_naoPrecos;
    private javax.swing.JRadioButton rb_somenteVenda;
    // End of variables declaration//GEN-END:variables
}
