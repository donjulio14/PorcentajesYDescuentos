package paquete1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField precio;
	private JTextField descuento;
	private JTextField resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora de Descuentos y Porcentajes\r\n");
		lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(75, 0, 325, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Introduce el precio de tu producto:\r\n");
		lblNewLabel_1.setBounds(10, 37, 174, 25);
		contentPane.add(lblNewLabel_1);
		
		precio = new JTextField();
		precio.setBounds(10, 57, 229, 20);
		contentPane.add(precio);
		precio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Introduce el porcentaje de descuento:\r\n");
		lblNewLabel_2.setBounds(10, 88, 185, 20);
		contentPane.add(lblNewLabel_2);
		
		descuento = new JTextField();
		descuento.setBounds(10, 106, 229, 20);
		contentPane.add(descuento);
		descuento.setColumns(10);
		
		JButton btnCalcular = new JButton("¡Calcular!");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCalcular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			int a, b, c;
			int calo;
			a=Integer.parseInt(precio.getText());
			b=Integer.parseInt(descuento.getText());
			c=((b/100)*a);
			resultado.setText(String.valueOf(c));
			}
		});
		btnCalcular.setBounds(171, 149, 89, 23);
		contentPane.add(btnCalcular);
		
		resultado = new JTextField();
		resultado.setBounds(136, 200, 174, 20);
		contentPane.add(resultado);
		resultado.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado:\r\n");
		lblNewLabel_3.setBounds(77, 203, 70, 14);
		contentPane.add(lblNewLabel_3);
	}
}
