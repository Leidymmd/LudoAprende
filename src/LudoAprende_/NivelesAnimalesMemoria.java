package LudoAprende_;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Leidy Milena Molano Diaz
 * Herramienta Interactiva Digital "LudoAprende"
 */

public class NivelesAnimalesMemoria extends javax.swing.JFrame {

    /**
     * Creates new form NivelesAnimales
     */
    
    public NivelesAnimalesMemoria() {
        setSize(888,551);//Tamaño reajustable de la ventana
        this.setLocationRelativeTo(null);
        setTitle("LudoAprende");
        Image icon=new ImageIcon(getClass().getResource("/imagenes/Logo.png")).getImage();
        setIconImage(icon);
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

        jPanel1 = new javax.swing.JPanel();
        Nivel1 = new javax.swing.JButton();
        Nivel2 = new javax.swing.JButton();
        Nivel3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();
        BotonVolver = new javax.swing.JButton();
        Instruccion1 = new javax.swing.JLabel();
        Instruccion2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(95, 216, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 551));

        Nivel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrella.png"))); // NOI18N
        Nivel1.setBorder(null);
        Nivel1.setContentAreaFilled(false);
        Nivel1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrella.png"))); // NOI18N
        Nivel1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrella01.png"))); // NOI18N
        Nivel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel1ActionPerformed(evt);
            }
        });

        Nivel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas2.png"))); // NOI18N
        Nivel2.setBorder(null);
        Nivel2.setContentAreaFilled(false);
        Nivel2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas2.png"))); // NOI18N
        Nivel2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas02.png"))); // NOI18N
        Nivel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel2ActionPerformed(evt);
            }
        });

        Nivel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas3.png"))); // NOI18N
        Nivel3.setBorder(null);
        Nivel3.setContentAreaFilled(false);
        Nivel3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas3.png"))); // NOI18N
        Nivel3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Estrellas03.png"))); // NOI18N
        Nivel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Videos/NivelesA.gif"))); // NOI18N

        BotonSalir.setBackground(new java.awt.Color(19, 130, 232));
        BotonSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        BotonVolver.setBackground(new java.awt.Color(19, 130, 232));
        BotonVolver.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        Instruccion1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Instruccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion1.setText("Selecciona un nivel para jugar, recuerda que:");

        Instruccion2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Instruccion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instruccion2.setText("1 estrella es fácil, 2 estrellas es medio y 3 estrellas es difícil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Instruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(60, Short.MAX_VALUE)
                                .addComponent(Instruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(Nivel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nivel3)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Instruccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Instruccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nivel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nivel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel1ActionPerformed
        MemoriaAnimalesN1 memoriaAnimaln1 = new MemoriaAnimalesN1();
        memoriaAnimaln1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nivel1ActionPerformed

    private void Nivel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel2ActionPerformed
        MemoriaAnimalesN2 memoriaAnimales2= new MemoriaAnimalesN2();
        memoriaAnimales2.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nivel2ActionPerformed

    private void Nivel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel3ActionPerformed
        MemoriaAnimalesN3  animalmemoria3 = new MemoriaAnimalesN3 ();
        animalmemoria3.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nivel3ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Tematicas tematica = new Tematicas();
        tematica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Instruccion1;
    private javax.swing.JLabel Instruccion2;
    private javax.swing.JButton Nivel1;
    private javax.swing.JButton Nivel2;
    private javax.swing.JButton Nivel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
