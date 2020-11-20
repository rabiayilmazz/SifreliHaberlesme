
package sifrelihaberlesme;

import javax.swing.JFrame;

public class Ekran extends javax.swing.JFrame {

    public Ekran() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gonderen = new javax.swing.JLabel();
        sifre = new javax.swing.JLabel();
        alici = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        asilMetin = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sifreliMetin = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        cozumluMetin = new javax.swing.JTextArea();
        gonder = new javax.swing.JButton();
        sifrele = new javax.swing.JButton();
        cozumle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        gonderen.setBackground(new java.awt.Color(204, 255, 204));
        gonderen.setForeground(new java.awt.Color(0, 102, 102));
        gonderen.setText("GÖNDERİCİ");
        gonderen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        sifre.setBackground(new java.awt.Color(0, 0, 204));
        sifre.setForeground(new java.awt.Color(0, 102, 102));
        sifre.setText("ŞİFRELİ METİN");
        sifre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        alici.setBackground(new java.awt.Color(0, 0, 204));
        alici.setForeground(new java.awt.Color(0, 102, 102));
        alici.setText("ALICI");
        alici.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        asilMetin.setColumns(20);
        asilMetin.setRows(5);
        jScrollPane1.setViewportView(asilMetin);

        sifreliMetin.setEditable(false);
        sifreliMetin.setColumns(20);
        sifreliMetin.setRows(5);
        jScrollPane2.setViewportView(sifreliMetin);

        cozumluMetin.setColumns(20);
        cozumluMetin.setRows(5);
        jScrollPane3.setViewportView(cozumluMetin);

        gonder.setText("GÖNDER");
        gonder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderActionPerformed(evt);
            }
        });

        sifrele.setText("ŞİFRELE");
        sifrele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreleActionPerformed(evt);
            }
        });

        cozumle.setText("ÇÖZÜMLE");
        cozumle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cozumleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(alici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gonderen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(gonder)
                        .addGap(18, 18, 18)
                        .addComponent(sifrele)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cozumle)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderen, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifrele)
                    .addComponent(gonder))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cozumle)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alici, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gonderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderActionPerformed
        cozumluMetin.setText(asilMetin.getText() + "\nmesaj gönderdi");
    }//GEN-LAST:event_gonderActionPerformed

    private void sifreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreleActionPerformed
        sifreliMetin.setText(asilMetin.getText() + "\nmetin şifrelendi");
    }//GEN-LAST:event_sifreleActionPerformed

    private void cozumleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cozumleActionPerformed
        cozumluMetin.setText(sifreliMetin.getText() + "\nmetin cozumlendi");
    }//GEN-LAST:event_cozumleActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ekran().setVisible(true);
            }
        });
    }
    public void Sifrele(){
        //metni şifreleyip gösterilecek kısm burası
    }
    public void Cozum(){
        //şifreli metin buradan çözülüp gösterilecek
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alici;
    private javax.swing.JTextArea asilMetin;
    private javax.swing.JButton cozumle;
    private javax.swing.JTextArea cozumluMetin;
    private javax.swing.JButton gonder;
    private javax.swing.JLabel gonderen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel sifre;
    private javax.swing.JButton sifrele;
    private javax.swing.JTextArea sifreliMetin;
    // End of variables declaration//GEN-END:variables
}
