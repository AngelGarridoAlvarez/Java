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
import javax.swing.JSpinner;

public class consultarAutor extends JFrame {

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
	public consultarAutor(ArrayList mis_autores) {
		setTitle("Consulta de Autores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n referente de los autores insertados");
		lblNewLabel.setBounds(10, 25, 370, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Id Autor:");
		lblNewLabel_1.setBounds(10, 68, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(66, 65, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(66, 106, 267, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre:");
		lblNewLabel_1_1.setBounds(10, 109, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(66, 148, 267, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellidos");
		lblNewLabel_1_1_1.setBounds(10, 151, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(66, 194, 267, 20);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Nacionalidad:");
		lblNewLabel_1_1_2.setBounds(10, 197, 46, 14);
		contentPane.add(lblNewLabel_1_1_2);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(66, 240, 267, 20);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("F. Naci");
		lblNewLabel_1_1_3.setBounds(10, 243, 46, 14);
		contentPane.add(lblNewLabel_1_1_3);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(153, 323, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Anterior");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador--;
				if (contador>=0)
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
		btnNewButton_1.setBounds(35, 323, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.addActionListener(new ActionListener() {
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
		btnNewButton_1_1.setBounds(391, 323, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_2 = new JButton("Consultar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero = Integer.parseInt(textField.getText());
				
				Autor el_autor=null;
				int i=0;
				boolean encontrado=false;
				while (i<mis_autores.size() && !encontrado)
				{
					el_autor = (Autor) mis_autores.get(i);
					if (el_autor.getId() == numero)
					{
						encontrado=true;
					}
					i++;
				}
				if (encontrado)
				{
					//textField.setText(Integer.valueOf(numero));
					textField_1.setText(el_autor.getNombre());
					textField_2.setText(el_autor.getApellidos());
					textField_3.setText(el_autor.getNacionalidad());
					textField_4.setText(el_autor.getF_nacimiento());
				}
				else
				{
					JOptionPane.showMessageDialog(null, "El id "+numero+" no existe como autor");
				}
			}
		});
		btnNewButton_2.setBounds(276, 323, 89, 23);
		contentPane.add(btnNewButton_2);
		
		if (mis_autores.size()!=0)
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
			JOptionPane.showMessageDialog(null, "No hay autores cargados, por favor inserte antes autores");
			this.dispose();
		}
			
		
		
		
	}
}
