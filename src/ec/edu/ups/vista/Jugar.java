/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.modelo.*;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTextField;

/**
 *
 * @author Dutan2000
 */
public class Jugar extends Thread {

    private boolean continuar;
    private int juego;
    private VentanaPrueba ventanaP;

    private Ruleta r;
    private List<Jugadores> jugadores;

    private ControladorRuleta controladorR = new ControladorRuleta();
    private ControladorJugador controladorJ = new ControladorJugador();

    private DefaultListModel<String> modeloLista;
    private JList listaInterfaz;
    private JTextField texto;
    private JTextField textoCaja;

    public Jugar(DefaultListModel modelo, JList lista, JTextField texto,JTextField caja) {
        modeloLista = modelo;
        listaInterfaz = lista;
        this.texto = texto;
        textoCaja=caja;
    }

    public void cobroNumeroConcreto() {
        for (Jugadores jugadores : jugadores) {
            jugadores.setDinero(jugadores.getDinero() - 10);
            controladorJ.update(jugadores);
        }
        r.setValorDeCaja(r.getValorDeCaja() + (jugadores.size() * 10));
        controladorR.update(r);
        textoCaja.setText(r.getValorDeCaja()+"");

    }

    public void resultadoNumeroC() throws InterruptedException {
        int posicion = controladorR.girarRuleta();
        texto.setText(posicion + "");
        if (posicion == 0) {
            modeloLista.addElement("HAN PERDIDO TODOS");
            listaInterfaz.setModel(modeloLista);

            Thread.sleep(2000);
        } else {
            for (Jugadores jugador : jugadores) {
                if (jugador.getNumeroApostado() == posicion) {
                    int ganado = 360;
                    jugador.setDinero(jugador.getDinero() + ganado);
                    r.setValorDeCaja(r.getValorDeCaja() - ganado);
                    controladorJ.update(jugador);
                    controladorR.update(r);
                    textoCaja.setText(r.getValorDeCaja()+"");
                    modeloLista.addElement(" EL JUGADOR " + jugador.getId() + " HA GANADO, APOSTANDO POR EL NUEMRO:" + jugador.getNumeroApostado() + " SALDO ACTUAL:$" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);

                } else {
                    modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA PERDIDO, APOSTANDO POR EL NUMERO:" + jugador.getNumeroApostado() + " SALDO ACTUAL:$" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);
                }
            }
        }
        Thread.sleep(2000);

    }

    public void cobroParImpar() {
        for (Jugadores jugadores : jugadores) {
            jugadores.setDinero(jugadores.getDinero() - 10);
            controladorJ.update(jugadores);
        }
        r.setValorDeCaja(r.getValorDeCaja() + (jugadores.size() * 10));
        controladorR.update(r);
        textoCaja.setText(r.getValorDeCaja()+"");

    }

    public void resultadoParImpar() throws InterruptedException {
        int posicion = controladorR.girarRuleta();
        texto.setText(posicion + "");
        if (posicion == 0) {
            modeloLista.addElement("HAN PERDIDO TODOS");
            listaInterfaz.setModel(modeloLista);
            Thread.sleep(2000);
        } else {
            String parImpar = (posicion % 2 == 0) ? "PAR" : "IMPAR";

            for (Jugadores jugador : jugadores) {
                if (parImpar.equals("PAR") && jugador.getTipoParImpar().equals("PAR")) {
                    jugador.setDinero(jugador.getDinero() + 20);
                    r.setValorDeCaja(r.getValorDeCaja() - 20);
                    controladorR.update(r);
                    textoCaja.setText(r.getValorDeCaja()+"");
                    modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA GANADO,APOSTANDO POR:" + jugador.getTipoParImpar() + " SALDO ACTUAL $:" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);

                } else if (parImpar.equals("IMPAR") && jugador.equals("IMPAR")) {
                    jugador.setDinero(jugador.getDinero() + 20);
                    r.setValorDeCaja(r.getValorDeCaja() - 20);
                    controladorR.update(r);
                    textoCaja.setText(r.getValorDeCaja()+"");
                    modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA GANADO,APOSTANDO POR:" + jugador.getTipoParImpar() + " SALDO ACTUAL $:" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);
                } else {
                    modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA PERDIDO,APOSTANDO POR:" + jugador.getTipoParImpar() + " SALDO ACTUAL $:" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);
                }
            }
            Thread.sleep(2000);
        }
    }

    public void cobroMartingala() {
        for (Jugadores jugadores : jugadores) {
            int valorAPAgar = jugadores.getVecesPerdidas() * 10;
            jugadores.setDinero(jugadores.getDinero() - valorAPAgar);
            controladorJ.update(jugadores);
            r.setValorDeCaja(r.getValorDeCaja() + valorAPAgar);
            controladorR.update(r);
        }
        textoCaja.setText(r.getValorDeCaja()+"");

    }

    public void resultadoMartingala() throws InterruptedException {
        int posicion = controladorR.girarRuleta();
        texto.setText(posicion + "");
        if (posicion == 0) {
            for (Jugadores jugador : jugadores) {
                jugador.setVecesPerdidas(jugador.getVecesPerdidas() * 2);
                controladorJ.update(jugador);
            }
            modeloLista.addElement("HAN PERDIDO TODOS");
            listaInterfaz.setModel(modeloLista);
            Thread.sleep(2000);
        } else {
            for (Jugadores jugador : jugadores) {
                if (jugador.getNumeroApostado() == posicion) {
                    int ganado = 360;
                    jugador.setDinero(jugador.getDinero() + ganado);
                    controladorJ.update(jugador);
                    r.setValorDeCaja(r.getValorDeCaja() - ganado);
                    controladorR.update(r);
                    textoCaja.setText(r.getValorDeCaja()+"");
                    modeloLista.addElement(" EL JUGADOR " + jugador.getId() + " HA GANADO,APOSTANDO POR:" + jugador.getNumeroApostado() + " SALDO ACTUAL:$" + jugador.getDinero());
                    listaInterfaz.setModel(modeloLista);
                } else {
                    if (jugador.getVecesPerdidas() < 25) {
                        jugador.setVecesPerdidas(jugador.getVecesPerdidas() * 2);
                        controladorJ.update(jugador);
                        modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA PERDIDO,APOSTANDO POR:" + jugador.getNumeroApostado() + " SALDO ACTUAL:$" + jugador.getDinero());
                        listaInterfaz.setModel(modeloLista);
                    }else{  
                        jugador.setVecesPerdidas(1);
                        controladorJ.update(jugador);
                        modeloLista.addElement("EL JUGADOR " + jugador.getId() + " HA PERDIDO,APOSTANDO POR:" + jugador.getNumeroApostado() + " SALDO ACTUAL:$" + jugador.getDinero());
                        listaInterfaz.setModel(modeloLista);
                    }

                }
            }
            Thread.sleep(2000);
        }
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }

    public int getJuego() {
        return juego;
    }

    public void setJuego(int juego) {
        this.juego = juego;
    }

    public Ruleta getR() {
        return r;
    }

    public void setR(Ruleta r) {
        this.r = r;
    }

    public List<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugadores> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public void run() {
        try {
            while (continuar) {
                if (juego == 1) {
                    cobroNumeroConcreto();
                    resultadoNumeroC();
                } else if (juego == 2) {
                    cobroParImpar();
                    resultadoParImpar();
                } else if (juego == 3) {
                    cobroMartingala();
                    resultadoMartingala();
                }
            }

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
