/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Dutan2000
 */
public class VentanaPrueba extends javax.swing.JFrame {

    private ControladorJugador controladorJ = new ControladorJugador();
    private ControladorRuleta controladorR = new ControladorRuleta();
    private Ruleta r;
    private Jugadores j;
    private Jugar jugar;
    private HiloRuleta hiloR;
    private List<Jugadores> jugadores = new ArrayList<>();
    private DefaultListModel<String> modeloLista;

    public VentanaPrueba() {
        initComponents();
        modeloLista = new DefaultListModel<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaV = new javax.swing.JList<>();
        opcionNumeroC = new javax.swing.JRadioButton();
        opcionParImpar = new javax.swing.JRadioButton();
        opcionMartingala = new javax.swing.JRadioButton();
        txtNumeroR = new javax.swing.JTextField();
        btnSimular = new javax.swing.JToggleButton();
        lblMesa = new javax.swing.JLabel();
        btnDetener = new javax.swing.JButton();
        panelRuleta1 = new ec.edu.ups.vista.PanelRuleta();
        lbljugador = new javax.swing.JLabel();
        lbljugador1 = new javax.swing.JLabel();
        lbljugador2 = new javax.swing.JLabel();
        lbljugador3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CASINO");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setViewportView(listaV);

        buttonGroup1.add(opcionNumeroC);
        opcionNumeroC.setText("NUMERO CONCRETO");

        buttonGroup1.add(opcionParImpar);
        opcionParImpar.setText("PAR/IMPAR");

        buttonGroup1.add(opcionMartingala);
        opcionMartingala.setText("MARTINGALA");

        txtNumeroR.setEditable(false);

        btnSimular.setText("SIMULAR");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        lblMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/Mesa.png"))); // NOI18N

        btnDetener.setText("DETENER");
        btnDetener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRuleta1Layout = new javax.swing.GroupLayout(panelRuleta1);
        panelRuleta1.setLayout(panelRuleta1Layout);
        panelRuleta1Layout.setHorizontalGroup(
            panelRuleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );
        panelRuleta1Layout.setVerticalGroup(
            panelRuleta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );

        lbljugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/jugador.png"))); // NOI18N

        lbljugador1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/jugador.png"))); // NOI18N

        lbljugador2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/jugador.png"))); // NOI18N

        lbljugador3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/imagenes/jugador.png"))); // NOI18N

        jLabel1.setText("NUMERO:");

        txtCaja.setEditable(false);

        jLabel2.setText("CAJA: $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNumeroR, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opcionMartingala)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(opcionNumeroC)
                                    .addComponent(opcionParImpar))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDetener)
                                    .addComponent(btnSimular)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbljugador)
                        .addGap(44, 44, 44)
                        .addComponent(lbljugador1)
                        .addGap(46, 46, 46)
                        .addComponent(lbljugador3)
                        .addGap(56, 56, 56)
                        .addComponent(lbljugador2)
                        .addGap(95, 95, 95)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcionNumeroC)
                            .addComponent(btnSimular))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcionParImpar)
                            .addComponent(btnDetener))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(opcionMartingala)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbljugador)
                                    .addComponent(lbljugador2)
                                    .addComponent(lbljugador3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMesa)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(panelRuleta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNumeroR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))))
                            .addComponent(lbljugador1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed

        panelRuleta1.loadimage("/Users/newuser/NetBeansProjects/ExamenHilosJPA/src/ec/edu/ups/imagenes/Ruleta.png");
        panelRuleta1.invalidate();
        if (opcionNumeroC.isSelected()) {
            if (controladorJ.findAll().isEmpty()) {
                for (int i = 0; i < 4; i++) {
                    j = new Jugadores();
                    j.setDinero(1000);
                    j.setId((i + 1));
                    j.setVecesPerdidas(1);
                    j.setNumeroApostado(controladorJ.elegirAlazar());
                    j.setTipoParImpar(controladorJ.elegirParImpar());
                    controladorJ.create(j);
                    jugadores.add(j);
                }
                r = new Ruleta();
                r.setId(1);
                r.setValorDeCaja(50000);
                controladorR.create(r);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(1);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();
            } else {
                jugadores = controladorJ.findAll();
                for (Jugadores jugador : jugadores) {
                    int numero = controladorJ.elegirAlazar();
                    String tipo = controladorJ.elegirParImpar();
                    jugador.setNumeroApostado(numero);
                    jugador.setDinero(1000);
                    jugador.setTipoParImpar(tipo);
                    controladorJ.update(jugador);
                }
                r = controladorR.read(1);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(1);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();
            }
        } else if (opcionParImpar.isSelected()) {
            if (controladorJ.findAll().isEmpty()) {
                for (int i = 0; i < 4; i++) {
                    j = new Jugadores();
                    j.setDinero(1000);
                    j.setId((i + 1));
                    j.setVecesPerdidas(1);
                    j.setNumeroApostado(controladorJ.elegirAlazar());
                    j.setTipoParImpar(controladorJ.elegirParImpar());
                    controladorJ.create(j);
                    jugadores.add(j);
                }
                r = new Ruleta();
                r.setId(1);
                r.setValorDeCaja(50000);
                controladorR.create(r);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(2);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();

            } else {
                jugadores = controladorJ.findAll();
                for (Jugadores jugador : jugadores) {
                    int numero = controladorJ.elegirAlazar();
                    String tipo = controladorJ.elegirParImpar();
                    jugador.setNumeroApostado(numero);
                    jugador.setTipoParImpar(tipo);
                    jugador.setDinero(1000);
                    controladorJ.update(jugador);
                }
                r = controladorR.read(1);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(2);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();
            }

        } else if (opcionMartingala.isSelected()) {
            if (controladorJ.findAll().isEmpty()) {
                for (int i = 0; i < 4; i++) {
                    j = new Jugadores();
                    j.setDinero(1000);
                    j.setId((i + 1));
                    j.setVecesPerdidas(1);
                    j.setNumeroApostado(controladorJ.elegirAlazar());
                    j.setTipoParImpar(controladorJ.elegirParImpar());
                    controladorJ.create(j);
                    jugadores.add(j);
                }
                r = new Ruleta();
                r.setId(1);
                r.setValorDeCaja(50000);
                controladorR.create(r);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(3);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();
            } else {
                jugadores = controladorJ.findAll();
                for (Jugadores jugador : jugadores) {
                    int numero = controladorJ.elegirAlazar();
                    String tipo = controladorJ.elegirParImpar();
                    jugador.setNumeroApostado(numero);
                    jugador.setTipoParImpar(tipo);
                    jugador.setDinero(1000);
                    controladorJ.update(jugador);
                }
                r = controladorR.read(1);
                jugar = new Jugar(modeloLista, listaV, txtNumeroR,txtCaja);
                jugar.setJugadores(jugadores);
                jugar.setR(r);
                jugar.setJuego(3);
                jugar.setContinuar(true);
                jugar.start();
                hiloR = new HiloRuleta(panelRuleta1);
                hiloR.setContinuar(true);
                hiloR.start();
            }
        }else{
            JOptionPane.showMessageDialog(null, "DEBE SELECIONAR UNA OPCION DE JUEGO");
        }
    }//GEN-LAST:event_btnSimularActionPerformed

    private void btnDetenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetenerActionPerformed
        jugar.setContinuar(false);
        hiloR.setContinuar(false);
    }//GEN-LAST:event_btnDetenerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        panelRuleta1.loadimage("/Users/newuser/NetBeansProjects/ExamenHilosJPA/src/ec/edu/ups/imagenes/Ruleta.png");
        panelRuleta1.invalidate();

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetener;
    private javax.swing.JToggleButton btnSimular;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMesa;
    private javax.swing.JLabel lbljugador;
    private javax.swing.JLabel lbljugador1;
    private javax.swing.JLabel lbljugador2;
    private javax.swing.JLabel lbljugador3;
    private javax.swing.JList<String> listaV;
    private javax.swing.JRadioButton opcionMartingala;
    private javax.swing.JRadioButton opcionNumeroC;
    private javax.swing.JRadioButton opcionParImpar;
    private ec.edu.ups.vista.PanelRuleta panelRuleta1;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtNumeroR;
    // End of variables declaration//GEN-END:variables
}
