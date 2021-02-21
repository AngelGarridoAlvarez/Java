package pruebaGraficos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtJtextfieldEsUna;

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
		setTitle("Mi primera ventana con Java y Swig");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Checkbox");
		chckbxNewCheckBox.setBounds(24, 43, 89, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("JButton");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(24, 298, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("JLabel es una simple etiquieta de texto que aparece donde yo lo ponga");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 11, 585, 25);
		contentPane.add(lblNewLabel);
		
		txtJtextfieldEsUna = new JTextField();
		txtJtextfieldEsUna.setText("JTextField es una caja de texto");
		txtJtextfieldEsUna.setBounds(35, 88, 239, 35);
		contentPane.add(txtJtextfieldEsUna);
		txtJtextfieldEsUna.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(26, 241, 121, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(24, 200, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JTextArea txtrJtextareaMePermite = new JTextArea();
		txtrJtextareaMePermite.setText("JtextArea me permite \r\nintroducir un area \r\nde texto multilinea");
		txtrJtextareaMePermite.setBounds(434, 72, 193, 65);
		contentPane.add(txtrJtextareaMePermite);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Jerez de la Frontera", "Leuven", "Sevilla", "Ar\u00E9valo", "Buitrago de Lozoya", "Villavieja de Lozoya"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(646, 200, 149, 22);
		contentPane.add(comboBox);
		
		JLabel lblJcomboboxSirvePara = new JLabel("JComboBox sirve para hacer un \r\nmen\u00FA desplegable con diferentes opciones:");
		lblJcomboboxSirvePara.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJcomboboxSirvePara.setBounds(215, 198, 421, 25);
		contentPane.add(lblJcomboboxSirvePara);
		
		JLabel lblCambiandoSelectedindexElegimos = new JLabel("Cambiando SelectedIndex elegimos en que item empieza");
		lblCambiandoSelectedindexElegimos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCambiandoSelectedindexElegimos.setBounds(215, 223, 421, 25);
		contentPane.add(lblCambiandoSelectedindexElegimos);
	}
}
