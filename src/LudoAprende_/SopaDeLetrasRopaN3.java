package LudoAprende_;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 *
 * @author Milena
 */
public class SopaDeLetrasRopaN3 extends javax.swing.JFrame {
    JLabel letra[][];
    JLabel palabra[];
    String palabras[];//al macenas las palabras en un arreglo de string
    int iniciox[];
    int inicioy[];
    boolean gano; 
    boolean direccion[];    


    public SopaDeLetrasRopaN3() {
       
        setSize(888,551);//Tamaño reajustable de la ventana
        this.setLocationRelativeTo(null);
        setTitle("LudoAprende");
        Image icon=new ImageIcon(getClass().getResource("/imagenes/Logo.png")).getImage();
        setIconImage(icon);
        initComponents();
        
        palabra = new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};
        this.setLocationRelativeTo(null);
        cargar();
        palabras=new String[10];
        palabra=new JLabel[]{p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};//
        for (int i = 0; i < letra.length; i++) {
            palabras[i]=palabra[i].getText();//pasa la palabra del arreglo label al al arreglo de string
        }        
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        BotonVolver1 = new javax.swing.JButton();
        MenuJuego = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        instrucciones = new javax.swing.JLabel();
        Listado_Palabras = new javax.swing.JPanel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        JuegoSopaDeLetras = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        Gif = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BotonVolver1.setBackground(new java.awt.Color(19, 130, 232));
        BotonVolver1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonVolver1.setText("Volver");
        BotonVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolver1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuJuego.setBackground(new java.awt.Color(95, 216, 232));
        MenuJuego.setPreferredSize(new java.awt.Dimension(888, 551));

        titulo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Juego de sopa de letras");

        instrucciones.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        instrucciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        instrucciones.setText("Lee las palabras y encuentralas en la sopa de letras");

        Listado_Palabras.setBackground(new java.awt.Color(95, 216, 232));
        Listado_Palabras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        p1.setBackground(new java.awt.Color(0, 153, 255));
        p1.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setText("sudadera");
        p1.setOpaque(true);

        p2.setBackground(new java.awt.Color(0, 153, 255));
        p2.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setText("pantaloneta");
        p2.setOpaque(true);

        p3.setBackground(new java.awt.Color(0, 153, 255));
        p3.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setText("cachucha");
        p3.setOpaque(true);

        p4.setBackground(new java.awt.Color(0, 153, 255));
        p4.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setText("cinturón");
        p4.setOpaque(true);

        p5.setBackground(new java.awt.Color(0, 153, 255));
        p5.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setText("saco");
        p5.setOpaque(true);

        p6.setBackground(new java.awt.Color(0, 153, 255));
        p6.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setText("medias");
        p6.setOpaque(true);

        p7.setBackground(new java.awt.Color(0, 153, 255));
        p7.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setText("botas");
        p7.setOpaque(true);

        p8.setBackground(new java.awt.Color(0, 153, 255));
        p8.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setText("camiseta");
        p8.setOpaque(true);

        p9.setBackground(new java.awt.Color(0, 153, 255));
        p9.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setText("pijama");
        p9.setOpaque(true);

        p10.setBackground(new java.awt.Color(0, 153, 255));
        p10.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setText("vestido");
        p10.setOpaque(true);

        javax.swing.GroupLayout Listado_PalabrasLayout = new javax.swing.GroupLayout(Listado_Palabras);
        Listado_Palabras.setLayout(Listado_PalabrasLayout);
        Listado_PalabrasLayout.setHorizontalGroup(
            Listado_PalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listado_PalabrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Listado_PalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p8, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(p9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(p10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Listado_PalabrasLayout.setVerticalGroup(
            Listado_PalabrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Listado_PalabrasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        JuegoSopaDeLetras.setBackground(new java.awt.Color(95, 216, 232));
        JuegoSopaDeLetras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JuegoSopaDeLetras.setLayout(new java.awt.GridLayout(10, 14));

        BotonVolver.setBackground(new java.awt.Color(19, 130, 232));
        BotonVolver.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        Reiniciar.setBackground(new java.awt.Color(19, 130, 232));
        Reiniciar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        Reiniciar.setText("Reiniciar");
        Reiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReiniciarMouseClicked(evt);
            }
        });
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });

        Gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Videos/SopaDeLetras.gif"))); // NOI18N

        javax.swing.GroupLayout MenuJuegoLayout = new javax.swing.GroupLayout(MenuJuego);
        MenuJuego.setLayout(MenuJuegoLayout);
        MenuJuegoLayout.setHorizontalGroup(
            MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuJuegoLayout.createSequentialGroup()
                .addGroup(MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuJuegoLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(instrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuJuegoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuJuegoLayout.createSequentialGroup()
                                .addComponent(JuegoSopaDeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Listado_Palabras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
                            .addGroup(MenuJuegoLayout.createSequentialGroup()
                                .addGroup(MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuJuegoLayout.createSequentialGroup()
                                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(192, 192, 192)
                                        .addComponent(Reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(66, 66, 66))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuJuegoLayout.createSequentialGroup()
                                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)))
                                .addComponent(Gif, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        MenuJuegoLayout.setVerticalGroup(
            MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuJuegoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MenuJuegoLayout.createSequentialGroup()
                        .addComponent(Gif)
                        .addGap(27, 27, 27)
                        .addComponent(Listado_Palabras, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuJuegoLayout.createSequentialGroup()
                        .addGroup(MenuJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Reiniciar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(titulo)
                        .addGap(18, 18, 18)
                        .addComponent(instrucciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JuegoSopaDeLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuJuego, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolver1ActionPerformed
        NivelesFamiliaAhorcado nfamilia1 = new NivelesFamiliaAhorcado();
        nfamilia1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolver1ActionPerformed

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        ActRopa actividaRopaa = new ActRopa();
        actividaRopaa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReiniciarActionPerformed


    private void ReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarMouseClicked
        for (int i = 0; i < letra.length; i++) {
            palabra[i].setText(palabras[i]);//asigna a los label de la derecha las palabras
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                JuegoSopaDeLetras.remove(letra[i][j]);//quita el panel  Sopa_de_letra
            }
        }
        cargar();//carga el juego
    }//GEN-LAST:event_ReiniciarMouseClicked

    public void cargar()
    {
        gano=false;
        iniciox=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en x
        inicioy=new int[10];//crea un arreglo de enteros para guadar las posiciones de las palabras en y
        direccion=new boolean[10];//crea un arreglo de enteros para guadar las direcion de las palabras ya sea hacia alante o hacia tras
        celdasdeletras();
        colocarpalabras();
        llenarespaciosvacios();
    }
    
    public void celdasdeletras(){
        letra=new JLabel[10][14];//crea la matriz de celdas donde va cada letra
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 14; j++) {
                letra[i][j]=new JLabel("", javax.swing.SwingConstants.CENTER);//crea la casilla la vacia y con una alineacion centrada
                letra[i][j].setName("");//le pone un nombre a la casilla en este caso no le pone ninguno
                letra[i][j].setBackground(Color.WHITE);//coloca la casilla de color blanco
                letra[i][j].setFont(new java.awt.Font("Century Gothic", 0, 14)); 
                letra[i][j].setForeground(new java.awt.Color(0, 5, 2));
                letra[i][j].setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
                letra[i][j].setOpaque(true);//esto es para que se pueda ver el color de la casilla o cajonsito donde va la letra
                letra[i][j].setBorder(new javax.swing.border.LineBorder(Color.BLACK, 1));//pone a la casiilla en borde con una linea negra
                letra[i][j].addMouseListener(new java.awt.event.MouseAdapter() {//pone a la casilla a la escucha del mouse para saber cuando se esta dando clic
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        presioneClic(evt);//llama al metodo que debe ejecutarse cuando se da clic
                    }
                });
                JuegoSopaDeLetras.add(letra[i][j]);//coloca la pasilla en el panel Sopa_de_letra
            }
        }
    } 
    
    //este metodo se ejecuta cuando se presiona clic en una casilla
    public void presioneClic(java.awt.event.MouseEvent evt) {
        if (!gano) {//verifica si gano el juego
            if (evt.getComponent().getBackground().equals(Color.WHITE))//verifica si la casilla esta de color blanco 
            {
                evt.getComponent().setBackground(new java.awt.Color(95, 51, 255));//si esta de color blanco la pone de color azul
                tachar();
            }else if(evt.getComponent().getName().equals(""))//pregunta si la casilla no tiene una letra de alguna palabra
            {
                evt.getComponent().setBackground(Color.WHITE);//pone la casilla de color blanco
            }
        }
    }

    public void tachar(){
        for (int i = 0; i < 10; i++) 
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) {
                if (tacharLetra(iniciox[i],inicioy[i],palabra[i].getText().length(),direccion[i]))//pregunta si hay una palabra encontrada
                {
                    palabra[i].setText("<html><body><s>"+palabra[i].getText()+"</s></body></html>");//tacha la palabra
                    break;
                }
            }
        }
        boolean aux=true;//ayuda para saber si ya todas las palabras estan tachadas
        for (int i = 0; i < letra.length; i++)
        {
            if (!palabra[i].getText().substring(0, 1).equals("<")) 
            {
                aux=false;
                break;
            }
        }
        /*if (aux) {
            if (!(fin instanceof Final)) 
            { //esto comprueba si la ventana no esta en memoria, entonces la instancia
                fin = new Final();   
                gano=true;
            } 
            CentrarVentanaInterna(fin); //usamos el metodo generico para centrar
        }*/
    }
    
//    verifica si se puede tachar la letra
    public boolean  tacharLetra(int x,int y,int tamaño,boolean direccion) {
        boolean respuesta=true;
        if (direccion) {
            for (int i = y; i < tamaño+y; i++) {
                if (letra[x][i].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }else
        {
            for (int j = y; j >y-tamaño; j--) {
                if (letra[x][j].getBackground().equals(Color.WHITE)) {
                    respuesta=false;
                    break;
                }
            }
        }
        return respuesta;
    }    
    
    public void colocarpalabras() {
        String palabra[]={p1.getText(),p2.getText(),p3.getText(),p4.getText(),p5.getText(),p6.getText(),p7.getText(),p8.getText(),p9.getText(),p10.getText()};
        Random random=new Random();//estemetodo ayuda a crear numeros aleatorios
        int iniciax=0;//posicion x donde inicia la palabra
        int iniciay;//posicion y donde inicia la palabra
        int unico[]=NumerosSinRepeticiones(10);//evita que en una fila se generen mas de una vez
        iniciox=unico;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].length()<14) {
                iniciax=unico[i];
                iniciay=(int)(random.nextDouble()*14-1);
                int estrae=0;//ayuda para estraer las letras de la palabra
                if (iniciay+palabra[i].length()<14) {
                    for (int j = iniciay; j < iniciay+palabra[i].length(); j++) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));//estrae una letra de la palabra
                        letra[iniciax][j].setName("1");//pone el nombre a la casilla para que se sepa que hay va una letra de una palabra
                        estrae++;//esto es para que se estraiga la siguiente letra de la palabra
                        inicioy[i]=iniciay;
                        direccion[i]=true;
                    }
                } else if (iniciay-palabra[i].length()>0)
                {
                    for (int j = iniciay; j >iniciay-palabra[i].length() ; j--) {
                        letra[iniciax][j].setText(palabra[i].substring(estrae, estrae+1));
                        letra[iniciax][j].setName("1");
                        estrae++;
                        inicioy[i]=iniciay;
                        direccion[i]=false;
                    }
                }
            }
        }
    } 
    
    public int[] NumerosSinRepeticiones(int repeticiones) {
        int numeros[]=new int[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            numeros[i]=-1;
        }
        Random random=new Random();
        boolean aux ;//informa si la fila esta o no repetida
        int numero=0;
        for (int x = 0; x < repeticiones; x++) 
        {
            aux = true;
            while (aux) {  
                aux=false;
                numero=(int)(random.nextDouble()*11-1);
                for (int j = 0; j < numeros.length; j++) {
                    if (numeros[j]==numero) {
                        aux=true;
                        break;
                    }
                }
            }
            numeros[x]=numero;
        }
        return numeros;
    } 

    public void llenarespaciosvacios(){
        //este arreglo ayuda a poner las letras del avecedario
        String abc[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n",
                      "ñ","o","p","q","r","s","t","u","v","w","x","y","z","ó","á"};
        Random random=new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 14; j++) {
                if (letra[i][j].getText().equals("")) {//si la casilla esta vacia pongale una letra del arreglo abc
                    letra[i][j].setText(abc[(int)(random.nextDouble()*abc.length-1)]);//aqui pone la letra
                }
            }
        }
    }    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonVolver;
    private javax.swing.JButton BotonVolver1;
    private javax.swing.JLabel Gif;
    private javax.swing.JPanel JuegoSopaDeLetras;
    private javax.swing.JPanel Listado_Palabras;
    private javax.swing.JPanel MenuJuego;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JLabel instrucciones;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
