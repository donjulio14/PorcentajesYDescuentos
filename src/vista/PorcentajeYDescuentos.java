/**
 * 
 */
package vista;

import aplicacion.Interfaz;
import pantalladecarga.PantalladeCarga;
import cabecera.Continuar;
import controlador.Controlador;
import miModeloDescuentos.MiLookDescuento;

/**
 * 
 */
public class PorcentajeYDescuentos {


	public static void main(String[] args) {
		Interfaz inter = new Interfaz(); 
		Continuar conti = new Continuar();
		MiLookDescuento look = new MiLookDescuento();
		PantalladeCarga splash = new PantalladeCarga();
		Controlador ctrl = new Controlador(inter, conti, look);
		
		
		ctrl.iniciarVista();
	}

}
