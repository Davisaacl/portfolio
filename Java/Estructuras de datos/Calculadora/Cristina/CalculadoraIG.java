/*
Cristina Crespo, Eyal Schuller, Luisa García
19 de febrero del 2018
Calculadora
 */
package proyecto;

/**
 * @author Cristina Crespo, Eyal Schuller, Luisa García
 */
public class CalculadoraIG extends javax.swing.JFrame {
    /**
     * Constructor nulo
     */
    public CalculadoraIG() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resTxt = new javax.swing.JTextField();
        n1B = new javax.swing.JButton();
        n2B = new javax.swing.JButton();
        n3B = new javax.swing.JButton();
        masB = new javax.swing.JButton();
        n4B = new javax.swing.JButton();
        n5B = new javax.swing.JButton();
        n6B = new javax.swing.JButton();
        menosB = new javax.swing.JButton();
        n7B = new javax.swing.JButton();
        n8B = new javax.swing.JButton();
        n9B = new javax.swing.JButton();
        porB = new javax.swing.JButton();
        n0B = new javax.swing.JButton();
        puntoB = new javax.swing.JButton();
        igualB = new javax.swing.JButton();
        entreB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        pAbiertoB = new javax.swing.JButton();
        comaB = new javax.swing.JButton();
        pCerradoB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        n1B.setText("1");
        n1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1BActionPerformed(evt);
            }
        });

        n2B.setText("2");
        n2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2BActionPerformed(evt);
            }
        });

        n3B.setText("3");
        n3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3BActionPerformed(evt);
            }
        });

        masB.setText("+");
        masB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBActionPerformed(evt);
            }
        });

        n4B.setText("4");
        n4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4BActionPerformed(evt);
            }
        });

        n5B.setText("5");
        n5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5BActionPerformed(evt);
            }
        });

        n6B.setText("6");
        n6B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6BActionPerformed(evt);
            }
        });

        menosB.setText("-");
        menosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBActionPerformed(evt);
            }
        });

        n7B.setText("7");
        n7B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7BActionPerformed(evt);
            }
        });

        n8B.setText("8");
        n8B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8BActionPerformed(evt);
            }
        });

        n9B.setText("9");
        n9B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9BActionPerformed(evt);
            }
        });

        porB.setText("*");
        porB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porBActionPerformed(evt);
            }
        });

        n0B.setText("0");
        n0B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n0BActionPerformed(evt);
            }
        });

        puntoB.setText(".");
        puntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoBActionPerformed(evt);
            }
        });

        igualB.setText("=");
        igualB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualBActionPerformed(evt);
            }
        });

        entreB.setText("/");
        entreB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreBActionPerformed(evt);
            }
        });

        clearB.setText("Clear");
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
            }
        });

        deleteB.setText("Delete");
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        pAbiertoB.setText("(");
        pAbiertoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pAbiertoBActionPerformed(evt);
            }
        });

        comaB.setText(",");
        comaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comaBActionPerformed(evt);
            }
        });

        pCerradoB.setText(")");
        pCerradoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCerradoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resTxt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n1B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n2B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n3B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(masB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n4B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n5B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n6B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menosB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(n7B, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n8B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(n9B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(porB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(puntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(n0B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearB, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pAbiertoB, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pCerradoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(igualB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entreB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comaB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(n1B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n2B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(n3B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n4B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n5B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n7B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n8B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n9B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(porB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(n0B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(igualB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(entreB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comaB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(puntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pAbiertoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pCerradoB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(n6B, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menosB, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un cuatro al texto en la ventana de la calculadora
 */
    private void n4BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4BActionPerformed
        general("4");
    }//GEN-LAST:event_n4BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un uno al texto en la ventana de la calculadora
 */
    private void n1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1BActionPerformed
        general("1");
    }//GEN-LAST:event_n1BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un paréntesis abierto al texto en la ventana de la calculadora
 */
    private void pAbiertoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pAbiertoBActionPerformed
        // TODO add your handling code here:
        general("(");
    }//GEN-LAST:event_pAbiertoBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un dos al texto en la ventana de la calculadora
 */
    private void n2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2BActionPerformed
        general("2");
    }//GEN-LAST:event_n2BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un tres al texto en la ventana de la calculadora
 */
    private void n3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3BActionPerformed
        general("3");
    }//GEN-LAST:event_n3BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un signo más al texto en la ventana de la calculadora
 */
    private void masBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBActionPerformed
        general("+");
    }//GEN-LAST:event_masBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un cinco al texto en la ventana de la calculadora
 */
    private void n5BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5BActionPerformed
        // TODO add your handling code here:
        general("5");
    }//GEN-LAST:event_n5BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un seis al texto en la ventana de la calculadora
 */
    private void n6BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6BActionPerformed
        // TODO add your handling code here:
        general("6");
    }//GEN-LAST:event_n6BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un signo menos al texto en la ventana de la calculadora
 */
    private void menosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBActionPerformed
        // TODO add your handling code here:
        general("-");
    }//GEN-LAST:event_menosBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un siete al texto en la ventana de la calculadora
 */
    private void n7BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7BActionPerformed
        // TODO add your handling code here:
        general("7");
    }//GEN-LAST:event_n7BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un ocho al texto en la ventana de la calculadora
 */
    private void n8BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8BActionPerformed
        // TODO add your handling code here:
        general("8");
    }//GEN-LAST:event_n8BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un nueve al texto en la ventana de la calculadora
 */
    private void n9BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9BActionPerformed
        // TODO add your handling code here:
        general("9");
    }//GEN-LAST:event_n9BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un operador de multiplicación al texto en la ventana de la calculadora
 */
    private void porBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porBActionPerformed
        // TODO add your handling code here:
        general("*");
    }//GEN-LAST:event_porBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un punto al texto en la ventana de la calculadora
 */
    private void puntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoBActionPerformed
        // TODO add your handling code here:
        general(".");
    }//GEN-LAST:event_puntoBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un cero al texto en la ventana de la calculadora
 */
    private void n0BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n0BActionPerformed
        // TODO add your handling code here:
        general("0");
    }//GEN-LAST:event_n0BActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see Metodos.esValido()
 * @see Metodos.calcula()
 * @see Metodos.posfija()
 * Este método se asegura que la operación sea válida, la cambia a posfija, la calcula, y pone el resultado en la ventana calculadora
 */
    private void igualBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualBActionPerformed
        String operacion= resTxt.getText();
        PilaA<Object> posfija= new PilaA();
        
        if(Metodos.esValido(operacion)){
            posfija=Metodos.postfija(operacion);
            resTxt.setText(Metodos.calcula(posfija));
        }
        else{
            resTxt.setText("Operacion no valida");
        }
    }//GEN-LAST:event_igualBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un operador de división al texto en la ventana de la calculadora
 */
    private void entreBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreBActionPerformed
        // TODO add your handling code here:
        general("/");
    }//GEN-LAST:event_entreBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade un paréntesis cerrado al texto en la ventana de la calculadora
 */
    private void pCerradoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCerradoBActionPerformed
        // TODO add your handling code here:
        general(")");
    }//GEN-LAST:event_pCerradoBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * @see general(String)
 * Este método añade una coma al texto en la ventana de la calculadora
 */
    private void comaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comaBActionPerformed
        // TODO add your handling code here:
        general(",");
    }//GEN-LAST:event_comaBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * Este método limpia la ventana de la calculadora
 */
    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        resTxt.setText("");
    }//GEN-LAST:event_clearBActionPerformed
/**
 * @param evt Recibe como parámetro el botón apretado
 * Este método elimina el último caracter en el texto de la ventana de la calculadora
 */
    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        // TODO add your handling code here:
        String aux= resTxt.getText();
        StringBuilder cad= new StringBuilder("");
        
        for(int i=0; i<aux.length()-1; i++)
            cad.append(aux.charAt(i));
        resTxt.setText(cad.toString());
    }//GEN-LAST:event_deleteBActionPerformed
/**
 * @param evt Recibe como parámetro  el valor del boton apretado 
 * Este método añade el valor del boton apretado al texto de la ventana de la calculadora
 */
    private void general(String boton){
        StringBuilder cad=new StringBuilder(resTxt.getText());
        cad.append(boton);
        resTxt.setText(cad.toString());
    }
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
            java.util.logging.Logger.getLogger(CalculadoraIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraIG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraIG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearB;
    private javax.swing.JButton comaB;
    private javax.swing.JButton deleteB;
    private javax.swing.JButton entreB;
    private javax.swing.JButton igualB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton masB;
    private javax.swing.JButton menosB;
    private javax.swing.JButton n0B;
    private javax.swing.JButton n1B;
    private javax.swing.JButton n2B;
    private javax.swing.JButton n3B;
    private javax.swing.JButton n4B;
    private javax.swing.JButton n5B;
    private javax.swing.JButton n6B;
    private javax.swing.JButton n7B;
    private javax.swing.JButton n8B;
    private javax.swing.JButton n9B;
    private javax.swing.JButton pAbiertoB;
    private javax.swing.JButton pCerradoB;
    private javax.swing.JButton porB;
    private javax.swing.JButton puntoB;
    private javax.swing.JTextField resTxt;
    // End of variables declaration//GEN-END:variables

}
