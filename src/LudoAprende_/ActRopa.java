package LudoAprende_;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Leidy Milena Molano Diaz
 * Herramienta Interactiva Digital "LudoAprende"
 */

public class ActRopa extends javax.swing.JFrame {

    /**
     * Creates new form ActAnimales
     */
    public ActRopa() {
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
        BotonVolver = new javax.swing.JButton();
        Instrucciones = new javax.swing.JLabel();
        Instrucciones1 = new javax.swing.JLabel();
        BotonJuegoAr = new javax.swing.JButton();
        BotonJuegoMem = new javax.swing.JButton();
        BotonJuegoAr1 = new javax.swing.JButton();
        BotonJuegoMem1 = new javax.swing.JButton();
        VideoInstruccion = new javax.swing.JLabel();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(95, 216, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 551));

        BotonVolver.setBackground(new java.awt.Color(19, 130, 232));
        BotonVolver.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        Instrucciones.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones.setText("Selecciona la actividad con la que desea repasar");
        Instrucciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Instrucciones1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        Instrucciones1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Instrucciones1.setText("1. Sopa de letras   2. Juego del ahorcado");
        Instrucciones1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BotonJuegoAr.setBackground(new java.awt.Color(19, 130, 232));
        BotonJuegoAr.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BotonJuegoAr.setText("Juego del ahorcado");
        BotonJuegoAr.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonJuegoAr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoArActionPerformed(evt);
            }
        });

        BotonJuegoMem.setBackground(new java.awt.Color(19, 130, 232));
        BotonJuegoMem.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        BotonJuegoMem.setText("Juego de sopa de letras");
        BotonJuegoMem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonJuegoMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoMemActionPerformed(evt);
            }
        });

        BotonJuegoAr1.setBackground(new java.awt.Color(19, 130, 232));
        BotonJuegoAr1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonJuegoAr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SopaDLetras.png"))); // NOI18N
        BotonJuegoAr1.setBorder(null);
        BotonJuegoAr1.setContentAreaFilled(false);
        BotonJuegoAr1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonJuegoAr1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SopaDLetras.png"))); // NOI18N
        BotonJuegoAr1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Letras.png"))); // NOI18N
        BotonJuegoAr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoAr1ActionPerformed(evt);
            }
        });

        BotonJuegoMem1.setBackground(new java.awt.Color(19, 130, 232));
        BotonJuegoMem1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonJuegoMem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Horca.png"))); // NOI18N
        BotonJuegoMem1.setBorder(null);
        BotonJuegoMem1.setContentAreaFilled(false);
        BotonJuegoMem1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonJuegoMem1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Horca.png"))); // NOI18N
        BotonJuegoMem1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ahorcados.png"))); // NOI18N
        BotonJuegoMem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonJuegoMem1ActionPerformed(evt);
            }
        });

        VideoInstruccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Videos/ActividadRopa.gif"))); // NOI18N

        BotonSalir.setBackground(new java.awt.Color(19, 130, 232));
        BotonSalir.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Instrucciones1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addComponent(VideoInstruccion)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(BotonJuegoAr1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(BotonJuegoMem)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(BotonJuegoMem1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(BotonJuegoAr)))))
                .addContainerGap(146, Short.MAX_VALUE))
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
                        .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Instrucciones1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(VideoInstruccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonJuegoAr1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonJuegoMem, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonJuegoMem1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BotonJuegoAr, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
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

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Tematicas tematica = new Tematicas();
        tematica.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonJuegoArActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoArActionPerformed
        NivelesRopaAhorcado nivelesAhorcadoRopa = new NivelesRopaAhorcado();
        nivelesAhorcadoRopa .setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonJuegoArActionPerformed

    private void BotonJuegoMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoMemActionPerformed
    NivelesRopaSopaDeLetras  nivelesRopaLetras = new NivelesRopaSopaDeLetras ();
    nivelesRopaLetras .setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_BotonJuegoMemActionPerformed

    private void BotonJuegoAr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoAr1ActionPerformed
    NivelesRopaSopaDeLetras  nivelesRopaLetras = new NivelesRopaSopaDeLetras ();
    nivelesRopaLetras .setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_BotonJuegoAr1ActionPerformed

    private void BotonJuegoMem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonJuegoMem1ActionPerformed
        NivelesRopaAhorcado nivelesAhorcadoRopa = new NivelesRopaAhorcado();
        nivelesAhorcadoRopa .setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonJuegoMem1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonJuegoAr;
    private javax.swing.JButton BotonJuegoAr1;
    private javax.swing.JButton BotonJuegoMem;
    private javax.swing.JButton BotonJuegoMem1;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Instrucciones;
    private javax.swing.JLabel Instrucciones1;
    private javax.swing.JLabel VideoInstruccion;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
