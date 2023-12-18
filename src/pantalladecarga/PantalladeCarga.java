package pantalladecarga;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.SplashScreen;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
 
public class PantalladeCarga extends JDialog{
 
   private JProgressBar barraProgreso;
 
   public PantalladeCarga() {
   	setBackground(new Color(88, 250, 245));
      setBounds(100, 100, 637, 566);
      JPanel contentPane = new JPanel();
      contentPane.setLayout(new BorderLayout());
      setContentPane(contentPane);
 
   
      JPanel panelInferior = new JPanel();
      panelInferior.setLayout(new GridLayout(2, 1, 0, 0));
      barraProgreso = new JProgressBar();
      
      barraProgreso.setStringPainted(true);
      panelInferior.add(barraProgreso);
 
      JLabel lblCarga = new JLabel("Cargando...\r\n");
      lblCarga.setForeground(Color.BLUE);
      lblCarga.setHorizontalAlignment(SwingConstants.CENTER);
      panelInferior.add(lblCarga);
 
     
      contentPane.add(panelInferior, BorderLayout.SOUTH);
 
      setResizable(false); 
      setUndecorated(true);
      setLocationRelativeTo(null); 
      setVisible(true);
 
      try {
         iniciarBarraCarga();
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }finally{
    	  setVisible(false);
      }

   }
 
   private void iniciarBarraCarga() throws InterruptedException {
      for(int i = 0; i <= 100; i++){
         Thread.sleep(20);
         actualizarBarraProgreso(i);
      }
   }
 
   private void actualizarBarraProgreso(int valor) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            barraProgreso.setValue(valor);
         }
      });
   }
}