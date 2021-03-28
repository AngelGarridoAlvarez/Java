import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JComboBox;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JLabel lblNewLabel_1_1_1_2;
	private JTextField textField_5;
	private JLabel lblNewLabel_1_1_1_3;
	private JTextField textField_6;
	private JLabel lblNewLabel_1_1_1_4;
	private JTextField textField_7;
	private JLabel lblNewLabel_1_1_1_5;
	private JTextField textField_8;
	private JLabel lblNewLabel_1_1_1_6;
	private JTextField textField_9;
	private JLabel lblNewLabel_1_1_1_7;
	private JTextField textField_10;
	private JLabel lblNewLabel_1_1_1_8;
	private JTextField textField_11;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanaPrincipal frame = new ventanaPrincipal();
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
	public ventanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 631, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(53, 11, 120, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(10, 14, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(213, 17, 46, 14);
		contentPane.add(lblApellidos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 11, 120, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DNI:");
		lblNewLabel_1_1.setBounds(425, 14, 26, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(461, 11, 144, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Tipo de v\u00EDa:");
		lblNewLabel_1_1_1.setBounds(10, 64, 61, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nombre v\u00EDa:");
		lblNewLabel_1_1_1_1.setBounds(198, 64, 61, 14);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(268, 58, 120, 20);
		contentPane.add(textField_4);
		
		lblNewLabel_1_1_1_2 = new JLabel("N\u00BA:");
		lblNewLabel_1_1_1_2.setBounds(412, 61, 26, 14);
		contentPane.add(lblNewLabel_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(436, 61, 23, 20);
		contentPane.add(textField_5);
		
		lblNewLabel_1_1_1_3 = new JLabel("Piso:");
		lblNewLabel_1_1_1_3.setBounds(476, 61, 26, 14);
		contentPane.add(lblNewLabel_1_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(504, 61, 23, 20);
		contentPane.add(textField_6);
		
		lblNewLabel_1_1_1_4 = new JLabel("Puerta:");
		lblNewLabel_1_1_1_4.setBounds(537, 61, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_4);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(582, 61, 23, 20);
		contentPane.add(textField_7);
		
		lblNewLabel_1_1_1_5 = new JLabel("CP:");
		lblNewLabel_1_1_1_5.setBounds(10, 110, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_5);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(42, 107, 86, 20);
		contentPane.add(textField_8);
		
		lblNewLabel_1_1_1_6 = new JLabel("Poblaci\u00F3n:");
		lblNewLabel_1_1_1_6.setBounds(144, 110, 54, 14);
		contentPane.add(lblNewLabel_1_1_1_6);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(196, 107, 86, 20);
		contentPane.add(textField_9);
		
		lblNewLabel_1_1_1_7 = new JLabel("Provincia:");
		lblNewLabel_1_1_1_7.setBounds(305, 110, 54, 14);
		contentPane.add(lblNewLabel_1_1_1_7);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(356, 107, 86, 20);
		contentPane.add(textField_10);
		
		lblNewLabel_1_1_1_8 = new JLabel("Pa\u00EDs:");
		lblNewLabel_1_1_1_8.setBounds(465, 110, 46, 14);
		contentPane.add(lblNewLabel_1_1_1_8);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(497, 107, 86, 20);
		contentPane.add(textField_11);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(39, 174, 134, 23);
		contentPane.add(btnNewButton);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(244, 174, 120, 23);
		contentPane.add(btnBorrar);
		
		JButton btnNewButton_1_1 = new JButton("Limpiar");
		btnNewButton_1_1.setBounds(436, 174, 121, 23);
		contentPane.add(btnNewButton_1_1);
		
		table = new JTable();
		table.setBounds(36, 232, 547, 162);
		contentPane.add(table);
		
		JLabel label = new JLabel("New label");
		label.setBounds(81, 232, 46, 14);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(81, 60, 81, 22);
		contentPane.add(comboBox);
	}
}
