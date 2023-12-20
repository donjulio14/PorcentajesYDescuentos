package controlador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;

import aplicacion.Interfaz;
import cabecera.Continuar;
import miModeloDescuentos.MiLookDescuento;
import pantalladecarga.PantalladeCarga;




public class Controlador {
	private Interfaz interfaz1;
	private Continuar continuar;
	private MiLookDescuento Lookdescuento;
	
	public Controlador(Interfaz interfaz1, Continuar continuar, MiLookDescuento Lookdescuento) {
		this.interfaz1= interfaz1;
		this.continuar = continuar;
		this.Lookdescuento = Lookdescuento;
		
		JButton botonContinuar = continuar.botonEmpezar();
		
		botonContinuar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				continuar.setVisible(false);
				interfaz1.setVisible(true);
				
			}
		});
		
		
		
		
	}
	public void iniciarVista() {
		Color celeste;
		Lookdescuento.setCeleste(new Color(88, 250, 245));
		celeste = Lookdescuento.getCeleste();
		
		continuar.contentPane.setBackground(celeste);
		continuar.setVisible(true);
		
	}

}


