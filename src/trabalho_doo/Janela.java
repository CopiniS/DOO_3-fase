
package trabalho_doo;

import java.awt.BorderLayout;
import java.util.ArrayList;

public class Janela extends javax.swing.JFrame {
    static Tela_Inicial t1;
    static Tela_login t2;
    static Tela_cadastro t3;
    static Tela_cadastroCliente t4;
    static Tela_cadastro_admi t5;
    static Tela_listaProdutos_adm t6;
    static Tela_cadastroProdutos t7;
    static Tela_imprimeCatalogo t8;
    static Tela_editarProdutos t9;
    static Tela_alteracaoEstoque t10;
    static Tela_listaProdutos_cliente t11;
    static Tela_carrinho t12;
    static Tela_quantidadeProduto t13;
    
    public Janela() {
        initComponents();
        t1 = new Tela_Inicial();
        t2 = new Tela_login();
        t3 = new Tela_cadastro();
        t4 = new Tela_cadastroCliente();
        t5 = new Tela_cadastro_admi();
        t6 = new Tela_listaProdutos_adm();
        t7 = new Tela_cadastroProdutos();
        t8 = new Tela_imprimeCatalogo();
        t9 = new Tela_editarProdutos(null);
        t10 = new Tela_alteracaoEstoque(null);
        t11 = new Tela_listaProdutos_cliente(null);
        t12 = new Tela_carrinho();
        t13 = new Tela_quantidadeProduto(null);
        
        
        this.setLayout(new BorderLayout());
        this.add(t1, BorderLayout.CENTER);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBounds(0, 0, 416, 308);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
