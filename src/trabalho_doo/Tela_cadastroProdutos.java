
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Tela_cadastroProdutos extends javax.swing.JPanel {
    static ArrayList<Produto> listaProdutos;
    
    public Tela_cadastroProdutos() {
        initComponents();
        listaProdutos = new ArrayList();
         produtosPrecadastrados();
    }
    
    public Produto criaProduto(){
        Produto p1 = new Produto();
        
        p1.setNome(tx_nome.getText());
        p1.setCategoria(tx_categoria.getText());
        p1.setMarca(tx_marca.getText());
        p1.setPrecoCusto(tx_precoCusto.getText());
        p1.setPrecoVenda(tx_precoVenda.getText());
        p1.setEstoque(tx_estoque.getText());
        
        return p1;
    }
    
    public void produtosPrecadastrados(){
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        Produto p4 = new Produto();
        Produto p5 = new Produto();
        Produto p6 = new Produto();
        Produto p7 = new Produto();
        Produto p8 = new Produto();
        Produto p9 = new Produto();
        Produto p10 = new Produto();
        Produto p11 = new Produto();
        
        
        p1.setNome("Banana");
        p1.setCategoria("Fruta");
        p1.setFornecedor("Via Serra");
        p1.setMarca("Da terra");
        p1.setPrecoCusto("5");
        p1.setPrecoVenda("10");
        p1.setEstoque("100");
        
        p2.setNome("Bolacha agua e sal");
        p2.setCategoria("bolacha");
        p2.setFornecedor("mirabel");
        p2.setMarca("Mirabel");
        p2.setPrecoCusto("1");
        p2.setPrecoVenda("1.50");
        p2.setEstoque("1000");
        
        p3.setNome("Maçã");
        p3.setCategoria("Fruta");
        p3.setFornecedor("Via Serra");
        p3.setMarca("fungi");
        p3.setPrecoCusto("2");
        p3.setPrecoVenda("6");
        p3.setEstoque("205");
        
        p4.setNome("Pera");
        p4.setCategoria("Fruta");
        p4.setFornecedor("Havita");
        p4.setMarca("Chocolate");
        p4.setPrecoCusto("3");
        p4.setPrecoVenda("7");
        p4.setEstoque("8");
        
        p5.setNome("Bacon cubos");
        p5.setCategoria("Bacon");
        p5.setFornecedor("Havita");
        p5.setMarca("fazenda");
        p5.setPrecoCusto("17");
        p5.setPrecoVenda("21");
        p5.setEstoque("250");
        
        p6.setNome("Calabresa fatiada");
        p6.setCategoria("calabresa");
        p6.setFornecedor("franciosi");
        p6.setMarca("Perdigao");
        p6.setPrecoCusto("16.99");
        p6.setPrecoVenda("10");
        p6.setEstoque("100");
        
        p7.setNome("Bacon fatiado");
        p7.setCategoria("Bacon");
        p7.setFornecedor("franciosi");
        p7.setMarca("Perdigao");
        p7.setPrecoCusto("20");
        p7.setPrecoVenda("30");
        p7.setEstoque("300");
        
        p8.setNome("Bacon manta");
        p8.setCategoria("bacon");
        p8.setFornecedor("Via Serra");
        p8.setMarca("Perdigao");
        p8.setPrecoCusto("5");
        p8.setPrecoVenda("10");
        p8.setEstoque("100");
        
        p9.setNome("amora");
        p9.setCategoria("Fruta");
        p9.setFornecedor("Via Serra");
        p9.setMarca("Da terra");
        p9.setPrecoCusto("5");
        p9.setPrecoVenda("10");
        p9.setEstoque("100");
        
        p10.setNome("melancia");
        p10.setCategoria("Fruta");
        p10.setFornecedor("Via Serra");
        p10.setMarca("Da terra");
        p10.setPrecoCusto("5");
        p10.setPrecoVenda("10");
        p10.setEstoque("100");
        
        p11.setNome("melão");
        p11.setCategoria("Fruta");
        p11.setFornecedor("Via Serra");
        p11.setMarca("Da terra");
        p11.setPrecoCusto("5");
        p11.setPrecoVenda("10");
        p11.setEstoque("100");
        
        
        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
        listaProdutos.add(p4);
        listaProdutos.add(p5);
        listaProdutos.add(p6);
        listaProdutos.add(p7);
        listaProdutos.add(p8);
        listaProdutos.add(p9);
        listaProdutos.add(p10);
        listaProdutos.add(p11);
    }
    
    public void limparTextos(){
        tx_nome.setText("");
        tx_categoria.setText("");
        tx_marca.setText("");
        tx_precoCusto.setText("");
        tx_precoVenda.setText("");
        tx_estoque.setText("");
        
    }
    
    public boolean tratarErro(){
        boolean existeErro = false;
        
        if(tx_nome.getText().isBlank() || tx_categoria.getText().isBlank()||
        tx_marca.getText().isBlank() || tx_precoCusto.getText().isBlank() || tx_precoVenda.getText().isBlank() || 
        tx_estoque.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Digite todos os campos obrigatórios", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            existeErro = true;
        }
        
        else if(!listaProdutos.isEmpty()){
            for(int i=0; i<listaProdutos.size(); i++){
                if(listaProdutos.get(i).getNome().equals(tx_nome.getText())){
                    JOptionPane.showMessageDialog(null, "Este nome de produto ja está cadastrado", 
                    "ERRO", JOptionPane.ERROR_MESSAGE);
                    existeErro = true;
                }
                
            }
        }
        return existeErro;
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tx_nome = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tx_precoCusto = new javax.swing.JTextField();
        tx_estoque = new javax.swing.JTextField();
        tx_precoVenda = new javax.swing.JTextField();
        tx_marca = new javax.swing.JTextField();
        tx_categoria = new javax.swing.JTextField();
        bt_voltar = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 102, 0));
        jButton1.setText("Salvar");

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(429, 495));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Cadastro de Produtos");
        add(jLabel1);
        jLabel1.setBounds(80, 20, 270, 32);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Nome: ");
        add(jLabel2);
        jLabel2.setBounds(40, 80, 70, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Preço de custo:");
        add(jLabel4);
        jLabel4.setBounds(40, 250, 149, 27);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Preço de venda:");
        add(jLabel6);
        jLabel6.setBounds(220, 250, 137, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Marca:");
        add(jLabel7);
        jLabel7.setBounds(220, 160, 64, 27);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Estoque:");
        add(jLabel8);
        jLabel8.setBounds(120, 340, 100, 25);

        tx_nome.setBackground(new java.awt.Color(255, 255, 255));
        tx_nome.setForeground(new java.awt.Color(255, 255, 255));
        tx_nome.setOpaque(false);
        tx_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_nomeActionPerformed(evt);
            }
        });
        add(tx_nome);
        tx_nome.setBounds(40, 110, 340, 22);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Categoria:");
        add(jLabel9);
        jLabel9.setBounds(40, 160, 95, 25);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 51));
        add(jLabel10);
        jLabel10.setBounds(0, 0, 0, 0);

        tx_precoCusto.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoCusto.setForeground(new java.awt.Color(255, 255, 255));
        tx_precoCusto.setOpaque(false);
        tx_precoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoCustoKeyTyped(evt);
            }
        });
        add(tx_precoCusto);
        tx_precoCusto.setBounds(40, 280, 140, 22);

        tx_estoque.setBackground(new java.awt.Color(255, 255, 255));
        tx_estoque.setForeground(new java.awt.Color(255, 255, 255));
        tx_estoque.setOpaque(false);
        tx_estoque.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_estoqueKeyTyped(evt);
            }
        });
        add(tx_estoque);
        tx_estoque.setBounds(120, 370, 164, 22);

        tx_precoVenda.setBackground(new java.awt.Color(255, 255, 255));
        tx_precoVenda.setForeground(new java.awt.Color(255, 255, 255));
        tx_precoVenda.setOpaque(false);
        tx_precoVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tx_precoVendaKeyTyped(evt);
            }
        });
        add(tx_precoVenda);
        tx_precoVenda.setBounds(220, 280, 160, 22);

        tx_marca.setBackground(new java.awt.Color(255, 255, 255));
        tx_marca.setForeground(new java.awt.Color(255, 255, 255));
        tx_marca.setOpaque(false);
        add(tx_marca);
        tx_marca.setBounds(220, 190, 160, 22);

        tx_categoria.setBackground(new java.awt.Color(255, 255, 255));
        tx_categoria.setForeground(new java.awt.Color(255, 255, 255));
        tx_categoria.setOpaque(false);
        add(tx_categoria);
        tx_categoria.setBounds(40, 190, 140, 22);

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
        bt_voltar.setBounds(40, 430, 113, 34);

        bt_salvar.setBackground(new java.awt.Color(255, 153, 102));
        bt_salvar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_salvar.setForeground(new java.awt.Color(0, 0, 0));
        bt_salvar.setText("Salvar");
        bt_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_salvarMouseClicked(evt);
            }
        });
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });
        add(bt_salvar);
        bt_salvar.setBounds(270, 430, 113, 34);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_429-518.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 430, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void tx_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_nomeActionPerformed

    private void bt_salvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_salvarMouseClicked
        if(tratarErro() == false){
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "Tudo filé", JOptionPane.INFORMATION_MESSAGE);
            listaProdutos.add(criaProduto());
            limparTextos();
        }
    }//GEN-LAST:event_bt_salvarMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela.t6 = new Tela_listaProdutos_adm();
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t7);
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

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_salvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_salvar;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_back;
    private javax.swing.JTextField tx_categoria;
    private javax.swing.JTextField tx_estoque;
    private javax.swing.JTextField tx_marca;
    private javax.swing.JTextField tx_nome;
    private javax.swing.JTextField tx_precoCusto;
    private javax.swing.JTextField tx_precoVenda;
    // End of variables declaration//GEN-END:variables
}
