package LudoAprende_;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 * @author Leidy Milena Molano Diaz
 * Herramienta Interactiva Digital "LudoAprende"
 */
public class AhorcadoRopaN1 extends javax.swing.JFrame {

    public ImageIcon imgs[];
    public JButton btns[];
    public String msgs[];
    public int ran;
    public int err;
    public int err2;
    public String res[];
    
    /**
     * Creates new form AhorcadoFamiliaN1
     */
    public AhorcadoRopaN1() {
        initComponents();
        setSize(888,561);//Tamaño reajustable de la ventana
        this.setLocationRelativeTo(null);
        setTitle("LudoAprende");
        Image icon=new ImageIcon(getClass().getResource("/imagenes/Logo.png")).getImage();
        setIconImage(icon);

        imgs = new ImageIcon[12];
        btns = new JButton[28];
        msgs = new String[1];
        
        //imagen del muñeco ahorcado que saldra por error
        imgs[0] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im1.png"));
        imgs[1] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im2.png"));
        imgs[2] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im3.png"));
        imgs[3] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im4.png"));
        imgs[4] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im5.png"));
        imgs[5] = new ImageIcon(getClass().getResource("/imagenesAhorcado/im6.png"));
        
        //Imagenes que saldran en cada fallo de letra
       imgs[6] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo0.png"));
       imgs[7] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo1.png"));
       imgs[8] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo2.png"));
       imgs[9] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo3.png"));
       imgs[10] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo4.png"));
       imgs[11] = new ImageIcon(getClass().getResource("/imagenesAhorcado/fallo5.png"));
       
       //Declaración de los botones que estarán disponibles para seleccionar
        btns[1]=button_1;
        btns[2]=button_2;
        btns[3]=button_3;
        btns[4]=button_4;
        btns[5]=button_5;
        btns[6]=button_6;
        btns[7]=button_7;
        btns[8]=button_8;
        btns[9]=button_9;
        btns[10]=button_10;
        btns[11]=button_11;
        btns[12]=button_12;
        btns[13]=button_13;
        btns[14]=button_14;
        btns[15]=button_16;
        btns[16]=button_17;
        btns[17]=button_18;
        btns[18]=button_19;
        btns[19]=button_20;
        btns[20]=button_21;
        btns[21]=button_22;
        btns[22]=button_23;
        btns[23]=button_24;
        btns[24]=button_25;
        btns[25]=button_26;
        btns[26]=button_27;
        btns[27]=button_15;
        
        //Palabra oculta
        msgs[0] = "medias".toUpperCase();
        //Ciclo para asignar un evento a cada letra para comprobar que exista en la palabra a adivinar
        for (int i = 1; i < 28; i++) {
            btns[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    checarLetra(e);
                }
            });
        }
        iniciar();   
    }
    
    public void iniciar() {
        
        err = 0;
        err2=6;
        Dibujo.setIcon(imgs[0]);
        txtPalabra.setText("");
        errores.setIcon(imgs[6]);
        for (int i = 1; i < 28; i++) {
            btns[i].setEnabled(true);
        }
        //para generar una palabra aleatoriamente en caso de que se tengan sinonimos para una palabra
        ran = (int) 0 + (int) (Math.random() * ((msgs.length - 1) + 1));
        //Separa las palabras
        String pal[] = msgs[ran].split(" ");
        res = new String[msgs[ran].length() + 1];
        int j = 0;
        // Agrega los guiones deacuerdo a la palabra oculta
        for (String pal1 : pal) {
            for (int i = 0; i < pal1.length(); i++) {
                txtPalabra.setText(txtPalabra.getText() + "_ ");
                res[j++] = "_";
            }
            txtPalabra.setText(txtPalabra.getText() + "\n");
            res[j++] = " ";
        }
    }
    
public void checarLetra(ActionEvent e) {
        Icon cp=new ImageIcon(getClass().getResource("/imagenesAhorcado/copa.png"));
        Icon cara=new ImageIcon(getClass().getResource("/imagenesAhorcado/cara.png"));
        JButton bt = (JButton) e.getSource();
        char c[];
        //busca la letra en la palabra luego de que este sea seleccionada por el jugador
        for (int i = 1; i < 28; i++) {
            if (bt == btns[i]) {
                      c = Character.toChars(64 + i);
                //busca si la letra esta en la palabra oculta
                boolean esta = false;
                for (int j = 0; j < msgs[ran].length(); j++) {
                    if (c[0] == msgs[ran].charAt(j)) {
                        res[j] = c[0] + "";
                        esta = true;
                        }
                }
                //SI LA LETRA ESTA EN EL MENSAJE SE MUESTRA EN EL TEXTPANEL
                if (esta) {
                    txtPalabra.setText("");
                    for (String re : res) {
                        if (" ".equals(re)) {
                            txtPalabra.setText(txtPalabra.getText() + "\n");
                        } else {
                            txtPalabra.setText(txtPalabra.getText() + re + " ");
                        }
                    }
                    //hace una comprobacion de las letras restantes y faltantes
                    boolean gano = true;
                    for (String re : res) {
                        if (re.equals("_")) {
                            gano = false;
                            break;
                            }
                    }
                    //al ser correcta se muestra un mensaje y se reinicia el juego
                    if (gano) { 
                        JOptionPane.showMessageDialog(this, "¡Muy bien!\n Puedes pasar al proximo nivel", "LudoAprende.",JOptionPane.INFORMATION_MESSAGE, cp);
                        iniciar();
                        return;
                    }
                    //Si no esta la letra dentro de la palabra se incrementan los errores
                } else {
                    Dibujo.setIcon(imgs[++err]);
                    errores.setIcon(imgs[++err2]);
                    //En caso de que se completen 5 fallos se muestra el siguiente mensaje
                    if (err == 5) {
                        JOptionPane.showMessageDialog(this, "¿Qué pasó? \n Sigue repasando escritura y vocabulario \n" + msgs[ran], "LudoAprende",JOptionPane.INFORMATION_MESSAGE, cara);
                        iniciar();
                        return;
                        }
                }
                //esta es la linea que desactiva las letras despues de ser usadas :3
                bt.setEnabled(false);
                break;
            }
        }
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
        Instrucciones = new javax.swing.JPanel();
        Gif = new javax.swing.JLabel();
        Frase = new javax.swing.JLabel();
        BotonVolver = new javax.swing.JButton();
        BotonSiguiente = new javax.swing.JButton();
        Texto = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Teclas = new javax.swing.JPanel();
        button_1 = new javax.swing.JButton();
        button_2 = new javax.swing.JButton();
        button_3 = new javax.swing.JButton();
        button_4 = new javax.swing.JButton();
        button_5 = new javax.swing.JButton();
        button_6 = new javax.swing.JButton();
        button_7 = new javax.swing.JButton();
        button_8 = new javax.swing.JButton();
        button_9 = new javax.swing.JButton();
        button_10 = new javax.swing.JButton();
        button_11 = new javax.swing.JButton();
        button_12 = new javax.swing.JButton();
        button_13 = new javax.swing.JButton();
        button_14 = new javax.swing.JButton();
        button_15 = new javax.swing.JButton();
        button_16 = new javax.swing.JButton();
        button_17 = new javax.swing.JButton();
        button_18 = new javax.swing.JButton();
        button_19 = new javax.swing.JButton();
        button_20 = new javax.swing.JButton();
        button_21 = new javax.swing.JButton();
        button_22 = new javax.swing.JButton();
        button_23 = new javax.swing.JButton();
        button_24 = new javax.swing.JButton();
        button_25 = new javax.swing.JButton();
        button_26 = new javax.swing.JButton();
        button_27 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DibujoPanel = new javax.swing.JPanel();
        Dibujo = new javax.swing.JLabel();
        PanelPalabras = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtPalabra = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        errores = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        jPanel1.setBackground(new java.awt.Color(95, 216, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 551));

        Instrucciones.setBackground(new java.awt.Color(95, 216, 232));
        Instrucciones.setPreferredSize(new java.awt.Dimension(888, 122));

        Gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Videos/AhorcadoInstruccion.gif"))); // NOI18N

        Frase.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Frase.setText("Juego del ahorcado ");

        BotonVolver.setBackground(new java.awt.Color(19, 130, 232));
        BotonVolver.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        BotonSiguiente.setBackground(new java.awt.Color(19, 130, 232));
        BotonSiguiente.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonSiguiente.setText("Siguiente");
        BotonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguienteActionPerformed(evt);
            }
        });

        Texto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Texto.setText("Observa la seña y la imagen, escoje las letras que necesitas para ");

        Texto1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Texto1.setText("correspondan a lo observado para completar la palabr oculta antes de que se complete la imagen");

        Texto2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Texto2.setText("completar la palabra oculta.");

        javax.swing.GroupLayout InstruccionesLayout = new javax.swing.GroupLayout(Instrucciones);
        Instrucciones.setLayout(InstruccionesLayout);
        InstruccionesLayout.setHorizontalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruccionesLayout.createSequentialGroup()
                .addGroup(InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InstruccionesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 713, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(InstruccionesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InstruccionesLayout.createSequentialGroup()
                                .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Frase, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(InstruccionesLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Texto2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addComponent(Gif, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        InstruccionesLayout.setVerticalGroup(
            InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstruccionesLayout.createSequentialGroup()
                .addGroup(InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InstruccionesLayout.createSequentialGroup()
                        .addGroup(InstruccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InstruccionesLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Frase))
                            .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Texto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Texto2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(Gif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Texto1)
                .addGap(13, 13, 13))
        );

        Teclas.setBackground(new java.awt.Color(95, 216, 232));
        Teclas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Letras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        button_1.setBackground(new java.awt.Color(11, 163, 240));
        button_1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_1.setText("a");
        button_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_1ActionPerformed(evt);
            }
        });

        button_2.setBackground(new java.awt.Color(11, 163, 240));
        button_2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_2.setText("b");
        button_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_2ActionPerformed(evt);
            }
        });

        button_3.setBackground(new java.awt.Color(11, 163, 240));
        button_3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_3.setText("c");
        button_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_3ActionPerformed(evt);
            }
        });

        button_4.setBackground(new java.awt.Color(11, 163, 240));
        button_4.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_4.setText("d");
        button_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_4ActionPerformed(evt);
            }
        });

        button_5.setBackground(new java.awt.Color(11, 163, 240));
        button_5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_5.setText("e");
        button_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_5ActionPerformed(evt);
            }
        });

        button_6.setBackground(new java.awt.Color(11, 163, 240));
        button_6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_6.setText("f");
        button_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_6ActionPerformed(evt);
            }
        });

        button_7.setBackground(new java.awt.Color(11, 163, 240));
        button_7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_7.setText("g");
        button_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_7ActionPerformed(evt);
            }
        });

        button_8.setBackground(new java.awt.Color(11, 163, 240));
        button_8.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_8.setText("h");
        button_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_8ActionPerformed(evt);
            }
        });

        button_9.setBackground(new java.awt.Color(11, 163, 240));
        button_9.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_9.setText("i");
        button_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_9ActionPerformed(evt);
            }
        });

        button_10.setBackground(new java.awt.Color(11, 163, 240));
        button_10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_10.setText("j");
        button_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_10ActionPerformed(evt);
            }
        });

        button_11.setBackground(new java.awt.Color(11, 163, 240));
        button_11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_11.setText("k");
        button_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_11ActionPerformed(evt);
            }
        });

        button_12.setBackground(new java.awt.Color(11, 163, 240));
        button_12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_12.setText("l");
        button_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_12ActionPerformed(evt);
            }
        });

        button_13.setBackground(new java.awt.Color(11, 163, 240));
        button_13.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_13.setText("m");
        button_13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_13ActionPerformed(evt);
            }
        });

        button_14.setBackground(new java.awt.Color(11, 163, 240));
        button_14.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_14.setText("n");
        button_14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_14ActionPerformed(evt);
            }
        });

        button_15.setBackground(new java.awt.Color(11, 163, 240));
        button_15.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_15.setText("ñ");
        button_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_15ActionPerformed(evt);
            }
        });

        button_16.setBackground(new java.awt.Color(11, 163, 240));
        button_16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_16.setText("o");
        button_16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_16ActionPerformed(evt);
            }
        });

        button_17.setBackground(new java.awt.Color(11, 163, 240));
        button_17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_17.setText("p");
        button_17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_17ActionPerformed(evt);
            }
        });

        button_18.setBackground(new java.awt.Color(11, 163, 240));
        button_18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_18.setText("q");
        button_18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_18ActionPerformed(evt);
            }
        });

        button_19.setBackground(new java.awt.Color(11, 163, 240));
        button_19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_19.setText("r");
        button_19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_19ActionPerformed(evt);
            }
        });

        button_20.setBackground(new java.awt.Color(11, 163, 240));
        button_20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_20.setText("s");
        button_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_20ActionPerformed(evt);
            }
        });

        button_21.setBackground(new java.awt.Color(11, 163, 240));
        button_21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_21.setText("t");
        button_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_21ActionPerformed(evt);
            }
        });

        button_22.setBackground(new java.awt.Color(11, 163, 240));
        button_22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_22.setText("u");
        button_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_22ActionPerformed(evt);
            }
        });

        button_23.setBackground(new java.awt.Color(11, 163, 240));
        button_23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_23.setText("v");
        button_23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_23ActionPerformed(evt);
            }
        });

        button_24.setBackground(new java.awt.Color(11, 163, 240));
        button_24.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_24.setText("w");
        button_24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_24ActionPerformed(evt);
            }
        });

        button_25.setBackground(new java.awt.Color(11, 163, 240));
        button_25.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_25.setText("x");
        button_25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_25ActionPerformed(evt);
            }
        });

        button_26.setBackground(new java.awt.Color(11, 163, 240));
        button_26.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_26.setText("y");
        button_26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_26ActionPerformed(evt);
            }
        });

        button_27.setBackground(new java.awt.Color(11, 163, 240));
        button_27.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        button_27.setText("z");
        button_27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TeclasLayout = new javax.swing.GroupLayout(Teclas);
        Teclas.setLayout(TeclasLayout);
        TeclasLayout.setHorizontalGroup(
            TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeclasLayout.createSequentialGroup()
                .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TeclasLayout.createSequentialGroup()
                        .addComponent(button_1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(button_2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeclasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TeclasLayout.createSequentialGroup()
                                .addComponent(button_15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TeclasLayout.createSequentialGroup()
                                .addComponent(button_22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_26, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button_27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeclasLayout.createSequentialGroup()
                        .addComponent(button_8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_13)
                        .addGap(5, 5, 5)
                        .addComponent(button_14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        TeclasLayout.setVerticalGroup(
            TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeclasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_1)
                    .addComponent(button_2)
                    .addComponent(button_3)
                    .addComponent(button_4)
                    .addComponent(button_5)
                    .addComponent(button_6)
                    .addComponent(button_7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_8)
                    .addComponent(button_9)
                    .addComponent(button_10)
                    .addComponent(button_11)
                    .addComponent(button_12)
                    .addComponent(button_13)
                    .addComponent(button_14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_15)
                    .addComponent(button_16)
                    .addComponent(button_17)
                    .addComponent(button_18)
                    .addComponent(button_19)
                    .addComponent(button_20)
                    .addComponent(button_21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TeclasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_22)
                    .addComponent(button_23)
                    .addComponent(button_24)
                    .addComponent(button_25)
                    .addComponent(button_26)
                    .addComponent(button_27)))
        );

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Medias.png"))); // NOI18N

        DibujoPanel.setBackground(new java.awt.Color(95, 216, 232));
        DibujoPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        javax.swing.GroupLayout DibujoPanelLayout = new javax.swing.GroupLayout(DibujoPanel);
        DibujoPanel.setLayout(DibujoPanelLayout);
        DibujoPanelLayout.setHorizontalGroup(
            DibujoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DibujoPanelLayout.createSequentialGroup()
                .addComponent(Dibujo, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        DibujoPanelLayout.setVerticalGroup(
            DibujoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dibujo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );

        PanelPalabras.setBackground(new java.awt.Color(95, 216, 232));
        PanelPalabras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));

        jPanel2.setBackground(new java.awt.Color(95, 216, 232));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Palabra Oculta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        txtPalabra.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPalabraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPalabra)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtPalabra, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(95, 216, 232));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 0, 12))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(errores, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelPalabrasLayout = new javax.swing.GroupLayout(PanelPalabras);
        PanelPalabras.setLayout(PanelPalabrasLayout);
        PanelPalabrasLayout.setHorizontalGroup(
            PanelPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPalabrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PanelPalabrasLayout.setVerticalGroup(
            PanelPalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPalabrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Videos/Niño.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DibujoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Teclas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PanelPalabras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Teclas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addComponent(DibujoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_1ActionPerformed

    private void button_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_2ActionPerformed

    private void button_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_3ActionPerformed

    private void button_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_4ActionPerformed

    private void button_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_5ActionPerformed

    private void button_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_6ActionPerformed

    private void button_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_7ActionPerformed

    private void button_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_8ActionPerformed

    private void button_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_9ActionPerformed

    private void button_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_10ActionPerformed

    private void button_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_11ActionPerformed

    private void button_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_12ActionPerformed

    private void button_13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_13ActionPerformed

    private void button_14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_14ActionPerformed

    private void button_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_15ActionPerformed

    private void button_16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_16ActionPerformed

    private void button_17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_17ActionPerformed

    private void button_18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_18ActionPerformed

    private void button_19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_19ActionPerformed

    private void button_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_20ActionPerformed

    private void button_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_21ActionPerformed

    private void button_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_22ActionPerformed

    private void button_23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_23ActionPerformed

    private void button_24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_24ActionPerformed

    private void button_25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_25ActionPerformed

    private void button_26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_26ActionPerformed

    private void button_27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_27ActionPerformed

    private void txtPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPalabraActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        NivelesFamiliaAhorcado nfamilia1 = new NivelesFamiliaAhorcado();
        nfamilia1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguienteActionPerformed
        AhorcadoRopaN2 ahorcado2Ropa = new AhorcadoRopaN2();
        ahorcado2Ropa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonSiguienteActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSiguiente;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Dibujo;
    private javax.swing.JPanel DibujoPanel;
    private javax.swing.JLabel Frase;
    private javax.swing.JLabel Gif;
    private javax.swing.JPanel Instrucciones;
    private javax.swing.JPanel PanelPalabras;
    private javax.swing.JPanel Teclas;
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JButton button_1;
    private javax.swing.JButton button_10;
    private javax.swing.JButton button_11;
    private javax.swing.JButton button_12;
    private javax.swing.JButton button_13;
    private javax.swing.JButton button_14;
    private javax.swing.JButton button_15;
    private javax.swing.JButton button_16;
    private javax.swing.JButton button_17;
    private javax.swing.JButton button_18;
    private javax.swing.JButton button_19;
    private javax.swing.JButton button_2;
    private javax.swing.JButton button_20;
    private javax.swing.JButton button_21;
    private javax.swing.JButton button_22;
    private javax.swing.JButton button_23;
    private javax.swing.JButton button_24;
    private javax.swing.JButton button_25;
    private javax.swing.JButton button_26;
    private javax.swing.JButton button_27;
    private javax.swing.JButton button_3;
    private javax.swing.JButton button_4;
    private javax.swing.JButton button_5;
    private javax.swing.JButton button_6;
    private javax.swing.JButton button_7;
    private javax.swing.JButton button_8;
    private javax.swing.JButton button_9;
    private javax.swing.JLabel errores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPalabra;
    // End of variables declaration//GEN-END:variables
}
