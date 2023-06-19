/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pobreAbastece.frontEnd;

/**
 *
 * @author gabri
 */
public class Sobre extends javax.swing.JFrame {

    /**
     * Creates new form Sobre
     */
    public Sobre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Com o atual cenário de pós pandemia com um dos maiores preços de combustível da história mundial, \ntemos que saber os melhores preços do combustível não abrindo mão da qualidade, já que o combustível \né algo essencial para a locomoção da população Brasileira já que muitos não podem depender de transporte \npúblico, precisamos mapear os postos de combustível com os melhores custo benefício mantendo uma qualidade\n mínima desejada, oferecendo serviços e apresentação mais completa do posto com tudo que ele oferta para atender\n melhor os clientes finais. Para isso oferecemos uma interface simples mostrando o nosso serviço principal que é a\n localização dos postos com o melhor preço podendo ordenar ou pesquisar por um posto específico ou combustível \nespecífico (ex.: Etanol, Gasolina, Gás Natural e etc.), abrindo a oportunidade para o cliente descobrir mais serviços ou\n produtos que o posto tem a oferecer com feedbacks de outros clientes que já o frequentaram, trazendo uma experiência \nmais familiar por ter outra pessoa que já tenha conhecido o posto e trazendo mais confiança que é uma empresa séria. ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 240, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Com o atual cenário de pós pandemia com um dos maiores preços de combustível da \nhistória mundial, temos que saber os melhores preços do combustível não abrindo \nmão da qualidade, já que o combustível é algo essencial para a locomoção da \npopulação Brasileira já que muitos não podem depender de transporte público, \nprecisamos mapear os postos de combustível com os melhores custo benefício \nmantendo uma qualidade mínima desejada, oferecendo serviços e apresentação mais \ncompleta do posto com tudo que ele oferta para atender melhor os clientes finais. Para \nisso oferecemos uma interface simples mostrando o nosso serviço principal que é a \nlocalização dos postos com o melhor preço podendo ordenar ou pesquisar por um \nposto específico ou combustível específico (ex.: Etanol, Gasolina, Gás Natural e etc.), \ntem a oferecer com feedbacks de outros clientes que já o frequentaram, trazendo uma \nexperiência mais familiar por ter outra pessoa que já tenha conhecido o posto e \ntrazendo mais confiança que é uma empresa séria.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 560, 200));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, -40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pobreAbastece/frontEnd/icons/fundo2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sobre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sobre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}