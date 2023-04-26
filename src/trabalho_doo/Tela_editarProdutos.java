
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_editarProdutos extends javax.swing.JPanel {
    String produto;
    public Tela_editarProdutos(String produto) {
        initComponents();
        this.produto = produto;
        iniciarCaixasTextos();  
        lb_nome.setText(produto);
    }
    
    public void iniciarCaixasTextos(){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                tx_categoria.setText(Tela_cadastroProdutos.listaProdutos.get(i).getCategoria());
                tx_precoCusto.setText(Tela_cadastroProdutos.listaProdutos.get(i).getPrecoCusto());
                tx_precoVenda.setText(Tela_cadastroProdutos.listaProdutos.get(i).getPrecoVenda());
                tx_marca.setText(Tela_cadastroProdutos.listaProdutos.get(i).getMarca());
                tx_estoque.setText(Tela_cadastroProdutos.listaProdutos.get(i).getEstoque());
            }
        }
     }
    public void editaProduto(){
        for(int i=0; i<Tela_cadastroProdutos.listaProdutos.size(); i++){
            if(Tela_cadastroProdutos.listaProdutos.get(i).getNome().equals(produto)){
                Tela_cadastroProdutos.listaProdutos.get(i).setCategoria(tx_categoria.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setPrecoCusto(tx_precoCusto.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setPrecoVenda(tx_precoVenda.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setMarca(tx_marca.getText());
                Tela_cadastroProdutos.listaProdutos.get(i).setEstoque(tx_estoque.getText());
                
            }
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        tx_estoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tx_precoVenda = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tx_marca = new javax.swing.JTextField();
        tx_categoria = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bt_voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_nome = new javax.swing.JLabel();
        bt_salvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tx_precoCusto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(406, 518));
        setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Preço de venda:");
        add(jLabel6);
        jLabel6.setBounds(220, 210, 137, 27);

        tx_estoque.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoque.setForeground(new java.awt.Color(255, 255, 255));
        tx_estoque.setOpaque(false);
        tx_estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_estoqueActionPerformed(evt);
            }
        });
        tx_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_estoqueKeyTyped(evt);
            }
        });
        add(tx_estoque);
        tx_estoque.setBounds(130, 310, 140, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Marca:");
        add(jLabel7);
        jLabel7.setBounds(50, 150, 64, 27);

        tx_precoVenda.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoVenda.setForeground(new java.awt.Color(255, 255, 255));
        tx_precoVenda.setOpaque(false);
        tx_precoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoVendaKeyTyped(evt);
            }
        });
        add(tx_precoVenda);
        tx_precoVenda.setBounds(220, 240, 130, 22);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Estoque:");
        add(jLabel8);
        jLabel8.setBounds(130, 280, 100, 25);

        tx_marca.setBackground(new java.awt.Color(255, 255, 255));
        tx_marca.setForeground(new java.awt.Color(255, 255, 255));
        tx_marca.setOpaque(false);
        add(tx_marca);
        tx_marca.setBounds(50, 180, 300, 22);

        tx_categoria.setBackground(new java.awt.Color(255, 255, 255));
        tx_categoria.setForeground(new java.awt.Color(255, 255, 255));
        tx_categoria.setOpaque(false);
        add(tx_categoria);
        tx_categoria.setBounds(50, 120, 300, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Categoria:");
        add(jLabel9);
        jLabel9.setBounds(50, 90, 89, 25);

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
        bt_voltar.setBounds(30, 430, 113, 34);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Editar ");
        add(jLabel1);
        jLabel1.setBounds(80, 10, 80, 32);

        lb_nome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(255, 153, 51));
        lb_nome.setText("<Nome> ");
        add(lb_nome);
        lb_nome.setBounds(170, 10, 190, 27);

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
        bt_salvar.setBounds(270, 430, 113, 34);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Preço de custo:");
        add(jLabel4);
        jLabel4.setBounds(50, 210, 149, 27);

        tx_precoCusto.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoCusto.setForeground(new java.awt.Color(255, 255, 255));
        tx_precoCusto.setOpaque(false);
        tx_precoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoCustoKeyTyped(evt);
            }
        });
        add(tx_precoCusto);
        tx_precoCusto.setBounds(50, 240, 130, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_429-518.jpg"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(-20, 0, 430, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        if(tx_marca.getText().isBlank() || tx_precoCusto.getText().isBlank() || tx_precoVenda.getText().isBlank() || 
        tx_estoque.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
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

    private void tx_estoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_estoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_estoqueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JTextField tx_categoria;
    private javax.swing.JTextField tx_estoque;
    private javax.swing.JTextField tx_marca;
    private javax.swing.JTextField tx_precoCusto;
    private javax.swing.JTextField tx_precoVenda;
    // End of variables declaration//GEN-END:variables
}
