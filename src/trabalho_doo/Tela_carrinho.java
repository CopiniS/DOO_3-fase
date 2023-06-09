
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
            for (int i = 0; i < Tela_Inicial.listaAdicionados.size(); i++) {        
                Object[] dados = {Tela_Inicial.listaAdicionados.get(i).getNome(), 
                Tela_Inicial.listaAdicionados.get(i).getQuantidade(),
                Tela_Inicial.listaAdicionados.get(i).getPrecoVenda()};
                model.addRow(dados);  
            }
           
    }
    
    public void calculaValorTotal(){
        double valorTotal = 0;
        double valorPorProduto;
        for(Produto produto : Tela_Inicial.listaAdicionados){
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
        lb_total = new javax.swing.JLabel();
        bt_editar = new javax.swing.JButton();
        lb_back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(743, 540));
        setLayout(null);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Carrinho");
        add(jLabel5);
        jLabel5.setBounds(227, 16, 117, 32);

        tb_adicionados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produtos", "Quantidade", "Preço"
            }
        ));
        tb_adicionados.setOpaque(false);
        jScrollPane1.setViewportView(tb_adicionados);

        add(jScrollPane1);
        jScrollPane1.setBounds(73, 60, 452, 402);

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
        bt_voltar.setBounds(595, 378, 124, 40);

        bt_notaFiscal.setBackground(new java.awt.Color(255, 153, 102));
        bt_notaFiscal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_notaFiscal.setForeground(new java.awt.Color(0, 0, 0));
        bt_notaFiscal.setText("Nota Fiscal");
        bt_notaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_notaFiscalMouseClicked(evt);
            }
        });
        add(bt_notaFiscal);
        bt_notaFiscal.setBounds(595, 70, 124, 40);

        bt_remover.setBackground(new java.awt.Color(255, 153, 102));
        bt_remover.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bt_remover.setForeground(new java.awt.Color(0, 0, 0));
        bt_remover.setText("Remover ");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });
        add(bt_remover);
        bt_remover.setBounds(595, 161, 124, 40);

        lb_valorTotal.setBackground(new java.awt.Color(255, 255, 255));
        lb_valorTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_valorTotal.setForeground(new java.awt.Color(255, 255, 255));
        lb_valorTotal.setText("<valor tota>");
        add(lb_valorTotal);
        lb_valorTotal.setBounds(610, 490, 90, 28);

        lb_total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_total.setForeground(new java.awt.Color(255, 255, 255));
        lb_total.setText("Total:");
        add(lb_total);
        lb_total.setBounds(550, 490, 50, 28);

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
        bt_editar.setBounds(595, 270, 124, 40);

        lb_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Fundo azul_743-540.jpg"))); // NOI18N
        add(lb_back);
        lb_back.setBounds(0, 0, 740, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_notaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_notaFiscalMouseClicked
        System.out.println("Cliente: "  + clienteLogado.getNome());
        System.out.println("CPF: " + clienteLogado.getCpf());
        System.out.println("//////////////////////////////");
        System.out.println("Produtos comprados: \n");
        for(Produto produto : Tela_Inicial.listaAdicionados){
            System.out.println("Produto: " + produto.getNome() + "   Marca: " + produto.getMarca() + "\n");
        }
        
        
    }//GEN-LAST:event_bt_notaFiscalMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked
        if(tb_adicionados.getSelectedRow() != -1){
            
            Tela_Inicial.listaAdicionados.remove(tb_adicionados.getSelectedRow());
            model.removeRow(tb_adicionados.getSelectedRow());
            calculaValorTotal();
            
            if(Tela_Inicial.listaAdicionados.isEmpty()){
                Janela.t11 = new Tela_listaProdutos_cliente(clienteLogado);
                Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
                janela.getContentPane().remove(Janela.t12);
                janela.add(Janela.t11, BorderLayout.CENTER);
                janela.pack();
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Nenhum produto selecionado", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_bt_removerMouseClicked

    private void bt_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voltarMouseClicked
        
        Janela janela = (Janela) SwingUtilities.getWindowAncestor(this);
        janela.getContentPane().remove(Janela.t12);
        janela.add(Janela.t11, BorderLayout.CENTER);
        janela.pack();
    }//GEN-LAST:event_bt_voltarMouseClicked

    private void bt_editarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_editarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_editarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_editar;
    private javax.swing.JButton bt_notaFiscal;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_voltar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_back;
    private javax.swing.JLabel lb_total;
    private javax.swing.JLabel lb_valorTotal;
    private javax.swing.JTable tb_adicionados;
    // End of variables declaration//GEN-END:variables
}
