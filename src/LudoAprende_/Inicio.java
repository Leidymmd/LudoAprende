package LudoAprende_;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * @author Leidy Milena Molano Diaz
 * Herramienta Interactiva Digital "LudoAprende"
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Panel que me permite ingresar a la herramienta interactiva digital
     */
    
    ImagenFondo inicio = new ImagenFondo();
    
    public Inicio() {
        this.setContentPane(inicio);
        setSize(888,551);//Tamaño reajustable de la ventana
        this.setLocationRelativeTo(null);
        setTitle("LudoAprende");
        Image icon=new ImageIcon(getClass().getResource("/imagenes/Logo.png")).getImage();
        setIconImage(icon);
        initComponents();
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonJuego = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonJuego.setBackground(new java.awt.Color(19, 130, 232));
        jButtonJuego.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButtonJuego.setText("Jugar");
        jButtonJuego.setBorder(null);
        jButtonJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJuegoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(jButtonJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jButtonJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(238, 238, 238))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJuegoActionPerformed
        Tematicas paneltematicas = new Tematicas();
        paneltematicas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonJuegoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonJuego;
    // End of variables declaration//GEN-END:variables

    class ImagenFondo extends JPanel{
        private Image imagen;
        
        public void paint ( Graphics fondo){
            imagen = new ImageIcon (getClass().getResource("/Imagenes/ImagenFondo.jpg")).getImage();
            fondo.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(fondo);
        }
        
    }
}
