/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Jugadores;
import java.util.Random;

/**
 *
 * @author Dutan2000
 */
public class ControladorJugador extends ControladorGenerico<Jugadores> {

    private Random randomico = new Random();

    public int elegirAlazar() {
        return randomico.nextInt(35) + 1;
    }

    public String elegirParImpar() {
        int opcion = ((Math.random() <= 0.5) ? 1 : 2);
        if (opcion == 1) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

}
