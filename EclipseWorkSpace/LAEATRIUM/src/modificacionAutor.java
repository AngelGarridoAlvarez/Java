import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modificacionAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;
	private JButton btnCerrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args, ArrayList mis_autores) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					modificacionAutor frame = new modificacionAutor(mis_autores);
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
	public modificacionAutor(ArrayList mis_autores) {
		setTitle("Modificaci\u00F3n de Autores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setColumns(10);
		textField.setBounds(87, 217, 267, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("F. Naci");
		lblNewLabel_1_1_3.setBounds(31, 220, 46, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setColumns(10);
		textField_1.setBounds(87, 171, 267, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_1_1_2.setBounds(31, 174, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setColumns(10);
		textField_2.setBounds(87, 125, 267, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1_1.setBounds(31, 128, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setColumns(10);
		textField_3.setBounds(87, 83, 267, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(31, 86, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(87, 42, 86, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("Id Autor:");
		lblNewLabel_1.setBounds(31, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Autor mi_autor =(Autor) mis_autores.get(0);
		String una=String.valueOf(mi_autor.getId());
		textField.setText(una);
		textField_1.setText(mi_autor.getNombre());
		textField_2.setText(mi_autor.getApellidos());
		textField_3.setText(mi_autor.getNacionalidad());
		textField_4.setText(mi_autor.getF_nacimiento());
		
		btnNewButton = new JButton("Actualizar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mis_autores.remove(0);
				
				if (comprobar())
				{
					//System.out.println(mis_autores.length);
					//Significa que tengo datos para insertar.
					int id=Integer.parseInt(textField.getText());
					Autor uno  = new Autor(id,textField_1.getText(),textField_2.getText(),textField_3.getText(),textField_4.getText() );
					mis_autores.add(uno);
					JOptionPane.showMessageDialog(null, "Autor insertado correctamente");
					Autor un_autor = (Autor) mis_autores.get(0);
					JOptionPane.showMessageDialog(null, un_autor.info_Autor() );
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Debes introducir datos en las cajas de texto");
				}
				
			}
		});
		btnNewButton.setBounds(55, 286, 89, 23);
		contentPane.add(btnNewButton);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(315, 286, 89, 23);
		contentPane.add(btnCerrar);
		
	}

}
