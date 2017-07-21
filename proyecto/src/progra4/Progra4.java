/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4;

import progra4.ui.GuiPantalla;

/**
 *
 * @author jmanu
 */
public class Progra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexiondb conect = new Conexiondb();
        Doctor doctor = new Doctor();
        GuiPantalla pantalla = new GuiPantalla();
        if(conect.connect()){
           // doctor.agregar();
            //doctor.editar();
            //doctor.imprimir();
           // doctor.eliminar();
           pantalla.setVisible(true);
        }else{
        }
    }
    
}
