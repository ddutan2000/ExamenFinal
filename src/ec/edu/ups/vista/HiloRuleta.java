/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

/**
 *
 * @author Dutan2000
 */
public class HiloRuleta extends Thread{

    private int i =0;
    private boolean continuar;
    private PanelRuleta p;

    public HiloRuleta(PanelRuleta panel) {
        p=panel;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public boolean isContinuar() {
        return continuar;
    }

    public void setContinuar(boolean continuar) {
        this.continuar = continuar;
    }

    
    @Override
    public void run() {
        while(continuar){
          if(i<=500){
              p.rotate(i);
              i+=25;
              /*if(i/250==1){
                  try {
                      Thread.sleep(2000);
                  } catch (InterruptedException ex) {
                      ex.printStackTrace();
                  }
              }*/
          }else{
              i=0;
          }  
        }
    }
    
    
}
