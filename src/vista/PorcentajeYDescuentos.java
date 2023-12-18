/**
 * 
 */
package vista;

import aplicacion.Interfaz;
import pantalladecarga.PantalladeCarga;
import cabecera.Continuar;
import controlador.Controlador;
/**
 * 
 */
public class PorcentajeYDescuentos {


	public static void main(String[] args) {
		Interfaz inter = new Interfaz(); 
		Continuar conti = new Continuar();
		PantalladeCarga splash = new PantalladeCarga();
		Controlador ctrl = new Controlador(inter, conti);
		
		
		ctrl.iniciarVista();
	}

}
