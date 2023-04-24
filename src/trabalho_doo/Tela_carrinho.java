
package trabalho_doo;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Tela_carrinho extends javax.swing.JPanel {
    Cliente clienteLogado;
    DefaultTableModel model;
            
    public Tela_carrinho(Cliente clienteLogado) {
        initComponents();
        this.clienteLogado = clienteLogado;
        
        model = new DefaultTableModel();
        inicializaModelTabela();
        calculaValorTotal();
    }
    
    public void inicializaModelTabela(){
            model = (DefaultTableModel) tb_adicionados.getModel();
            for (int i = 0; i < Tela_listaProdutos_cliente.listaAdicionados.size(); i++) {        
                Object[] dados = {Tela_listaProdutos_cliente.listaAdicionados.get(i).getNome(), 
                Tela_listaProdutos_cliente.listaAdicionados.get(i).getQuantidade(),
                Tela_listaProdutos_cliente.listaAdicionados.get(i).getPrecoVenda()};
                model.addRow(dados);  
            }
           
    }
    
    public void calculaValorTotal(){
        double valorTotal = 0;
        double valorPorProduto;
        for(Produto produto : Tela_listaProdutos_cliente.listaAdicionados){
            valorPorProduto = (double) (produto.quantidade) * Double.parseDouble(produto.precoVenda);
            valorTotal = valorTotal + valorPorProduto;
        }
        lb_valorTotal.setText(String.valueOf(valorTotal));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_adicionados = new javax.swing.JTable();
        bt_voltar = new javax.swing.JButton();
        bt_notaFiscal = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        lb_valorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Carrinho");

        tb_adicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade", "Preço"
            }
        ));
        jScrollPane1.setViewportView(tb_adicionados);

        bt_voltar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_voltar.setText("Voltar");
        bt_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voltarMouseClicked(evt);
            }
        });

        bt_notaFiscal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_notaFiscal.setText("Nota Fiscal");
        bt_notaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_notaFiscalMouseClicked(evt);
            }
        });

        bt_remover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_remover.setText("Remover ");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });

        lb_valorTotal.setText("<valor tota>");

        jLabel2.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt_notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lb_valorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
            .addGroup(layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bt_notaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(bt_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lb_valorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_notaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_notaFiscalMouseClicked
        System.out.println("Cliente: "+ clienteLogado.getNome());
        System.out.println("CPF: " + clienteLogado.getCpf());
        System.out.println("//////////////////////////////");
        System.out.println("Produtos comprados: \n");
        for(Produto produto : Tela_listaProdutos_cliente.listaAdicionados){
            System.out.println("Produto: " + produto.nome + "   Marca: " + produto.marca + "\n");
        }
        
        
    }//GEN-LAST:event_bt_notaFiscalMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked
        if(tb_adicionados.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        else{
            model.removeRow(tb_adicionados.getSelectedRow());
            System.out.println(tb_adicionados.getSelectedRow());
            Tela_listaProdutos_cliente.listaAdicionados.remove(tb_adicionados.getSelectedRow());
            
            if(Tela_cadastro_admi.listaAdministradores.isEmpty()){
                Janela.t11 = new Tela_listaProdutos_cliente(null);
                Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(Janela.t12);
                janela.add(Janela.t11, BorderLayout.CENTER);
                janela.pack();
            }
        }
        
        
    }//GEN-LAST:event_bt_removerMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        Janela.t11 = new Tela_listaProdutos_cliente(null);
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t12);
        janela.add(Janela.t11, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_notaFiscal;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_valorTotal;
    private javax.swing.JTable tb_adicionados;
    // End of variables declaration//GEN-END:variables
}
