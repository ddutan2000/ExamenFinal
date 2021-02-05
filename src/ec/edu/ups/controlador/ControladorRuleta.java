/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.*;
import java.util.Random;

/**
 *
 * @author Dutan2000
 */
public class ControladorRuleta extends ControladorGenerico<Ruleta> {

    private Random randomico = new Random();

    public int girarRuleta() {
        return randomico.nextInt(36);
    }

}
