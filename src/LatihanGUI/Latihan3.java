/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

/**
 *
 * @author Tarishaulia
 */
public class Latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan3
     */
    public Latihan3() {
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

        jeniskelamin = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idberat = new javax.swing.JTextField();
        idtinggi = new javax.swing.JTextField();
        rdblaki = new javax.swing.JRadioButton();
        rdbperempuan = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        idsaran = new javax.swing.JTextField();
        idhasilanalisa = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        buttonhitung = new javax.swing.JButton();
        buttonkeluar = new javax.swing.JButton();
        buttonulangi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("CEK KESEHATAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 140, 24);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 174, 90, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Berat Badan Ideal anda adalah : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 264, 220, 20);
        getContentPane().add(idideal);
        idideal.setBounds(220, 260, 40, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(290, 270, 50, 14);

        jLabel8.setText("Hasil Analisa Kesehatan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 290, 150, 14);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));
        jPanel1.add(idnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 250, 30));

        jLabel3.setText("Berat Badan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 20));

        jLabel9.setText("kg");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 54, 30, 20));

        jLabel10.setText("cm");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 94, 50, 20));

        jLabel4.setText("Tinggi Badan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 120, 30));

        idberat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idberatActionPerformed(evt);
            }
        });
        jPanel1.add(idberat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 210, 30));
        jPanel1.add(idtinggi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 210, 30));

        jeniskelamin.add(rdblaki);
        rdblaki.setText("Laki-laki");
        jPanel1.add(rdblaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, -1));

        jeniskelamin.add(rdbperempuan);
        rdbperempuan.setText("Perempuan");
        jPanel1.add(rdbperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 120, -1));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 40, 430, 160);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idsaran.setText("Saran ?");
        jPanel2.add(idsaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 340, 40));

        idhasilanalisa.setText("?");
        jPanel2.add(idhasilanalisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 40));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 290, 420, 120);

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonhitung.setText("Hitung");
        buttonhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhitungActionPerformed(evt);
            }
        });
        jPanel3.add(buttonhitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        buttonkeluar.setText("Keluar");
        buttonkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonkeluarActionPerformed(evt);
            }
        });
        jPanel3.add(buttonkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 80, -1));

        buttonulangi.setText("Ulangi");
        buttonulangi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonulangiActionPerformed(evt);
            }
        });
        jPanel3.add(buttonulangi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, -1));

        getContentPane().add(jPanel3);
        jPanel3.setBounds(90, 210, 300, 40);

        setBounds(0, 0, 541, 462);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonulangiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonulangiActionPerformed
        // TODO add your handling code here:
        idnama.setText("");
        idberat.setText("");
        idtinggi.setText("");
        jLabel6.setText("");
        idsaran.setText("");
        idhasilanalisa.setText("");
        jeniskelamin.clearSelection();
    }//GEN-LAST:event_buttonulangiActionPerformed

    private void idberatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idberatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idberatActionPerformed

    private void buttonhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhitungActionPerformed
        // TODO add your handling code here:
        double t, b, h =0;
        
        //untuk mengambil nilai tinggi dan berat serta nama
        t = Double.valueOf(idtinggi.getText());
        b = Double.valueOf(idberat.getText());
        String nm = idnama.getText();
        
        //pilihan jenis kelamin
        if (rdblaki.isSelected()){
            h = (t-100);
        }else if (rdbperempuan.isSelected()){
            h = (t-104);
        }
        String temp = Double.toString(h);
        
        //Logika untuk analisa kesehatan
        if(h<b){
            idideal.setText(temp);
            idhasilanalisa.setText("Maaf " + nm + " Ända kelebihan berat badan");
            idsaran.setText("Makan yang banyak dan bergizi");
        }else if (h>b){
            idideal.setText(temp);
            idhasilanalisa.setText("Maaf " + nm + " Anda kekurangan berat badan");
            idsaran.setText("Makan-makanan bergizi dan teratur");
        }else{
            idideal.setText(temp);
            idhasilanalisa.setText( nm + " Anda ideal");
            idsaran.setText("Tetap jaga pola makan dan olah raga teratur");
        }
    
    }//GEN-LAST:event_buttonhitungActionPerformed

    private void buttonkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonkeluarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonhitung;
    private javax.swing.JButton buttonkeluar;
    private javax.swing.JButton buttonulangi;
    private javax.swing.JTextField idberat;
    private javax.swing.JTextField idhasilanalisa;
    private javax.swing.JTextField idideal;
    private javax.swing.JTextField idnama;
    private javax.swing.JTextField idsaran;
    private javax.swing.JTextField idtinggi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup jeniskelamin;
    private javax.swing.JRadioButton rdblaki;
    private javax.swing.JRadioButton rdbperempuan;
    // End of variables declaration//GEN-END:variables
}
