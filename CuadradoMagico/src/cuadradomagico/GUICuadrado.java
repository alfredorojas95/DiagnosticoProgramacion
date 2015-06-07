package cuadradomagico;

public class GUICuadrado extends javax.swing.JFrame {

    Metodos met = new Metodos();
    boolean esNumero = false;

    public GUICuadrado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text2 = new javax.swing.JTextField();
        text3 = new javax.swing.JTextField();
        text4 = new javax.swing.JTextField();
        text5 = new javax.swing.JTextField();
        text6 = new javax.swing.JTextField();
        text7 = new javax.swing.JTextField();
        text8 = new javax.swing.JTextField();
        text9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text1KeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        jLabel1.setText("Cuadrado Mágico");

        text2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text2KeyTyped(evt);
            }
        });

        text3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text3KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text3KeyTyped(evt);
            }
        });

        text4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text4KeyTyped(evt);
            }
        });

        text5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text5KeyTyped(evt);
            }
        });

        text6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text6KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text6KeyTyped(evt);
            }
        });

        text7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text7KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text7KeyTyped(evt);
            }
        });

        text8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text8KeyTyped(evt);
            }
        });

        text9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));
        text9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                text9KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                text9KeyTyped(evt);
            }
        });

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void validarEntrada(java.awt.event.KeyEvent evt, javax.swing.JTextField c) {
//        restringir que el ingreso de datos sean sólo números entre 1 y 9 
//        y que al textfield no se pueda ingresar mas de un dígito 
        esNumero = false;
        char caracter = evt.getKeyChar();
        if ((caracter < '1' || caracter > '9') || (c.getText().length() == 1)/* && (caracter != evt.VK_BACK_SPACE)*/) {
            evt.consume();
            esNumero = true;
        }
    }

    private void capturarEntrada(java.awt.event.KeyEvent evt, javax.swing.JTextField c, int i, int j) {

        boolean estaRepetido = false;

        int y = evt.getKeyCode();
        if (y == 8) {//captura la tecla 'retroceso'
            met.almacenar(i, j, 0);//si se elimina (con retroceso)el valor del texfield se le asigna como nuevo valor el 'cero'
        } else {
            if (esNumero == false) {
                if (c.getText() != null) {//contenido del textfield debe ser distinto de nulo
                    int valorTextfield = Integer.parseInt(c.getText());
                    estaRepetido = met.estaRepetido(valorTextfield);//verificar repetido
                    if (estaRepetido == false) {//si no está repetido se guarda el valor del textfield en la matriz
                        met.almacenar(i, j, valorTextfield);//almacenar valores en la matriz
                    } else {// se encuntra repetido
                        c.setText("");//si está repetido lo borra del texfield y no se guarda en la matriz
                    }
                }

            }
        }

    }

//eventos keyTyped
    private void text1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyTyped
        validarEntrada(evt, text1);
    }//GEN-LAST:event_text1KeyTyped

    private void text3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyTyped
        validarEntrada(evt, text3);
    }//GEN-LAST:event_text3KeyTyped

    private void text2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyTyped
        validarEntrada(evt, text2);
    }//GEN-LAST:event_text2KeyTyped

    private void text4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyTyped
        validarEntrada(evt, text4);
    }//GEN-LAST:event_text4KeyTyped

    private void text5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyTyped
        validarEntrada(evt, text5);
    }//GEN-LAST:event_text5KeyTyped

    private void text6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text6KeyTyped
        validarEntrada(evt, text6);
    }//GEN-LAST:event_text6KeyTyped

    private void text7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text7KeyTyped
        validarEntrada(evt, text7);
    }//GEN-LAST:event_text7KeyTyped

    private void text8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text8KeyTyped
        validarEntrada(evt, text8);
    }//GEN-LAST:event_text8KeyTyped

    private void text9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text9KeyTyped
        validarEntrada(evt, text9);
    }//GEN-LAST:event_text9KeyTyped

    //eventos keyReleased
    private void text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text1KeyReleased
        capturarEntrada(evt, text1, 0, 0);
    }//GEN-LAST:event_text1KeyReleased

    private void text2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text2KeyReleased
        capturarEntrada(evt, text2, 0, 1);
    }//GEN-LAST:event_text2KeyReleased

    private void text3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text3KeyReleased
        capturarEntrada(evt, text3, 0, 2);
    }//GEN-LAST:event_text3KeyReleased

    private void text4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text4KeyReleased
        capturarEntrada(evt, text4, 1, 0);
    }//GEN-LAST:event_text4KeyReleased

    private void text5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text5KeyReleased
        capturarEntrada(evt, text5, 1, 1);
    }//GEN-LAST:event_text5KeyReleased

    private void text6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text6KeyReleased
        capturarEntrada(evt, text6, 1, 2);
    }//GEN-LAST:event_text6KeyReleased

    private void text7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text7KeyReleased
        capturarEntrada(evt, text7, 2, 0);
    }//GEN-LAST:event_text7KeyReleased

    private void text8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text8KeyReleased
        capturarEntrada(evt, text8, 2, 1);
    }//GEN-LAST:event_text8KeyReleased

    private void text9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text9KeyReleased
        capturarEntrada(evt, text9, 2, 2);
    }//GEN-LAST:event_text9KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        met.sumar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //met.limpiar();
       test_cuadrado.main(null);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUICuadrado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICuadrado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICuadrado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICuadrado.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICuadrado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField text1;
    public static javax.swing.JTextField text2;
    public static javax.swing.JTextField text3;
    public static javax.swing.JTextField text4;
    public static javax.swing.JTextField text5;
    public static javax.swing.JTextField text6;
    public static javax.swing.JTextField text7;
    public static javax.swing.JTextField text8;
    public static javax.swing.JTextField text9;
    // End of variables declaration//GEN-END:variables
}
