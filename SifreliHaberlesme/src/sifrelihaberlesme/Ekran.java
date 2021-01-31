
package sifrelihaberlesme;

import java.io.DataInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

public class Ekran extends javax.swing.JFrame {
    private BigInteger p;
    private BigInteger q;
    private BigInteger N;
    private BigInteger phi;
    private BigInteger e;
    private BigInteger d;
    private int        bitlength = 1024;
    private Random     r;

    private static String bytesToString(byte[] bytes) {
         String test = "";
        for (byte b : bytes)
        {
            test += Byte.toString(b);
        }
        return test;
    }

    public Ekran() {
        initComponents();
        r = new Random();
        p = BigInteger.probablePrime(bitlength, r);
        q = BigInteger.probablePrime(bitlength, r);
        N = p.multiply(q);
        phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
        e = BigInteger.probablePrime(bitlength / 2, r);
        while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0)
        {
            e.add(BigInteger.ONE);
        }
        d = e.modInverse(phi);
    }
     public Ekran(BigInteger e, BigInteger d, BigInteger N)
    {
        initComponents();
        this.e = e;
        this.d = d;
        this.N = N;
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
        jTextField1 = new javax.swing.JTextField();

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

        cozumluMetin.setEditable(false);
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

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cozumle)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(gonder)
                        .addGap(18, 18, 18)
                        .addComponent(sifrele))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(alici, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(gonderen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sifre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2)
                                    .addComponent(jScrollPane3))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                cozumluMetin.setText(asilMetin.getText());
        
        
    }//GEN-LAST:event_gonderActionPerformed

    private void sifreleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreleActionPerformed
       // sifreliMetin.setText(asilMetin.getText());
       System.out.println("ŞİFRELE BUTONUNA TIKLANDI @@@@@@Q");
        Ekran ekran = new Ekran();
        DataInputStream in = new DataInputStream(System.in);
        String teststring;
       // asilMetin.setText("dif aa geliyo");
        teststring = asilMetin.getText();
       
        System.out.println("asilMetin db:"+asilMetin.getText());
        System.out.println("TEST STRING @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+teststring);
        if(teststring != null && !teststring.trim().isEmpty()){
        sifreliMetin.setText(FuncSifrele(teststring));}
    }//GEN-LAST:event_sifreleActionPerformed

    private void cozumleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cozumleActionPerformed
        //cozumluMetin.setText("cozumleActionPerformed");
        String teststring = sifreliMetin.getText();
        
        cozumluMetin.setText(FuncDeSifrele(FuncSifrele(teststring)));
    }//GEN-LAST:event_cozumleActionPerformed
    
    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ekran().setVisible(true);
            }
        });
        Ekran ekran = new Ekran();
        DataInputStream in = new DataInputStream(System.in);
        String teststring;
        ekran.asilMetin.setText("hi");
        teststring = ekran.asilMetin.getText();
       
        System.out.println("asilMetin db:"+ekran.asilMetin.getText());
        if(teststring != null && !teststring.trim().isEmpty()){
        FuncSifrele(teststring);}
    }
     // Encrypt message
    public byte[] encrypt(byte[] message)
    {
        return (new BigInteger(message)).modPow(e, N).toByteArray();
    }
    // Decrypt message
    public byte[] decrypt(byte[] message)
    {
        return (new BigInteger(message)).modPow(d, N).toByteArray();
    }
    //buradaki değeri nerede atmaya çapuruyoır
     static String FuncSifrele(String teststring) {
         String Sifreli;
        System.out.println("DENEMEDEYİM");
        Ekran ekran = new Ekran();
        Rsa rsa = new Rsa();
        System.out.println("Encrypting String: " + teststring); //diğer projede şifreleme yapmısyınya nerede o buton hangi kod tam orası tam orda 
       
              
        // encrypt
        byte[] encrypted = ekran.encrypt(teststring.getBytes());
        // decrypt
        byte[] decrypted = ekran.decrypt(encrypted);
        System.out.println("Decrypting Bytes: " + bytesToString(decrypted));
        System.out.println("Decrypted String: " + new String(decrypted));
        System.out.println("şifreli  :" + encrypted);
        //System.out.println("şifreli strn :" + encrypted.toString());
        System.out.println("şifreli strn :" + bytesToString(teststring.getBytes()));
        Sifreli = bytesToString(teststring.getBytes());
        return Sifreli;
    }
     static String FuncDeSifrele(String teststring) {
        String deSifreli;
         Ekran ekran = new Ekran(); //o butonun içine yazmamız gereken kod nerede az önce konsolda çalıstırdın ya bvaska proje
       //emre3
        System.out.println("Encrypting String: " + teststring);
        System.out.println("String in Bytes: " + bytesToString(teststring.getBytes()));
       // byte[]
        byte[] encrypted = ekran.encrypt(teststring.getBytes());
        byte[] decrypted = ekran.decrypt(encrypted);
        
        
        System.out.println("Decrypting Bytes: " + bytesToString(decrypted));
        System.out.println("Decrypted String: " + new String(decrypted));
        System.out.println("sonuc String: " + bytesToString(teststring.getBytes()));
        for(int i = 0; i<= decrypted.length; i++ ){
            System.out.println(decrypted[i]);
            char convertedChar = (char)decrypted[i];
            System.out.println(convertedChar);
        }
        deSifreli =  bytesToString(decrypted);
         System.out.println(deSifreli+ "    osdkfıjglkdfj");
        return new String(decrypted);
    }
  
//bunlar neden private java swingde işler böyle :D oldan oluşturuyorsun burda kod kendisi oluşuyor hmm damam
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel sifre;
    private javax.swing.JButton sifrele;
    private javax.swing.JTextArea sifreliMetin;
    // End of variables declaration//GEN-END:variables

}
