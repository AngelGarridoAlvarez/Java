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
import java.util.ArrayList;
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
	public static void main(String[] args, ArrayList mis_autores) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					insertarAutor frame = new insertarAutor(mis_autores);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	boolean comprobar()
	{
		boolean valor;
		int cont =0;
		
		if (textField.getText().length()!=0)
		{
			cont++;
		}
		if (textField_1.getText().length()!=0)
		{
			cont++;
		}
		if (textField_2.getText().length()!=0)
		{
			cont++;
		}
		if (textField_3.getText().length()!=0)
		{
			cont++;
		}
		if (textField_4.getText().length()!=0)
		{
			cont++;
		}
		
		if (cont==5)
			valor=true;
		else
			valor=false;
		
		return valor;
	}
	
	/**
	 * Create the frame.
	 */
	public insertarAutor(ArrayList mis_autores) {
		setTitle("Insertar Autor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Por favor introduce los datos que se piden a continuaci\u00F3n para dar de alta a un autor:");
		lblNewLabel.setBounds(24, 25, 542, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Autor:");
		lblNewLabel_1.setBounds(24, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(94, 58, 62, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(24, 89, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(94, 86, 210, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setBounds(24, 117, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 114, 210, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nacionalidad:");
		lblNewLabel_1_3.setBounds(24, 148, 89, 14);
		contentPane.add(lblNewLabel_1_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(123, 145, 181, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("F Naci.");
		lblNewLabel_1_4.setBounds(24, 176, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(94, 173, 210, 20);
		contentPane.add(textField_4);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comprobar())
				{
					//System.out.println(mis_autores.length);
					//Significa que tengo datos para insertar.
					int id=Integer.parseInt(textField.getText());
					Autor uno  = new Autor(id,textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText() );
					mis_autores.add(uno);
					JOptionPane.showMessageDialog(null, "Autor insertado correctamente");
					//dispose();
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Debes introducir datos en las cajas de texto");
				}
			}
		});
		btnInsertar.setBounds(24, 246, 89, 23);
		contentPane.add(btnInsertar);
		
		JButton btnResetear = new JButton("Resetear");
		btnResetear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
			}
		});
		btnResetear.setBounds(215, 246, 89, 23);
		contentPane.add(btnResetear);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(419, 246, 89, 23);
		contentPane.add(btnCerrar);
	}
}
