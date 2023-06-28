
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sabri
 */
public class travelBooks extends javax.swing.JFrame {

    /**
     * Creates new form travelBooks
     */
    public travelBooks() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        travelTxt = new javax.swing.JLabel();
        TravelBookList = new javax.swing.JScrollPane();
        travelBooks = new javax.swing.JList<>();
        selectButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        travelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        travelTxt.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        travelTxt.setForeground(new java.awt.Color(255, 255, 255));
        travelTxt.setText("Choose Travel Books you'de like to buy:");
        jPanel1.add(travelTxt);
        travelTxt.setBounds(80, 30, 700, 50);

        travelBooks.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        travelBooks.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1. In a Sunburned Country by Bill Bryson...................................160 Tk", "2. Eat, Pray, Love by Elizabeth Gilbert........................................230 Tk", "3. Into the Wild by Jon Krakauer...............................................260 Tk", "4. A Year in Provence by Peter Mayle........................................210 Tk", "5. Under the Tuscan Sun by Frances Mayes...............................250 Tk", "6. On the Road by Jack Kerouac................................................180 Tk", "7. The Art of Travel by Alain de Botton......................................210 Tk", "8. In Patagonia by Bruce Chatwin..............................................160 Tk", "9. A Time of Gifts by Patrick Leigh Fermor..................................210 Tk", "10. Round Ireland with a Fridge by Tony Hawks..........................140 Tk", "11. Seven Years in Tibet by Heinrich Harrer................................260 Tk", "12. The Snow Leopard by Peter Matthiessen...............................390 Tk", "13. Riding the Iron Rooster by Paul Theroux................................260 Tk", "14. The Innocents Abroad by Mark Twain....................................240 Tk", "15. The Places in Between by Rory Stewart.................................210 Tk", "16. Kon-Tiki by Thor Heyerdahl..................................................340 Tk", "17.  Shantaram By Gregory David Roberts...................................270 Tk", "18.  World Walk By Steven Newman...........................................400 Tk", "19.  On The Road By Jack Kerouac..............................................330 Tk", "20. The Alchemist By Paulo Coelho..............................................230 Tk" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        TravelBookList.setViewportView(travelBooks);

        jPanel1.add(TravelBookList);
        TravelBookList.setBounds(30, 90, 800, 300);

        selectButton.setBackground(new java.awt.Color(204, 204, 255));
        selectButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectButton);
        selectButton.setBounds(590, 400, 110, 40);

        backButton.setBackground(new java.awt.Color(204, 204, 255));
        backButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(720, 400, 110, 40);

        travelBackground.setIcon(new javax.swing.ImageIcon("D:\\Study\\CSE\\Level-2, Term-2\\CSE-220 OOP Sessional-II\\Project\\Book Store\\image\\Travel-background.jpg")); // NOI18N
        jPanel1.add(travelBackground);
        travelBackground.setBounds(0, 0, 860, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        booklist obj = new booklist();
        obj.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        
        String name;
        String cost, shtname;
        
        List<String> a = travelBooks.getSelectedValuesList();
        int size = a.size();
        
        for(int i=0; i<size; i++)
{
            String str = a.get(i);
            
            try{
                FileInputStream fis = new FileInputStream("travelBooks.csv");
                Scanner inp = new Scanner(fis);
                
                while(inp.hasNext())
                {
                    name = inp.next();
                    cost = inp.next();
                    shtname = inp.next();
                    
                    if(name.equals(str))
                    {
                        try{
                            FileOutputStream fos = new FileOutputStream("SelectedBooks.csv");
                            PrintWriter p = new PrintWriter(fos);
                            p.write(shtname);
                            p.write(cost);
                            p.flush();
                            p.close();
                        }catch(IOException io){
                            System.out.println("ps");
                        }       
                    }
                }
            }catch(Exception e){
               System.out.println("en");
            }
}
        
        /*buyBooks buy = new buyBooks();
        buy.setVisible(true);
        this.setVisible(false);*/
    }//GEN-LAST:event_selectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(travelBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(travelBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(travelBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(travelBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new travelBooks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TravelBookList;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel travelBackground;
    private javax.swing.JList<String> travelBooks;
    private javax.swing.JLabel travelTxt;
    // End of variables declaration//GEN-END:variables
}