
package trabalho_doo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_quantidadeProduto extends javax.swing.JPanel {
    String produtoTxt;
    Cliente clienteLogado;
    
    
    public Tela_quantidadeProduto(String produto, Cliente clienteLogado) {
        initComponents();
        this.produtoTxt = produto;
        tx_estoque.setText(achaProduto(produto).getEstoque());
        tx_estoque.setEditable(false);
        this.clienteLogado = clienteLogado;
        lb_produto.setText(produto);
        tx_quantidade.setOpaque(false);
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
    
    public void alteraEstoque(){
            Produto p1 = new Produto();
            p1 = achaProduto(produtoTxt);
                double estoqueAtual = Double.parseDouble(p1.getEstoque()) - Double.parseDouble(tx_quantidade.getText());
                p1.setEstoque(String.valueOf(estoqueAtual));
            
            
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_produto = new javax.swing.JLabel();
        tx_quantidade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        tx_estoque = new javax.swing.JTextField();
        lb_estoque = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();
        bt_voltar = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(553, 248));
        setLayout(null);

        lb_produto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_produto.setForeground(new java.awt.Color(255, 153, 51));
        lb_produto.setText("<Produto>");
        add(lb_produto);
        lb_produto.setBounds(172, 6, 129, 26);

        tx_quantidade.setBackground(new java.awt.Color(255, 255, 255));
        tx_quantidade.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tx_quantidade.setForeground(new java.awt.Color(255, 255, 255));
        tx_quantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_quantidade.setText("1");
        tx_quantidade.setOpaque(false
        );
        add(tx_quantidade);
        tx_quantidade.setBounds(132, 88, 112, 25);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Quantidade:");
        add(jLabel1);
        jLabel1.setBounds(15, 88, 111, 25);

        tx_estoque.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoque.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tx_estoque.setForeground(new java.awt.Color(255, 255, 255));
        tx_estoque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tx_estoque.setOpaque(false);
        add(tx_estoque);
        tx_estoque.setBounds(390, 90, 112, 25);

        lb_estoque.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_estoque.setForeground(new java.awt.Color(255, 153, 51));
        lb_estoque.setText("Estoque:");
        add(lb_estoque);
        lb_estoque.setBounds(310, 88, 80, 25);

        bt_salvar.setBackground(new java.awt.Color(255, 153, 102));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(0, 0, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });
        add(bt_salvar);
        bt_salvar.setBounds(376, 189, 158, 40);

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
        bt_voltar.setBounds(15, 189, 158, 40);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_553-248.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 550, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        Produto p1 = new Produto();
        p1 = achaProduto(produtoTxt);
       
        if(Double.parseDouble(p1.getEstoque()) >= Double.parseDouble(tx_quantidade.getText())){
        
        if(Tela_Inicial.listaAdicionados.contains(achaProduto(produtoTxt))){
            p1.setQuantidade(p1.getQuantidade() + Integer.parseInt(tx_quantidade.getText()));
            alteraEstoque();
        }
        
        else{
            Tela_Inicial.listaAdicionados.add(achaProduto(produtoTxt));
            p1.setQuantidade(Integer.parseInt(tx_quantidade.getText()));
            alteraEstoque();
        }
        
        Janela.t11 = new Tela_listaProdutos_cliente(clienteLogado);
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t13);
        janela.add(Janela.t11, BorderLayout.CENTER);
        janela.pack();
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Quantidade insuficeiente no estoque", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        
        
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t13);
        janela.add(Janela.t11, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_estoque;
    private javax.swing.JLabel lb_produto;
    private javax.swing.JTextField tx_estoque;
    private javax.swing.JTextField tx_quantidade;
    // End of variables declaration//GEN-END:variables
}
