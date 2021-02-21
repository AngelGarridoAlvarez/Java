package pruebaGraficos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import javax.swing.JProgressBar;

public class ventanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtJtextfieldEsUna;
	private JPasswordField passwordField;

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
		rdbtnNewRadioButton.setBounds(24, 211, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JTextArea txtrJtextareaMePermite = new JTextArea();
		txtrJtextareaMePermite.setText("JtextArea me permite \r\nintroducir un area \r\nde texto multilinea");
		txtrJtextareaMePermite.setBounds(314, 77, 193, 65);
		contentPane.add(txtrJtextareaMePermite);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Madrid", "Jerez de la Frontera", "Leuven", "Sevilla", "Ar\u00E9valo", "Buitrago de Lozoya", "Villavieja de Lozoya"}));
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(646, 43, 149, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("JButton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Has pulsado el botón, se va a cambiar el texto de JTextField con la ciudad " + comboBox.getSelectedItem().toString() + " seleccionada.");
				txtJtextfieldEsUna.setText("La ciudad seleccionada es " + comboBox.getSelectedItem().toString());
			}
		});
		
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(24, 298, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblJcomboboxSirvePara = new JLabel("JComboBox sirve para hacer un \r\nmen\u00FA desplegable con diferentes opciones:");
		lblJcomboboxSirvePara.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblJcomboboxSirvePara.setBounds(215, 41, 421, 25);
		contentPane.add(lblJcomboboxSirvePara);	
		JCheckBox chckbxIngls = new JCheckBox("Ingl\u00E9s");
		chckbxIngls.setBounds(185, 259, 89, 23);
		contentPane.add(chckbxIngls);
		
		JCheckBox chckbxFrancs = new JCheckBox("Franc\u00E9s");
		chckbxFrancs.setBounds(185, 285, 89, 23);
		contentPane.add(chckbxFrancs);
		
		JCheckBox chckbxAlemn = new JCheckBox("Alem\u00E1n");
		chckbxAlemn.setBounds(185, 311, 89, 23);
		contentPane.add(chckbxAlemn);
		
		JRadioButton rdbtnEnglish = new JRadioButton("English");
		rdbtnEnglish.setBounds(314, 255, 109, 23);
		contentPane.add(rdbtnEnglish);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(314, 285, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_3.setBounds(314, 311, 109, 23);
		

		contentPane.add(rdbtnNewRadioButton_3);
		
		
		
		
		JLabel lblCambiandoSelectedindexElegimos = new JLabel("Cambiando SelectedIndex elegimos en que item empieza");
		lblCambiandoSelectedindexElegimos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCambiandoSelectedindexElegimos.setBounds(215, 223, 421, 25);
		contentPane.add(lblCambiandoSelectedindexElegimos);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(243, 153, 121, 20);
		contentPane.add(passwordField);
		
		JLabel lblJpassword = new JLabel("JPassword");
		lblJpassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJpassword.setBounds(166, 149, 75, 25);
		contentPane.add(lblJpassword);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(18, 14, 99, 1));
		spinner.setBounds(88, 138, 45, 20);
		contentPane.add(spinner);
		
		JLabel lblJspinned = new JLabel("JSpinned");
		lblJspinned.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJspinned.setBounds(24, 134, 75, 25);
		contentPane.add(lblJspinned);
		
		JLabel lblJpanelparaTexto = new JLabel("JTextPanel (para texto enriquecido)");
		lblJpanelparaTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJpanelparaTexto.setBounds(548, 117, 247, 25);
		contentPane.add(lblJpanelparaTexto);
		
		JTree tree = new JTree();
		tree.setBounds(548, 244, 89, 77);
		contentPane.add(tree);
		
		JTextPane txtpnSdasdasdasdassadasdasdasdasdasdasdasdasd = new JTextPane();
		txtpnSdasdasdasdassadasdasdasdasdasdasdasdasd.setText("sdasdasdasdassadasdasdasdasdasdasdasdasd");
		txtpnSdasdasdasdassadasdasdasdasdasdasdasdasd.setBounds(558, 153, 174, 23);
		contentPane.add(txtpnSdasdasdasdassadasdasdasdasdasdasdasdasd);
		
		JSlider slider = new JSlider();
		slider.setBounds(528, 187, 200, 26);
		contentPane.add(slider);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(0);
		progressBar.setBounds(215, 184, 174, 23);
		contentPane.add(progressBar);
		
		JButton btnNewButton_1 = new JButton("+10%");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int progressBarValue = progressBar.getValue();
				progressBar.setValue(progressBarValue + 10);
			}
		});
		
		
		
		btnNewButton_1.setBounds(406, 187, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("- 10%");
		btnNewButton_1_1.setBounds(130, 185, 75, 23);
		contentPane.add(btnNewButton_1_1);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int progressBarValue = progressBar.getValue();
				progressBar.setValue(progressBarValue - 10);
			}
			});
		
	}
}
