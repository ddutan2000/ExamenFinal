/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Dutan2000
 */
@Entity
public class Jugadores implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private double dinero;

    @Column
    private int vecesPerdidas;
    
    @Column
    private int numeroApostado;
    
    @Column
    private String tipoParImpar;

    public String getTipoParImpar() {
        return tipoParImpar;
    }

    public void setTipoParImpar(String tipoParImpar) {
        this.tipoParImpar = tipoParImpar;
    }
    
    

    public int getNumeroApostado() {
        return numeroApostado;
    }

    public void setNumeroApostado(int numeroApostado) {
        this.numeroApostado = numeroApostado;
    }


    public int getVecesPerdidas() {
        return vecesPerdidas;
    }

    public void setVecesPerdidas(int vecesPerdidas) {
        this.vecesPerdidas = vecesPerdidas;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Jugador" + "\nid:" + id + "\nDinero:" + dinero + "\nVeces perdidas=" + vecesPerdidas;
    }


}
