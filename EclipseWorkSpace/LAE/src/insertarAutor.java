import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class insertarAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, Autor[] mis_autores, int contador) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertarAutor frame = new insertarAutor(mis_autores, contador);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	boolean comprobar() {
		
		boolean valor;
		int cont = 0;
		
		if(textField.getText().length()!= 0) {
			cont++;			
		}
		if(textField_1.getText().length()!= 0) {
			cont++;			
		}
		if(textField_2.getText().length()!= 0) {
			cont++;			
		}
		if(textField_3.getText().length()!= 0) {
			cont++;			
		}
		if(textField_4.getText().length()!= 0) {
			cont++;			
		}
		if (cont==5) {
			valor = true;
		} else {
			valor = false;
		}
		return valor;
	}

	/**
	 * Create the frame.
	 */
	public insertarAutor(Autor[] mis_autores, int contador) {
		setTitle("Insertar Autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JLabel lblNewLabel = new JLabel("Id Autor:");
		lblNewLabel.setBounds(39, 69, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Por favor introduce los datos requeridos del autor:");
		lblNewLabel_1.setBounds(39, 30, 329, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setBounds(39, 109, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(159, 66, 58, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 106, 114, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Apellidos:");
		lblNewLabel_2_1.setBounds(39, 145, 102, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Nacionalidad:");
		lblNewLabel_2_1_1.setBounds(39, 185, 110, 14);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_2_1_1_1.setBounds(39, 223, 110, 14);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton = new JButton("Insertar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (comprobar())
				{
					//Significa que tengo datos para insertar
					
					int id=Integer.parseInt(textField.getText());
					mis_autores[contador] = new Autor(id, textField_1.getText(), textField_2.getText(), textField_3.getText(), textField_4.getText());
					
					JOptionPane.showMessageDialog(null, mis_autores[contador].info_Autor());
					JOptionPane.showMessageDialog(null, "Autor insertado Correctamente");
					dispose(); //Cerramos la ventana

				}
				else
				{
					JOptionPane.showMessageDialog(null, "Debes introducir datos en las cajas de texto");
				}
			}
		});
		btnNewButton.setBounds(39, 278, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnResetear = new JButton("Resetear");
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnResetear.setBounds(240, 278, 89, 23);
		contentPane.add(btnResetear);
		
		JButton btnNewButton_1_1 = new JButton("Cerrar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1_1.setBounds(431, 278, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(159, 142, 223, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(159, 182, 114, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(161, 220, 112, 20);
		contentPane.add(textField_4);
	}
}
