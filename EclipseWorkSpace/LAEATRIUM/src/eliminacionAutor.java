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

public class eliminacionAutor extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	int contador=0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args, ArrayList mis_autores) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminacionAutor frame = new eliminacionAutor(mis_autores);
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
	public eliminacionAutor(ArrayList mis_autores) {
		setTitle("Eliminar Autores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setColumns(10);
		textField.setBounds(90, 220, 267, 20);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("F. Naci");
		lblNewLabel_1_1_3.setBounds(34, 223, 46, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		textField_1 = new JTextField();
		textField_1.setText((String) null);
		textField_1.setColumns(10);
		textField_1.setBounds(90, 174, 267, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_1_1_2.setBounds(34, 177, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1_1.setBounds(34, 131, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setText((String) null);
		textField_2.setColumns(10);
		textField_2.setBounds(90, 128, 267, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText((String) null);
		textField_3.setColumns(10);
		textField_3.setBounds(90, 86, 267, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(34, 89, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Id Autor:");
		lblNewLabel_1.setBounds(34, 48, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_4 = new JTextField();
		textField_4.setText((String) null);
		textField_4.setColumns(10);
		textField_4.setBounds(90, 45, 86, 20);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mis_autores.remove(contador);
				JOptionPane.showMessageDialog(null, "Autor eliminado correctamente!!!");
				dispose();
			}
		});
		btnNewButton.setBounds(313, 304, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(462, 304, 89, 23);
		contentPane.add(btnCerrar);
		
		
		Autor mi_autor =(Autor) mis_autores.get(0);
		String una=String.valueOf(mi_autor.getId());
		textField.setText(una);
		textField_1.setText(mi_autor.getNombre());
		textField_2.setText(mi_autor.getApellidos());
		textField_3.setText(mi_autor.getNacionalidad());
		textField_4.setText(mi_autor.getF_nacimiento());
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador++;
				if (contador<mis_autores.size())
				{
					Autor mi_autor =(Autor) mis_autores.get(contador);
					String una=String.valueOf(mi_autor.getId());
					textField.setText(una);
					textField_1.setText(mi_autor.getNombre());
					textField_2.setText(mi_autor.getApellidos());
					textField_3.setText(mi_autor.getNacionalidad());
					textField_4.setText(mi_autor.getF_nacimiento());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "No hay mas autores para listar");
				}
			}
		});
		btnNewButton_1.setBounds(34, 304, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}

}
