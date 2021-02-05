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
public class Ruleta implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column
    private double valorDeCaja;

    public double getValorDeCaja() {
        return valorDeCaja;
    }

    public void setValorDeCaja(double valorDeCaja) {
        this.valorDeCaja = valorDeCaja;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  
    
}
