public class initialPage extends javax.swing.JFrame {
    public initialPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        whole = new javax.swing.JPanel();
        welcomeText = new javax.swing.JLabel();
        proceedBtn = new javax.swing.JButton();
        bgdPic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        whole.setLayout(null);

        welcomeText.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        welcomeText.setForeground(new java.awt.Color(0, 51, 51));
        welcomeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeText.setText("Welcome To The BookWorm BookStore");
        whole.add(welcomeText);
        welcomeText.setBounds(40, 30, 760, 160);

        proceedBtn.setBackground(new java.awt.Color(0, 204, 204));
        proceedBtn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(51, 51, 51));
        proceedBtn.setText("Proceed to Booklist");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });
        whole.add(proceedBtn);
        proceedBtn.setBounds(250, 290, 360, 50);

        bgdPic.setIcon(new javax.swing.ImageIcon("D:\\Study\\CSE\\Level-2, Term-2\\CSE-220 OOP Sessional-II\\Project\\Book Store\\image\\bgdpic.jpg")); // NOI18N
        whole.add(bgdPic);
        bgdPic.setBounds(0, 0, 860, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(whole, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(whole, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        SigninForm sign = new SigninForm();
        sign.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_proceedBtnActionPerformed

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
            java.util.logging.Logger.getLogger(initialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(initialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(initialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(initialPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new initialPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgdPic;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JLabel welcomeText;
    private javax.swing.JPanel whole;
    // End of variables declaration//GEN-END:variables
}
