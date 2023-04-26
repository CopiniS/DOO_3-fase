
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;


public class Tela_imprimeCatalogo extends javax.swing.JPanel {

    public Tela_imprimeCatalogo() {
        initComponents();
    }
    
    public ArrayList separacao(){
        ArrayList<Produto> listaOrdenada = new ArrayList();
        
        if(rb_categoria.isSelected()){
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=0; j<Tela_cadastroProdutos.listaProdutos.size(); j++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria().equalsIgnoreCase(Tela_cadastroProdutos.listaProdutos.get(j).getCategoria())
                            && !listaOrdenada.contains(Tela_cadastroProdutos.listaProdutos.get(j))){
                            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(j));
                    }
                }
                
            }
        }
        
        else if(rb_forndecedor.isSelected()){
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=0; j<Tela_cadastroProdutos.listaProdutos.size(); j++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getFornecedor().equalsIgnoreCase(Tela_cadastroProdutos.listaProdutos.get(j).getFornecedor())
                        && !listaOrdenada.contains(Tela_cadastroProdutos.listaProdutos.get(j))){
                        listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(j));
                    }
                }
            }
        }
        
        else{
            listaOrdenada.add(Tela_cadastroProdutos.listaProdutos.get(0));
            for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
                for(int j=0; j<Tela_cadastroProdutos.listaProdutos.size(); j++){
                    if(Tela_cadastroProdutos.listaProdutos.get(i).getMarca().equalsIgnoreCase(Tela_cadastroProdutos.listaProdutos.get(j).getMarca())
                        && !listaOrdenada.contains(Tela_cadastroProdutos.listaProdutos.get(j))){
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
                                    listaOrdenada.get(i).getMarca() + " - Preço: " + listaOrdenada.get(i).precoVenda + "\n");       
            }
        }
        
        else if(rb_custoVenda.isSelected()){
            for(int i =0; i<listaOrdenada.size();i++){
                 System.out.println(listaOrdenada.get(i).nome + " - Categoria: " + listaOrdenada.get(i).getCategoria() + " - Fornecedor: " + listaOrdenada.get(i).fornecedor + " - Marca: " +
                                    listaOrdenada.get(i).getMarca() + " - Preço de custo: " + listaOrdenada.get(i).precoCusto + " - Preço de Venda: " + listaOrdenada.get(i).precoVenda + "\n");  
            }
        }
       
        else{
            for(int i =0; i<listaOrdenada.size();i++){
                 System.out.println(listaOrdenada.get(i).nome + " - Categoria: " + listaOrdenada.get(i).getCategoria() + " - Fornecedor: " + listaOrdenada.get(i).fornecedor + " - Marca: " +
                                    listaOrdenada.get(i).getMarca() + "\n");   
                 
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
        lb_back = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
        setPreferredSize(new java.awt.Dimension(493, 376));
        setRequestFocusEnabled(false);
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Catálogo");
        add(jLabel5);
        jLabel5.setBounds(155, 6, 123, 32);

        buttonGroup1.add(rb_categoria);
        rb_categoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_categoria.setForeground(new java.awt.Color(255, 255, 255));
        rb_categoria.setText("Categoria");
        rb_categoria.setOpaque(false);
        add(rb_categoria);
        rb_categoria.setBounds(47, 143, 91, 29);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Separar por:");
        add(jLabel1);
        jLabel1.setBounds(47, 93, 113, 32);

        buttonGroup1.add(rb_forndecedor);
        rb_forndecedor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_forndecedor.setForeground(new java.awt.Color(255, 255, 255));
        rb_forndecedor.setText("Fornecedor");
        rb_forndecedor.setOpaque(false);
        add(rb_forndecedor);
        rb_forndecedor.setBounds(47, 178, 91, 29);

        buttonGroup1.add(rb_marca);
        rb_marca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_marca.setForeground(new java.awt.Color(255, 255, 255));
        rb_marca.setText("Marca");
        rb_marca.setOpaque(false);
        add(rb_marca);
        rb_marca.setBounds(47, 212, 91, 29);

        buttonGroup2.add(rb_somenteVenda);
        rb_somenteVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_somenteVenda.setForeground(new java.awt.Color(255, 255, 255));
        rb_somenteVenda.setText("Mostrar somente de venda");
        rb_somenteVenda.setOpaque(false);
        add(rb_somenteVenda);
        rb_somenteVenda.setBounds(210, 140, 210, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Preço:");
        add(jLabel2);
        jLabel2.setBounds(210, 90, 113, 32);

        buttonGroup2.add(rb_custoVenda);
        rb_custoVenda.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rb_custoVenda.setForeground(new java.awt.Color(255, 255, 255));
        rb_custoVenda.setText("Mostrar preço de custo e de venda");
        rb_custoVenda.setOpaque(false);
        rb_custoVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_custoVendaActionPerformed(evt);
            }
        });
        add(rb_custoVenda);
        rb_custoVenda.setBounds(210, 180, 270, 25);

        buttonGroup2.add(rb_naoPrecos);
        rb_naoPrecos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rb_naoPrecos.setForeground(new java.awt.Color(255, 255, 255));
        rb_naoPrecos.setText("Não exibir preços");
        rb_naoPrecos.setOpaque(false);
        add(rb_naoPrecos);
        rb_naoPrecos.setBounds(210, 220, 130, 21);

        bt_voltar.setBackground(new java.awt.Color(255, 153, 102));
        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setForeground(new java.awt.Color(0, 0, 0));
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });
        add(bt_voltar);
        bt_voltar.setBounds(33, 319, 111, 39);

        bt_imprime.setBackground(new java.awt.Color(255, 153, 102));
        bt_imprime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_imprime.setForeground(new java.awt.Color(0, 0, 0));
        bt_imprime.setText("Imprimir");
        bt_imprime.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimeMouseClicked(evt);
            }
        });
        add(bt_imprime);
        bt_imprime.setBounds(334, 319, 111, 39);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_490-482.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 490, 380);

        jLabel4.setText("jLabel4");
        add(jLabel4);
        jLabel4.setBounds(0, 0, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimeMouseClicked
        if((!rb_categoria.isSelected() && !rb_forndecedor.isSelected() && !rb_marca.isSelected())) {
            JOptionPane.showMessageDialog(null, "Selecione um método de separação", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else if(!rb_somenteVenda.isSelected() && !rb_custoVenda.isSelected() && !rb_naoPrecos.isSelected()){
            JOptionPane.showMessageDialog(null, "Selecione um método de Preço", "ERRO", JOptionPane.ERROR_MESSAGE);
            
        }
        
        else{
            Preco(separacao());
        }
    }//GEN-LAST:event_bt_imprimeMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t8);
        janela.add(Janela.t6, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void rb_custoVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_custoVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_custoVendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_imprime;
    private javax.swing.JButton bt_voltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_back;
    private javax.swing.JRadioButton rb_categoria;
    private javax.swing.JRadioButton rb_custoVenda;
    private javax.swing.JRadioButton rb_forndecedor;
    private javax.swing.JRadioButton rb_marca;
    private javax.swing.JRadioButton rb_naoPrecos;
    private javax.swing.JRadioButton rb_somenteVenda;
    // End of variables declaration//GEN-END:variables
}
