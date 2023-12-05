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
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textPrecio;
	private JTextField textDescuento;
	private JButton btnCalcular;
	private JTextField textResultado;

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
		contentPane.setBackground(new Color(128, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{175, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15, 0, 0, 0, 0, 33, 0, 58, 89, 0};
		gbl_contentPane.rowHeights = new int[]{29, 30, 0, 33, 30, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Calculadora de Descuentos");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 24;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserta el precio del producto:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.gridwidth = 12;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textPrecio = new JTextField();
		GridBagConstraints gbc_textPrecio = new GridBagConstraints();
		gbc_textPrecio.gridwidth = 11;
		gbc_textPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_textPrecio.fill = GridBagConstraints.HORIZONTAL;
		gbc_textPrecio.gridx = 15;
		gbc_textPrecio.gridy = 3;
		contentPane.add(textPrecio, gbc_textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Inserta el porcentaje de descuento:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.gridwidth = 12;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 3;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textDescuento = new JTextField();
		GridBagConstraints gbc_textDescuento = new GridBagConstraints();
		gbc_textDescuento.gridwidth = 11;
		gbc_textDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_textDescuento.fill = GridBagConstraints.HORIZONTAL;
		gbc_textDescuento.gridx = 15;
		gbc_textDescuento.gridy = 4;
		contentPane.add(textDescuento, gbc_textDescuento);
		textDescuento.setColumns(10);
		
		btnCalcular = new JButton("Calcular\r\n");
		GridBagConstraints gbc_btnCalcular = new GridBagConstraints();
		gbc_btnCalcular.gridwidth = 4;
		gbc_btnCalcular.insets = new Insets(0, 0, 5, 5);
		gbc_btnCalcular.gridx = 13;
		gbc_btnCalcular.gridy = 5;
		contentPane.add(btnCalcular, gbc_btnCalcular);
		
		textResultado = new JTextField();
		GridBagConstraints gbc_textResultado = new GridBagConstraints();
		gbc_textResultado.gridwidth = 17;
		gbc_textResultado.insets = new Insets(0, 0, 5, 5);
		gbc_textResultado.fill = GridBagConstraints.HORIZONTAL;
		gbc_textResultado.gridx = 6;
		gbc_textResultado.gridy = 6;
		contentPane.add(textResultado, gbc_textResultado);
		textResultado.setColumns(10);
		
		btnCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                double precio = Double.parseDouble(textPrecio.getText());
                
                
                double descuento = Double.parseDouble(textDescuento.getText());
                
                
                double resultado = precio - (precio * (descuento / 100));
                
               
                textResultado.setText(String.valueOf(resultado));
            }
        });
	}
}
