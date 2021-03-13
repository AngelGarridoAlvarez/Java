import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class consultarAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Autor[] mis_autores) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					consultarAutor frame = new consultarAutor(mis_autores);
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
	public consultarAutor(Autor[] mis_autores) {
		setTitle("Consultar Autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n de los autores insertados:");
		lblNewLabel.setBounds(28, 26, 236, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIdAutor = new JLabel("Id Autor:");
		lblIdAutor.setBounds(28, 64, 44, 14);
		contentPane.add(lblIdAutor);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(28, 96, 44, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(28, 132, 44, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad");
		lblNacionalidad.setBounds(28, 163, 70, 14);
		contentPane.add(lblNacionalidad);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de nacimiento");
		lblFechaDeNacimiento.setBounds(28, 195, 98, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		textField = new JTextField();
		textField.setBounds(152, 64, 35, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(151, 96, 111, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(151, 132, 111, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(151, 163, 111, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(152, 192, 111, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		//Aprovechamos los datos del Array y cargamos al primer autor
		
		String una = String.valueOf(mis_autores[0].getId());
		textField.setText(una);
		textField_1.setText(mis_autores[0].getNombre());
		textField_2.setText(mis_autores[0].getApellidos());
		textField_3.setText(mis_autores[0].getNacionalidad());
		textField_4.setText(mis_autores[0].getF_nacimiento());



	}
}
